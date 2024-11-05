import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, opcion;
        double resultado = 0.0;
        do {
            do {
                System.out.println("Introduce operando 1");
                numero1 = scanner.nextInt();
                System.out.println("Introduce operando 2");
                numero2 = scanner.nextInt();
            } while (numero1 < 0 || numero2 < 0);
            // garantizo que ambos son positivos
            System.out.println("Introduce una opcion a operadad");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multi");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    resultado = (double) numero1 / numero2;
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Operacion no contemplada");
            }
            if (opcion > 0 && opcion < 5) {
                System.out.println("El resultado de la operacion es " + resultado);
            }
        } while (opcion != 5);

    }
}
