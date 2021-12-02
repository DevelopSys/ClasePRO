package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        char[] abecedario = {'a','b','c','d','e','f','g','h'
                ,'i','j','k','l','m','n','ñ','o','p','q','r','s','t','v','w','x','y','z'};
        Scanner lecturaTeclado = new Scanner(System.in);
        int palabrasGenerar;
        System.out.println("Cuantas palabras quieres general");
        palabrasGenerar = lecturaTeclado.nextInt();

        for (int i = 0; i < palabrasGenerar; i++) {
            System.out.println("Palabra "+i);
            System.out.println("Cuantas letras tiene la palabra");
            int letras = lecturaTeclado.nextInt();
            String palabra = "";
            for (int j = 0; j < letras; j++) {
                char letraAleatoria = abecedario
                        [(int) (Math.random()*abecedario.length)];
                palabra += letraAleatoria;
            }
            System.out.println(palabra);


        }

    }
}
