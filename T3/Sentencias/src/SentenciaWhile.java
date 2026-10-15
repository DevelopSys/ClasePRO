import java.util.Scanner;

public class SentenciaWhile {


    public static void main(String[] args) {

        // pide valores por consola hasta que se meta un negativo
        Scanner lector = new Scanner(System.in);
        int numero;
        do {
            numero = lector.nextInt();
            if (numero >= 0)
                System.out.println("Numero correcto, repetimos");
        } while (numero >= 0);

        System.out.println("Numero negativo, terminamos");
        /*
        if (numero == 0) {
            while (numero >= 0) {
                System.out.println("Correcto, continua metiendo");
                numero = lector.nextInt();
            }
            System.out.println("Introducido un negativo");
        } else {
            System.out.println("El juego no puede arrancar");
        }*/

    }
}
