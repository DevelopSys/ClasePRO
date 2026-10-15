package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio8 {
    /*
    Pedir 10 números. Mostrar la media de los números positivos,
    la media de los números negativos y la cantidad de ceros (NumerosTipos)
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int sumatorioPositivos = 0, sumatorioNegativos = 0,
                numeroCeros = 0, numerosPositivos = 0,
                numerosNegativos = 0;

        for (int i = 0; i < 10; i++) {
            int numero = lector.nextInt();
            if (numero < 0) {
                sumatorioNegativos += numero;
                numerosNegativos++;
            } else if (numero > 0) {
                sumatorioPositivos += numero;
                numerosPositivos++;
            } else {
                numeroCeros++;
            }
        }

        System.out.println("El numero de 0 es " + numeroCeros);
        System.out.println("La media de positivos " + (double)sumatorioPositivos/numerosPositivos);
        System.out.println("La media de negativos " + (double)sumatorioNegativos/numerosNegativos);


    }
}
