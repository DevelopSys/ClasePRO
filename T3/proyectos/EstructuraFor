/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Profesor
 */
public class EstructuraFor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acumulador = 0;
        int max = 0, min = 999;
        // variable de inicio, variable de final, incremento
        System.out.println("Introduce el número de veces que quieres sumar");
        int veces = teclado.nextInt();
        for (int i = 1; i <= veces; i++) {
            // System.out.printf("Ejecución %d %n",i);
            System.out.printf("Dime número %d %n", i);
            int numero = teclado.nextInt();
            acumulador += numero;
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }

        double media = acumulador / veces;
        System.out.printf("La media es: %.2f %n", media);
        System.out.printf("El máx: %d %n", max);
        System.out.printf("El min: %d %n", min);

        // El número más grande introducido es: 
        // El número más pequeño introducido es: 
        // la media de números introducidos es: 
    }

}
