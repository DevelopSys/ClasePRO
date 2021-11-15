package base;

import java.util.Scanner;

public class Ejercicio2 {

    // Crear un programa que genere 30 números aleatorios entre 0 - 10 y
    // los guarde en un array. Una vez metidos, se deberá mostrar:
    //Numero de puntos obtenidos
    //Media de puntos obtenidos

    public static void main(String[] args) {

        int [] aletorios = new int[30];
        int suma =0;
        double media=0;

        for (int i = 0; i < aletorios.length; i++) {
            //int aleatorio = (int) (Math.random() *11);
            aletorios[i] = (int) (Math.random() *11);
        }

        // 1,23,4,42,34,234,234,23,42,34
        for ( int item : aletorios ) {
            suma += item;
        }

        media = (double) suma / (double)aletorios.length;

        System.out.println("La suma es; "+ suma);
        System.out.printf("La media es; %.2f %n", media);





    }
}
