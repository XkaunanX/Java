public class Coche {
    // Atributos
    String marca;
    String modelo;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método
    public void arrancar() {
        System.out.println("El coche " + marca + " " + modelo + " está arrancando.");
    }
}
