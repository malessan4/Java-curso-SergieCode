public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(8,6);

        circulo.imprimirInformacion();
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        rectangulo.imprimirInformacion();
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        
    }
}
