public class EjercicioBingo {

    public static void main(String[] args) {

        int[][] carton = new int[3][7];
        int numeroPares = 0, numeroImpares = 0;
        //Math.random()*100;
        /*for ( int[] fila : carton) {
            for (int numero: fila) {
                numero = (int) (Math.random()*100);
            }
        }*/
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                carton[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int[] fila : carton) {
            for (int numero : fila) {
                System.out.print(numero + " ");
            }
            System.out.println("");
        }

        for (int[] fila : carton) {
            for (int numero : fila) {
                if (numero % 2 == 0) {
                    numeroPares++;
                } else {
                    numeroImpares++;
                }
            }
        }

        // suma filas
        for (int i = 0; i < carton.length ; i++) {
            int sumaFila =0;
            for (int j = 0; j < carton[i].length; j++) {
                sumaFila += carton[i][j];
            }
            System.out.printf("La suma de la fila %d es: " +
                    "%d\n",i,sumaFila);
        }

        // suma columnas
        for (int i = 0; i < carton[0].length; i++) {
            int sumaColumnas =0;
            for (int j = 0; j < carton.length; j++) {
                sumaColumnas+= carton[j][i];
            }

            System.out.printf("La suma de la columna %d es: " +
                    "%d\n",i,sumaColumnas);
        }
    }


}
