public class Entrada {

    public static void main(String[] args) {
        //Ejemplo ejemplo = new Ejemplo();
        //ejemplo.mostarConjunto();


        Persona persona = new Jugador("Borja","Martin",123,Posiciones.delantero.getDefinicion());
        Jugador jugador = new Jugador("Borja1","Martin1",123,Posiciones.delantero.getDefinicion());
        Persona persona1 = new Entrenador("Entrenador","Apellido",1000,Vocaciones.defensivo.name());
        Entrenador entrenador = new Entrenador("Entrenador","Apellido",1000,Vocaciones.ofensivo.name());
        Canterano canterano = new Canterano("Canterano","Apellido",100,60);

        Seleccionable seleccionable = new Jugador("Nombre","Apellido",123,Posiciones.defensa.getDefinicion());

        Seleccion seleccion = new Seleccion();
        seleccion.addPersona(jugador);
        seleccion.addPersona(jugador);
        seleccion.addPersona(jugador);
        seleccion.addPersona(jugador);
        seleccion.addPersona(jugador);
        seleccion.addPersona(canterano);
        seleccion.addPersona(entrenador);

        seleccion.comprobarAtaque();



    }
}
