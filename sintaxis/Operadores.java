public class Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos
        int suma = 5 + 3;
        int resta = 10 - 4;
        int multiplicacion = 7 * 2;
        double division = 10.0 / 3.0;
        int modulo = 10 % 3;

        // Operadores de comparacion
        boolean esMayor = 5 > 3;
        boolean esIgual = 5 == 5;

        // Operadores logicos
        boolean yLogico = (5 > 3) && (4 < 6);
        boolean oLogico = (5 > 3) || (4 > 6);

        // Imprimir resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
        System.out.println("Mayor que: " + esMayor);
        System.out.println("Igual: " + esIgual);
        System.out.println("Y lógico: " + yLogico);
        System.out.println("O lógico: " + oLogico);
    }
}
