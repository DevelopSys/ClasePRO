import java.util.Scanner;

public class Ejercicio7 {
    /*
    Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
    Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2) .
    (Circunferencia) NOTA El valor de PI se obtiene con Math.PI
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el radio de la circunferencia");
        int radio = lector.nextInt();
        double longitud = 2*Math.PI*radio;
        double area = Math.PI * Math.pow(radio,2);
        System.out.printf("La longitud de una circ con radio %d es %f\n",radio,longitud);
        System.out.printf("El area de una circ con radio %d es %f\n",radio,area);
    }
}
