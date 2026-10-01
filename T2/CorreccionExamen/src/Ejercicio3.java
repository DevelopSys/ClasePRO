import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Nombre aparato");
        String nombre = lector.next();
        System.out.println("Indica potencia en vatios");
        int vatios = lector.nextInt();
        System.out.println("Indica el n de horas en uso");
        int horas = lector.nextInt();
        System.out.println("Cuandos dias lo vas a usar");
        int dias = lector.nextInt();
        System.out.println("Precio KW/h");
        double precioKW = lector.nextDouble();

        double kw = vatios / 10000.0;
        double consumoReal = kw * dias * horas;
        System.out.printf("El consumo real del aparato con nombre %s es de %.2f con un uso de %d horas\n", nombre, consumoReal, horas);
        double consumoPrecio = consumoReal*precioKW;
        System.out.printf("El precio real es de %.2f", consumoPrecio);


        lector.close();
    }
}
