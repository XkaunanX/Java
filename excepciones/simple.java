public class ManejoBasico {
    public static void main(String[] args) {
        try {
            // Código que puede generar una excepción
            int numerador = 10;
            int denominador = 0; // Provocará una excepción
            int resultado = numerador / denominador;

            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            // Captura de la excepción
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            // Código que siempre se ejecuta
            System.out.println("Fin del bloque try-catch.");
        }

        // Continuación del programa
        System.out.println("El programa continúa...");
    }
}
