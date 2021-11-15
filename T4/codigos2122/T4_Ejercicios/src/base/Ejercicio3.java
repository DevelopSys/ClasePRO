package base;

import java.util.Scanner;

public class Ejercicio3 {

    // Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
    //
    //en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    //en orden normal, es decir, el primero que se muestra es el primero que se ha introducido

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner lecturaTeclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero a guardar");
            int numero = lecturaTeclado.nextInt();
            numeros[i] = numero;
        }
        System.out.println("Orden inverso");
        for (int i = 9; i >-1; i--) {
            if (i == 0) {
                System.out.println(numeros[i]);
            } else if (i <= 9) {
                System.out.print(numeros[i]+",");
            }

        }
        // 0,9,8,7,6,5,4,3,2,1


        System.out.println("Orden normal");
        // 1,2,3,4,5,6,7,8,9,0
        for (int i = 0; i < numeros.length; i++) {
            if (i<9){
                System.out.print(numeros[i]+",");
            } else {
                System.out.println(numeros[i]);
            }
        }
    }
}
