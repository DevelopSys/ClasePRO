package ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner scanner = new Scanner(System.in);
        int[] listado = new int[10];
        for (int i = 0; i < listado.length; i++) {
            listado[i] = (int) (Math.random() * 20) + 1;
        }


        do {
            System.out.println("1. Imprimir");
            System.out.println("2. Izq");
            System.out.println("3. Der");
            System.out.println("4. Invertir");
            System.out.println("5. salir");
            System.out.println("Indica que opcion quieres realizar");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    for (int item : listado) {
                        System.out.print(item + " ");
                    }
                }
                case 2 -> {
                    int primero = listado[0];
                    for (int i = 0; i < listado.length - 1; i++) {
                        int aux = listado[i];
                        listado[i] = listado[i + 1];
                        listado[i + 1] = aux;
                    }
                    listado[listado.length - 1] = primero;
                }
                case 3 -> {
                    int ultimo = listado[listado.length - 1];
                    for (int i = listado.length - 1; i > 0; i--) {
                        int aux = listado[i];
                        listado[i] = listado[i - 1];
                        listado[i - 1] = aux;
                    }
                    listado[0] = ultimo;
                }

                case 4 -> {
                    for (int i = 0; i < listado.length / 2; i++) {
                        int aux = listado[i];
                        listado[i] = listado[listado.length-1-i];
                        listado[listado.length-1-i] = aux;
                    }
                }
            }
        } while (opcion != 5);


    }
}
