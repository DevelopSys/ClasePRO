import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = lector.nextInt();
        boolean condicionMayor = numero>50;
        boolean condicionImpar = numero%2 == 0;
        System.out.println("El numero es impar "+!condicionImpar);
        System.out.println("El numero es mayor que 50 "+condicionMayor);
        System.out.println("Las dos condiciones se cumplen "+(condicionMayor && condicionImpar));
    }
}
