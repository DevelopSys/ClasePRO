import java.util.Scanner;

public class Ejercicio3Sw {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce numero");
        int numero = lector.nextInt();
        int par = numero%2;
        switch (par){
            case 0 -> {}
            case 1 -> {}
        }
        lector.close();
    }
}
