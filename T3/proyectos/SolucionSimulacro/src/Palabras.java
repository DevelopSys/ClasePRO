import java.util.Scanner;

public class Palabras {
    public static void main(String[] args) {
        String palabra, palabraInversa = "";
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Por favor introduce una palabra por teclado");
        palabra = teclado.next();

        int longitud = palabra.length();


        // dependiendo de la longitud de la palabra
        if (longitud < 4) {
            palabra = palabra.toUpperCase();
        } else if (longitud >= 4 && longitud < 8) {
            palabra = palabra.toLowerCase();
        } else if (longitud >= 8 && longitud < 11) {
            palabra = palabra.replace('a', 'á');
            palabra = palabra.replace('e', 'é');
            palabra = palabra.replace('i', 'í');
            palabra = palabra.replace('o', 'ó');
            palabra = palabra.replace('u', 'ú');
            palabra = palabra.replace('A', 'Á');
            palabra = palabra.replace('E', 'É');
            palabra = palabra.replace('I', 'Í');
            palabra = palabra.replace('O', 'Ó');
            palabra = palabra.replace('u', 'Ú');
        } else {
            for (int i = longitud-1 ; i >= 0; i--) {
                palabraInversa += palabra.charAt(i);
            }
        }

        if (longitud < 11) {
            System.out.printf("La palabra resultante es %s %n", palabra);

        } else {
            System.out.printf("La palabra resultante es %s %n", palabraInversa);

        }
    }
}
