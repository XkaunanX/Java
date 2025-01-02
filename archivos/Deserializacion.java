import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializacion {
    public static void main(String[] args) {
        String rutaArchivo = "persona.ser";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            Persona persona = (Persona) ois.readObject();
            System.out.println("Objeto deserializado: " + persona);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error durante la deserialización: " + e.getMessage());
        }
    }
}
