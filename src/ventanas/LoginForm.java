/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author familia
 */
public class LoginForm extends javax.swing.JFrame {
    private Object pass;

   
    public boolean mostrar = false;
    
    
    
    
    public LoginForm() {
        initComponents();
        jTextField_Visible.setVisible(true);
        jTextField_Visible.setVisible(false);
       
       this.setLocationRelativeTo(null);
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
        jLabel_Close = new javax.swing.JLabel();
        jLabel_Login = new javax.swing.JLabel();
        jLabel_minimalise = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordFieldOculto = new javax.swing.JPasswordField();
        jTextField_Username = new javax.swing.JTextField();
        jButton_Cancel = new javax.swing.JButton();
        jButton_Entrar = new javax.swing.JButton();
        jLabel_New_Account = new javax.swing.JLabel();
        jTextField_Visible = new javax.swing.JTextField();
        jButton_Ver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel_Close.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Close.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Close.setText("X");
        jLabel_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jLabel_Login.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Login.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel_Login.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Login.setText("Login Form");

        jLabel_minimalise.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_minimalise.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel_minimalise.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_minimalise.setText("-");
        jLabel_minimalise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimalise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimaliseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(jLabel_minimalise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Close)
                    .addComponent(jLabel_Login)
                    .addComponent(jLabel_minimalise))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 130, 80, 20);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 160, 80, 20);

        jPasswordFieldOculto.setBackground(new java.awt.Color(108, 112, 137));
        jPasswordFieldOculto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldOcultoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldOcultoFocusLost(evt);
            }
        });
        jPasswordFieldOculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldOcultoActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordFieldOculto);
        jPasswordFieldOculto.setBounds(120, 160, 210, 26);

        jTextField_Username.setEditable(false);
        jTextField_Username.setBackground(new java.awt.Color(108, 112, 137));
        jTextField_Username.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Username);
        jTextField_Username.setBounds(120, 130, 210, 26);

        jButton_Cancel.setBackground(new java.awt.Color(142, 38, 19));
        jButton_Cancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Cancel);
        jButton_Cancel.setBounds(120, 210, 100, 40);

        jButton_Entrar.setBackground(new java.awt.Color(34, 167, 240));
        jButton_Entrar.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Entrar.setText("Entrar");
        jButton_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EntrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Entrar);
        jButton_Entrar.setBounds(230, 210, 100, 40);

        jLabel_New_Account.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_New_Account.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_New_Account.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_New_Account.setText("Create a new account");
        jLabel_New_Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_New_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_New_AccountMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_New_Account);
        jLabel_New_Account.setBounds(140, 270, 160, 17);

        jTextField_Visible.setEditable(false);
        jTextField_Visible.setBackground(new java.awt.Color(108, 112, 137));
        jTextField_Visible.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Visible.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_VisibleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_VisibleFocusLost(evt);
            }
        });
        jTextField_Visible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_VisibleActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Visible);
        jTextField_Visible.setBounds(120, 180, 210, 26);

        jButton_Ver.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jButton_Ver.setText("ver");
        jButton_Ver.setMaximumSize(new java.awt.Dimension(89, 40));
        jButton_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VerActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Ver);
        jButton_Ver.setBounds(330, 160, 40, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formHierarchyChanged

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jPasswordFieldOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldOcultoActionPerformed
       
        
    }//GEN-LAST:event_jPasswordFieldOcultoActionPerformed

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
     System.exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_minimaliseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimaliseMouseClicked
        
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimaliseMouseClicked

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EntrarActionPerformed
        // TODO add your handling code here:
        // para cuando uno a ingresar
        
// ------ >contraseÑa para ingresar <------
        if (jPasswordFieldOculto.getText().equals("1234567") || jTextField_Visible.getText().equals("1234567"))
        {
            JOptionPane.showMessageDialog(null, "Bienvenido");
        }else{
            JOptionPane.showMessageDialog(null,"Usted no se encuentra actualmente logiado");
        } 
    }//GEN-LAST:event_jButton_EntrarActionPerformed

    private void jLabel_New_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_New_AccountMouseClicked
        
        RegisterForm rgf = new RegisterForm ();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_New_AccountMouseClicked

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
       if (jTextField_Username.getText().trim().toLowerCase().equals("Username")) 
       {
         jTextField_Username.setText("");
         jTextField_Username.setForeground(Color.black);
       }
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost
        // TODO add your handling code here:
    if (jTextField_Username.getText().trim().equals("") ||
        jTextField_Username.getText().trim().toLowerCase().equals("Username"))
         {
            jTextField_Username.setText("Username");
            jTextField_Username.setForeground(new Color(153,153,153));
         }
              jTextField_Username.setBorder(null);
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    private void jPasswordFieldOcultoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldOcultoFocusGained
        // TODO add your handling code here:
        String pass = String.valueOf(jPasswordFieldOculto.getPassword());
        
        if (pass.trim().toLowerCase().equals("password"))
            
         {
            jPasswordFieldOculto.setText("Password");
            jPasswordFieldOculto.setForeground(Color.black);
         }
              jTextField_Username.setBorder(null);
        
    }//GEN-LAST:event_jPasswordFieldOcultoFocusGained

    private void jPasswordFieldOcultoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldOcultoFocusLost
        // TODO add your handling code here:
        
        String pass = String.valueOf(jPasswordFieldOculto.getPassword());
        
        if(pass.trim().equals("")|| pass.trim().toLowerCase().equals("Password"))
        {
            jPasswordFieldOculto.setText("Password");
            jPasswordFieldOculto.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordFieldOcultoFocusLost

    private void jTextField_VisibleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_VisibleFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_VisibleFocusGained

    private void jTextField_VisibleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_VisibleFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_VisibleFocusLost

    private void jTextField_VisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_VisibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_VisibleActionPerformed

    private void jButton_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VerActionPerformed
        // TODO add your handling code here:
        if (mostrar)
        {
            jTextField_Visible.setVisible(true);
            jPasswordFieldOculto.setVisible(false);
            jTextField_Visible.setText(jPasswordFieldOculto.getText());
            mostrar = false; 
        }else {
            jTextField_Visible.setVisible(true);
            jPasswordFieldOculto.setVisible(false);
            jPasswordFieldOculto.setText(jTextField_Visible.getText());
            mostrar = true;
        }
    }//GEN-LAST:event_jButton_VerActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Entrar;
    private javax.swing.JButton jButton_Ver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JLabel jLabel_New_Account;
    private javax.swing.JLabel jLabel_minimalise;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldOculto;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JTextField jTextField_Visible;
    // End of variables declaration//GEN-END:variables
}
