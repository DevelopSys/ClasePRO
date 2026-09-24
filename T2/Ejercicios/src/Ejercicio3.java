import java.util.Scanner;

public class Ejercicio3 {

    /*
    Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
a) Suma
b) Resta
c) Multiplicación
d) División entera
e) Resto
f) División real
g) Resto real
(Operaciones)
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio1");
        System.out.println("Introduce el primer operando");
        int operando1 = lector.nextInt();
        System.out.println("Introduce el segundo operando");
        int operando2 = lector.nextInt();
        int suma = operando1 + operando2;
        int resta = operando1 - operando2;
        int division = operando1 / operando2;
        int modulo = operando1 % operando2;
        int multiplicacion = operando1 * operando2;
        double divisionReal = (double) operando1 / operando2;
        double moduloReal = (double) operando1 % operando2;



        System.out.printf("La suma de los operandos %d y %d es %d\n", operando1, operando2, operando1 + operando2);
        System.out.printf("La resta de los operandos %d y %d es %d\n", operando1, operando2, operando1 - operando2);
        System.out.printf("La division real de los operandos %d y %d es %.2f\n", operando1, operando2, (double)operando1/operando2);
    }
}
