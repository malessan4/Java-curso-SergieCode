// Con esto especificamos que gato hereda la clase animal

public class Gato extends Animal {

    public Gato(String nombre, int edad){
        // con la palabra super estams asignando la informacion heredada
        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }


}
