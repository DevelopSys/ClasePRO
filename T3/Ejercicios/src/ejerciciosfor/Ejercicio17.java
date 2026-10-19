package ejerciciosfor;

public class Ejercicio17 {

    public static void main(String[] args) {
        int factorial = 1;
        int numeroCalcular = 4;

        for (int i = 2; i <= numeroCalcular; i++) {
            factorial = factorial * i;
        }
        System.out.println("el valor de factorial es de " + factorial);
    }
}
