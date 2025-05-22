
package admin;

import Config.Logs;
import Config.config;
import Users.UsersForm;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class addForm extends javax.swing.JFrame {

    
    public addForm() {
        initComponents();
        
    }
    public String destination;
   File selectedFile;
   public String oldpath;
   public String path;
   
    



public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/Images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
public ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = (ImagePath != null) ? new ImageIcon(ImagePath) : new ImageIcon(pic);

    int labelWidth = label.getWidth();
    if (labelWidth == 0) labelWidth = 150; // fallback width if not initialized

    int newHeight = getHeightFromWidth(ImagePath, labelWidth);
    if (newHeight <= 0) newHeight = 150; // fallback height

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(labelWidth, newHeight, Image.SCALE_SMOOTH);
    return new ImageIcon(newImg);
}

public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
           
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!"+ex);
        }
        
        return -1;
    }

    public static String emails, usernames;
    
    public boolean duplicateChecker(){
        config conf = new config();
        try{
            String query = "SELECT * FROM users WHERE uname = '"+uname.getText()+"' OR email = '"+email.getText()+"'";
            ResultSet resultSet = conf.getData(query);
            
            if(resultSet.next()){
                emails = resultSet.getString("email");
                if(emails.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used!");
                    email.setText(null);
                }
                usernames = resultSet.getString("uname");
                if(usernames.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used!");
                    uname.setText(null);
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
     public boolean updateChecker(){
        config conf = new config();
        try{
            String query = "SELECT * FROM users WHERE (uname = '"+uname.getText()+"' OR email = '"+email.getText()+"')AND id!='"+id.getText()+"' ";
            ResultSet resultSet = conf.getData(query);
            
            if(resultSet.next()){
                emails = resultSet.getString("email");
                if(emails.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used!");
                    email.setText(null);
                }
                usernames = resultSet.getString("uname");
                if(usernames.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used!");
                    uname.setText(null);
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        utype = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        lname = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        pconfirm = new javax.swing.JPasswordField();
        pname = new javax.swing.JPasswordField();
        jLabel36 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        pconfirm1 = new javax.swing.JPasswordField();
        jLabel39 = new javax.swing.JLabel();
        ustatus = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Contact #:");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, -1));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Last Name:");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, -1));

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Gender:");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("User Type:");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, -1));
        jPanel9.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 160, -1));
        jPanel9.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 160, -1));

        utype.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Receptionist", "Client" }));
        utype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utypeActionPerformed(evt);
            }
        });
        jPanel9.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 160, -1));

        gender.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel9.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 160, -1));
        jPanel9.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 160, -1));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("First Name:");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Username:");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 90, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Password:");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 90, -1));
        jPanel9.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, -1));

        pconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pconfirmActionPerformed(evt);
            }
        });
        jPanel9.add(pconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 160, -1));

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        jPanel9.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 160, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Confirm Pass:");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Email:");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 90, -1));
        jPanel9.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 160, -1));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 102)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("X");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 50, 50));

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("USERS FORM");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 20, 860, 40));

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 990, 80));

        delete.setBackground(new java.awt.Color(0, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel9.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 170, -1));

        jLabel37.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Confirm Pass:");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, -1));

        pconfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pconfirm1ActionPerformed(evt);
            }
        });
        jPanel9.add(pconfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 160, -1));

        jLabel39.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Status:");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 90, -1));

        ustatus.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ustatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        ustatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ustatusActionPerformed(evt);
            }
        });
        jPanel9.add(ustatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 160, -1));

        id.setEnabled(false);
        jPanel9.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 160, -1));

        jLabel38.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("id");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 240));

        jPanel9.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 220, 240));

        select.setText("SELECT");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel9.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel9.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        add.setBackground(new java.awt.Color(0, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel9.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 170, -1));

        update.setBackground(new java.awt.Color(0, 255, 255));
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel9.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 170, -1));

        cancel.setBackground(new java.awt.Color(0, 255, 255));
        cancel.setText("CANCEL");
        cancel.setEnabled(false);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel9.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 170, -1));

        refresh.setBackground(new java.awt.Color(0, 255, 255));
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel9.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, 170, -1));

        clear.setBackground(new java.awt.Color(0, 255, 255));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel9.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 670, 170, -1));

        getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 0, 660, 760);

        setSize(new java.awt.Dimension(543, 721));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void utypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utypeActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void pconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pconfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pconfirmActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
  

    if(fname.getText().isEmpty()
        || lname.getText().isEmpty()
        || email.getText().isEmpty()
        || uname.getText().isEmpty()
        || pname.getText().isEmpty()
        || contact.getText().isEmpty()) {

        
        JOptionPane.showMessageDialog(null, "All Fields are Required!");
        return;
    }

    if(pname.getText().length() < 8) {
        pname.setText("");
        
        JOptionPane.showMessageDialog(null, "Password Must be longer than 8!");
        return;
    }

    String emails = this.email.getText();
    String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    Pattern patternEmail = Pattern.compile(emailRegex);
    Matcher matcherEmail = patternEmail.matcher(emails);

    if (!matcherEmail.matches()) {
        
        JOptionPane.showMessageDialog(this, "Invalid email format. Please use a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
        this.email.setText("");
        this.email.requestFocus();
        return;
    }

    if (!pname.getText().equals(pconfirm.getText())) {
        
        JOptionPane.showMessageDialog(null, "Password does not match!");
        return;
    }

    if (duplicateChecker()) {
        
        System.out.println("Duplicate Exist!");
        return;
    }

    config conf = new config();
    int result = conf.insertData("INSERT INTO users (fname, lname, gender, account_type, email, uname, pname, contact, status,image) "
        + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+gender.getSelectedItem()+"'"
        + ", '"+utype.getSelectedItem()+"', '"+email.getText()+"', '"+uname.getText()+"'"
        + ", '"+pname.getText()+"', '"+contact.getText()+"',  '"+ustatus.getSelectedItem()+"', '"+destination+"')");

    if (result == 1) {
        try {
            Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            Logs.logFunctionCall("Admin Registered a user succesfully" + fname);
            JOptionPane.showMessageDialog(null, "Registered Successfully!");
            UsersForm login = new UsersForm();
            login.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logs.logFunctionCall("File Copy Error");
            System.out.println("Insert Error: " + ex);
        }
    } else {
        Logs.logFunctionCall("a_addActionPerformed - Insert Failed");
    }
    }//GEN-LAST:event_addActionPerformed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void pconfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pconfirm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pconfirm1ActionPerformed

    private void ustatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ustatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ustatusActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
 
        
        if (fname.getText().isEmpty() ||
        lname.getText().isEmpty() ||
        email.getText().isEmpty() ||
        uname.getText().isEmpty() ||
        pname.getText().isEmpty() ||
        contact.getText().isEmpty()) {

        JOptionPane.showMessageDialog(null, "All Fields are Required!");
        return;
    }

    if (pname.getText().length() < 8) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters!");
        return;
    }

    if (!pname.getText().equals(pconfirm.getText())) {
        JOptionPane.showMessageDialog(null, "Password does not match!");
        return;
    }

    if (updateChecker()) {
        JOptionPane.showMessageDialog(null, "Duplicate user exists!");
        return;
    }

    config conf = new config();

    conf.updateData("UPDATE users SET fname='" + fname.getText() +
        "', lname='" + lname.getText() +
        "', email='" + email.getText() +
        "', gender='" + gender.getSelectedItem() +
        "', account_type='" + utype.getSelectedItem() +
        "', uname='" + uname.getText() +
        "', status='" + ustatus.getSelectedItem() +
        "', pname='" + pname.getText() +
        "', image='" + destination +
        "' WHERE id='" + id.getText() + "'");

    if (destination.isEmpty()) {
        File existingFile = new File(oldpath);
        if (existingFile.exists()) {
            existingFile.delete();
        }
    } else {
        if (!oldpath.equals(path)) {
            imageUpdater(oldpath, path);
        }
    }

    Logs.logFunctionCall( "Admin updated user with ID: " + id.getText());

    JOptionPane.showMessageDialog(null, "Updated Successfully!");

    UsersForm usf = new UsersForm();
    usf.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       
          
        
    }//GEN-LAST:event_cancelActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
       UsersForm usf=  new  UsersForm();
            usf.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseClicked

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
       JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/Images/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                            remove.setEnabled(true);
                            
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!"+ex);
                    }
                }
    }//GEN-LAST:event_selectActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
      remove.setEnabled(false);
       select.setEnabled(true);
       image.setIcon(null);
       destination = "";
       path = "";
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    public javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    public javax.swing.JComboBox<String> gender;
    public javax.swing.JTextField id;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JTextField lname;
    public javax.swing.JPasswordField pconfirm;
    private javax.swing.JPasswordField pconfirm1;
    public javax.swing.JPasswordField pname;
    private javax.swing.JButton refresh;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    public javax.swing.JTextField uname;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> ustatus;
    private javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}
