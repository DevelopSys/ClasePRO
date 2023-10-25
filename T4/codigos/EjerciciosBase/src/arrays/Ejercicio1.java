package arrays;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introdice el numerp");
            int numeroIntroducido = scanner.nextInt();
            numeros[i] = numeroIntroducido;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("El numero en la posicion" +
                    " %d es %d\n",i,numeros[i]);
        }



    }
}
