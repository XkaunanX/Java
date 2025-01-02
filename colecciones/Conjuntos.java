import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        // Crear un conjunto
        Set<String> frutas = new HashSet<>();

        // Agregar elementos
        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Naranja");

        // Intentar agregar un elemento duplicado
        frutas.add("Manzana");

        // Mostrar todos los elementos
        System.out.println("Conjunto de frutas: " + frutas);

        // Verificar si un elemento está en el conjunto
        System.out.println("¿Contiene Naranja? " + frutas.contains("Naranja"));

        // Eliminar un elemento
        frutas.remove("Plátano");
        System.out.println("Conjunto después de eliminar: " + frutas);
    }
}
