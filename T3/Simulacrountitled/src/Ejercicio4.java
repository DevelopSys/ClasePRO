import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        a. Si su longitud es menor de 4, transformar todas sus letras en mayúsculas
        b. Si su longitud es mayor igual que 4 pero menor que 8, transformar sus letras en
        minúsculas
        c. Si su longitud es mayor igual que 8 pero menor que 11, todas las vocales deberán
        estar acentuadas
        d. Si la longitud es mayor igual a 11 se deberá dar la vuelta a la palabra
         */
        String palabraInversa = "";
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.next();
        if (palabra.length() < 4) {
            palabra = palabra.toUpperCase();
        } else if (palabra.length() < 8) {
            palabra = palabra.toLowerCase();
        } else if (palabra.length() < 11) {
            palabra = palabra.replaceAll("a", "á")
                    .replaceAll("e", "é")
                    .replaceAll("i", "í")
                    .replaceAll("o", "ó")
                    .replaceAll("u", "ú");
        } else {
            palabraInversa = "";
            for (int i = palabra.length()-1; i >=0 ; i--) {
                palabraInversa += palabra.charAt(i);
            }
        }

        if (palabra.length()>=11){
            System.out.println(palabraInversa);
        } else {
            System.out.println(palabra);
        }



    }
}
