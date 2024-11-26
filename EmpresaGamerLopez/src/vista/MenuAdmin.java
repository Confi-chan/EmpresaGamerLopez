
package vista;
import Conexion.ConectarBase;
import javax.swing.*;
import java.sql.*;



public class MenuAdmin extends javax.swing.JFrame {
      // JDBC connection parameters
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USER = "EmpresaGamer"; // Cambiar con tu usuario
    private static final String DB_PASSWORD = "2024gamer"; // Cambiar con tu contraseña



    
    public MenuAdmin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnNuevoEmpleados = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setText("StudioGamer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnProductos.setBackground(new java.awt.Color(102, 102, 102));
        btnProductos.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btnNuevoEmpleados.setBackground(new java.awt.Color(102, 102, 102));
        btnNuevoEmpleados.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnNuevoEmpleados.setText("Nuevos Empleados");
        btnNuevoEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        btnInventario.setBackground(new java.awt.Color(102, 102, 102));
        btnInventario.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        btnReporte.setBackground(new java.awt.Color(102, 102, 102));
        btnReporte.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnReporte.setText("Reportes");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jtEmpleados.setBackground(new java.awt.Color(102, 255, 153));
        jtEmpleados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre de empleado", "ID", "Rol"
            }
        ));
        jScrollPane1.setViewportView(jtEmpleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 360, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4768220eda2bdf16308f85bc566d46f7.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 617, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Botón Productos
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
          String menu = "1. Añadir producto\n" +
                      "2. Eliminar producto\n" +
                      "3. Listar productos\n" +
                      "4. Actualizar producto\n" +
                      "Selecciona una opción:";
        String opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {
            case "1": insertarProducto();
            case "2": eliminarProducto();
            case "3" : listarProductos();
            case "4" : actualizarProducto();
            default : JOptionPane.showMessageDialog(this, "Opción inválida.");
        }
    }

    private void insertarProducto() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String id = JOptionPane.showInputDialog("ID del producto:");
            String nombre = JOptionPane.showInputDialog("Nombre del producto:");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto:"));
            String licencia = JOptionPane.showInputDialog("Tipo de licencia:");
            int stock = Integer.parseInt(JOptionPane.showInputDialog("Stock inicial:"));

            String query = "INSERT INTO PRODUCTOS (ID_PRODUCTO, NOMBRE, PRECIO, TIPO_LICENCIA, STOCK) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, Integer.parseInt(id));
                stmt.setString(2, nombre);
                stmt.setDouble(3, precio);
                stmt.setString(4, licencia);
                stmt.setInt(5, stock);
                stmt.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Producto añadido.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al insertar producto: " + e.getMessage());
        }
    }

    private void eliminarProducto() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String id = JOptionPane.showInputDialog("ID del producto a eliminar:");
            String query = "DELETE FROM PRODUCTOS WHERE ID_PRODUCTO = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, Integer.parseInt(id));
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Producto eliminado.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un producto con ese ID.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar producto: " + e.getMessage());
        }
    }

    private void listarProductos() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "SELECT * FROM PRODUCTOS";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                StringBuilder lista = new StringBuilder("Productos:\n");
                while (rs.next()) {
                    lista.append("ID: ").append(rs.getInt("ID_PRODUCTO"))
                         .append(", Nombre: ").append(rs.getString("NOMBRE"))
                         .append(", Precio: ").append(rs.getDouble("PRECIO"))
                         .append(", Licencia: ").append(rs.getString("TIPO_LICENCIA"))
                         .append(", Stock: ").append(rs.getInt("STOCK"))
                         .append("\n");
                }
                JOptionPane.showMessageDialog(this, lista.toString());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al listar productos: " + e.getMessage());
        }
    }

    private void actualizarProducto() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String id = JOptionPane.showInputDialog("ID del producto a actualizar:");
            String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre del producto:");
            double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio del producto:"));
            String nuevaLicencia = JOptionPane.showInputDialog("Nuevo tipo de licencia:");
            int nuevoStock = Integer.parseInt(JOptionPane.showInputDialog("Nuevo stock del producto:"));

            String query = "UPDATE PRODUCTOS SET NOMBRE = ?, PRECIO = ?, TIPO_LICENCIA = ?, STOCK = ? WHERE ID_PRODUCTO = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, nuevoNombre);
                stmt.setDouble(2, nuevoPrecio);
                stmt.setString(3, nuevaLicencia);
                stmt.setInt(4, nuevoStock);
                stmt.setInt(5, Integer.parseInt(id));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Producto actualizado exitosamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar producto: " + e.getMessage());
        }
                   
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnNuevoEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadosActionPerformed
      String nombre = txtNombreCliente.getText();
    String correo = txtCorreo.getText();

    if (nombre.isEmpty() || correo.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conexion = new ConectarBase().conectarBase()) {
        String query = "INSERT INTO Clientes (nombre_cliente, correo_cliente) VALUES (?, ?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, correo);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    int idCliente = rs.getInt(1);
                    javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                    // Abrir ventana de selección de productos
                    SeleccionProductos seleccion = new SeleccionProductos(idCliente);
                    seleccion.setVisible(true);
                    this.dispose();
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo registrar el cliente.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error en la base de datos: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

}

private void registrarUsuario() {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
        String id = JOptionPane.showInputDialog("ID del usuario:");
        String usuario = JOptionPane.showInputDialog("Nombre del usuario:");
        String contrasena = JOptionPane.showInputDialog("Contraseña:");
        String rol = JOptionPane.showInputDialog("Rol (e.g., Admin, Empleado):");

        String query = "INSERT INTO USUARIOS (ID_USUARIO, NOMBRE_USUARIO, CONTRASENA, ROL) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, Integer.parseInt(id));
            stmt.setString(2, usuario);
            stmt.setString(3, contrasena);
            stmt.setString(4, rol);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al registrar usuario: " + e.getMessage());
    }

    }//GEN-LAST:event_btnNuevoEmpleadosActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
          listarInventario();
}

private void listarInventario() {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
        String query = "SELECT * FROM PRODUCTOS";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            StringBuilder inventario = new StringBuilder("Inventario:\n");
            while (rs.next()) {
                int stock = rs.getInt("STOCK");
                inventario.append("ID: ").append(rs.getInt("ID_PRODUCTO"))
                          .append(", Nombre: ").append(rs.getString("NOMBRE"))
                          .append(", Precio: ").append(rs.getDouble("PRECIO"))
                          .append(", Licencia: ").append(rs.getString("TIPO_LICENCIA"))
                          .append(", Stock: ").append(stock);
                if (stock < 5) {
                    inventario.append(" *Bajo stock*");
                }
                inventario.append("\n");
            }
            JOptionPane.showMessageDialog(this, inventario.toString());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al listar inventario: " + e.getMessage());
    }
       
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
       String menu = "1. Registrar nueva venta\n" +
                  "2. Listar ventas\n" +
                  "Selecciona una opción:";
    String opcion = JOptionPane.showInputDialog(menu);

    switch (opcion) {
        case "1" : registrarVenta();
        case "2" : listarVentas();
        default : JOptionPane.showMessageDialog(this, "Opción inválida.");
    }
}

private void registrarVenta() {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
        String idVenta = JOptionPane.showInputDialog("ID de la venta:");
        String idCliente = JOptionPane.showInputDialog("ID del cliente:");
        String idProducto = JOptionPane.showInputDialog("ID del producto:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));

        String query = "INSERT INTO VENTAS (ID_VENTA, ID_CLIENTE, ID_PRODUCTO, CANTIDAD) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, Integer.parseInt(idVenta));
            stmt.setInt(2, Integer.parseInt(idCliente));
            stmt.setInt(3, Integer.parseInt(idProducto));
            stmt.setInt(4, cantidad);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Venta registrada exitosamente.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al registrar venta: " + e.getMessage());
    }
}

private void listarVentas() {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
        String query = "SELECT * FROM VENTAS";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            StringBuilder reportes = new StringBuilder("Ventas registradas:\n");
            while (rs.next()) {
                reportes.append("ID Venta: ").append(rs.getInt("ID_VENTA"))
                        .append(", ID Cliente: ").append(rs.getInt("ID_CLIENTE"))
                        .append(", ID Producto: ").append(rs.getInt("ID_PRODUCTO"))
                        .append(", Cantidad: ").append(rs.getInt("CANTIDAD"))
                        .append("\n");
            }
            JOptionPane.showMessageDialog(this, reportes.toString());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al listar ventas: " + e.getMessage());
    }
    }//GEN-LAST:event_btnReporteActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    private void listarUsuarios() {
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

    private static class txtNombreCliente {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public txtNombreCliente() {
        }
    }

    private static class txtCorreo {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public txtCorreo() {
        }
    }
    
    // Data classes
    class Empleado {
        private String nombre, id, rol;

        public Empleado(String nombre, String id, String rol) {
            this.nombre = nombre;
            this.id = id;
            this.rol = rol;
        }
    }
   class Producto {
        private String id, nombre, licencia;
        private double precio;
        private int stock;

        public Producto(String id, String nombre, double precio, String licencia, int stock) {
            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
            this.licencia = licencia;
            this.stock = stock;
        }
      public String getId() {
            return id;
        }

        public int getStock() {
            return stock;
        }

        @Override
        public String toString() {
            return String.format("ID: %s, Nombre: %s, Precio: %.2f, Licencia: %s, Stock: %d",
                    id, nombre, precio, licencia, stock);
        }
    }

    class Reporte {
        private String idVenta, idCliente, idProducto;
        private int cantidad;
        private String fecha;

        public Reporte(String idVenta, String idCliente, String idProducto, int cantidad, String fecha) {
            this.idVenta = idVenta;
            this.idCliente = idCliente;
            this.idProducto = idProducto;
            this.cantidad = cantidad;
            this.fecha = fecha;
        }

        @Override
        public String toString() {
            return String.format("ID Venta: %s, ID Cliente: %s, ID Producto: %s, Cantidad: %d, Fecha: %s",
                    idVenta, idCliente, idProducto, cantidad, fecha);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnNuevoEmpleados;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEmpleados;
    // End of variables declaration//GEN-END:variables
}
