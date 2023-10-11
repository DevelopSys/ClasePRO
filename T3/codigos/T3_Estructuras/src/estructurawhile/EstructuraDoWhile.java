package estructurawhile;

import java.util.Scanner;

public class EstructuraDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Introduce numero");
            numero = scanner.nextInt();
        } while (numero!=0);

        System.out.println("Saliendo del do-while");
    }
}
