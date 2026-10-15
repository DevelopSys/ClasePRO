import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el primer rango");
        int n1 = lector.nextInt();
        System.out.println("Indica el segundo rango");
        int n2 = lector.nextInt();
        lector.close();
        int min = 1000000, max=-1000000;
        if (n1>n2){
            max = n1;
            min = n2;
        } else if (n2>n1) {
            max = n2;
            min = n1;
        }

        for (int i = min; i <= max ; i++) {
            if (i%2==0){
                System.out.println("El par es "+i);
            }
        }
    }
}
