package base;

import java.util.Scanner;

public class Ejercicio1 {


    // Realiza un programa que pida 10 números por teclado y que los almacene en un array.
    // A continuación se mostrará el contenido de ese array junto al índice (0 – 9)


    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner lecturaTeclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero a guardar");
            int numero = lecturaTeclado.nextInt();
            numeros[i] = numero;
        }

        for (int i = 0; i <= numeros.length; i++) {
            System.out.printf("%d : %d%n", i, numeros[i]);
        }

    }
}
