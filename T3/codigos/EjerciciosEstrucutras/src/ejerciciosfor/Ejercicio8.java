package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumatorioPositivos = 0.0, sumatorioNegativos = 0.0;
        int numeroCeros = 0, numerosNegativos=0, numeroPositivos=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce numero");
            int numero = scanner.nextInt();
            if (numero >= 0) {
                // positivo
                sumatorioPositivos+=numero;
                numeroPositivos++;
            } else {
                // negativo
                sumatorioNegativos+=numero;
                numerosNegativos++;
            }
            if (numero == 0) {
                numeroCeros++;
            }
        }
        System.out.println("La media de positivos es: "+(sumatorioPositivos/numeroPositivos));
        System.out.println("La media de negativos es: "+(sumatorioNegativos/numerosNegativos));
        System.out.println("El nº de ceros es: "+(numeroCeros));
    }
}
