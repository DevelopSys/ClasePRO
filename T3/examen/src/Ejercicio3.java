import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // final int CLAVE = 4576;
        // 1000 - 9999
        Scanner scanner = new Scanner(System.in);
        final int CLAVE_RANDOM = (int) (Math.random() *9000)+1000;
        System.out.println(CLAVE_RANDOM);
        int numeroUsuario=0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce tu intento");
            numeroUsuario = scanner.nextInt();
            if (numeroUsuario == CLAVE_RANDOM){
                System.out.println("Abierto");
            } else {
                if (i<3){
                    System.out.println("Por favor introduce de nuevo");
                } else if (i==3){
                    System.out.println("Bloqueada");
                }
            }
        }

    }
}
