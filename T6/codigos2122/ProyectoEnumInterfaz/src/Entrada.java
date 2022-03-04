public class Entrada {

    public static void main(String[] args) {
        //Ejemplo ejemplo = new Ejemplo();
        //ejemplo.mostarConjunto();


        Persona persona = new Jugador("Borja","Martin",123,Posiciones.medio.getDefinicion());
        Jugador jugador = new Jugador("Borja1","Martin1",123,Posiciones.medio.getDefinicion());


        Persona persona1 = new Entrenador("Entrenador","Apellido",1000,Vocaciones.ofensivo.name());
        Entrenador entrenador = new Entrenador("Entrenador","Apellido",1000,Vocaciones.ofensivo.name());


    }
}
