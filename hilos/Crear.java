public class CreacionHilos {
    public static void main(String[] args) {
        // Creación de hilo usando la clase Thread
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hilo 1 - Contador: " + i);
                try {
                    Thread.sleep(500); // Pausa de 500 ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Creación de hilo usando Runnable
        Runnable tarea = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hilo 2 - Contador: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread hilo2 = new Thread(tarea);

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
    }
}
