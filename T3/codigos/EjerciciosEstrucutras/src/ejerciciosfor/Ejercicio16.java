package ejerciciosfor;

public class Ejercicio16 {
    public static void main(String[] args) {
        int numero = 10;
        int factorial = 1;
        for (int i = 1; i <=numero ; i++) {
            factorial *=i;
        }
        System.out.println(factorial);
    }
}
