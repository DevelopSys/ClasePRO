package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas temperaturas vas a meter");
        int nTemperaturas = scanner.nextInt();
        double media = 0.0;
        double sumatorio = 0.0;
        for (int i = 0; i < nTemperaturas; i++) {
            System.out.println("Por favor introduce la temperatura");
            int temperatura = scanner.nextInt();
            if (temperatura<1){
                temperatura = 10;
            }
            sumatorio +=temperatura;
        }
        System.out.printf("La media de las temperaturas es de %.2f",sumatorio/nTemperaturas);

    }
}
