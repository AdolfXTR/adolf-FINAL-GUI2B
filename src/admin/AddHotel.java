
package admin;

import Config.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AddHotel extends javax.swing.JFrame {
    private Connection conn;

  
    public AddHotel() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtHotelName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        cmbRating = new javax.swing.JComboBox<>();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addhotel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD HOTEL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 80));

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
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, 420));

        jPanel4.setBackground(new java.awt.Color(250, 249, 249));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(txtHotelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 30));
        jPanel4.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 200, 30));
        jPanel4.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 200, 30));

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });
        jPanel4.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 30));
        jPanel4.add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 200, 30));
        jPanel4.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 200, 30));
        jPanel4.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 270, 100));

        cmbRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5.0", "4.0", "3.0", "2.0", "1.0" }));
        jPanel4.add(cmbRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 200, 30));
        jPanel4.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 30));
        jPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 200, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("Hotel name:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setText("Address:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 190, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("City:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 190, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel6.setText("State:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel7.setText("Zip Code");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 190, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel8.setText("Country:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 190, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel9.setText("Phone Number:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel10.setText("Email:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 190, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel11.setText("Star Rating:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 190, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel12.setText("Description:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, -1));

        addhotel.setBackground(new java.awt.Color(102, 255, 255));
        addhotel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addhotel.setText("Add");
        addhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addhotelActionPerformed(evt);
            }
        });
        jPanel4.add(addhotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 280, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 280, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 830, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addhotelActionPerformed
  String hotelName = txtHotelName.getText().trim();
    String address = txtAddress.getText().trim();
    String city = txtCity.getText().trim();
    String state = txtState.getText().trim();
    String zip = txtZip.getText().trim();
    String country = txtCountry.getText().trim();
    String phone = txtPhone.getText().trim();
    String email = txtEmail.getText().trim();
    String description = txtDescription.getText().trim();

    if (hotelName.isEmpty() || address.isEmpty() || city.isEmpty() || country.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double rating = 0.0;
    try {
        String selectedRating = cmbRating.getSelectedItem().toString();
        rating = Double.parseDouble(selectedRating);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Please select a valid star rating.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Database connection variables
    String url = "jdbc:mysql://localhost:3306/hotel_management";
    String username = "root"; // Change if needed
    String password = "";     // Change if needed

    String sql = "INSERT INTO hotels (hotel_name, address, city, state, zip_code, country, phone_number, email, star_rating, description) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement pst = conn.prepareStatement(sql)) {

        pst.setString(1, hotelName);
        pst.setString(2, address);
        pst.setString(3, city);
        pst.setString(4, state);
        pst.setString(5, zip);
        pst.setString(6, country);
        pst.setString(7, phone);
        pst.setString(8, email);
        pst.setDouble(9, rating);
        pst.setString(10, description);

        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Hotel added successfully.");
            Admins aa = new Admins();
            aa.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add hotel.", "Insert Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_addhotelActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           Admins aa = new Admins();
            aa.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addhotel;
    private javax.swing.JComboBox<String> cmbRating;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHotelName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
