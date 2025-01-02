import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Concurrencia {
    public static void main(String[] args) {
        // Crear un pool de hilos con 3 hilos
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Definir tareas
        Runnable tarea1 = () -> {
            System.out.println("Tarea 1 ejecutada por " + Thread.currentThread().getName());
        };

        Runnable tarea2 = () -> {
            System.out.println("Tarea 2 ejecutada por " + Thread.currentThread().getName());
        };

        Runnable tarea3 = () -> {
            System.out.println("Tarea 3 ejecutada por " + Thread.currentThread().getName());
        };

        Runnable tarea4 = () -> {
            System.out.println("Tarea 4 ejecutada por " + Thread.currentThread().getName());
        };

        // Enviar tareas al executor
        executor.execute(tarea1);
        executor.execute(tarea2);
        executor.execute(tarea3);
        executor.execute(tarea4);

        // Apagar el executor
        executor.shutdown();
    }
}
