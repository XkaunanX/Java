import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.*;
import java.net.InetSocketAddress;

public class ServidorHTTP {
    public static void main(String[] args) throws IOException {
        // Crear el servidor en el puerto 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        System.out.println("Servidor HTTP iniciado en http://localhost:8000");

        // Definir el contexto de la petición
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "¡Hola, mundo!";
                exchange.sendResponseHeaders(200, response.getBytes().length);

                // Enviar la respuesta
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });

        // Iniciar el servidor
        server.start();
    }
}
