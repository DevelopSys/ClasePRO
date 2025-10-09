import java.util.Scanner;

public class EntradaMenu {

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("MAIN Menu");
        int opcion;
        do {
            int operador1 = 0, operador2 = 0;
            double resultado = 0.0;
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            System.out.println("Que quieres hacer");
            opcion = lectorTeclado.nextInt();
            if (opcion > 0 && opcion < 5) {
                System.out.println("Introduce el primer operando");
                operador1 = lectorTeclado.nextInt();
                System.out.println("Introduce el segundo operando");
                operador2 = lectorTeclado.nextInt();
            }
            switch (opcion) {
                case 1 -> {
                    System.out.println("Seleccionado sumar");
                    resultado = operador1 + operador2;
                }
                case 2 -> {
                    System.out.println("Seleccionado restar");
                    resultado = operador1 - operador2;

                }
                case 3 -> {
                    System.out.println("Seleccionado multiplicar");
                    resultado = operador1 * operador2;

                }
                case 4 -> {
                    System.out.println("Seleccionado dividir");
                    resultado = (double) operador1 / operador2;

                }
                case 5 -> {
                    System.out.println("Saliendo del menu.....");
                }
                default -> {
                    System.out.println("Caso no contemplado");
                }
            }
            if (opcion > 0 && opcion < 5) {
                System.out.println("El resultado de la operacion es " + resultado);
            }
        } while (opcion != 5);

        System.out.println("Terminando el programa completo");

    }
}
