/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JFrame;


/**
 *
 * @author familia
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_X = new javax.swing.JLabel();
        jLabel_Register = new javax.swing.JLabel();
        jLabel_min = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_ID = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel_Name = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel_LastName = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel_CellPhone = new javax.swing.JLabel();
        jTextField_CellPhone = new javax.swing.JTextField();
        jLabel_PassWord = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton_Cancel = new javax.swing.JButton();
        jButton_Register = new javax.swing.JButton();
        jLabel_New_Register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel_X.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_X.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel_X.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_X.setText("X");
        jLabel_X.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_XMouseClicked(evt);
            }
        });

        jLabel_Register.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Register.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel_Register.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Register.setText("Register Form");

        jLabel_min.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_min.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel_min.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_min.setText("-");
        jLabel_min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(jLabel_min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_X)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_X)
                    .addComponent(jLabel_Register)
                    .addComponent(jLabel_min))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 380, 50);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel_ID.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_ID.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_ID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ID.setText("ID");

        jTextField_ID.setEditable(false);
        jTextField_ID.setBackground(new java.awt.Color(108, 112, 137));
        jTextField_ID.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jLabel_Name.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Name.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Name.setText("Name:");

        jTextField_Name.setEditable(false);
        jTextField_Name.setBackground(new java.awt.Color(108, 112, 137));
        jTextField_Name.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jLabel_LastName.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_LastName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_LastName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_LastName.setText("Last Name:");

        jTextField_LastName.setEditable(false);
        jTextField_LastName.setBackground(new java.awt.Color(108, 112, 137));
        jTextField_LastName.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LastNameActionPerformed(evt);
            }
        });

        jLabel_CellPhone.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_CellPhone.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_CellPhone.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CellPhone.setText("Cell Phone");

        jTextField_CellPhone.setEditable(false);
        jTextField_CellPhone.setBackground(new java.awt.Color(108, 112, 137));
        jTextField_CellPhone.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_CellPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CellPhoneActionPerformed(evt);
            }
        });

        jLabel_PassWord.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_PassWord.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_PassWord.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PassWord.setText("Password:");

        jPasswordField1.setBackground(new java.awt.Color(108, 112, 137));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton_Cancel.setBackground(new java.awt.Color(142, 38, 19));
        jButton_Cancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jButton_Register.setBackground(new java.awt.Color(34, 167, 240));
        jButton_Register.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_Register.setText("Register");
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });

        jLabel_New_Register.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_New_Register.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_New_Register.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_New_Register.setText("Create a new account");
        jLabel_New_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_New_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_New_RegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel_CellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextField_CellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel_PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel_New_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_CellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_CellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel_New_Register))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 380, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_XMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_XMouseClicked

    private void jLabel_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minMouseClicked

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jLabel_New_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_New_RegisterMouseClicked

        LoginForm lgf = new LoginForm ();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jLabel_New_RegisterMouseClicked

    private void jTextField_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LastNameActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_CellPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CellPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CellPhoneActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel_CellPhone;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_LastName;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_New_Register;
    private javax.swing.JLabel jLabel_PassWord;
    private javax.swing.JLabel jLabel_Register;
    private javax.swing.JLabel jLabel_X;
    private javax.swing.JLabel jLabel_min;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_CellPhone;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Name;
    // End of variables declaration//GEN-END:variables
}
