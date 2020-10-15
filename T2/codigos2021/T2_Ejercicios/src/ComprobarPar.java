import java.util.Scanner;

public class ComprobarPar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean esPar, esMayorIgual;
        System.out.println("Introduce el numero a comprobar");
        numero = teclado.nextInt();
        // 4%2 == 0 -->true
        esPar = numero%2 == 0;
        //boolean esImpar = numero%2 != 0;
        esMayorIgual = numero>=50;
        System.out.printf("El numero %d tiene las siguientes comprobaciones%n" +
                "Par: %b%n" +
                "Es mayor o igual que 50: %b%n",numero,esPar,esMayorIgual);


    }
}
