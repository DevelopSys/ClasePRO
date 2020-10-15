import java.util.Scanner;

public class Radio {

    /*
    * Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
    * Obténgase la longitud de la circunferencia (2π r) y el área del circulo (π r 2) .
    * */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int radio;
        double area, longitud;
        //double PI = Math.PI;
        System.out.println("Introduce el radio de la circunferencia");
        radio = teclado.nextInt();
        area = Math.PI * (radio*radio);
        longitud = 2*Math.PI *radio;

        System.out.printf("El aréa de la circunferencia es: %.2f%n" +
                "La longitud de la circunferencia es: %.2f%n", area,longitud);


    }
}
