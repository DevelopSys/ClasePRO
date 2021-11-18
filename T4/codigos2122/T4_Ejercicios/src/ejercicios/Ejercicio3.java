package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    /*
    * (MultiplicarArray) Crear un array de 5 posiciones:
se le pedirá al usuario que introduzca cada unos de los elementos del array
Multiplica cada elemento del array * 2 y vuelve a guardar su valor
Saca por consola la suma de todos los números
Saca la media de todos los elementos
    *
    * */

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroInto=0;
        double media =0, suma = 0;
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Por favor introduce numero");
            numeroInto = lecturaTeclado.nextInt();
            numeros[i] = numeroInto;
        }

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] *2;
        }

        for ( int item : numeros ) {
            suma += item;
        }

        System.out.println("la suma de los numeros es "+suma);
        System.out.println("la media de los numeros es "+(double)suma/(double) numeros.length);


    }
}
