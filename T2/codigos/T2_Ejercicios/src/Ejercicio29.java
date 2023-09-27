import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce primer numero");
        double numero1 = scanner.nextDouble();
        System.out.println("Introduce segundo numero");
        double numero2 = scanner.nextDouble();
        System.out.println("Introduce tercer numero");
        double numero3 = scanner.nextDouble();
        boolean condicion = (numero1+numero2)==numero3;
        System.out.println("La suma de los dos primeros es el tercero: "+condicion);
    }
}
