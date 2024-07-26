import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();
        System.out.println("Bienvenidos a la fiesta de los superheroes");

        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("CatWoman");
        superHeroes.add("Hulk");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Superman");

        // Despues llego tarde nuestro superheroe estrella

        superHeroes.add("Iron Man");

        if (superHeroes.contains("Spiderman")) {
            System.out.println("Spiderman esta en la fiesta");
        }

        System.out.println("Hay un superheroe que ya esta ebrio, el superheroe ebrio es: " + superHeroes.get(0));

        superHeroes.set((6), "Tony Stark");
        System.out.println("Ironman se saca el traje mostrando su verdadera identidad que es: " + superHeroes.get(6));
        superHeroes.remove(3);

        if (!superHeroes.contains("Hulk")) {
            System.out.println("Hulk se ha ido de la fiesta");
        }

        // Fue y volvio tan rapido al kiosco que no nos dimos cuenta que se fue

        superHeroes.add("Superman");

        if (superHeroes.isEmpty()) {
            System.out.println("La fiesta ha terminado todos se han ido");
        } else {
            System.out.println("La fiesta continua aun hay " + superHeroes.size() + " superheroes");
        }

        System.out.println("¿Quienes estan aun en la fiesta?");
        for (String superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }
    }
}
