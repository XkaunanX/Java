import java.io.*;
import java.net.*;

public class ServidorSocket {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Servidor esperando conexiones...");

            // Aceptar una conexión de un cliente
            try (Socket socket = serverSocket.accept()) {
                System.out.println("Cliente conectado desde: " + socket.getInetAddress());

                // Crear streams de entrada y salida
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);

                // Leer mensaje del cliente
                String mensaje = reader.readLine();
                System.out.println("Mensaje recibido: " + mensaje);

                // Responder al cliente
                writer.println("Mensaje recibido: " + mensaje);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
