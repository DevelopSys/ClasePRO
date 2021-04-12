package ejerciciotorneo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Torneo {

    private ArrayList<Equipo> listaParticipantes;

    public Torneo() {
        this.listaParticipantes = new ArrayList<>();
        listaParticipantes.add(new Equipo("Sevilla",60,35));
        listaParticipantes.add(new Equipo("Barsa",65,56));
        listaParticipantes.add(new Equipo("Atleti",67,50));
        listaParticipantes.add(new Equipo("Madrid",66,58));
    }

    public void mostrarClasificacion(){


        Collections.sort(listaParticipantes, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                return o2.getNombre().compareTo(o1.getNombre());
            }
        });



        for (Equipo itemEquipo:listaParticipantes) {
            System.out.printf("%s puntos: %d goles: %d%n",itemEquipo.getNombre(), itemEquipo.getPuntos(), itemEquipo.getGoles());
        }
    }
}
