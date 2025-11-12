package ejercicio3;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tamaño tiene la matriz");
        int tamanio = scanner.nextInt();

        int[][] matrizA = new int[tamanio][tamanio];
        int[][] matrizB = new int[tamanio][tamanio];
        int[][] matrizC = new int[tamanio][tamanio];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (int) (Math.random() * 51);
                matrizB[i][j] = (int) (Math.random() * 51);
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
    }
}
