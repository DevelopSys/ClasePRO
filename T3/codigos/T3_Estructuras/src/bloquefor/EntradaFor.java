package bloquefor;

import java.util.Scanner;

public class EntradaFor {

    public static void main(String[] args) {


        new EntradaFor().ejecicioNumeros();
        // inicio; final; incremento
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero del que quieres ver la tabla del multi");
        int numero = scanner.nextInt();

        if (numero >= 1) {
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d * %d = %d\n", numero, i, numero * i);
            }
        } else {
            System.out.println("No se puede ver la tabla");
        }

        // un programa que pida 10 numeros
        // indicar el
        // numero de pares
        // nunmero de impares
        // suma total de los numeros
        // media te los numeros introducidos
    }


    public static void ejecicioNumeros() {


        Scanner scanner = new Scanner(System.in);
        int numeroPares = 0, numeroImpares = 0, sumatorio = 0;
        double media = 0.0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el numero");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                numeroPares++;
            } else {
                numeroImpares++;
            }
            sumatorio+=numero; // sumatorio = sumatorio  + numero
        }
        media = (double) sumatorio /10;

        System.out.println("En numero de impares es "+numeroImpares);
        System.out.println("En numero de pares es "+numeroPares);
        System.out.println("En numero medio "+media);
        System.out.println("El sumatorio es "+sumatorio);

    }
}
