package videos.estaticos;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Equipo> listaEquipos = DataSet.newInstance().getEquiposLaLiga();
        System.out.println("CLASIFICACIÓN LALIGA");
        for (Equipo equipo : listaEquipos) {
            System.out.printf(String.format("%d - %s %n", equipo.getPosicion(), equipo.getNombre()));
        }

        listaEquipos = DataSet.newInstance().getEquiposPremiere();
        System.out.println("\nCLASIFICACIÓN PREMIERE");
        for (Equipo equipo : listaEquipos) {
            System.out.printf(String.format("%d - %s %n", equipo.getPosicion(), equipo.getNombre()));
        }

        listaEquipos = DataSet.newInstance().getEquiposCalcio();
        System.out.println("\nCLASIFICACIÓN CALCIO");
        for (Equipo equipo : listaEquipos) {
            System.out.printf(String.format("%d - %s %n", equipo.getPosicion(), equipo.getNombre()));
        }

    }
}
