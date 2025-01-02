public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Fido");
        Animal gato = new Gato("Mishi");

        // Polimorfismo: el método se comporta diferente según el tipo de objeto
        perro.hacerSonido();
        gato.hacerSonido();
    }
}
