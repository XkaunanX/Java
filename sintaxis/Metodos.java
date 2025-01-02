public class Metodos {
    // Metodo principal
    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("La suma es: " + resultado);

        imprimirMensaje("¡Hola desde un método!");
    }

    // Metodo que suma dos numeros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Metodo que imprime un mensaje
    public static void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
