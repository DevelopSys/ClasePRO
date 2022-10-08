import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia: ");
        int radioCircunferencia = lecturaTeclado.nextInt();

        // (2π r)
        double longitudCircunferencia = 2*Math.PI*radioCircunferencia ;
        // (π r 2)
        double areaCircunferencia= Math.PI * (radioCircunferencia*radioCircunferencia);

        System.out.printf("La longitud de la circunferencia es de %.2f%n",longitudCircunferencia);
        System.out.printf("El area de la circunferencia es de %.2f%n",areaCircunferencia);

    }
}
