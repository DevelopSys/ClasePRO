import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica numero uno");
        int numeroUno = scanner.nextInt();
        System.out.println("Indica numero dos");
        int numeroDos = scanner.nextInt();
        System.out.printf("%d %d\n",numeroUno,numeroDos);
        int aux = numeroUno;
        numeroUno = numeroDos;
        numeroDos = aux;
        System.out.printf("%d %d",numeroUno,numeroDos);


    }
}
