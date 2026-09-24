import java.util.Scanner;

public class Ejercicio11Compra {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("De cuanto dinero dispones");
        double dineroDisponible = lector.nextDouble();
        System.out.println("Cual es el iva aplicado");
        double iva = 1+(double)lector.nextInt()/100;
        System.out.println("Cuando vale la play");
        double precioPlay = lector.nextDouble() * iva;
        System.out.println("Cuando vale el iphone");
        double precioIphone = lector.nextDouble() * iva;
        boolean compraPlay = dineroDisponible>=precioPlay;
        boolean compraIPhone = dineroDisponible>=precioIphone;
        boolean compraTodo = dineroDisponible >= precioIphone+precioPlay;
        System.out.println("Puedes comprar la play "+compraPlay);
        System.out.println("Puedes comprar el iphone "+compraIPhone);
        System.out.println("Puedes comprar todo "+compraTodo);
    }
}
