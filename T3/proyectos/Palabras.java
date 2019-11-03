import java.util.Scanner;

public class Palabras {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra de la que quieres hacer la evaluación");
        String palabra = teclado.next();

        // indica el número de letras que tiene una palabra
        int numeroLetras = palabra.length();


        System.out.printf("La palabra %s tiene %d letras %n",palabra,numeroLetras);

        System.out.println("Introduce la letra que quieres ver si está en la palabra");
        String letra = teclado.next();
        // obtiene un booleano si la letra está o no en la palabra
        boolean contiene = palabra.contains(letra);
        // obtiene la posición de la letra dentro de una palabra
        int posicion = palabra.indexOf(letra);

        if (contiene){
            System.out.printf("la letra %s está en la posición %d %n",letra,posicion);
        }
        else {
            System.out.printf("la letra %s no está  en la palabra %n",letra);
        }

        // recorre cada una de las letras de la palabra y las imprime
        for (int i =0; i<palabra.length();i++){
            System.out.println(palabra.charAt(i));
        }

    }
}
