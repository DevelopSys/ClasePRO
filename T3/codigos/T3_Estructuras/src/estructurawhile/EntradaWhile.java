package estructurawhile;

import java.util.Scanner;

public class EntradaWhile {

    public static void main(String[] args) {
        // pedir datos hasta que el usuario introduzca un 0;
        int numero=-1;
        Scanner scanner = new Scanner(System.in);
        while (numero != 0) {
            System.out.println("Por favor introduce numero");
            // realiza la suma de todos los numeros
            numero=scanner.nextInt();
        }

        System.out.println("Saliendo del while");
    }
}
