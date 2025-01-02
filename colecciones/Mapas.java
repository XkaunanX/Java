import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        // Crear un mapa
        Map<Integer, String> estudiantes = new HashMap<>();

        // Agregar pares clave-valor
        estudiantes.put(1, "Juan");
        estudiantes.put(2, "Ana");
        estudiantes.put(3, "Luis");

        // Mostrar el mapa completo
        System.out.println("Mapa completo: " + estudiantes);

        // Acceder a un valor por su clave
        System.out.println("Estudiante con ID 1: " + estudiantes.get(1));

        // Recorrer el mapa
        System.out.println("Todos los estudiantes:");
        for (Map.Entry<Integer, String> entrada : estudiantes.entrySet()) {
            System.out.println("ID: " + entrada.getKey() + ", Nombre: " + entrada.getValue());
        }

        // Eliminar un elemento por clave
        estudiantes.remove(2);
        System.out.println("Mapa después de eliminar: " + estudiantes);
    }
}
