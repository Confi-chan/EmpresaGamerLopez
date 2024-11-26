package vista;

import Conexion.ConectarBase;
import java.sql.SQLException;



public class Login extends javax.swing.JFrame {

    

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panLogin = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panSesionAdministrativo = new javax.swing.JPanel();
        lblContraseña = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnAgregarAdmin = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panLogin.setBackground(new java.awt.Color(0, 102, 153));
        panLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 255, 255));
        lblTitulo.setText("StudioGamer");
        panLogin.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        panSesionAdministrativo.setBackground(new java.awt.Color(153, 255, 204));
        panSesionAdministrativo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inicio de sesion administrativo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 204, 153))); // NOI18N
        panSesionAdministrativo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblContraseña.setText("Contraseña");
        panSesionAdministrativo.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 133, -1, -1));

        jPassword.setText("jPasswordField1");
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        panSesionAdministrativo.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 137, 131, -1));

        btnIngresar.setBackground(new java.awt.Color(204, 204, 255));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panSesionAdministrativo.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 200, -1, -1));

        btnAgregarAdmin.setBackground(new java.awt.Color(204, 204, 255));
        btnAgregarAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarAdmin.setText("AgregarAdmin");
        btnAgregarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAdminActionPerformed(evt);
            }
        });
        panSesionAdministrativo.add(btnAgregarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 200, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setText("NombreUsuario");
        panSesionAdministrativo.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 78, -1, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        panSesionAdministrativo.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 140, 25));

        panLogin.add(panSesionAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 380, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4768220eda2bdf16308f85bc566d46f7.jpg"))); // NOI18N
        panLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuario = txtUsuario.getText();
    String contraseña = new String(jPassword.getPassword());
    // Validar las credenciales contra la base de datos
    if (validarCredenciales(usuario, contraseña)) {
        // Abrir la clase MenuAdmin
        MenuAdmin menu = new MenuAdmin();
        menu.setVisible(true);
        this.dispose(); // Cerrar ventana actual
    } else {
        // Mostrar mensaje de error
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Usuario o contraseña incorrectos.", 
            "Error", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    
    }

// Método auxiliar para validar credenciales
private boolean validarCredenciales(String usuario, String contraseña) {
    // Simular consulta en base de datos
    // Esto debe reemplazarse con lógica real de base de datos
    String adminUsuario = "admin"; // Usuario de ejemplo
    String adminContraseña = "admin123"; // Contraseña de ejemplo
    
    return usuario.equals(adminUsuario) && contraseña.equals(adminContraseña);

        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnAgregarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdminActionPerformed
         String contraseñaAdmin = javax.swing.JOptionPane.showInputDialog(this, 
        "Ingrese la contraseña del administrador actual:", 
        "Validación de seguridad", 
        javax.swing.JOptionPane.WARNING_MESSAGE);
    
    if (contraseñaAdmin == null) {
        return; // Canceló la acción
    }
    
    ConectarBase conexion = new ConectarBase();
    if (!conexion.validarAdmin("admin", contraseñaAdmin)) { // Cambiar "admin" según sea necesario
        javax.swing.JOptionPane.showMessageDialog(this,
                "Contraseña incorrecta. No se puede agregar un nuevo administrador.",
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
    // Pedir datos del nuevo administrador
    String nuevoUsuario = javax.swing.JOptionPane.showInputDialog(this, 
            "Ingrese el nombre de usuario del nuevo administrador:");
    String nuevaContraseña = javax.swing.JOptionPane.showInputDialog(this, 
            "Ingrese la contraseña del nuevo administrador:");
    if (nuevoUsuario != null && nuevaContraseña != null) {
        if (conexion.agregarAdmin(nuevoUsuario, nuevaContraseña)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Nuevo administrador agregado exitosamente.",
                    "Éxito", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Error al agregar el nuevo administrador.",
                    "Error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

}

// Método auxiliar para validar contraseña del administrador actual
private boolean validarContraseñaAdmin(String contraseña) {
    // Simular consulta en base de datos
    String adminContraseña = "admin123"; // Contraseña de ejemplo
    return contraseña.equals(adminContraseña);
}

// Método auxiliar para guardar nuevo administrador en la base de datos
private boolean guardarNuevoAdmin(String usuario, String contraseña) {
    // Aquí debes implementar la lógica para insertar en la base de datos
    // Simulación: siempre retorna verdadero
    System.out.println("Nuevo admin guardado: " + usuario + ", " + contraseña);
  return true;

    }//GEN-LAST:event_btnAgregarAdminActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAdmin;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panLogin;
    private javax.swing.JPanel panSesionAdministrativo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
