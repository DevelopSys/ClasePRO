import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Por favor introduce el número");
        int numero = lecturaTeclado.nextInt();

        // lo divido entre 2 y el resto es 0 = es par
        boolean isPar = numero%2 == 0;
        // > 50
        boolean isMayor = numero > 50;
        // es par?
        // es mayor 50
        System.out.println("El número es par: "+isPar);
        System.out.println("El número es mayor que 50: "+isMayor);
    }
}
