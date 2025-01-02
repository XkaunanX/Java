import java.util.LinkedList;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        // Crear una cola
        Queue<String> tareas = new LinkedList<>();

        // Agregar elementos (encolar)
        tareas.add("Hacer la compra");
        tareas.add("Estudiar Java");
        tareas.add("Ir al gimnasio");

        // Mostrar toda la cola
        System.out.println("Cola completa: " + tareas);

        // Obtener el primer elemento sin eliminarlo
        System.out.println("Primera tarea: " + tareas.peek());

        // Eliminar elementos (desencolar)
        System.out.println("Tarea realizada: " + tareas.poll());
        System.out.println("Cola después de realizar una tarea: " + tareas);

        // Verificar si la cola está vacía
        System.out.println("¿Cola vacía? " + tareas.isEmpty());
    }
}
