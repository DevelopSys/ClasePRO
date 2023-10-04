package bloqueif;

import java.util.Scanner;

public class EstructuraIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        String resultado;

        // el numero introducido esta entre 0 y 100?

        if (numero >= 0 && numero <= 100) {
            resultado = "número en rango";
            System.out.println("Número esta entre 0-100");
        } else {
            resultado = "numero sin rangho";
            System.out.println("Número fuera del rango");
        }
        System.out.println("Ejecución continuada");
        System.out.println(resultado);

    }
}
