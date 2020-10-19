import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        double precioUno, precioDos, ahorros;
        final double IVA = 21;
        String nombre;
        Scanner teclado = new Scanner(System.in);
        double precioIVA, precioSinIVA;
        boolean comprarUno, comprarDos;

        System.out.println("Valor PS5");
        precioUno = teclado.nextDouble();
        System.out.println("Valor Iphone");
        precioDos = teclado.nextDouble();
        System.out.println("Cuanto tienes ahorrado");
        ahorros = teclado.nextDouble();
        System.out.println("Como te llamas");
        nombre = teclado.next();
        precioIVA = precioUno + precioDos;
        precioSinIVA = precioIVA - (precioIVA * (IVA/100));
        comprarDos = precioIVA <= ahorros;
        comprarUno = precioUno <= ahorros || precioDos <= ahorros;

        System.out.printf("Articulo PS5: %.2f%n" +
                "Articulo Iphone12: %.2f%n" +
                "IVA aplicado: %.2f%n" +
                "Total con IVA: %.2f%n" +
                "Total sin IVA: %.2f%n" +
                "Ahorros disponibles: %.2f%n" +
                "Puedo comprar uno: %b%n" +
                "Puedo comparar dos: %b%n",precioUno,precioDos,IVA,
                precioIVA, precioSinIVA,ahorros,comprarUno,comprarDos);




    }

}
