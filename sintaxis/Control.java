public class EstructurasControl {
    public static void main(String[] args) {
        // If-else
        int numero = 5;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }

        // Switch
        int dia = 3;
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            default -> System.out.println("Otro día");
        }

        // Ciclo for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // Ciclo while
        int contador = 3;
        while (contador > 0) {
            System.out.println("Contador: " + contador);
            contador--;
        }
    }
}
