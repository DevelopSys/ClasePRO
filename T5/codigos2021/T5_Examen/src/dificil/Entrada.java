package dificil;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Integer> numerosBingo = new ArrayList<>();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        Carton cartonGanador = null;
        Jugador jugadorGanador = null;

        boolean ganador = false;

        // Carton carton = new Carton(1);
        // carton.mostrarNumeros();
        // deberia tener un conjunto de 10 nºs (1-99) únicos
        Jugador jugador1 = new Jugador("123", "borja");
        Jugador jugador2 = new Jugador("234", "pepe");

        jugadores.add(jugador1);
        jugadores.add(jugador2);


        jugador1.recargarDinero(50);
        jugador1.comprarCarton(10, 0);
        //jugador.mostrarCartones();
        //System.out.println("Cartones del jugador 1");
        jugador2.recargarDinero(50);
        jugador2.comprarCarton(10, 10);
        //jugador1.mostrarCartones();

        /*int aleatorio = (int) (Math.random()* 99 +1);
        System.out.println("Aciertos: "+jugador.getListaCartones().get(0).getAciertos());
        jugador.getListaCartones().get(0).estaNumero(aleatorio);
        System.out.println("Aciertos: "+jugador.getListaCartones().get(0).getAciertos());*/

        do {

            int aleatorio = (int) (Math.random() * 99 + 1);
            //System.out.println(aleatorio);
            if (!numerosBingo.contains(aleatorio)) {
                numerosBingo.add(aleatorio);
                //System.out.println(aleatorio);
                for (Jugador itemJugador : jugadores) {

                    for (Carton itemCarton : itemJugador.getListaCartones()) {
                        //ganador = false;
                        itemCarton.estaNumero(aleatorio);
                        if (itemCarton.getAciertos() == 10) {
                            cartonGanador = itemCarton;
                            jugadorGanador = itemJugador;
                            ganador = true;
                            /*System.out.println("Id ganador " +itemJugador.getNombre()) ;
                            System.out.println("Id ganador " +itemCarton.getId());*/
                            break;
                            // arraylista ganadores lo meto
                        }
                    }
                }
                /*jugador1.getListaCartones().get(0).estaNumero(aleatorio);
                if ( jugador1.getListaCartones().get(0).getAciertos() == 10){
                    ganador = true;
                    System.out.println( "Id ganador "+jugador1.getListaCartones().get(0).getId());
                    System.out.println( "Id ganador "+jugador1.getNombre());

                }*/
            }

        } while (!ganador);
        // listaganadores.size >0
        System.out.println("Id ganador " + jugadorGanador.getNombre());
        System.out.println("Id ganador " + cartonGanador.getId());


    }
}
