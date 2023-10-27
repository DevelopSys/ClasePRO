public class EntradaMultidimensionales
{
    public static void main(String[] args) {

        int[][]carton =new int[2][4];
        // 0 0 0 0
        // 0 0 0 0
        int[][]cartonNumeros = new int[][]{{4,8,9,10,123,21},{20,30,23,7,123,123,123,123,123,123,12,123,123}};
        // 4 8 9 10
        // 20 30 23 7

        //carton[1][3] = 20;
        //System.out.println(carton[1][2]);
        //System.out.println(cartonNumeros[1][1]);
        // sacar todos los datos de un array multidimensional
        for ( int[] fila : cartonNumeros ) {
            for ( int numero : fila ) {
                System.out.print(numero+" ");
            }
            System.out.println("");
            break;
        }

        for (int i = 0; i < cartonNumeros.length; i++) {
            // filas
            for (int j = 0; j < cartonNumeros[i].length; j++) {
                System.out.print(cartonNumeros[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
