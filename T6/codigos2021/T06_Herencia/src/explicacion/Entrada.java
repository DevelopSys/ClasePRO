package explicacion;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Coche> listaCoches = new ArrayList<>();

        //Coche coche = new Coche("Ford",100,1234);
        //coche.mostrarDatos();
        Coche deportivo = new Deportivo("ferrari",300,2345);
        Coche deportivo2 = new Deportivo("porche",400,2345);
        Coche todoTerreno = new TodoTerreno("LandRover",200,3456,3000);
        Coche todoTerreno2 = new TodoTerreno("Vw",321,234,1000);
        /*System.out.println("Imprimiendo coche");
        coche.mostrarDatos();
        System.out.println("Imprimiendo deportivo");
        deportivo.mostrarDatos();
        System.out.println("Imprimiendo TodoTerreno");
        todoTerreno.mostrarDatos();*/

        //listaCoches.add(coche);
        listaCoches.add(deportivo);
        listaCoches.add(deportivo2);
        listaCoches.add(todoTerreno);
        listaCoches.add(todoTerreno2);

        for ( Coche item : listaCoches ) {
            if (item instanceof Deportivo) {
                item.mostrarDatos();
            }
        }




    }
}
