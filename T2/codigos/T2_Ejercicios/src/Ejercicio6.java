import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica tu nombre");
        String nombre = scanner.next();
        System.out.println("Indica tu edad");
        int edad = scanner.nextInt();
        System.out.println("Tu nombre es "+nombre);
        System.out.println("Tu edad es "+edad);
        System.out.println("Pulsa enter para continuar......");
        scanner.nextLine();
        scanner.nextLine();
        //System.out.println(cosa);
        //scanner.nextLine();
    }

}


