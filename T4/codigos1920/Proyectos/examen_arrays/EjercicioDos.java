package examenArray;

import sun.tools.jstat.Scale;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioDos {

    static int[] numeros = new int[20];
    static int opcion = 0;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        numeros = new int[20];

        do {
            System.out.println("1. Registar posiciones");
            System.out.println("2. Obtener elementos de una posición");
            System.out.println("3. Mostrar el array completo");
            System.out.println("4. Mostrar el array ordenado");
            System.out.println("5. Rotar el array");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("**Rellenando el array**");
                    rellenarArray();
                    break;
                case 2:
                    obtenerElemento();
                    break;
                case 3:
                    mostrarArray();
                    break;
                case 4:
                    mostrarArrayOrdenado();
                    break;
                case 5:
                    System.out.println("Por favor indica la dirección en la que quieres ordenar:");
                    System.out.println("0 - Izquierda");
                    System.out.println("1 - Derecha");
                    int rotacion = teclado.nextInt();
                    rotarArray(rotacion);
                    break;
                default:
                    break;
            }

        } while (opcion != 6);
    }

    private static void rotarArray(int rotacion) {
        int primero = numeros[0];
        int ultimo = numeros[19];

        // se rota a la derecha
        if (rotacion == 0) {
            for (int i = 0; i < numeros.length; i++) {

                if (i == numeros.length - 1) {
                    numeros[i] = primero;
                } else {
                    int aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                }
            }
        }
        // se rota a la izquierda
        else if (rotacion == 1) {
            for (int x = numeros.length-1; x >0; x--) {
                if (x != 0) {
                    int aux = numeros[x - 1];
                    numeros[x] = numeros[x - 1];
                    numeros[x - 1] = aux;
                }
            }
            numeros[0] = ultimo;

        } else {
            System.out.println("Opción no comprendida");
        }

        System.out.println("Rotación completa");
        System.out.println("**************");
    }

    private static void mostrarArrayOrdenado() {
        Arrays.sort(numeros);
        for (int n : numeros) {
            System.out.printf("%d ", n);
        }
        System.out.println("");
        System.out.println("Mostrado completo");
        System.out.println("**************");
    }

    private static void mostrarArray() {
        for (int n : numeros) {
            System.out.printf("%d ", n);
        }
        System.out.println("");
        System.out.println("Mostrado completo");
        System.out.println("**************");

    }

    private static void obtenerElemento() {

    }

    private static void rellenarArray() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduce el número para guardar");
            int numero = teclado.nextInt();
            numeros[i] = numero;
        }

        System.out.println("Array completo");
        System.out.println("**************");
    }
}
