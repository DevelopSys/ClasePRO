import java.util.Scanner;

public class EstructuraFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tabla de multiplicar queres ver");
        int numero = scanner.nextInt();

        for (int i=0; i<11; i++){
            System.out.printf("%d * %d = %d\n",numero,i,numero*i);
        }

    }
}
