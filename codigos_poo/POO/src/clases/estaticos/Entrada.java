package clases.estaticos;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        /*DataSet dataSet = new DataSet();
        ArrayList<Equipo> listaItalia = dataSet.getEquiposItalia();
        ArrayList<Equipo> listaEspania= dataSet.getEquiposLaLiga();*/

        ArrayList<Equipo> listaEquipos = DataSet.newInstance().getEquiposLaLiga();

        for (Equipo equipo: listaEquipos) {
            equipo.mostrarDatos();
        }


        listaEquipos = DataSet.newInstance().getEquiposItalia();

        for (Equipo equipo: listaEquipos) {
            equipo.mostrarDatos();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce opcion a seleccionad");
        int opcion = scanner.nextInt();
        DataSet.newInstance(1);



    }
}
