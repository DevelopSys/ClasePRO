import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuando vale el coche que te quieres comprar");
        int precio = scanner.nextInt();
        System.out.println("En cuantps plazos lo quieres pagar");
        int plazos = scanner.nextInt();

        double cuotaMes = precio/plazos;
        System.out.printf("Vas a pagar el coche de %d€ en %d meses, con un total de %.2f cada plazo (sin\n" +
                "tener en cuenta los intereses)\n",precio,plazos,cuotaMes);


    }
}
