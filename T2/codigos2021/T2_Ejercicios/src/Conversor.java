import java.util.Scanner;

public class Conversor {


    /*
    * Crea un conversor entre euros, dolares, libras y yens.
    * Para ello crea una variable para cada convesión y muesta
    * por pantalla el valor pedido de euros en todas las monedas
    * con el siguiente formado:
    * 23 euros son 25,63 dolares
    *
    *  Euros pedidos por consola
    *  1 euro = 1,18 dollar
    *  1 euro = 124,74 yenes
    *  1 euro = 0,91 libras
    *  System.out.printf()
    * */

    public static void main(String[] args) {

        double valorDollar = 1.18, valorYen = 124.74, valorLibras = 0.91;
        double euros;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los euros que quieres convertir");
        euros =  teclado.nextDouble();

        System.out.printf("El valor euros - dollar es %.2f%n", euros*valorDollar);
        System.out.printf("El valor euros - yenes es %.2f%n", euros*valorYen);
        System.out.printf("El \t valor euros - libras es %.2f%n", euros*valorLibras);

        System.out.println("NOMBRE \t\t APELLIDO \t\t EDAD");
        System.out.println("Borja \t\t Martin \t\t 18");



    }

}
