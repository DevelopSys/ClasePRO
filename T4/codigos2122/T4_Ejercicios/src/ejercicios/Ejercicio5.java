package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int[] arrayUno, arrayDos, arrayTres;
        int longitud;
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("De que longitud quieres los arrays");
        longitud = lecturaTeclado.nextInt();

        arrayUno = new int[longitud];
        arrayDos = new int[longitud];
        arrayTres = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            arrayUno[i] = (int)(Math.random() *21);
            arrayDos[i] = (int)(Math.random() *21);
        }

        for (int i = 0; i < longitud; i++) {
            arrayTres[i] = arrayUno[i] + arrayDos[i];
        }
    }
}
