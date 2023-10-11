package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas tiradas quieres hacer");
        int nVeces = scanner.nextInt();
        if (nVeces<1){
            nVeces = 100;
        }
        for (int i = 0; i < nVeces; i++) {
            // 0 - 0.999999
            int tirada = (int)(Math.random() * 6)+1;
            System.out.println(tirada);
        }
    }
}
