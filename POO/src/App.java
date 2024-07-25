public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Animal animal = new Animal("Bestia", 200);
        Gato gato = new Gato("Glottis", 15);
        Perro perro = new Perro("Firulais", 3);

        System.out.println("El animal llamado " + animal.nombre + " hace: ");
        System.out.println(animal.hacerSonido());
        System.out.println("El gato llamado " + gato.nombre + " hace: ");
        System.out.println(gato.hacerSonido());
        System.out.println("El perro llamado " + perro.nombre + " hace: ");
        System.out.println(perro.hacerSonido());

        System.out.println("El total de animales creados es de: " + Animal.getCantAnimales());

        System.out.println("");
    }
}
