import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

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
        int opcion = 0, num1 = 0, num2 = 0, suma = 0, resta = 0, div = 0, mult = 0;
        ArrayList<int[]> resultados = new ArrayList<>();
        do {
            try {
                System.out.println("Por favor introduce el primer numero");
                num1 = scanner.nextInt();
                System.out.println("Por favor introduce el segundo numero");
                num2 = scanner.nextInt();
                suma = num1 + num2;
                mult = num1 * num2;
                resta = num1 - num2;
                div = num1 / num2;

                System.out.println("Los resultados son:");
                System.out.println("Suma: " + suma);
                System.out.println("Resta: " + resta);
                System.out.println("Multi: " + mult);
                System.out.println("Div: " + div);
                resultados.add(new int[]{suma, resta, mult, div});
                System.out.println("Quieres volver a operar (1-SI 2-NO)");
                opcion = scanner.nextInt();

            } catch (ArithmeticException e) {
                // solucion -> la division la pones como 0
                System.out.println("Error en division / 0");
                div = 0;
                System.out.println("Los resultados son:");
                System.out.println("Suma: " + suma);
                System.out.println("Resta: " + resta);
                System.out.println("Multi: " + mult);
                System.out.println("Div: " + div);
                resultados.add(new int[]{suma, resta, mult, div});
                System.out.println("Quieres volver a operar (1-SI 2-NO)");
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                // solucion -> pedir otra vez los datos
                System.out.println("Error a la hora de introducir los datos");
                opcion = 1;
            } catch (Exception e) {
                // solucion
            } finally {
                scanner = new Scanner(System.in);
            }

        } while (opcion == 1);

    }
}
