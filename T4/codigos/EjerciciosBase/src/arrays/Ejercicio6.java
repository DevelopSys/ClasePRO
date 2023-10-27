package arrays;

public class Ejercicio6 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int numeroCambios = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 31);
        }
        mostrarArray(numeros);
        for (int i = 0; i < numeros.length; i++) {
            // los 6 por 8
            if (numeros[i] == 6) {
                numeros[i] = 8;
                numeroCambios++;
            }
        }
        mostrarArray(numeros);

        for (int i = 0; i < numeros.length; i++) {
            // los 7 por 15
            if (numeros[i] == 7) {
                numeros[i] = 15;
                numeroCambios++;
            }
        }
        mostrarArray(numeros);

        for (int i = 0; i < numeros.length; i++) {
            // los 6 por 8
            if (numeros[i] == 20) {
                numeros[i] = 10;
                numeroCambios++;
            }
        }
        mostrarArray(numeros);

        System.out.println("El numero de cambios realizados es: " + numeroCambios);
    }

    public static void mostrarArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }

}
