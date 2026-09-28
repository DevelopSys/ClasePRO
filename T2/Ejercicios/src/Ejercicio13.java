import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primera palabra");
        int numero1 = lector.nextInt();
        System.out.println("Introduce el segunda palabra");
        int numero2 = lector.nextInt();
        boolean comprobacion1 = numero1%2==0 && numero2%2!=0;
        boolean comprobacion2 = numero1>numero2*2 && numero1<8;
        boolean comprobacion3 = numero1==numero2 || numero1-numero2<2;
        System.out.println("Comprobacion1 "+comprobacion1);
        System.out.println("Comprobacion2 "+comprobacion2);
        System.out.println("Comprobacion3 "+comprobacion3);
        lector.close();
    }
}
