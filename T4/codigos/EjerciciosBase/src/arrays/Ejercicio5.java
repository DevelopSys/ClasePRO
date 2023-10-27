package arrays;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero");
            numeros[i] = scanner.nextInt();
        }

        for ( int item : numeros ) {
            if (item%2==0){
                System.out.println("Par "+item);
            } else {
                System.out.println("Impar "+item);
            }
        }

    }
}
