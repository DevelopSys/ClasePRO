import java.util.Scanner;

public class EntradaSwitch {

    public static void main(String[] args) {

        int numero = 0;
        switch (numero) {
            case 0:
                int edad = 10;
                System.out.println("El valor es 0");
                break;
            case 5:
                // puedo acceder a edad??????
                // System.out.println(edad);
                // edad = 10;
                System.out.println("El valor es 5");
                break;
            case 10:
                System.out.println("El valor es 10");
                break;
            default:
                System.out.println("El valor no esta contemplado");
        }

        String mes = "Enero";
        switch (mes){
            case "Enero":
                break;
            case "Febrero":
                break;
            case "Marzo":
                break;
        }

        char letra = 'Z';
        switch (letra){
            case 'A':
                break;
            case 'Z':
                break;
            case 'R':
                break;
        }
        System.out.println("Terminando bloque");

        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.next();
        char letraScanner = scanner.next().charAt(0);
        String  numeroChars = "4567";
        String  aleatorioChars = "3456";
        // numeroChars.charAt(0) == aleatorioChars.charAt(0)
        // numeroChars.charAt(1) == aleatorioChars.charAt(1)

    }
}
