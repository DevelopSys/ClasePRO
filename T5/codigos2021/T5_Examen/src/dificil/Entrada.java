package dificil;

public class Entrada {

    public static void main(String[] args) {

        // Carton carton = new Carton(1);
        // carton.mostrarNumeros();
        // deberia tener un conjunto de 10 nºs (1-99) únicos
        Jugador jugador = new Jugador("123","borja");
        Jugador jugador1 = new Jugador("234","pepe");
        jugador.recargarDinero(30);
        jugador.comprarCarton(3,0);
        jugador.mostrarCartones();
        System.out.println("Cartones del jugador 1");
        jugador1.recargarDinero(3);
        jugador1.comprarCarton(1,3);
        jugador1.mostrarCartones();
        

    }
}
