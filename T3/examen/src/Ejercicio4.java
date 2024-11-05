import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime que numero en B10 quieres cambiar");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("No pueedo hacer el cambio");
        } else {
            System.out.println("Que cambio quieres hacer");
            System.out.println("Base 2");
            System.out.println("Base 8");
            System.out.println("Base 16");
            System.out.println("Que opcion quieres");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    pasoBase(numero,2);
                    break;
                case 2:
                    pasoBase(numero,8);
                    break;
                case 3:
                    pasoBase(numero,16);

                    break;
                default:
                    System.out.println("Base no contemplada");
            }
        }
    }

    public static void pasoBase(int numero, int base) {
        int resultado = 0;
        int resto = 0;
        String numeroResultante = "";
        if (numero < base) {
            numeroResultante = String.valueOf(numero);
        } else {
            resultado = numero;
            do {
                resultado = resultado / base;
                resto = resultado % base;
                numeroResultante = resto + numeroResultante;
            } while (resultado > base);
            numeroResultante = resultado + numeroResultante;
        }
    }
}
