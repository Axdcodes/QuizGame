/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.main.GUI;

import com.mysql.cj.x.protobuf.MysqlxSql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Signup extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        regUpassword = new javax.swing.JPasswordField();
        btnSignup1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnSignin1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        regUname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 195, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\mp.png")); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 420, 530));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("E");
        jLabel6.setMaximumSize(new java.awt.Dimension(50, 66));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 60, 60));

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 60)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Q");
        jLabel7.setMaximumSize(new java.awt.Dimension(50, 66));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 60));

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("U");
        jLabel8.setMaximumSize(new java.awt.Dimension(50, 66));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 60));

        jLabel9.setFont(new java.awt.Font("Segoe Script", 1, 60)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("I");
        jLabel9.setMaximumSize(new java.awt.Dimension(50, 66));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 50));

        jLabel10.setFont(new java.awt.Font("Segoe Script", 1, 60)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Z");
        jLabel10.setMaximumSize(new java.awt.Dimension(50, 66));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, 60));

        jLabel11.setFont(new java.awt.Font("Segoe Script", 1, 60)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("G");
        jLabel11.setMaximumSize(new java.awt.Dimension(50, 66));
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 60, 60));

        jLabel12.setFont(new java.awt.Font("Segoe Script", 1, 60)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("A");
        jLabel12.setMaximumSize(new java.awt.Dimension(50, 66));
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 60, 60));

        jLabel13.setFont(new java.awt.Font("Segoe Script", 1, 60)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("M");
        jLabel13.setMaximumSize(new java.awt.Dimension(50, 66));
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 60, 60));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("SIGN UP");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("PASSWORD  :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 50));

        regEmail.setBackground(new java.awt.Color(0, 255, 255));
        regEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        regEmail.setForeground(new java.awt.Color(0, 102, 102));
        regEmail.setBorder(null);
        regEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmailActionPerformed(evt);
            }
        });
        jPanel2.add(regEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 270, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 270, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("DON'T HAVE AN ACCOUNT");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 250, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 204, 204));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 270, 10));

        regUpassword.setBackground(new java.awt.Color(0, 255, 255));
        regUpassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        regUpassword.setForeground(new java.awt.Color(0, 102, 102));
        regUpassword.setBorder(null);
        regUpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regUpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(regUpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 270, 40));

        btnSignup1.setBackground(new java.awt.Color(0, 255, 255));
        btnSignup1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSignup1.setForeground(new java.awt.Color(0, 204, 204));
        btnSignup1.setText("SIGN UP");
        btnSignup1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        btnSignup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignup1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 120, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 204));
        jLabel14.setText("EMAIL  :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 40));

        btnSignin1.setBackground(new java.awt.Color(0, 255, 255));
        btnSignin1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignin1.setForeground(new java.awt.Color(0, 204, 204));
        btnSignin1.setText("SIGN IN");
        btnSignin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        btnSignin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignin1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 120, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 204));
        jLabel15.setText("USER NAME  :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 40));

        jSeparator4.setForeground(new java.awt.Color(0, 204, 204));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 270, 10));

        regUname.setBackground(new java.awt.Color(0, 255, 255));
        regUname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        regUname.setForeground(new java.awt.Color(0, 102, 102));
        regUname.setBorder(null);
        regUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regUnameActionPerformed(evt);
            }
        });
        jPanel2.add(regUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regEmailActionPerformed

    private void regUpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regUpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regUpasswordActionPerformed

    private void btnSignup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignup1ActionPerformed
        // TODO add your handling code here:
        try {
            String query = "INSERT INTO `signin`(`Username`, `Email`, `Password`,'score') VALUES (?,?,?,0)";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gameuser", "root", "");
            pst = conn.prepareStatement(query);

            pst.setString(1, regUname.getText());
            pst.setString(2, regEmail.getText());
            pst.setString(3, regUpassword.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registered Successfully");

            Signin SignIn = new Signin();
            SignIn.show();

            dispose();

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_btnSignup1ActionPerformed

    private void btnSignin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignin1ActionPerformed
        // TODO add your handling code here:+
        Signin SignIn = new Signin();
        SignIn.show();

        dispose();
    }//GEN-LAST:event_btnSignin1ActionPerformed

    private void regUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regUnameActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignin1;
    private javax.swing.JButton btnSignup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField regEmail;
    private javax.swing.JTextField regUname;
    private javax.swing.JPasswordField regUpassword;
    // End of variables declaration//GEN-END:variables
}
