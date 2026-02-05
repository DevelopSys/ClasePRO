import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMetodos {

    public static void main(String[] args) {

        // Que pida por consola dos numeros
        // realizar operaciones basicas y mostrar los resultados
        // suma, resta, multi, modulo, division
        // mostrar los resultados
        // una vez mostrados los resultados, preguntar al usuario
        // si quiere realizar una nueva operacion

        // una vez realizada la operacion guardar los resultados en una
        // ArrayList< int[] > [<s,r,m,d>,<s,r,m,d>,<s,r,m,d>,<s,r,m,d>]

        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int opcion = 0, num1 = 0, num2 = 0, suma = 0, resta = 0, div = 0, mult = 0;

        do {
            try {
                System.out.println("Por favor introduce el primer numero");
                num1 = scanner.nextInt();
                System.out.println("Por favor introduce el segundo numero");
                num2 = scanner.nextInt();
                suma = operaciones.sumar(num1, num2);
                mult = operaciones.multiplicacion(num1, num2);
                resta = operaciones.resta(num1, num2);
                div = operaciones.division(num1, num2);
                opcion = operaciones.agregarResultados(new int[]{suma, resta, mult, div});
            } catch (InputMismatchException e) {
                System.out.println("Has introducido mal los operandos");
                opcion = 1;
            } catch (ArithmeticException e) {
                System.out.println("Has dividido entre 0");
                div = 0;
                opcion = operaciones.agregarResultados(new int[]{suma, resta, mult, div});
            } finally {
                scanner = new Scanner(System.in);
            }
        } while (opcion == 1);

    }
}
