package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De que lado quieres el cuadrado");
        int lado = scanner.nextInt();
        for (int i = 0; i < lado; i++) {
            // las filas
            for (int j = 0; j < lado; j++) {
                // las columnas
                // estoy en la primera fila (+)
                if (i==0){
                    System.out.print("+");
                }
                // estoy en la ultima fila (+)
                else if (i==lado-1){
                    System.out.print("+");
                }
                // estoy en la primera columna (+)
                else if (j==0){
                    System.out.print("+");
                }
                // estoy en la ultima columna (+)
                else if (j==lado-1) {
                    System.out.print("+");
                }
                // el resto ( - )
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
