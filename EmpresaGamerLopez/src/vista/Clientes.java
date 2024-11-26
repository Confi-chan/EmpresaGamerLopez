
package vista;

import Conexion.ConectarBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Clientes extends javax.swing.JFrame {

    
    public Clientes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panRegistro = new javax.swing.JPanel();
        lblNombreCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        btnNuevoRegistro = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panRegistro.setBackground(new java.awt.Color(102, 23, 124));
        panRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        lblNombreCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCliente.setText("Nombre");

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnNuevoRegistro.setText("Nuevo Registro");
        btnNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRegistroLayout = new javax.swing.GroupLayout(panRegistro);
        panRegistro.setLayout(panRegistroLayout);
        panRegistroLayout.setHorizontalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addComponent(btnIniciarSesion)
                        .addGap(31, 31, 31)
                        .addComponent(btnNuevoRegistro)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCliente)
                            .addComponent(lblCorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCliente)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
        );
        panRegistroLayout.setVerticalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCliente)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarSesion)
                    .addComponent(btnNuevoRegistro))
                .addGap(52, 52, 52))
        );

        jPanel1.add(panRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 290, 290));

        lblTitulo.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 255));
        lblTitulo.setText("StudioGamer");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/9a4d208dd62d64eb531cac2248f9abfe.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 470, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4768220eda2bdf16308f85bc566d46f7.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 630, 416));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
         String correo = txtCorreo.getText();
        String nombre = txtNombreCliente.getText();

        if (correo.isEmpty() || nombre.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar si el cliente existe en la base de datos
        if (existeCliente(correo, nombre)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            // Abrir la ventana principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente no registrado. Por favor, regístrese primero.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
    
    private void btnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistroActionPerformed
            String nombre = txtNombreCliente.getText();
        String correo = txtCorreo.getText();

        if (nombre.isEmpty() || correo.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conexion = new ConectarBase().conectarBase()) {
            String query = "INSERT INTO clientes (nombre_cliente, correo_cliente) VALUES (?, ?)";
            try (PreparedStatement pstmt = conexion.prepareStatement(query)) {
                pstmt.setString(1, nombre);
                pstmt.setString(2, correo);

                int filasAfectadas = pstmt.executeUpdate();
                if (filasAfectadas > 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    txtNombreCliente.setText("");
                    txtCorreo.setText("");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "No se pudo registrar el cliente.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en la base de datos: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean existeCliente(String correo, String nombre) {
        try (Connection conexion = new ConectarBase().conectarBase()) {
            String query = "SELECT COUNT(*) FROM clientes WHERE correo_cliente = ? AND nombre_cliente = ?";
            try (PreparedStatement pstmt = conexion.prepareStatement(query)) {
                pstmt.setString(1, correo);
                pstmt.setString(2, nombre);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        return rs.getInt(1) > 0; // Devuelve true si el cliente existe
                    }
                }
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al verificar cliente: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        return false;

    }//GEN-LAST:event_btnNuevoRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panRegistro;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables

    private boolean existeCliente(String correo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class SeleccionProductos {

        public SeleccionProductos() {
        }

        private SeleccionProductos(int idCliente) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }



        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        
    }
}
