package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAprobados=0, numeroCondicionados=0, numeroSS=0;
        for (int i = 0; i < 6; i++) {
            System.out.println("introduce nota");
            int nota = scanner.nextInt();
            if (nota<4){
                numeroSS++;
            } else if (nota<5){
                numeroCondicionados++;
            } else {
                numeroAprobados++;
            }
        }
        System.out.println("El numero de ap es "+numeroAprobados);
        System.out.println("El numero de ss es "+numeroSS);
        System.out.println("El numero de cd es "+numeroCondicionados);
    }
}
