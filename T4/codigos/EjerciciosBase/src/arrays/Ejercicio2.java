package arrays;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] numerosGenerados = new int[30];
        //Math.random()*11;
        for (int i = 0; i < numerosGenerados.length; i++) {
            numerosGenerados[i] = (int) (Math.random() * 11);
            // guarda un aleatorio en cada vueltas
        }

        int sumatorioPuntos = 0;
        double mediaPuntos = 0;

        for (int i = 0; i < numerosGenerados.length; i++) {
            sumatorioPuntos += numerosGenerados[i];
        }

        for (int item : numerosGenerados) {
            sumatorioPuntos += item;
        }

        mediaPuntos = (double) sumatorioPuntos / 30;
        System.out.println("El sumatorio es: "+sumatorioPuntos);
        System.out.println("La media es: "+mediaPuntos);


    }
}
