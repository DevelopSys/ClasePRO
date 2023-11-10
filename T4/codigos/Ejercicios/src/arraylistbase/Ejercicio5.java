package arraylistbase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Ejercicio5 {

    private ArrayList<Object[]> listaCoches;

    public void iniciarEjercicio(){
        iniciarLista();
        //mostrarCoches();
        filtrarDatos("ford");
    }

    private void iniciarLista(){
        listaCoches = new ArrayList<>();
        // marca(str) modelo(str) cv(int) --> Coche
        Object[] coche1 = new Object[]{"Ford","Focus",150};
        Object[] coche4 = new Object[]{"Ford","Fiesta",90};
        Object[] coche2 = new Object[]{"Opel","Astra",100};
        Object[] coche5 = new Object[]{"Opel","Corsa",110};
        Object[] coche3 = new Object[]{"Seat","Leon",120};
        Object[] coche6 = new Object[]{"Seat","Ibiza",150};
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(coche4);
        listaCoches.add(coche5);
        listaCoches.add(coche6);
        System.out.println("Los cv del seat son "+listaCoches.get(2)[2]);
    }

    public void mostrarCoches(){
        for (Object[] coche :listaCoches) {
            System.out.printf("%s %s %d\n",coche[0],coche[1],coche[2]);
        }
    }

    public void filtrarDatos(){
        // sacar todos los coches de una marca pedido por parametros
    }

}
