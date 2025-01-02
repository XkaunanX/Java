import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperacionesIntermedias {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Filtrar números pares
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtrar
                .collect(Collectors.toList());
        System.out.println("Números pares: " + pares);

        // Transformar cada número multiplicándolo por 2
        List<Integer> multiplicados = numeros.stream()
                .map(n -> n * 2) // Transformar
                .collect(Collectors.toList());
        System.out.println("Números multiplicados por 2: " + multiplicados);

        // Limitar el flujo a los primeros 3 elementos
        List<Integer> primerosTres = numeros.stream()
                .limit(3) // Limitar
                .collect(Collectors.toList());
        System.out.println("Primeros tres números: " + primerosTres);

        // Saltar los primeros 3 elementos
        List<Integer> restantes = numeros.stream()
                .skip(3) // Saltar
                .collect(Collectors.toList());
        System.out.println("Números restantes: " + restantes);
    }
}
