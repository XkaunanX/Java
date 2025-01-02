import java.io.*;
import java.net.*;

public class ClienteSocket {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Conectado al servidor.");

            // Crear streams de entrada y salida
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Enviar un mensaje al servidor
            writer.println("¡Hola, servidor!");

            // Leer la respuesta del servidor
            String respuesta = reader.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
