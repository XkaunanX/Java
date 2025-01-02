import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    public static void main(String[] args) {
        String rutaArchivo = "archivo.txt"; // Se creará o sobreescribirá este archivo

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            bw.write("Primera línea de texto.");
            bw.newLine();
            bw.write("Segunda línea de texto.");
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
