import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Entrada {

    public static void main(String[] args) {
        Torneo.Equipo madrid = new Torneo.Equipo("Madrid",89,60);
        Torneo.Equipo barcelona = new Torneo.Equipo("Barcelona",85,60);
        Torneo.Equipo atleti = new Torneo.Equipo("Atletico",70,50);
        Torneo.Equipo sevilla = new Torneo.Equipo("Sevilla",79,40);
        ArrayList<Torneo.Equipo> lista = new ArrayList<>();
        lista.add(sevilla);
        lista.add(madrid);
        lista.add(barcelona);
        lista.add(atleti);
        Torneo champion = new Torneo("Champion");
        champion.realizarSorteo(lista);
        champion.mostrarPartidos();
        champion.iniciarTorneo();
        System.out.println("Los partidos jugados son");
        //champion.mostrarPartidosJugados();
        champion.imprimirClasificacion();





    }
}
