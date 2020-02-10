/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages.view;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import my.packages.Empresa;
import my.packages.Usuario;
import my.packages.utilities.DBconnection;

/**
 *
 * @author Estudiante
 */
public class FormalizacionCompra extends javax.swing.JFrame {

    inicioUsuario inicio;
    Empresa empresa;
    DBconnection connection;
    String name;
    Usuario user;
    String nEvento;
    
    
    public FormalizacionCompra(Empresa empresa, DBconnection connection, String name, Usuario user, String nEvento) {
        this.empresa = empresa;
        this.connection = connection;
        this.name = name;
        this.user = user;
        this.nEvento = nEvento;
        initComponents();
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

        JButton_cerrar2 = new javax.swing.JButton();
        UNTIQUETE2 = new javax.swing.JLabel();
        jButton_atras = new javax.swing.JButton();
        jLabel_tarjeta = new javax.swing.JLabel();
        jLabel_contrasena1 = new javax.swing.JLabel();
        jTextField_tarjeta = new javax.swing.JTextField();
        jButton_comprar1 = new javax.swing.JButton();
        jPasswordField_contrasena = new javax.swing.JPasswordField();
        jLabel_formalizacion = new javax.swing.JLabel();
        jLabel_fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButton_cerrar2.setBackground(new java.awt.Color(255, 0, 0));
        JButton_cerrar2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JButton_cerrar2.setText("Cerrar");
        JButton_cerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_cerrar2ActionPerformed(evt);
            }
        });
        getContentPane().add(JButton_cerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        UNTIQUETE2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        UNTIQUETE2.setForeground(new java.awt.Color(255, 0, 0));
        UNTIQUETE2.setText("UNTIQUETE");
        getContentPane().add(UNTIQUETE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 390, 90));

        ImageIcon imagen4= new ImageIcon(getClass().getResource("/my/packages/utilities/images/atras.jpg"));
        Icon ic4 = new ImageIcon(imagen4.getImage().getScaledInstance(70,30, Image.SCALE_DEFAULT));
        jButton_atras.setIcon(ic4);
        jButton_atras.setBackground(new java.awt.Color(255, 255, 255));
        jButton_atras.setBorder(null);
        jButton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 30));

        jLabel_tarjeta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_tarjeta.setText("Número de la tarjeta:");
        getContentPane().add(jLabel_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jLabel_contrasena1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_contrasena1.setText("Código:");
        getContentPane().add(jLabel_contrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        jTextField_tarjeta.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jTextField_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 280, 40));

        jButton_comprar1.setBackground(new java.awt.Color(255, 255, 0));
        jButton_comprar1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_comprar1.setText("Comprar");
        jButton_comprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_comprar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_comprar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 130, -1));

        jPasswordField_contrasena.setBackground(new java.awt.Color(204, 204, 255));
        jPasswordField_contrasena.setText("jPasswordField1");
        jPasswordField_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_contrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 420, 40));

        jLabel_formalizacion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_formalizacion.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_formalizacion.setText("Formalización de la compra");
        getContentPane().add(jLabel_formalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel_fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/packages/utilities/images/fondo.png")));
        getContentPane().add(jLabel_fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_cerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_cerrar2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JButton_cerrar2ActionPerformed

    private void jButton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atrasActionPerformed
        inicio = new inicioUsuario(empresa, connection, name, user);
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_atrasActionPerformed

    private void jPasswordField_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_contrasenaActionPerformed

    private void jButton_comprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_comprar1ActionPerformed
        CompraExitosa compraExitosa = new CompraExitosa(empresa, connection, name, user, nEvento);
        compraExitosa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_comprar1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormalizacionCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormalizacionCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormalizacionCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormalizacionCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_cerrar2;
    private javax.swing.JLabel UNTIQUETE2;
    private javax.swing.JButton jButton_atras;
    private javax.swing.JButton jButton_comprar1;
    private javax.swing.JLabel jLabel_contrasena1;
    private javax.swing.JLabel jLabel_fondo2;
    private javax.swing.JLabel jLabel_formalizacion;
    private javax.swing.JLabel jLabel_tarjeta;
    private javax.swing.JPasswordField jPasswordField_contrasena;
    private javax.swing.JTextField jTextField_tarjeta;
    // End of variables declaration//GEN-END:variables
}
