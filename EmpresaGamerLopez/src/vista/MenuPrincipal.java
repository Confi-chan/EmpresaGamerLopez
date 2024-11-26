
package vista;

import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

   
    public MenuPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPantallaPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnInicioSesion = new javax.swing.JButton();
        btnQueso = new javax.swing.JButton();
        lblPrecio1 = new javax.swing.JLabel();
        lblPrecio2 = new javax.swing.JLabel();
        btnCastro = new javax.swing.JButton();
        btnMonki = new javax.swing.JButton();
        btnKirby1 = new javax.swing.JButton();
        btnCarreras = new javax.swing.JButton();
        btnstruck2 = new javax.swing.JButton();
        lblPrecio3 = new javax.swing.JLabel();
        lblPrecio4 = new javax.swing.JLabel();
        lblPrecio5 = new javax.swing.JLabel();
        lblPrecio6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPantallaPrincipal.setBackground(new java.awt.Color(204, 102, 255));
        panPantallaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 255, 255));
        lblTitulo.setText("StudioGamer");
        panPantallaPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        btnInicioSesion.setBackground(new java.awt.Color(153, 153, 153));
        btnInicioSesion.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        btnInicioSesion.setText("Inicio de Sesion");
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });
        panPantallaPrincipal.add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        btnQueso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_2293.jpg"))); // NOI18N
        btnQueso.setText("Run ");
        btnQueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuesoActionPerformed(evt);
            }
        });
        panPantallaPrincipal.add(btnQueso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 80, 110));

        lblPrecio1.setBackground(new java.awt.Color(153, 153, 153));
        lblPrecio1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrecio1.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio1.setText("queso $250");
        lblPrecio1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panPantallaPrincipal.add(lblPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        lblPrecio2.setBackground(new java.awt.Color(153, 153, 153));
        lblPrecio2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrecio2.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio2.setText("kirby $450 ");
        lblPrecio2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panPantallaPrincipal.add(lblPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        btnCastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Indieground's Weekly Inspiration Dose #115.jpg"))); // NOI18N
        btnCastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCastroActionPerformed(evt);
            }
        });
        panPantallaPrincipal.add(btnCastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 80, 110));

        btnMonki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/22c31d57ea9aead20babd3432016ac4b.jpg"))); // NOI18N
        btnMonki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonkiActionPerformed(evt);
            }
        });
        panPantallaPrincipal.add(btnMonki, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 80, 110));

        btnKirby1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_2293.jpg"))); // NOI18N
        btnKirby1.setText("Run ");
        btnKirby1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKirby1ActionPerformed(evt);
            }
        });
        panPantallaPrincipal.add(btnKirby1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, 110));

        btnCarreras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Indieground's Weekly Inspiration Dose #115.jpg"))); // NOI18N
        btnCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrerasActionPerformed(evt);
            }
        });
        panPantallaPrincipal.add(btnCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 80, 110));

        btnstruck2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/22c31d57ea9aead20babd3432016ac4b.jpg"))); // NOI18N
        btnstruck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstruck2ActionPerformed(evt);
            }
        });
        panPantallaPrincipal.add(btnstruck2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 80, 110));

        lblPrecio3.setBackground(new java.awt.Color(153, 153, 153));
        lblPrecio3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrecio3.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio3.setText("struck $200");
        lblPrecio3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panPantallaPrincipal.add(lblPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        lblPrecio4.setBackground(new java.awt.Color(153, 153, 153));
        lblPrecio4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrecio4.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio4.setText("Carreras $678");
        lblPrecio4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panPantallaPrincipal.add(lblPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        lblPrecio5.setBackground(new java.awt.Color(153, 153, 153));
        lblPrecio5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrecio5.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio5.setText("castro $300");
        lblPrecio5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panPantallaPrincipal.add(lblPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        lblPrecio6.setBackground(new java.awt.Color(153, 153, 153));
        lblPrecio6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrecio6.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio6.setText("Monki $786");
        lblPrecio6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panPantallaPrincipal.add(lblPrecio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4768220eda2bdf16308f85bc566d46f7.jpg"))); // NOI18N
        jLabel3.setText("Nuevo Vendedor");
        panPantallaPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPantallaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
       abrirSesionAdminOClientes();
 
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void btnQuesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuesoActionPerformed
        
        abrirSesionAdminOClientes();
    }//GEN-LAST:event_btnQuesoActionPerformed

    private void btnKirby1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKirby1ActionPerformed
        abrirSesionAdminOClientes();
    }//GEN-LAST:event_btnKirby1ActionPerformed

    private void btnstruck2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstruck2ActionPerformed
        abrirSesionAdminOClientes();
    }//GEN-LAST:event_btnstruck2ActionPerformed

    private void btnCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrerasActionPerformed
        abrirSesionAdminOClientes();
    }//GEN-LAST:event_btnCarrerasActionPerformed

    private void btnCastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCastroActionPerformed
        abrirSesionAdminOClientes();
    }//GEN-LAST:event_btnCastroActionPerformed

    private void btnMonkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonkiActionPerformed
        abrirSesionAdminOClientes();
    }//GEN-LAST:event_btnMonkiActionPerformed

    /**
     * Método para abrir la ventana de SesionAdminOClientes.
     */
    private void abrirSesionAdminOClientes() {
        SesionAdminOClientes sesion = new SesionAdminOClientes();
        sesion.setVisible(true);
        this.dispose(); // Cierra la ventana actual si es necesario
    }

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarreras;
    private javax.swing.JButton btnCastro;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnKirby1;
    private javax.swing.JButton btnMonki;
    private javax.swing.JButton btnQueso;
    private javax.swing.JButton btnstruck2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblPrecio4;
    private javax.swing.JLabel lblPrecio5;
    private javax.swing.JLabel lblPrecio6;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panPantallaPrincipal;
    // End of variables declaration//GEN-END:variables
}
