import java.util.Scanner;

public class Compra {


    /*
    * Permítase introducir el valor con IVA de una compra con dos decimales
    * (la compra no puede ser superior a 500€ ni inferior a 0€)
    * y el valor del IVA de dicha compra (valor entero entre 0 y 25%).
    * ¿Cuánto costó la compra sin IVA? ¿Cuánto fue el IVA? Muéstrese los resultados redondeados
    * a dos decimales.
    * */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double iva, precio;

        System.out.println("Introduce el precio final del articulo");
        precio = teclado.nextDouble();
        System.out.println("Introduce el valor del IVA");
        iva = teclado.nextDouble();
        double precioSinIVA = precio -(precio *iva);
        double precioIVA = (precio *iva);

        System.out.printf("El valor de la compra es: %.2f%n",precioSinIVA);
        System.out.printf("El valor del iva de la compra es: %.2f%n",precioIVA);
        System.out.printf("El valor total de la compra es: %.2f%n",precioSinIVA+precioIVA);






    }
}
