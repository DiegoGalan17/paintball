/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

//import Login_Register_Data.Login_Form;
//import control.BaseDatos;

import java.awt.BorderLayout;

/**
 *
 * @author familia
 */
public class pn_ventas extends javax.swing.JPanel {

    /**
     * Creates new form pnventas
     */
    public pn_ventas() {
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

        jLabel_nameguia = new javax.swing.JLabel();
        jButton_Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_nameguia.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel_nameguia.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nameguia.setText("VENTAS");
        add(jLabel_nameguia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jButton_Regresar.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha-izquierda.png"))); // NOI18N
        jButton_Regresar.setText(" Regresar");
        jButton_Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RegresarMouseClicked(evt);
            }
        });
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegresarActionPerformed(evt);
            }
        });
        add(jButton_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegresarMouseClicked
        // TODO add your handling code here:    
        
        Menu_Form menu = new Menu_Form ();
        menu.setVisible(true);
        
                
    }//GEN-LAST:event_jButton_RegresarMouseClicked

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegresarActionPerformed
        // TODO add your handling code here:
        pn_ventas pv = new pn_ventas ();
        pv.setVisible(false);
        // dispose();
    }//GEN-LAST:event_jButton_RegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_nameguia;
    // End of variables declaration//GEN-END:variables
}
