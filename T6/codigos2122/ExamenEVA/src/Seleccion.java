import java.util.ArrayList;

public final class Seleccion {

    private double gastos;
    private String nombre;
    private ArrayList<Persona> listaPersonas;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        listaPersonas = new ArrayList<>();
        // listaPersonas = null
        // gastos = 0
    }

    public Seleccion() {
    }

    public void contratarJugador(Jugador jugador) {
        // comprobacion
        if (!existePersona(jugador.getDni())) {
            // cuando no existe
            this.listaPersonas.add(jugador);
        }
    }

    public void contratarEntrenador(Entrenador entrenador) {
        // comprobacion
        if (!existePersona(entrenador.getDni())) {
            // cuando no existe
            this.listaPersonas.add(entrenador);
        }
    }

    public void contratarTrabajador(Persona entrenador) {
        // comprobacion
        if (!existePersona(entrenador.getDni())) {
            // cuando no existe
            this.listaPersonas.add(entrenador);
        }
    }

    public void verPosicion(String posicion) {
        for (Persona persona : listaPersonas) {
            if (persona instanceof Jugador) {
                if (((Jugador) persona).getPosicion().equalsIgnoreCase(posicion)) {
                    persona.mostrarDatos();
                }
            }
        }
    }

    public void verJugadores() {
        for (Persona item : listaPersonas) {
            if (item instanceof Jugador) {
                item.mostrarDatos();
            }
        }
    }

    public void verEntrenadores() {
        for (Persona item : listaPersonas) {
            if (item instanceof Entrenador) {
                item.mostrarDatos();
            }
        }
    }

    public void verPlantilla() {
        int jugadores=0, entrenadores=0;
        for (Persona item : listaPersonas) {
            System.out.println(item.getClass().getSimpleName());
            item.mostrarDatos();
            if (item instanceof Jugador){
                jugadores++;
            } else{
                entrenadores++;
            }
        }
        System.out.println("Hay "+jugadores+" jugadores");
        System.out.println("Hay "+entrenadores+" entrenadores");
    }

    public void mostrarGastos(){
        for ( Persona item : listaPersonas ) {
            gastos += item.getSueldo();
        }

        System.out.println("La seleccion cuesta: "+gastos);
    }


    private boolean existePersona(String dni) {

        Persona persona = null;
        boolean exite = false;

        for (Persona item : listaPersonas) {
            if (item.getDni().equalsIgnoreCase(dni)) {
                // es la persona que tiene el dni pasado
                // especie de break
                System.out.println("No se puede agregar, la persona existe");
                exite = true;
                return exite;
            }
        }

        return exite;
    }
}
