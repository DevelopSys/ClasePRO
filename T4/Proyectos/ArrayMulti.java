/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author borjamartin
 */
public class ArrayMulti {

    public static void main(String[] args) {

        int[][] numeros = {{11, 12, 13}, {21, 22, 23}, {31, 32, 33}, {41, 42, 43}};

        // {11,12,13}
        // {00,01,02}
        numeros[0][0] = 00;
        numeros[0][1] = 01;
        numeros[0][2] = 200;

        for (int i = 0; i < numeros.length; i++) {
            for (int x = 0; x < numeros[i].length; x++) {
                System.out.print(numeros[i][x]);
            }
            System.out.println("*****");
        }
        
        // pedir por consola cuantos datos quiero introducir
        // y cuantas columnas tiene cada dato
        // llenar todas las posiciones con aleatorios
    }

}
