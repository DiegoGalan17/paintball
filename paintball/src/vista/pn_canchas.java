/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import vista.Login_Form;
import control.BaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author familia
 */
public final class pn_canchas extends javax.swing.JPanel {

    /**
     * Creates new form pn_canchas
     */
    public pn_canchas() {
        initComponents();
        this.getDataCanchas();
    }

    public void getDataCanchas() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Disponibilidad");

        PreparedStatement ps = null;
        ResultSet res = null;
        BaseDatos db = new BaseDatos();
        Connection conexion = (Connection) db.crearConexion();

        try {
            String query = "select * from canchas";
            ps = conexion.prepareStatement(query);
            res = ps.executeQuery();
            String disponibilidad = null;
            while (res.next()) {
                if (res.getInt(2) == 1) {
                    disponibilidad = "Si";
                } else {
                    disponibilidad = "No";
                }
                model.addRow(new Object[]{res.getInt(1), disponibilidad});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTable_DataCanchas.setModel(model);
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
        jScrollPane_DataCanchas = new javax.swing.JScrollPane();
        jTable_DataCanchas = new javax.swing.JTable();
        jLabel_Buscarcancha = new javax.swing.JLabel();
        jTextField_BuscarCancha5 = new javax.swing.JTextField();
        jLabel_Buscarcancha3 = new javax.swing.JLabel();
        txtDispEd = new javax.swing.JTextField();
        txtIDEd = new javax.swing.JTextField();
        jLabel_Buscarcancha1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel_Buscarcancha2 = new javax.swing.JLabel();
        jLabel_Buscarcancha4 = new javax.swing.JLabel();
        txtDisp = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButtonvolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_DataCanchas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane_DataCanchas.setViewportView(jTable_DataCanchas);

        jPanel1.add(jScrollPane_DataCanchas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 490, 160));

        jLabel_Buscarcancha.setText("Disponibilidad");
        jPanel1.add(jLabel_Buscarcancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, 30));
        jPanel1.add(jTextField_BuscarCancha5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 360, -1));

        jLabel_Buscarcancha3.setText("Buscar Cancha");
        jPanel1.add(jLabel_Buscarcancha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        txtDispEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDispEdActionPerformed(evt);
            }
        });
        jPanel1.add(txtDispEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 80, -1));

        txtIDEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDEdActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 80, -1));

        jLabel_Buscarcancha1.setText("ID");
        jPanel1.add(jLabel_Buscarcancha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 20));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 90, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 80, -1));

        jLabel_Buscarcancha2.setText("ID");
        jPanel1.add(jLabel_Buscarcancha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 20));

        jLabel_Buscarcancha4.setText("Disponibilidad");
        jPanel1.add(jLabel_Buscarcancha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        txtDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDispActionPerformed(evt);
            }
        });
        jPanel1.add(txtDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 80, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 90, -1));

        jButtonvolver.setText("Volver");
        jButtonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonvolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.jpg"))); // NOI18N
        jLabel1.setText("ddd");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 580, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDispEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDispEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDispEdActionPerformed

    private void txtIDEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDEdActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
        String disponibilidad = txtDisp.getText();

        PreparedStatement ps = null;
        ResultSet res = null;
        BaseDatos db = new BaseDatos();
        Connection conexion = (Connection) db.crearConexion();

        ResultSet rs;
        String registerUserQuery = "INSERT INTO canchas(idCancha, disponibilidad) VALUES (?,?)";

        try {
            ps = conexion.prepareStatement(registerUserQuery);
            ps.setString(1, id);
            ps.setString(2, disponibilidad);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Cancha creada.");
                this.getDataCanchas();

            } else {
                JOptionPane.showMessageDialog(null, "Error: Check Your Information");
            }

        } catch (SQLException ex) {
            Logger.getLogger(pn_canchas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, " Realmente deseas quitar esta cancha ?");
        if (respuesta == 0) {
            DefaultTableModel model = (DefaultTableModel) jTable_DataCanchas.getModel();
            try {
                int row = jTable_DataCanchas.getSelectedRow();
                Object eve = jTable_DataCanchas.getModel().getValueAt(row, 0);
                String delRow = "delete from canchas where idCancha=" + eve;
                PreparedStatement ps = null;
                ResultSet res = null;
                BaseDatos db = new BaseDatos();
                Connection conexion = (Connection) db.crearConexion();
                ps = conexion.prepareStatement(delRow);
                ps.execute();
                model.removeRow(row);
                JOptionPane.showMessageDialog(null, "Cancha eliminada !!");

            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDispActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String id = txtIDEd.getText();
        String disponibilidad = txtDispEd.getText();

        PreparedStatement ps = null;
        ResultSet res = null;
        BaseDatos db = new BaseDatos();
        Connection conexion = (Connection) db.crearConexion();

        ResultSet rs;
        String registerUserQuery = "UPDATE canchas SET disponibilidad = ? WHERE idCancha = ?";

        try {
            ps = conexion.prepareStatement(registerUserQuery);
            ps.setString(1, disponibilidad);
            ps.setString(2, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Cancha actualizada.");
                this.getDataCanchas();

            } else {
                JOptionPane.showMessageDialog(null, "Error: Check Your Information");
            }

        } catch (SQLException ex) {
            Logger.getLogger(pn_canchas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) jTable_DataCanchas.getModel();
        try {
            int row = jTable_DataCanchas.getSelectedRow();
            Object eve = jTable_DataCanchas.getModel().getValueAt(row, 0);
            String query = "select * from canchas where idCancha=" + eve;

            PreparedStatement ps = null;
            ResultSet res = null;
            BaseDatos db = new BaseDatos();
            Connection conexion = (Connection) db.crearConexion();
            ps = conexion.prepareStatement(query);
            res = ps.executeQuery();
            while (res.next()) {
                txtIDEd.setText(res.getString(1));
                txtIDEd.setEditable(false);
                txtDispEd.setText(res.getString(2));
            }

        } catch (Exception e) {
            System.out.println("error");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButtonvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvolverActionPerformed
        // TODO add your handling code here:
        pn_ventas pv = new pn_ventas ();
        pv.setVisible(false);
    }//GEN-LAST:event_jButtonvolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButtonvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Buscarcancha;
    private javax.swing.JLabel jLabel_Buscarcancha1;
    private javax.swing.JLabel jLabel_Buscarcancha2;
    private javax.swing.JLabel jLabel_Buscarcancha3;
    private javax.swing.JLabel jLabel_Buscarcancha4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane_DataCanchas;
    private javax.swing.JTable jTable_DataCanchas;
    private javax.swing.JTextField jTextField_BuscarCancha5;
    private javax.swing.JTextField txtDisp;
    private javax.swing.JTextField txtDispEd;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDEd;
    // End of variables declaration//GEN-END:variables
}
