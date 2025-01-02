import java.util.Arrays;
import java.util.List;

public class ApiStreams {
    public static void main(String[] args) {
        // Lista de ejemplo
        List<String> nombres = Arrays.asList("Juan", "Ana", "Luis", "María", "Pedro");

        // Uso básico de Streams: filtrar y contar
        long conteo = nombres.stream()
                .filter(nombre -> nombre.length() > 3) // Operación intermedia
                .count(); // Operación final

        System.out.println("Nombres con más de 3 letras: " + conteo);

        // Transformar elementos usando map
        nombres.stream()
                .map(String::toUpperCase) // Operación intermedia
                .forEach(System.out::println); // Operación final
    }
}
