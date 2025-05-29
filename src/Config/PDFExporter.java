package Config;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;
import java.io.File;
import java.io.FileOutputStream;
import java.awt.Color;

public class PDFExporter {
    public static void exportSelectedRowsToPDF(JTable table, int[] selectedRows) {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save PDF");
        chooser.setFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));

        int result = chooser.showSaveDialog(null);
        if (result != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File file = chooser.getSelectedFile();
        String filePath = file.getAbsolutePath();
        if (!filePath.toLowerCase().endsWith(".pdf")) {
            filePath += ".pdf";
        }

        Document document = new Document(PageSize.A4);

        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Logo
            try {
                Image logo = Image.getInstance("Images/logo.png");
                logo.scaleToFit(70, 70);
                logo.setAlignment(Image.LEFT);
                document.add(logo);
            } catch (Exception e) {
                System.out.println("Logo not found.");
            }

            // Hotel Header
            Font headerFont = new Font(Font.HELVETICA, 20, Font.BOLD, Color.BLACK);
            Paragraph hotelName = new Paragraph("GRAND ADOLF HOTEL", headerFont);
            hotelName.setAlignment(Element.ALIGN_CENTER);
            document.add(hotelName);

            Font subFont = new Font(Font.HELVETICA, 12, Font.NORMAL, Color.BLACK);
            Paragraph contact = new Paragraph("Adolf Hotel Tungop, Minglanilla, Cebu\nPhone: 09912231723 | Email: adolf132@hotel.com", subFont);
            contact.setAlignment(Element.ALIGN_CENTER);
            document.add(contact);

            document.add(Chunk.NEWLINE);

            // Receipt Title
            Font titleFont = new Font(Font.HELVETICA, 16, Font.BOLD, Color.BLACK);
            Paragraph title = new Paragraph("ROOM BOOKING RECEIPT", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            document.add(Chunk.NEWLINE);

            // Table styling fonts
            TableModel model = table.getModel();
            Font labelFont = new Font(Font.HELVETICA, 12, Font.BOLD, Color.BLACK);
            Font valueFont = new Font(Font.HELVETICA, 12, Font.NORMAL, Color.BLACK);

            for (int rowIndex : selectedRows) {
                Paragraph bookingHeader = new Paragraph("Booking #" + model.getValueAt(rowIndex, 0),
                        new Font(Font.HELVETICA, 14, Font.BOLD, Color.BLUE));
                bookingHeader.setSpacingBefore(10f);
                bookingHeader.setSpacingAfter(5f);
                document.add(bookingHeader);

                PdfPTable infoTable = new PdfPTable(2);
                infoTable.setWidthPercentage(100);
                infoTable.setWidths(new float[]{1f, 2f});
                infoTable.setSpacingBefore(5f);
                infoTable.setSpacingAfter(10f);

                for (int col = 0; col < model.getColumnCount(); col++) {
                    String label = model.getColumnName(col);
                    Object valueObj = model.getValueAt(rowIndex, col);
                    String value = valueObj != null ? valueObj.toString() : "";

                    PdfPCell labelCell = new PdfPCell(new Phrase(" " + label + " ", labelFont));
                    PdfPCell valueCell = new PdfPCell(new Phrase(" " + value + " ", valueFont));

                    labelCell.setBackgroundColor(new Color(230, 230, 250)); // light lavender
                    labelCell.setBorderColor(Color.GRAY);
                    labelCell.setPadding(5);

                    valueCell.setBorderColor(Color.GRAY);
                    valueCell.setPadding(5);

                    infoTable.addCell(labelCell);
                    infoTable.addCell(valueCell);
                }

                document.add(infoTable);
            }

            document.add(Chunk.NEWLINE);

            // Footer
            Font footerFont = new Font(Font.HELVETICA, 12, Font.BOLD, Color.DARK_GRAY);
            Paragraph footer = new Paragraph("Thank you for choosing Grand Adolf Hotel!", footerFont);
            footer.setAlignment(Element.ALIGN_CENTER);
            document.add(footer);

            Paragraph date = new Paragraph("Generated on: " + java.time.LocalDate.now(), subFont);
            date.setAlignment(Element.ALIGN_RIGHT);
            document.add(date);

            document.close();

            JOptionPane.showMessageDialog(null, "PDF exported successfully to:\n" + filePath);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error generating PDF: " + e.getMessage(), "PDF Export Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
