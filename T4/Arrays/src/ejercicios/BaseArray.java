package ejercicios;

import java.util.Scanner;

public class BaseArray {
    public static void main(String[] args) {
        ejercicio1();
    }

    public static void ejercicio1() {
        /*Realiza un programa que pida 10 números por teclado
        y que los almacene en un array.
        A continuación se mostrará el contenido de ese array
        junto al índice (0 – 9)*/
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el numero");
            numeros[i] = scanner.nextInt();
        }

        // FOR O FOREACH???
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("El numero en la posicion %d es %d\n",i+1,numeros[i]);
        }

    }
}
