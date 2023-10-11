package bloquefor;

public class EntradaForeach {

    public static void main(String[] args) {

        int[] numeros = new int[]{4, 7, 12, 56, 123, 123, 123, 14, 3, 67, 54, 32, 34, 56, 7};
        // 4[0] 7[1] 12[2] 56[3] -> 4
        /*for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/
        // for ( elemento que itero : coleccion de datos )
        // indica cuantos pares existen
        int positivos = 0;
        for (int item : numeros) {
            if (item % 2 == 0) {
                System.out.println(item);
                positivos++;
            }
        }
    }
}
