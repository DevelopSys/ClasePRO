package ejercicioswitch;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la operacion que quieres hacer (+,-,*,/)");
        char operacion = scanner.next().charAt(0);
        System.out.println("Introduce operando uno");
        int numeroUno = scanner.nextInt();
        System.out.println("Introduce operando dos");
        int numeroDos = scanner.nextInt();

        int resultado=0;
        switch (operacion) {
            case '+':
                resultado = numeroDos + numeroUno;
                break;
            case '-':
                resultado = numeroUno - numeroDos;
                break;
            case '*':
                resultado = numeroDos * numeroUno;
                break;
            case '/':
                resultado = numeroDos / numeroUno;
                break;
        }

        System.out.println("El resultado es " + resultado);
    }
}
