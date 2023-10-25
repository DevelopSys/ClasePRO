import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int clave = 4325;
        int intentos = 4;
        boolean abierta = false;
        Scanner scanner = new Scanner(System.in);
        int numeroIntento = 0;

        for (int i = 0; i < intentos; i++) {
            System.out.println("Introduce numero de apertura");
            numeroIntento = scanner.nextInt();

            if (numeroIntento == clave) {
                System.out.println("Has abierto la caja");
                abierta = true;
                break;
            } else {
                System.out.println("No has acertado");
            }
        }

        // abierta = true
        if (!abierta) {
            System.out.println("Caja bloqueada");
        }
    }
}
