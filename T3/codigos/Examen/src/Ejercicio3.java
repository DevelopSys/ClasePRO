import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroLoteria = (int) (Math.random() * 9000) + 1000;
        int numeroUsuario = 0;

        do {
            System.out.println("Introduce numero de la loteria");
            numeroUsuario = scanner.nextInt();
        } while (numeroUsuario < 1000 || numeroUsuario > 9999);

        // 1568
        // unidades
        int unidadesUsuario = numeroUsuario % 10;
        // decenas 68
        int decenasUsuario = (numeroUsuario % 100) / 10;
        // centenas
        int centenasUsuario = (numeroUsuario % 1000) / 100;
        // todos

        // 1568
        // unidades
        int unidades = numeroLoteria % 10;
        // decenas 68
        int decenas = (numeroLoteria % 100) / 10;
        // centenas
        int centenas = (numeroLoteria % 1000) / 100;
        // todos

        // LOTERIA= 5432
        // USUARIO= 4532

        if (numeroUsuario == numeroLoteria) {
            System.out.println("Premio 10000");
        } else if (unidadesUsuario == unidades && decenasUsuario == decenas
                && centenasUsuario == centenas) {
            System.out.println("Premio 1000");
        } else if (unidadesUsuario == unidades && decenasUsuario == decenas) {
            System.out.println("Premio 100");
        } else {
            System.out.println("Premio 10");

        }
    }
}
