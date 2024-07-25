public class Perro extends Animal {

    public Perro(String nombre, int edad){
        // con la palabra super estams asignando la informacion heredada
        super(nombre, edad);
    }


    // con el decorador override podemos sobreescribir un metodo!
    @Override
    public String hacerSonido() {
        return "Guau";
    }


}
