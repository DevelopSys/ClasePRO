import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Cuando vale la compra");
        double precioCompra = lecturaTeclado.nextDouble();
        System.out.println("Cual es el % de IVA aplicado");
        int IVA = lecturaTeclado.nextInt();

        double ivaCompra = (precioCompra * IVA)/100;
        double compraSinIva = precioCompra - ivaCompra;

        System.out.println("Precio de la compra: "+ compraSinIva);
        //System.out.println("Precio de la compra: "+ (precioCompra-ivaCompra));
        System.out.println("El IVA de la compra: "+ivaCompra);
        System.out.println("El total de la compra: "+precioCompra);

    }
}
