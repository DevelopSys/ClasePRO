import java.util.Scanner;

public class Ejercicio6 {

    /*
    Permítase introducir el valor con IVA de una compra con dos decimales
    (la compra no puede ser superior a 500€ ni inferior a 0€)
    y el valor del IVA de dicha compra (valor entero entre 0 y 25%).¿
    Cuánto costó la compra sin IVA?¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales.
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuanto te ha costado la compra");
        double compraTotal = lector.nextDouble(); //
        System.out.println("Cuando IVA has pagado");
        int iva = lector.nextInt();
        // double ivaProducto = 1 - (double) iva/100;
        double compraSinIVA = compraTotal * (1 - ((double)iva/100)) ;
        double pagoIVA = compraTotal - compraSinIVA;
        System.out.printf("El precio de la compra sin IVA es %.2f\n",compraSinIVA);
        System.out.printf("Lo que has pagado de IVA es %.2f\n",pagoIVA);
    }
}
