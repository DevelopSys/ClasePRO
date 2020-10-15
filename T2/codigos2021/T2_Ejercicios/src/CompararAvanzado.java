import java.util.Scanner;

public class CompararAvanzado {

    /*
    * Lea dos números entre 0 y 9, ambos inclusive.
    * Compruébese (mostrándose verdadero o falso) las siguientes condiciones e indíquese cómo se evalúan:

        El primero es par y el segundo impar
        El primero es superior al doble del segundo e inferior a 8
        Son iguales o la diferencia entre el primero y el segundo es menor que 2
    * */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroUno, numeroDos;
        boolean comprobacionPares, comprobacionSuperiorInferior, comprobacionIguales;
        System.out.println("Introduce primer numero");
        numeroUno = teclado.nextInt();
        System.out.printf("Introduce segundo numero");
        numeroDos = teclado.nextInt();
        // 5/2 = 2 resto 1
        comprobacionPares = numeroUno%2 == 0 && numeroDos%2 != 0;
        comprobacionSuperiorInferior = numeroUno > numeroDos*2 && numeroUno<8;
        comprobacionIguales = numeroUno == numeroDos || (numeroUno-numeroDos) <2;

        System.out.printf("Las comprobaciones son: %n" +
                "Son pares?: %b%n" +
                "Son superior?: %b%n" +
                "Son iguales?: %b%n",
                comprobacionPares, comprobacionSuperiorInferior, comprobacionIguales);





    }
}
