
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author enric
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    
     private Connection con;

    

    public User() {
        this.con = con;
        initComponents();
        
        try {
            connection();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
      // this is for the SQL Statement
    Statement st;
    
    // required for connections
    // Database name, driver, URL, usernmae, password
    // creating a method for connection
   
    private static final String DbName = "dbregister";
    private static final String DbDriver = "com.mysql.cj.jdbc.Driver";
    private static final String DbUrl = "jdbc:mysql://localhost:3306/"+DbName;
    private static final String DbUsername = "root"; 
    private static final String DbPassword = "";

    public void connection () throws SQLException{
        try {
            Class.forName(DbDriver);
            // url, username, password
            con = DriverManager.getConnection(DbUrl, DbUsername, DbPassword);
            st = con.createStatement();
            if (con != null) {
                System.out.println("Connection successful");
            }
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void SetUser(String name){
        lblset.setText(name);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblset = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtPass = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtUser = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(null);

        lblset.setBackground(new java.awt.Color(153, 0, 153));
        lblset.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        lblset.setForeground(new java.awt.Color(204, 204, 255));
        lblset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblset);
        lblset.setBounds(0, 60, 1000, 95);

        jLabel2.setBackground(new java.awt.Color(102, 0, 102));
        jLabel2.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update own Info");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 200, 1000, 95);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black-evil-cat (2).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 0, 128, 128);
        jPanel1.add(jtPass);
        jtPass.setBounds(330, 380, 330, 20);

        jLabel4.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Old Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 350, 130, 19);

        jLabel5.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("OldPassword");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 380, 130, 19);

        jButton1.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(700, 340, 120, 26);

        jButton3.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(700, 380, 120, 26);
        jPanel1.add(jtUser);
        jtUser.setBounds(330, 350, 330, 20);

        jLabel3.setBackground(new java.awt.Color(102, 0, 102));
        jLabel3.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("hello!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-380, 70, 1000, 95);

        jButton4.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("Log out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 530, 120, 26);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        jtUser.setText("");
        jtPass.setText("");
        //jtEmail.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      try {
            String oldUsername = jtUser.getText();
            String oldPassword = jtPass.getText();
    //String oldEmail = jtEmail.getText();

    int update = JOptionPane.showConfirmDialog(null, "Confirm to Update", "Warning", JOptionPane.YES_NO_OPTION);

    if (update == JOptionPane.YES_OPTION) {
        if (oldUsername.isEmpty() || oldPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter old username and password.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String selectQuery = "SELECT * FROM user WHERE username=? AND password=?";
            PreparedStatement pst = con.prepareStatement(selectQuery);
            pst.setString(1, oldUsername);
            pst.setString(2, oldPassword);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                String newUsername = JOptionPane.showInputDialog(null, "Enter New Username:");
                String newPassword = JOptionPane.showInputDialog(null, "Enter New Password:");

                try {
                    if (newUsername == null || newPassword == null || newUsername.isEmpty() || newPassword.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (!newUsername.matches("[a-zA-Z0-9]+")) {
                        JOptionPane.showMessageDialog(null, "Invalid username. Username should contain only letters and numbers", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (!newPassword.matches("[a-zA-Z0-9]+")) {
                        JOptionPane.showMessageDialog(null, "Invalid password. Password should contain only letters and numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (newPassword.length() > 20) {
                        JOptionPane.showMessageDialog(null, "Password should be maximum 20 characters long.", "Error", JOptionPane.ERROR_MESSAGE);   
                    } else {
                        String updateQuery = "UPDATE user SET username=?, password=? WHERE username=?";
                        PreparedStatement prst = con.prepareStatement(updateQuery);
                        prst.setString(1, newUsername);
                        prst.setString(2, newPassword);
                        prst.setString(3, oldUsername); 

                        int rowsAffected = prst.executeUpdate();

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Successfully Updated!");
                        } else {
                            JOptionPane.showMessageDialog(null, "No details to update.");
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error occurred while updating record.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "An error occurred.", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        int r = JOptionPane.showConfirmDialog(this, "Are you sure to Log out");
        if(r==0){
            Login l = new Login();
            l.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel jPanel1;
    public static java.awt.TextField jtPass;
    public static java.awt.TextField jtUser;
    private javax.swing.JLabel lblset;
    // End of variables declaration//GEN-END:variables
}
