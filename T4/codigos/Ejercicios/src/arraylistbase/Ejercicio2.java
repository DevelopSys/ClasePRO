package arraylistbase;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

    private ArrayList<Integer> numeros;
    private int numeroNumeros;

    public void iniciarEjercicio(int numeros){
        numeroNumeros = numeros;
        iniciarLista();
        realizarCalculos();
    }

    private void iniciarLista(){
        numeros = new ArrayList<>();
        // 0-20 y tantos numeros como me diga el main
        for (int i = 0; i < numeroNumeros; i++) {
            numeros.add((int) (Math.random()*16));
        }
    }

    private void realizarCalculos(){
        Collections.sort(numeros);
        System.out.println("El más grande es: "+numeros.get(numeros.size()-1));
        System.out.println("El más pequeño es: "+numeros.get(0));
        int sumatorio = 0;
        for (int item: numeros ) {
            sumatorio+=item;
        }
        System.out.println("La suma es "+sumatorio);
        System.out.println("La media es "+(double)sumatorio/numeros.size());
    }
}
