import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroBebidas, numeroBocadillos, numeroComensales;
        double precioCompraBebidas, precioCompraBodadillos, costeBocadillos, costeBebidas, costeTotal;

        System.out.println("Cuantos bocadillos has comprado (0-20)");
        numeroBocadillos = lecturaTeclado.nextInt();
        System.out.println("Cuantas bebidas has comprado (0-20)");
        numeroBebidas = lecturaTeclado.nextInt();
        System.out.println("Cuanto ha costado cada bocata (0.0 - 5.0): ");
        precioCompraBodadillos = lecturaTeclado.nextDouble();
        System.out.println("Cuanto ha costado cada bebida (0.0 - 3.0)");
        precioCompraBebidas = lecturaTeclado.nextDouble();
        System.out.println("Cuantos comensales sois: ");
        numeroComensales = lecturaTeclado.nextInt();

        costeBocadillos = numeroBocadillos*precioCompraBodadillos;
        costeBebidas = numeroBebidas*precioCompraBebidas;
        costeTotal = costeBebidas+costeBocadillos;

        System.out.println("ARTICULO\t\t\t\t\tCANTIDAD\t\tPRECIO\t\tCOSTE");
        System.out.printf("Bocadillos\t\t\t\t\t%d\t\t\t%.2f\t\t%.2f%n",numeroBocadillos,precioCompraBodadillos,costeBocadillos);
        System.out.printf("Bebidas\t\t\t\t\t\t%d\t\t\t%.2f\t\t%.2f%n",numeroBebidas,precioCompraBebidas,costeBebidas);
        System.out.printf("TOTAL\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f%n",costeTotal);
        System.out.printf("PPP\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f%n",costeTotal/numeroComensales);


    }
}
