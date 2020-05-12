/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

/**
 *
 * @author familia
 */
public class Menu_Form extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Form
     */
    public Menu_Form() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        this.jButton_Menu.setSelected(true);
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel_title = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnmenu = new javax.swing.JPanel();
        jButton_home = new javax.swing.JButton();
        jButton_ventas = new javax.swing.JButton();
        jButton_productos = new javax.swing.JButton();
        jButton_canchas = new javax.swing.JButton();
        jButton_partidas = new javax.swing.JButton();
        jButton_Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(6, 17, 44));

        jPanel1.setBackground(new java.awt.Color(6, 17, 44));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jPanel_title.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 18)); // NOI18N
        jPanel_title.setForeground(new java.awt.Color(255, 161, 0));
        jPanel_title.setText("MENU");

        jLabel_minimize.setBackground(new java.awt.Color(255, 161, 0));
        jLabel_minimize.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel_minimize.setForeground(new java.awt.Color(255, 161, 0));
        jLabel_minimize.setText("-");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
        });

        jLabel_close.setBackground(new java.awt.Color(255, 161, 0));
        jLabel_close.setFont(new java.awt.Font("Lucida Grande", 1, 19)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(255, 161, 0));
        jLabel_close.setText("x");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(2, 10, 44));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        pnmenu.setBackground(new java.awt.Color(7, 7, 53));

        jButton_home.setBackground(new java.awt.Color(9, 30, 55));
        jButton_home.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_home.setForeground(new java.awt.Color(255, 255, 255));
        jButton_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/casa.png"))); // NOI18N
        jButton_home.setText("HOME");
        jButton_home.setAutoscrolls(true);
        jButton_home.setIconTextGap(70);
        jButton_home.setPreferredSize(new java.awt.Dimension(127, 29));
        jButton_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_homeActionPerformed(evt);
            }
        });

        jButton_ventas.setBackground(new java.awt.Color(9, 30, 55));
        jButton_ventas.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_ventas.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuenta.png"))); // NOI18N
        jButton_ventas.setText("VENTAS");
        jButton_ventas.setIconTextGap(60);
        jButton_ventas.setPreferredSize(new java.awt.Dimension(127, 29));
        jButton_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ventasActionPerformed(evt);
            }
        });

        jButton_productos.setBackground(new java.awt.Color(9, 30, 55));
        jButton_productos.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_productos.setForeground(new java.awt.Color(255, 255, 255));
        jButton_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos.png"))); // NOI18N
        jButton_productos.setText("PRODUCTOS");
        jButton_productos.setIconTextGap(25);
        jButton_productos.setPreferredSize(new java.awt.Dimension(127, 29));
        jButton_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_productosActionPerformed(evt);
            }
        });

        jButton_canchas.setBackground(new java.awt.Color(9, 30, 55));
        jButton_canchas.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_canchas.setForeground(new java.awt.Color(255, 255, 255));
        jButton_canchas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/canchas.png"))); // NOI18N
        jButton_canchas.setText("  CANCHAS");
        jButton_canchas.setIconTextGap(30);
        jButton_canchas.setPreferredSize(new java.awt.Dimension(127, 29));
        jButton_canchas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_canchasActionPerformed(evt);
            }
        });

        jButton_partidas.setBackground(new java.awt.Color(9, 30, 55));
        jButton_partidas.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_partidas.setForeground(new java.awt.Color(255, 255, 255));
        jButton_partidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Partidas.png"))); // NOI18N
        jButton_partidas.setText("PARTIDAS");
        jButton_partidas.setIconTextGap(40);
        jButton_partidas.setPreferredSize(new java.awt.Dimension(127, 29));
        jButton_partidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_partidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnmenuLayout = new javax.swing.GroupLayout(pnmenu);
        pnmenu.setLayout(pnmenuLayout);
        pnmenuLayout.setHorizontalGroup(
            pnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_canchas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jButton_productos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_ventas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_partidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnmenuLayout.setVerticalGroup(
            pnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnmenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_canchas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_partidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jPanel3.add(pnmenu);

        jButton_Menu.setBackground(new java.awt.Color(9, 30, 55));
        jButton_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multimedia.png"))); // NOI18N
        jButton_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Menu)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 356, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_close)
                        .addComponent(jLabel_minimize))
                    .addComponent(jButton_Menu, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.ORANGE);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.ORANGE);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MenuActionPerformed
        // TODO add your handling code here:
        // part of menu despegable
        int posicion = this.pnmenu.getX();
        if (posicion > -1)
        {
            Animacion.Animacion.mover_izquierda(0, -188, 2, 2, pnmenu);
        } else 
        {
            Animacion.Animacion.mover_derecha(-188, 0, 2, 2, pnmenu);
        }
    }//GEN-LAST:event_jButton_MenuActionPerformed

    private void jButton_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_homeActionPerformed
        // TODO add your handling code here:
        if (! this.jButton_home.isSelected())
        {
            this.jButton_home.setBackground(new Color(0,84,104));
        }else 
        {
           this.jButton_home.setBackground (new Color(9,30,55));  
        }
    }//GEN-LAST:event_jButton_homeActionPerformed

    private void jButton_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ventasActionPerformed
        // TODO add your handling code here:
        if (! this.jButton_ventas.isSelected())
        {
            this.jButton_ventas.setBackground(new Color(0,84,104));
        }else 
        {
           this.jButton_ventas.setBackground (new Color(9,30,55));  
        }
    }//GEN-LAST:event_jButton_ventasActionPerformed

    private void jButton_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_productosActionPerformed
        // TODO add your handling code here:
        if (! this.jButton_productos.isSelected())
        {
            this.jButton_productos.setBackground(new Color(0,84,104));
        }else 
        {
           this.jButton_productos.setBackground (new Color(9,30,55));  
        }
    }//GEN-LAST:event_jButton_productosActionPerformed

    private void jButton_canchasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_canchasActionPerformed
        // TODO add your handling code here:
        if (! this.jButton_canchas.isSelected())
        {
            this.jButton_canchas.setBackground(new Color(0,84,104));
        }else 
        {
           this.jButton_canchas.setBackground (new Color(9,30,55));  
        }
    }//GEN-LAST:event_jButton_canchasActionPerformed

    private void jButton_partidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_partidasActionPerformed
        // TODO add your handling code here:
        if (! this.jButton_partidas.isSelected())
        {
            this.jButton_partidas.setBackground(new Color(0,84,104));
        }else 
        {
           this.jButton_partidas.setBackground (new Color(9,30,55));  
        }
    }//GEN-LAST:event_jButton_partidasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Menu;
    private javax.swing.JButton jButton_canchas;
    private javax.swing.JButton jButton_home;
    private javax.swing.JButton jButton_partidas;
    private javax.swing.JButton jButton_productos;
    private javax.swing.JButton jButton_ventas;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jPanel_title;
    private javax.swing.JPanel pnmenu;
    // End of variables declaration//GEN-END:variables
}
