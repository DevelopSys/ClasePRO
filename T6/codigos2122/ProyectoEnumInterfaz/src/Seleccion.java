import java.util.ArrayList;

public class Seleccion {

    private ArrayList<Persona> listaPersonas;
    private int nivelAtaque;

    public Seleccion(){
        this.listaPersonas = new ArrayList<>();
    }

    public void addPersona(Persona persona){
        this.listaPersonas.add(persona);
    }

    public void comprobarAtaque(){
        // ejecutar los métodos atacar
        for ( Persona item : listaPersonas) {
            if (!(item instanceof Entrenador)){
                nivelAtaque += ((Seleccionable)item).atacar();
            }
        }
        System.out.println("El nivel de ataque de la seleccion es: "+nivelAtaque);
    }

    public void repatirPrimaSeleccion(){
        for ( Persona item : listaPersonas ) {
            if (!(item instanceof Entrenador)){
                ((Seleccionable)item).repatirPrima();
            }
        }
    }


}
