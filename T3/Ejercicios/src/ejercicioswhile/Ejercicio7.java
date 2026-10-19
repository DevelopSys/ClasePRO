package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Las opciones son");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Salir");
            System.out.println("Que opcion quieres ejecutar");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Opcion 1");
                }
                case 2 -> {
                    System.out.println("Opcion 2");
                }
                case 3 -> {
                    System.out.println("Opcion 3");
                }
                case 4 -> {
                    System.out.println("Opcion 4");
                }
                case 5 -> {
                    System.out.println("Saliendo.....");
                }
                default -> System.out.println("No se contempla la opcion");
            }


        } while (opcion != 5);
    }
}
