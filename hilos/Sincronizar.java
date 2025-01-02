class Contador {
    private int cuenta = 0;

    // Método sincronizado para evitar condiciones de carrera
    public synchronized void incrementar() {
        cuenta++;
    }

    public synchronized int obtenerCuenta() {
        return cuenta;
    }
}

public class Sincronizacion {
    public static void main(String[] args) {
        Contador contador = new Contador();

        // Crear dos hilos que acceden al mismo objeto
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
        });

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mostrar el resultado final
        System.out.println("Valor final del contador: " + contador.obtenerCuenta());
    }
}
