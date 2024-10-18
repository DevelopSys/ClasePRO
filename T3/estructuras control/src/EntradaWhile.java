import java.util.Scanner;

public class EntradaWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // el numero no tiene que ser 0
        // PEDIR POR CONSOLA NUMEROS HASTA QUE EL USUARIO INTRODUZCA UN PAR
        /*while (numero%2!=0){
        int i = 0;
        int numero=-1;
            // pido numero
            i++;
            System.out.println("Por favor introduce numero");
            numero = scanner.nextInt();
        System.out.println("Has introducido "+i);
        }*/
        /*int numero;
        int i=0;
        do {
            System.out.println("Introduce numero");
            numero = scanner.nextInt();
            i++;
        }while (numero!=0);

        System.out.println("El numero de introducidos es: "+i);*/
        int opcion;
        do {
            System.out.println("1. Añadir");
            System.out.println("2. Borrar");
            System.out.println("3. Listar");
            System.out.println("4. Buscar");
            System.out.println("5. Salir");
            System.out.println("Que opcion quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Añadir");
                    break;
                case 2:
                    System.out.println("Borrar");
                    break;
                case 3:
                    System.out.println("Listar");
                    break;
                case 4:
                    System.out.println("Buscar");
                    break;
                case 5:
                    System.out.println("Saliendo.......");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intentalo de nuevo");
            }
        } while (opcion != 5);


    }
}
