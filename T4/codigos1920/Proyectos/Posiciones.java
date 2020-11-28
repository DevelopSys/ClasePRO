/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Scanner;

/**
 *
 * @author borjamartin
 */

/*
        (PosicionesArray) Crea una aplicación que:

pida por teclado la longitud de un array
cree el array de enteros de la longitud introducida
pida al usuario que introduzca todos los datos del array
mueva una posición todos los elementos. el elemento de la 
        posición 0 pasa a la posición 1 y así sucesivamente. 
        El elemento que está en la última posición pasa a la primera
realizar la tarea anterior pero al contrario. 
        El elemento que está en la primera posición pasa a la última y así sucesivamente
        
 */
public class Posiciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int posicion = teclado.nextInt();
        int[] numeros = new int[posicion];

        
        
        // ordenacion1
        int primero = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (i == numeros.length - 1) {
                numeros[i] = primero;
            } else {
                int aux = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = aux;
            }
        }
        
        
        
        System.out.println("ORDENADO");
        // mostrar array ordenado
        for (int numero : numeros) {
            System.out.println(numero);
        }
        

    }



}
