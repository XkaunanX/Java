public class ExcepcionesPersonalizadas {
    public static void main(String[] args) {
        try {
            // Llamar a un método que lanza una excepción personalizada
            verificarNumero(-5);
        } catch (MiExcepcion e) {
            // Manejar la excepción personalizada
            System.out.println("Se capturó una excepción personalizada: " + e.getMessage());
        }
    }

    // Método que lanza una excepción personalizada
    public static void verificarNumero(int numero) throws MiExcepcion {
        if (numero < 0) {
            throw new MiExcepcion("El número no puede ser negativo: " + numero);
        }
        System.out.println("El número es válido: " + numero);
    }
}
