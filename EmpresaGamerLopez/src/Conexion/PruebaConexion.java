
package Conexion;

import java.sql.Connection;
import java.sql.Statement;


public class PruebaConexion {
    public static void main(String[] args) {
        // Crear una instancia de ConectarBase
        ConectarBase conexion = new ConectarBase();

        // Establecer la conexión
        conexion.conectarBDOracle();

        // Obtener la conexión
        Connection conn = conexion.getConexion();

        try {
            // Crear una consulta
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM TU_TABLA"; // Cambia TU_TABLA por el nombre de tu tabla
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);

            // Procesar los resultados
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID") + ", Nombre: " + rs.getString("empresaGamer"));
            }

            // Cerrar los recursos
            rs.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println("Error al realizar la consulta: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            conexion.cerrarConexion();
        }
    }

    private static class ResultSet {

        public ResultSet() {
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getInt(String id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getString(String nombre) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}
