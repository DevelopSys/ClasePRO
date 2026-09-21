import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio2");
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(nombre);
    }
}
