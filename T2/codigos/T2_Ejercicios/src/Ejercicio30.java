import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce palabra 1");
        String cadena1 = scanner.next();
        System.out.println("Introduce palabra 2");
        String cadena2 = scanner.next();
        System.out.println("Son iguales: "+cadena1.equals(cadena2));
        System.out.println("Primera más pequeña que la segunda: "+cadena1.equals(cadena1.length()<cadena2.length()));
        System.out.println("Son distintas: "+!cadena1.equals(cadena2));
    }
}
