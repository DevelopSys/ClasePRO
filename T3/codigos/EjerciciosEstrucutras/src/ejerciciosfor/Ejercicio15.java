package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 16);
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);
        boolean acertado = false;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce numero");
            int numero = scanner.nextInt();
            intentos++;
            if (numero == aleatorio) {
                acertado = true;
                System.out.printf("Perfecto has adivinado el numero en %d intentos\n", intentos);
                break;
            }
        }
        if (!acertado) {
            System.out.println("Lo siento has agotado todos los intentos");
        }
    }
}
