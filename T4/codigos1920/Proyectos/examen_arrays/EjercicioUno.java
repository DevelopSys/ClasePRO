package examenArray;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioUno {

    static int[] numeros;
    static int numeroPares, numeroImpares, numeroRepeticiones;

    public static void main(String[] args) {
        numeros = new int[10];
        rellenarArray();
        System.out.println("** mostrar extremos");
        mostrarOrdenados();
        System.out.println("** mostrar par/impar");
        mostrarParImpar();
        System.out.println("** mostrar repeticiones");
        mostrarRepeticiones();
    }

    private static void mostrarRepeticiones() {
        System.out.println("Introduce el número del que quiere evaluar la repetición");
        int numeroEvaluar = new Scanner(System.in).nextInt();
        for (int n: numeros) {
            if (n == numeroEvaluar){
                numeroRepeticiones++;
            }
        }
        System.out.printf("El número %d se repite %d veces %n", numeroEvaluar,numeroRepeticiones);

    }

    private static void mostrarOrdenados() {
        Arrays.sort(numeros);
        System.out.printf("El número más grande es %d, el número más pequeño es %d %n"
                ,numeros[0],numeros[numeros.length-1]);
    }

    private static void mostrarParImpar() {
        for (int n : numeros){
            if (n%2==0){
                numeroPares++;
            } else {
                numeroImpares++;
            }
        }
    }

    private static void rellenarArray() {
        for (int i=0;i<numeros.length;i++){
            numeros[i]= (int) (Math.random()*21);
        }
    }
}
