import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica decenas de millar");
        int dm = lector.nextInt();
        System.out.println("Indica unidades de millar");
        int um = lector.nextInt();
        System.out.println("Indica centenas");
        int c = lector.nextInt();
        System.out.println("Indica decenas");
        int d = lector.nextInt();
        System.out.println("Indica unidades");
        int u = lector.nextInt();
        System.out.println(""+dm+um+c+d+u);
        System.out.println(String.valueOf(dm) + String.valueOf(um) + String.valueOf(c) + String.valueOf(d) + String.valueOf(u));
        System.out.printf("%d%d%d%d%d", dm, um, c, d, u);
        System.out.println("Vamos a descomponer");
        int numero = lector.nextInt();
        // 12345
        dm = numero/10000 ;
        um = (numero%10000)/1000;
        c = ((numero%10000)%1000)/100;
        d = (((numero%10000)%1000)%100)/10;
        u = (((numero%10000)%1000)%100)%10;

    }

}
