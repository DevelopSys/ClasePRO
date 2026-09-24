import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantos grados centigrados quieres pasar");
        //
        int gradosPasar = lector.nextInt();
        double gradosK = gradosPasar + 273.15;
        double gradosF = ((double) (9 * gradosPasar) / 5) + 32;
        // k
        System.out.println("Indiac los grados K a pasar");
        gradosPasar = lector.nextInt();
        double gradosC = gradosPasar - 273.15;
        gradosF = ((9 * gradosPasar - 273.15) / 5) + 32;
        // f
        System.out.println("Indiac los grados F a pasar");
        gradosPasar = lector.nextInt();
        gradosC = (double) (5 * gradosPasar - 32) / 9;
        gradosF = (double) (9 * (gradosPasar - 32)) / 5 + 32;
    }
}
