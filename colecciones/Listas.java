import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // Crear una lista
        List<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Luis");

        // Mostrar todos los elementos
        System.out.println("Lista completa: " + nombres);

        // Acceder a un elemento por índice
        System.out.println("Primer elemento: " + nombres.get(0));

        // Recorrer la lista
        System.out.println("Elementos:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }

        // Eliminar un elemento
        nombres.remove("Ana");
        System.out.println("Lista después de eliminar: " + nombres);
    }
}
