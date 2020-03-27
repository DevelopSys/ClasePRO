package clases.ejercicios.EjercicioTorneo;

import clases.estaticos.Equipo;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        Torneo laLiga = new Torneo("LaLiga");
        ArrayList<Torneo.Equipo> listaEquipo = new ArrayList();
        listaEquipo.add(new Torneo.Equipo("Barcelona"));
        listaEquipo.add(new Torneo.Equipo("Madrid"));
        listaEquipo.add(new Torneo.Equipo("Atletico"));
        listaEquipo.add(new Torneo.Equipo("Sevilla"));
        System.out.println("Partidos sin jugar");
        laLiga.realizarSorteo(listaEquipo);
        System.out.println("Partidos jugados");
        laLiga.jugarPartidos();
        laLiga.mostrarPartidos();
        laLiga.sacarClasificacion();

    }
}
