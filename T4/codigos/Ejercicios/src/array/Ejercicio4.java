package array;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tamaño tiene el array?");
        int[] numeros = new int[scanner.nextInt()];
        int[] numeros1 = new int[80];
        int[] numeros2 = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*21);
        }
        mostrarArray(numeros);

        // rotar derecha
        int aux = numeros[numeros.length-1];
        for (int i = numeros.length-1; i >0 ; i--) {
            numeros[i]=numeros[i-1];
        }
        numeros[0] = aux;

        

        mostrarArray(numeros);
    }

    public static void mostrarArray(int[] array){
        for (int item : array ) {
            System.out.print(item+" ");
        }
        System.out.println("");
    }
}
