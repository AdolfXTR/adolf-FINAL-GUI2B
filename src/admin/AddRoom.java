
package admin;

import Config.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author II
 */
public class AddRoom extends javax.swing.JFrame {
    private Connection conn;

    /**
     * Creates new form AddHotel
     */
    public AddRoom() {
        initComponents();
        
        loadHotelsToComboBox();
    }
private void loadHotelsToComboBox() {
    String url = "jdbc:mysql://localhost:3306/hotel_management";
    String username = "root";
    String password = "";

    String sql = "SELECT hotel_id, hotel_name FROM hotels";

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement pst = conn.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        cmbHotel.removeAllItems(); // clear existing items

        while (rs.next()) {
            int id = rs.getInt("hotel_id");
            String name = rs.getString("hotel_name");
            cmbHotel.addItem(id + " - " + name); // store both ID and name
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error loading hotels: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtRoomNumber = new javax.swing.JTextField();
        txtRoomType = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addroom = new javax.swing.JButton();
        cmbHotel = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD ROOM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, 470));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(txtRoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 290, 40));
        jPanel4.add(txtRoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, 40));
        jPanel4.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, 40));

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Booked" }));
        jPanel4.add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 290, 40));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel3.setText("Room number:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 190, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel4.setText("Room Type:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel5.setText("Price:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 190, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setText("Hotel Name:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 190, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel7.setText("Status:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 190, -1));

        addroom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addroom.setText("Add");
        addroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addroomActionPerformed(evt);
            }
        });
        jPanel4.add(addroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 290, 40));

        cmbHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHotelActionPerformed(evt);
            }
        });
        jPanel4.add(cmbHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 290, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 290, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 450, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addroomActionPerformed
     
     String selectedHotel = (String) cmbHotel.getSelectedItem();
    if (selectedHotel == null || selectedHotel.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a hotel.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int hotelId = Integer.parseInt(selectedHotel.split(" - ")[0]);
    String roomNumber = txtRoomNumber.getText().trim();
    String roomType = txtRoomType.getText().trim();
    String priceText = txtPrice.getText().trim();
    String status = (String) cmbStatus.getSelectedItem();

    if (roomNumber.isEmpty() || roomType.isEmpty() || priceText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double price;
    try {
        price = Double.parseDouble(priceText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price format.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String url = "jdbc:mysql://localhost:3306/hotel_management";
    String username = "root";
    String password = "";

    String sql = "INSERT INTO rooms (hotel_id, room_number, room_type, price, status) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement pst = conn.prepareStatement(sql)) {

        pst.setInt(1, hotelId);
        pst.setString(2, roomNumber);
        pst.setString(3, roomType);
        pst.setDouble(4, price);
        pst.setString(5, status);

        int inserted = pst.executeUpdate();
        if (inserted > 0) {
            JOptionPane.showMessageDialog(this, "Room added successfully.");
            // Optionally clear fields or refresh table
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add room.", "Insert Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_addroomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           Admins aa = new Admins();
            aa.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHotelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addroom;
    private javax.swing.JComboBox<String> cmbHotel;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoomNumber;
    private javax.swing.JTextField txtRoomType;
    // End of variables declaration//GEN-END:variables
}
