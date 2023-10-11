package ejercicioswitch;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la letra");
        char letra = scanner.next().charAt(0);

        // vocal -> aeiou
        // consonante -> resto
        switch (String.valueOf(letra).toUpperCase().charAt(0)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es consonante");
        }
    }
}
