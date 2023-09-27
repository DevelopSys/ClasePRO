import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        final double PRECIO_BOCADILLO = 2.05;
        final double PRECIO_BEBIDA = 1.25;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas bebidas: ");
        int numeroBebidas = scanner.nextInt();
        System.out.print("Cuantas bocadillos: ");
        int numeroBocadillos = scanner.nextInt();
        System.out.println("Indica cuantos sois");
        int comensales = scanner.nextInt();
        double precioBocadilloTotal =  numeroBocadillos*PRECIO_BOCADILLO;
        double precioBebidasTotal = numeroBebidas * PRECIO_BEBIDA;
        double precioTotal = precioBebidasTotal+ precioBocadilloTotal;

        System.out.printf("El precio de los bocadillos es de: %.2f\n",precioBocadilloTotal);
        System.out.printf("El precio de las bebidas es de: %.2f\n",precioBebidasTotal);
        System.out.printf("El precio total es de: %.2f\n",precioTotal);
        System.out.printf("El precio total por persona es de : %.2f\n",precioTotal/comensales);
    }
}
