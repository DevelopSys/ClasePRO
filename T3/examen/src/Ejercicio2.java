import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Con que numero quieres jugar la bonoloto");
        int numeroUsuario = scanner.nextInt();
        int numeroMax = 0, numeroMin =100, sumatorioGenerados=0;
        double media = 0.0;
        boolean premio = false;
        // 1-100

        for (int i = 0; i < 10; i++) {
            int generado = (int) (Math.random() * 100) + 1;
            if (generado>numeroMax){
                numeroMax = generado;
            }
            if (generado<numeroMin){
                numeroMin = generado;
            }
            if (generado == numeroUsuario){
                premio=true;
            }
            sumatorioGenerados += generado;
        }
        media = (double) sumatorioGenerados/10;

        System.out.println("El numero mas grande es "+numeroMax);
        System.out.println("El numero mas pequeño es "+numeroMin);
        System.out.println("El sumatorio es "+sumatorioGenerados);
        System.out.println("La media es "+media);

        if (premio){
            System.out.println("Has acertado el numero");
        } else {
            System.out.println("Has fallado");
        }


    }
}
