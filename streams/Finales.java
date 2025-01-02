import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OperacionesFinales {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Sumar todos los números
        int suma = numeros.stream()
                .reduce(0, Integer::sum); // Reduce combina los elementos
        System.out.println("Suma de los números: " + suma);

        // Encontrar el número máximo
        Optional<Integer> maximo = numeros.stream()
                .max(Comparator.naturalOrder()); // Encuentra el máximo
        maximo.ifPresent(valor -> System.out.println("Máximo: " + valor));

        // Encontrar el número mínimo
        Optional<Integer> minimo = numeros.stream()
                .min(Comparator.naturalOrder()); // Encuentra el mínimo
        minimo.ifPresent(valor -> System.out.println("Mínimo: " + valor));

        // Contar los números mayores a 5
        long conteo = numeros.stream()
                .filter(n -> n > 5) // Filtrar
                .count(); // Contar
        System.out.println("Cantidad de números mayores a 5: " + conteo);

        // Imprimir cada elemento
        System.out.println("Números en la lista:");
        numeros.stream()
                .forEach(System.out::println); // Iterar y ejecutar
    }
}
