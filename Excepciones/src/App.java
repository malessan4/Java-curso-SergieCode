import Exceptions.CalculadoraException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();

        // Excepciones: eventos que interrumpen el flujo normal de la aplicacion

        int numero1 = 5;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

        try {
            resultado = calculadora.dividir(numero1, numero2);
            System.out.println(resultado);

        } catch (CalculadoraException e) {
            e.printStackTrace();
            System.out.println("Esto va despues de la excepcion");

        } finally {
            System.out.println("Hemos finalizado el calculo ya sea exitoso o no");
        }

    }
}
