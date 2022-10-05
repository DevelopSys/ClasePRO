import java.util.Scanner;

public class EntradaEjercicio3 {

    public static void main(String[] args) {
        // cambio entre monedas
        Scanner lecturaTeclado = new Scanner(System.in);

        final double CAMBIO_DOLAR = 0.99;
        final double CAMBIO_YEN = 143.13;
        final double CAMBIO_LIBRA = 0.87;

        System.out.println("Cuantos euros quieres cambiar");
        double cantidadEuros = lecturaTeclado.nextDouble();
        // es --> ,  no es el --> .

        double cambioDolares = cantidadEuros * CAMBIO_DOLAR;
        double cambioLibras = cantidadEuros * CAMBIO_LIBRA;
        double cambioYens = cantidadEuros * CAMBIO_YEN;

        System.out.printf("El cambio de %.2f€ a $ es de: %.2f%n",cantidadEuros,cambioDolares);
        System.out.printf("El cambio de %.2f€ a Libras es de: %.2f%n",cantidadEuros,cambioLibras);
        System.out.printf("El cambio de %.2f€ a Yens es de: %.2f%n",cantidadEuros,cambioYens);

    }


}
