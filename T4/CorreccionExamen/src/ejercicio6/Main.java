package ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] notas = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int nota;
            do {
                System.out.println("Indica la nota del usuario");
                nota = scanner.nextInt();
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }
        int numeroSS = 0, numeroAP = 0, media = 0, acumulador = 0;
        for (int item : notas) {
            if (item < 5)
                numeroSS++;
            else
                numeroAP++;
            acumulador += item;
        }
        media = acumulador / 10;
        System.out.println("N AP "+numeroAP);
        System.out.println("N SS "+numeroSS);
        System.out.println("Acumulador "+acumulador);
        System.out.println("Media "+media);

    }
}
