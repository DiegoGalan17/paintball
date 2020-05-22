/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Login_Register_Data.Login_Form;
import control.BaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class n_productos extends javax.swing.JFrame {

    /**
     * Creates new form n_productos
     */
    public n_productos() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_nombreProduc = new javax.swing.JLabel();
        jLabel_precioProducto = new javax.swing.JLabel();
        jLabel_precioProducto1 = new javax.swing.JLabel();
        jLabel_Codigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtSt = new javax.swing.JTextField();
        textNombreP = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel_Tipo = new javax.swing.JLabel();
        jLabel_Provedor = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox();
        textProvedor = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel_paravencimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Dia = new javax.swing.JLabel();
        jLabel_Mes = new javax.swing.JLabel();
        jTextField_mes = new javax.swing.JTextField();
        jLabel_año = new javax.swing.JLabel();
        jTextField_aÑo = new javax.swing.JTextField();
        jTextField_dia = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel_buscarpnombre = new javax.swing.JLabel();
        textBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jButton_Cerrar = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Guardar = new javax.swing.JButton();
        jButton_nuevo = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jButton_Regresar = new javax.swing.JButton();
        jLabel_img_fondo = new javax.swing.JLabel();
        jLabel_nameguia1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_nombreProduc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_nombreProduc.setText("NOMBRE");
        jPanel3.add(jLabel_nombreProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel_precioProducto.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_precioProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/precios.png"))); // NOI18N
        jLabel_precioProducto.setText("PRECIO");
        jLabel_precioProducto.setIconTextGap(20);
        jPanel3.add(jLabel_precioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel_precioProducto1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_precioProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caja.png"))); // NOI18N
        jLabel_precioProducto1.setText("STOCK");
        jLabel_precioProducto1.setIconTextGap(20);
        jPanel3.add(jLabel_precioProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel_Codigo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_Codigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horizontal.png"))); // NOI18N
        jLabel_Codigo.setText("CODIGO");
        jLabel_Codigo.setIconTextGap(20);
        jPanel3.add(jLabel_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPanel3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 180, 30));
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 180, 30));
        jPanel3.add(txtSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, 30));
        jPanel3.add(textNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 180, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 190));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel_Tipo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_Tipo.setText("TIPO");

        jLabel_Provedor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_Provedor.setText("PROVEDOR");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bebida", "Mecato", "Recargas", "Implementos" }));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/herramientas-y-utensilios.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel_Provedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel_Tipo)
                        .addGap(18, 18, 18)
                        .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Tipo)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Provedor)
                    .addComponent(textProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 320, 90));

        jPanel_paravencimiento.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Fecha de Vencimiento");

        jLabel_Dia.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_Dia.setText("Dia");

        jLabel_Mes.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_Mes.setText("Mes");

        jLabel_año.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_año.setText("Año");

        javax.swing.GroupLayout jPanel_paravencimientoLayout = new javax.swing.GroupLayout(jPanel_paravencimiento);
        jPanel_paravencimiento.setLayout(jPanel_paravencimientoLayout);
        jPanel_paravencimientoLayout.setHorizontalGroup(
            jPanel_paravencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_paravencimientoLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_paravencimientoLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel_Dia)
                .addGap(4, 4, 4)
                .addComponent(jTextField_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Mes)
                .addGap(4, 4, 4)
                .addComponent(jTextField_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel_año)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_aÑo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel_paravencimientoLayout.setVerticalGroup(
            jPanel_paravencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_paravencimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_paravencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Dia)
                    .addComponent(jLabel_Mes)
                    .addComponent(jLabel_año)
                    .addComponent(jTextField_aÑo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_paravencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 310, 70));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jLabel_buscarpnombre.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel_buscarpnombre.setText("Buscar por Nombre");

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatos);

        jButton_Cerrar.setText("Cerrar");
        jButton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel_buscarpnombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBuscar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Cerrar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_buscarpnombre)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Cerrar)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 410, -1));

        jButton_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui.png"))); // NOI18N
        jButton_Actualizar.setText("Actualizar");
        jPanel2.add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comercio.png"))); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.setIconTextGap(10);
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 90, -1));

        jButton_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jButton_nuevo.setText("Nuevo");
        jButton_nuevo.setIconTextGap(10);
        jPanel2.add(jButton_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 90, -1));

        jButton_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.setIconTextGap(10);
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 90, -1));

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
        jPanel2.add(jButton_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel_img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.jpg"))); // NOI18N
        jPanel2.add(jLabel_img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -10, 580, 430));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 45, 820, 460));

        jLabel_nameguia1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel_nameguia1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nameguia1.setText("PRODUCTOS");
        jPanel1.add(jLabel_nameguia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CerrarActionPerformed
        // TODO add your handling code here:
        this.doLayout();
    }//GEN-LAST:event_jButton_CerrarActionPerformed

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(null, " Realmente deseas quitar este producto ?");
        if (respuesta == 0) {
            DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
            try {
                int row = tblDatos.getSelectedRow();
                Object eve = tblDatos.getModel().getValueAt(row, 0);
                String delRow = "delete from productos where idProducto="+eve;
                PreparedStatement ps = null;
                ResultSet res = null;
                //              BaseDatos db = new BaseDatos();
                //              Connection conexion = (Connection) db.crearConexion();
                //             ps = conexion.prepareStatement(delRow);
                ps.execute();
                model.removeRow(row);
                JOptionPane.showMessageDialog(null, "Eliminado !!");

            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void jButton_RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegresarMouseClicked
        // TODO add your handling code here:

        Menu_Form menu = new Menu_Form ();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton_RegresarMouseClicked

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegresarActionPerformed
        // TODO add your handling code here:
        pn_ventas pv = new pn_ventas ();
        pv.setVisible(false);
    }//GEN-LAST:event_jButton_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(n_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(n_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(n_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(n_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new n_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboTipo;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Cerrar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JButton jButton_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Codigo;
    private javax.swing.JLabel jLabel_Dia;
    private javax.swing.JLabel jLabel_Mes;
    private javax.swing.JLabel jLabel_Provedor;
    private javax.swing.JLabel jLabel_Tipo;
    private javax.swing.JLabel jLabel_año;
    private javax.swing.JLabel jLabel_buscarpnombre;
    private javax.swing.JLabel jLabel_img_fondo;
    private javax.swing.JLabel jLabel_nameguia1;
    private javax.swing.JLabel jLabel_nombreProduc;
    private javax.swing.JLabel jLabel_precioProducto;
    private javax.swing.JLabel jLabel_precioProducto1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_paravencimiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_aÑo;
    private javax.swing.JTextField jTextField_dia;
    private javax.swing.JTextField jTextField_mes;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textNombreP;
    private javax.swing.JTextField textProvedor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSt;
    // End of variables declaration//GEN-END:variables
}