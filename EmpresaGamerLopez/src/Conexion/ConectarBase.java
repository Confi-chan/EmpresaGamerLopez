package Conexion;
import java.sql.Connection;//establecer conexion a BD
import java.sql.DriverManager;//Enlace de conexion entre BD y Java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ConectarBase {
      public Connection cn;
    public Statement stmt;
    public ResultSet rs;

    // Método para establecer la conexión
    public void conectarBDOracle() {
        try {
            // Cargar el controlador JDBC
           Class.forName("oracle.jdbc.driver.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:XE";
String user = "EmpresaGamer";
String password = "2024gamer";
Connection conn = DriverManager.getConnection(url, user,password);

            // Establecer conexión con la base de datos
            cn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "EmpresaGamer", "2024gamer");

            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "***** Conexion Empresa Gamer ****\n\n** Ariel Sofia Lopez Amaya ***");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: No se encontró el controlador JDBC.\n" + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.\n" + e.getMessage());
        }
    }

    // Método para obtener la conexión
    public Connection getConexion() {
        return cn;
    }

    // Método para cerrar la conexión
    public void cerrarConexion() {
        try {
            if (cn != null && !cn.isClosed()) {
                cn.close();
                JOptionPane.showMessageDialog(null, "Conexión cerrada exitosamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión.\n" + e.getMessage());
        }
    }

    public Connection conectarBase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean validarAdmin(String admin, String contraseñaAdmin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean agregarAdmin(String nuevoUsuario, String nuevaContraseña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


   

