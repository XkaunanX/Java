import java.io.*;
import java.net.*;

public class ClienteHTTP {
    public static void main(String[] args) throws IOException {
        // URL del servidor HTTP
        URL url = new URL("http://localhost:8000");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Configurar el método GET
        connection.setRequestMethod("GET");

        // Leer la respuesta
        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            // Mostrar la respuesta
            System.out.println("Respuesta del servidor: " + response.toString());
        }
    }
}
