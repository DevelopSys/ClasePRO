package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero, sumatorio=0;

        do {
            System.out.println("Introduce un nunero");
            numero = scanner.nextInt();
            if (numero>0){
                sumatorio+=numero;
                // sumatorio = sumatorio + numero
            }
        } while (numero !=0);
        System.out.println("La suma de los positivos es: "+sumatorio);

    }
}
