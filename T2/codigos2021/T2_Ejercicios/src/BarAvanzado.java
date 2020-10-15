import java.util.Scanner;

public class BarAvanzado {

    /*
    * Hágase una aplicación que permita introducir el número de bebidas y bocadillos
    * comprados (valores entre 0 y 20).
    * Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €)
    * y de cada bocadillo (valor entre 0.00 € y 5.00 €).
    * También se podrá introducir el número de alumnos que realizaron la compra
    * (valor entre 0 y 10). Se mostrará el total de la compra
    * (con el subtotal de las bebidas y de los bocadillos)
    * y la cantidad que debe pagar cada alumno redondeada a 2 decimales.
    * */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numBebidas, numBocadillos, numComensales;
        double precioBebida, precioBocadillo, totalBebidas, totalBocadillos,
                totalFactura, precioPersona;

        System.out.println("Cuantas personas sois");
        numComensales = teclado.nextInt();
        System.out.println("Cuantos bocadillos quereis");
        numBocadillos = teclado.nextInt();
        System.out.println("Cuantas bebidas quereis");
        numBebidas = teclado.nextInt();

        System.out.println("Cuando vale cada bocadillo");
        precioBocadillo = teclado.nextDouble();
        System.out.println("Cuando vale cada bebida");
        precioBebida = teclado.nextDouble();

        totalBebidas = numBebidas*precioBebida;
        totalBocadillos = numBocadillos *precioBocadillo;
        totalFactura = totalBebidas +totalBocadillos;
        precioPersona = totalFactura / numComensales;

        System.out.printf("Bocadillos\t\t\t%d\t\t\t%.2f\t\t\t%.2f%n",numBocadillos,precioBocadillo,totalBocadillos);
        System.out.printf("Bebidas\t\t\t\t%d\t\t\t%.2f\t\t\t%.2f%n",numBebidas,precioBebida,totalBebidas);
        System.out.printf("El total de la factura es: \t\t\t\t\t\t\t\t\t %.2f%n",totalFactura);
        System.out.printf("El total por persona es: \t\t\t\t\t\t\t\t\t %.2f",totalFactura/numComensales);



    }
}
