import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el operando");
        int operando = lector.nextInt();
        operando +=5;
        System.out.println("Despues de sumar "+operando);
        operando -=3;
        System.out.println("Despues de restar "+operando);
        operando *=10;
        System.out.println("Despues de multiplicar "+operando);
        operando /=2;
        System.out.println("Despues de dividir "+operando);
        lector.close();
    }
}
