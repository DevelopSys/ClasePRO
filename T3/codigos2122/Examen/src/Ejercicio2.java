import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroCaja = 1234;
        int numeroIntroducido;
        boolean bloqueada = true;

        for (int i = 0; i < 4; i++) {
            System.out.printf("Introduce nuevo numero %n");
            numeroIntroducido = lecturaTeclado.nextInt();
            if (numeroIntroducido == numeroCaja) {
                System.out.printf("Caja desbloqueada %n");
                bloqueada = false;
                break;
            }

        }
        if (bloqueada) {
            System.out.println("Caja bloqueada");
        }

    }
}
