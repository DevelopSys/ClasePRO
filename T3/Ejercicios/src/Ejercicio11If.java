import java.util.Scanner;

public class Ejercicio11If {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica n1");
        int n1 = lector.nextInt();
        System.out.println("Indica n2");
        int n2 = lector.nextInt();
        System.out.println("Indica n3");
        int n3 = lector.nextInt();
        System.out.println("Indica ordenacion");
        boolean ordenacion = lector.nextBoolean();
        if (ordenacion){
            // de mayor a menor
            if (n1>n2 && n1>n3 && n2>n3){

            } else if (n2>n1 && n2>n3 && n1>n3){

            } else if (n3>n1 && n3>n2 && n2>n1){

            }

        } else {
            // de menor a mayor
            if (n1<n2 && n1<n3 && n2<n3){

            } else if (n2<n1 && n2<n3 && n1<n3){

            } else if (n3<n1 && n3<n2 && n2<n1){

            }
        }
    }
}
