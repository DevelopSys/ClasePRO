package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio7 {

    /*
    * Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato
    * - Bienvenido a la aplicación del menú
    * - 1. Opción1
    * - 2. Opción2
    * - 3. Opción3
    * - 4. Opción4
    * - 5. Salir
    * - Introduce la opción seleccionada
    Una vez mostrado la última línea, el sistema esperará a que el usuario introduzca un dato.
    * Dependiendo de la opción seleccionada aparecerá un mensaje por pantalla que ponga
    * "La opción seleccionada es X". En el caso de meter una diferente pondrá "opción no contemplada".
    * El programa se repetiría hasta que introduzca el 5 (MenuSimple)
    * */

    public static void main(String[] args) {

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bienvenido al menu");
            System.out.println("1-Opcion 1");
            System.out.println("2-Opcion 2");
            System.out.println("3-Opcion 3");
            System.out.println("4-Opcion 4");
            System.out.println("5- Salir");
            System.out.println("Introduce la opcion deseada");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Opcion seleccionada 1");
                    break;
                case 2:
                    System.out.println("Opcion seleccionada 2");
                    break;
                case 3:
                    System.out.println("Opcion seleccionada 3");
                    break;
                case 4:
                    System.out.println("Opcion seleccionada 4");
                    break;
                case 5:
                    System.out.println("Saliendo.......");
                    break;
                default:
                    System.out.println("Opcion no contemplada");
            }
        } while (opcion != 5);

        System.out.println("Fin del menu");

    }
}
