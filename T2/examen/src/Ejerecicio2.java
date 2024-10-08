import java.util.Scanner;

public class Ejerecicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // genera un aleatorio (1000 y 9999)
        int aleatorio = (int) (Math.random()*9000)+1000;
        // mete un numero
        System.out.println("Por favor introduce un numero");
        int numero = scanner.nextInt();
        // y di coincidencias numero a numero
        int millares = numero/1000;
        int resto = numero%1000;
        int centenas = resto/100 ;
        resto = resto%100;
        int decenas = resto/10;
        int unidades = resto%10;

        // sacar las unidades del aleatorio
        System.out.println("Coinciden las unidades:"+ (unidades==unidades));
        // sacar las decenas del aleatorio
        System.out.println("Coinciden las decenas:"+ (decenas==decenas));
        // sacar las centenas del aleatorio
        System.out.println("Coinciden las centenas:"+ (centenas==centenas));
        // sacar las millares del aleatorio
        System.out.println("Coinciden las centenas:"+ (millares==millares));
        // todos coinciden
        System.out.println("Coinciden todos: "+(aleatorio==numero));

    }
}
