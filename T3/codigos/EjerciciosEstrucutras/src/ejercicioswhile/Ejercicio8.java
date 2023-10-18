package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int opcion = 0, operandoUno = 0, operandoDos = 0;
        double resultado = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la app de caluclo");
        do {

            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Dividir");
            System.out.println("4-Multiplicar");
            System.out.println("5-Modulo");
            System.out.println("6- Salir");
            System.out.println("Introduce la operacion deseada");
            opcion = scanner.nextInt();
            if (opcion > 0 && opcion < 6) {
                System.out.println("Introduce operando 1");
                operandoUno = scanner.nextInt();
                System.out.println("Introduce operando 2");
                operandoDos = scanner.nextInt();
            }

            switch (opcion) {
                case 1:
                    resultado = operandoUno + operandoDos;

                    break;
                case 2:
                    resultado = operandoUno - operandoDos;
                    break;
                case 3:
                    resultado = (double) operandoUno / operandoDos;
                    break;
                case 4:
                    resultado = operandoUno * operandoDos;
                    break;
                case 5:
                    resultado = operandoUno % operandoDos;

                    break;
                case 6:
                    System.out.println("Saliendo......");
                    break;
                default:
                    System.out.println("Opcion no contemplada");
            }
            if (opcion > 0 && opcion < 6) {
                System.out.println("El resultado es " + resultado);
            }

        } while (opcion != 6);

        System.out.println("Fin del menu");

    }
}
