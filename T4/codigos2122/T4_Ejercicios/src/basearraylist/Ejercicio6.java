package basearraylist;

import java.util.ArrayList;

public class Ejercicio6 {

    public static void main(String[] args) {

        Object[] coche1 = new Object[]{"Mercedes", "c220", 250, "ASD123"};
        Object[] coche2 = new Object[]{"Audi", "A5", 350};
        Object[] coche3 = new Object[]{"VW", "Arteon", 180, true, 45.0, "Repro"};

        ArrayList<Object[]> listaCoches = new ArrayList();
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(new Object[]{"Ford", "Focus", 150});

        // obtener coches

        /*Object[] cocheSeleccionado = listaCoches.get(3);
        System.out.println(cocheSeleccionado[1]);*/
        //System.out.println(listaCoches.get(2)[0]);

        // Marca: Mercedes  Modelo: C220    CV: 250
        // Marca: Mercedes  Modelo: C220    CV: 250
        // Marca: Mercedes  Modelo: C220    CV: 250
        // Marca: Mercedes  Modelo: C220    CV: 250
        // Marca: Mercedes  Modelo: C220    CV: 250

        /*for (int i = 0; i < listaCoches.size(); i++) {

            Object[] cocheActual = listaCoches.get(i);
            for (int j = 0; j < cocheActual.length; j++) {
                System.out.print("\t "+cocheActual[j]);
            }
            System.out.println();
            /*System.out.println("Marca: "+cocheActual[0]+" Modelo: "+cocheActual[1]+
                    " CV: "+cocheActual[2]+" "+cocheActual[3]+" "+cocheActual[4] );

        }*/

        /*for ( Object[] coche : listaCoches ) {
            System.out.println("Marca: "+coche[0]+" Modelo: "+coche[1]+" CV: "+coche[2]);

        }*/


    }
}
