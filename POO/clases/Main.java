public class Main {
    public static void main(String[] args) {
        // Crear instancia de la clase Persona
        Persona persona = new Persona("Juan", 25);
        persona.mostrarInformacion();

        // Crear objetos
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Focus");

        // Usar métodos
        coche1.arrancar();
        coche2.arrancar();
    }
}
