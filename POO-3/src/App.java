public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();
        
        Delfin delfin = new Delfin("Adolfina");
        Pulpo pulpo = new Pulpo("Gonazlez", 8);

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();

        pulpo.nadar();
        pulpo.comunicarse();
        pulpo.alimentar();
        
    }
}
