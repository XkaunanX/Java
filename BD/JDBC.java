import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tu_base_de_datos"; // Cambia la URL de la base de datos
        String usuario = "root"; // Cambia según tu configuración
        String contrasena = ""; // Cambia según tu configuración

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena)) {
            System.out.println("Conexión exitosa a la base de datos.");

            // Crear una tabla de ejemplo
            String crearTabla = "CREATE TABLE IF NOT EXISTS usuarios (id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(50), edad INT)";
            conexion.createStatement().execute(crearTabla);

            // Insertar datos
            String insertar = "INSERT INTO usuarios (nombre, edad) VALUES (?, ?)";
            try (PreparedStatement ps = conexion.prepareStatement(insertar)) {
                ps.setString(1, "Juan");
                ps.setInt(2, 25);
                ps.executeUpdate();
            }

            // Consultar datos
            String consulta = "SELECT * FROM usuarios";
            try (PreparedStatement ps = conexion.prepareStatement(consulta); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre") + ", Edad: " + rs.getInt("edad"));
                }
            }

        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}
