
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestra verduleria");
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();

        // reordena con orden alfabetico
        Map<String, Double> inventario = new TreeMap<>();

        inventario.put("Banana", 0.89);
        inventario.put("Tomate", 0.75);
        inventario.put("Palta", 0.95);
        inventario.put("Frutilla", 0.65);
        inventario.put("Morron", 0.77);

        System.out.println("Este es el inventario de frutas y verduras: ");

        // keySet me da un arreglo con las keys
        for (String fruta : inventario.keySet()) {
            // Con el get puedo acceder al valor
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        String frutaBuscada = "Frutilla";
        System.out.println("Se acerca un cliente y nos pide la siguiente fruta: " + frutaBuscada);

        if (inventario.containsKey(frutaBuscada)) {
            System.out.println(frutaBuscada + " esta en el inventario, encantados de venderle");
        } else {
            System.out.println("Lamentablemente nos quedamos sin " + frutaBuscada);
        }

        String sinStock = "Frutilla";
        inventario.remove(sinStock);

        System.out.println("Nos hemos quedado sin: " + sinStock);

        System.out.println("Inventario actualizado: ");
        for (String fruta : inventario.keySet()) {
            // con el get puedo acceder al valor
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        System.out.println("La cantidad de mercaderia es: " + inventario.size());

    }

}
