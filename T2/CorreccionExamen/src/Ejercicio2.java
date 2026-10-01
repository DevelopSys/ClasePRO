import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el nombre de la reserva");
        String nombreReserva = lector.nextLine();
        System.out.println("Indica el numero de noches");
        int noches = lector.nextInt();
        System.out.println("Indica el precio noche");
        double precioNoche = lector.nextDouble();
        System.out.println("Indica el numero de personas");
        int personas = lector.nextInt();
        System.out.println("Indica el IVA");
        double iva = 1 + (lector.nextInt() / 100.0);
        lector.close();
        double precioTotal = ((noches * precioNoche) + (noches * 30) + (personas * 20)) * iva;
        System.out.printf("La reserva a nombre de %s es de %.2f con un total de %d noches",
                nombreReserva, precioTotal, noches);
    }
}
