import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la primera cadena de texto");
        String cadena1 = lector.nextLine();
        System.out.println("Introduce la segunda cadena de texto");
        String cadena2 = lector.nextLine();
        lector.close();
        boolean iguales = cadena1.equals(cadena2);
        boolean menor = cadena1.length() < cadena2.length();
        boolean distinas = !iguales;
        System.out.println("Las cadenas son igusles: "+cadena1.equals(cadena2));
        System.out.println("La primera cadena es menor: "+menor);
        System.out.println("Las cadenas son diferentes: "+!iguales);
    }
}
