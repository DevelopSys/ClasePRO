package basearraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int max = -99999;
        int min = 99999;
        double media;
        for (int i = 0; i < 10; i++) {
            int aleatorio = (int) (Math.random()*101);
            listaNumeros.add(aleatorio);
        }

        double acumulador=0.0;
        for ( Integer item : listaNumeros ) {
            if (item > max){
                max = item;
            }
            if (item<min){
                min = item;
            }
            acumulador += item;
        }

        max = Collections.max(listaNumeros);
        min = Collections.min(listaNumeros);

        for ( Integer item: listaNumeros) {
            System.out.println(item);
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(acumulador/listaNumeros.size());

    }
}
