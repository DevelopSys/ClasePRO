import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra = scanner.next().charAt(0);
        System.out.println("Digito: "+Character.isDigit(letra));
        System.out.println("Vocal:"+!Character.isDigit(letra));
    }
}
