import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroLoteria = (int) (Math.random() * 10000);
        int numeroJugar;

        System.out.printf("Introduce numero para jugar");
        numeroJugar = lecturaTeclado.nextInt();

        if (numeroJugar < 10000 && numeroJugar > 999) {

            // unidades, decenas, centenas loteria
            int unidadesLoteria = numeroLoteria % 10;
            int decenasLoteria = (numeroLoteria % 100) / 10;
            int centenasLoteria = (numeroLoteria % 1000) / 100;

            // unidades, decenas, centenas mio

            int unidadesMio = numeroJugar % 10;
            int decenasMio = (numeroJugar % 100) / 10;
            int centenasMio = (numeroJugar % 1000) / 100;

            if (numeroJugar == numeroLoteria) {
                System.out.printf("Has ganado el premio gordo");
            } else if (unidadesLoteria == unidadesMio
                    && decenasLoteria == decenasMio
                    && centenasLoteria == centenasMio) {
                System.out.printf("Has ganado 10000");
            } else if (unidadesLoteria == unidadesMio
                    && decenasLoteria == decenasMio) {
                System.out.printf("Has ganado 1000");
            } else if (unidadesLoteria == unidadesMio) {
                System.out.printf("Has ganado 10");
            } else {
                System.out.printf("Has perdido");

            }
        }

    }
}
