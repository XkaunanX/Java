public class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(nombre + " está haciendo un sonido.");
    }
}
