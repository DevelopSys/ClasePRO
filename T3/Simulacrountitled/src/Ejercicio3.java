import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PIN = 1111;
        double saldo = 0;
        // sacar dinero
        // meter dinero
        // consultar dinero
        // salir
        int opcion = 0;
        int pinUsuario=0;
        do {
            System.out.println("1. Ingresar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar");
            System.out.println("4. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Dime el pin de la cuenta");
                    pinUsuario = scanner.nextInt();
                    if (pinUsuario==PIN){
                        System.out.println("Que cantidad quieres ingresar");
                        int cantidad = scanner.nextInt();
                        if (cantidad>0){
                            saldo+=cantidad;
                            System.out.println("Saldo actualizado");
                        } else {
                            System.out.println("Cantidad invalida");
                        }
                    } else {
                        System.out.println("No es el pin");
                    }

                    break;
                case 2:
                    System.out.println("Dime el pin de la cuenta");
                    pinUsuario = scanner.nextInt();
                    if (pinUsuario==PIN){
                        System.out.println("Que cantidad quieres sacar");
                        int cantidad = scanner.nextInt();
                        if (cantidad>0 && saldo>=cantidad){
                            saldo-=cantidad;
                            System.out.println("Saldo actualizado");
                        } else {
                            System.out.println("Cantidad invalida");
                        }
                    } else {
                        System.out.println("No es el pin");
                    }

                    break;
                case 3:
                    System.out.println("El saldo de la cuenta es "+saldo);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while (opcion!=4);

    }
}
