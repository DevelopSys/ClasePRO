import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // tipo nombre = valor
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Vamos a realizar lecturas de teclado");
        System.out.println("Por favor introduce tu nombre");
        String nombre = lectorTeclado.next();
        System.out.println("Por favor introduce la edad");
        int edad = lectorTeclado.nextInt();
        System.out.printf("Me llamo %s y tengo %d años%n",nombre,edad);
        lectorTeclado.close();

    }
}
