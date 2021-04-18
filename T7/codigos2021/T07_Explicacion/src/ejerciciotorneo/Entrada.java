package ejerciciotorneo;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        //Torneo torneo = new Torneo("La Liga");
        Torneo.Equipo madrid = new Torneo.Equipo("Real Madrid");
        Torneo.Equipo barcelona = new Torneo.Equipo("FC Barcelona");
        Torneo.Equipo sevilla = new Torneo.Equipo("Sevilla FC");
        Torneo.Equipo getafe = new Torneo.Equipo("Getafe FC");
        ArrayList<Torneo.Equipo> listaEquipos = new ArrayList<>();
        listaEquipos.add(madrid);
        listaEquipos.add(barcelona);
        listaEquipos.add(sevilla);
        listaEquipos.add(getafe);
        Torneo torneo = new Torneo("La liga",listaEquipos);
        torneo.realizarSorteo();
        torneo.mostrarClasificacion();

        //System.out.println(torneo.getListaParticipantes().size());
        //Torneo.Partido partido = torneo.new Partido();
        //Torneo.Equipo equipo = new Torneo.Equipo();

    }
}
