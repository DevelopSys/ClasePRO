import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // dime tu nombre y apellidos
        // dime cuanto vale la play
        // dime cuanto vale la iphone
        // dime cuanto dinero tienes
        // dime cuanto iva
        // puedo comprarme
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Como te llamas");
        String nombre = lectorTeclado.nextLine();
        System.out.println("Cuanto dinero tienes");
        double dineroDisponible = lectorTeclado.nextDouble();
        System.out.println("Cuanto vale la play");
        double dineroPlay = lectorTeclado.nextDouble();
        System.out.println("Cuanto vale el iphone");
        double dineroIphone = lectorTeclado.nextDouble();
        System.out.println("Cuanto iva se aplica");
        double iva = lectorTeclado.nextDouble();

        boolean comprarPlay = (dineroDisponible - (dineroPlay+dineroPlay*iva))>=0;
        boolean comprarIphone = (dineroDisponible - (dineroIphone+dineroIphone*iva))>=0;
        boolean comparaTodo = (dineroDisponible - ((dineroPlay+dineroPlay*iva) + (dineroIphone+dineroIphone*iva))) >=0;

        System.out.println("Te puedes comprar la play "+comprarPlay);
        System.out.println("Te puedes comprar la iphone "+comprarIphone);
        System.out.println("Te puedes comprar la todo "+comparaTodo);

    }
}

