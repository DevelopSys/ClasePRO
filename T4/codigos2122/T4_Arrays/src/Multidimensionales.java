public class Multidimensionales {

    public static void main(String[] args) {
        int[][] arrayMulti = new int[4][3];
        int[][] arrayMultiDiferente = {{0,0,0,0},{0,0,0},{0,0}};

        arrayMulti[0][0] = 7;
        arrayMulti[2][1] = 8;
        arrayMulti[1][2] = 6;
        System.out.println(arrayMulti[0]);

        for (int i = 0; i < arrayMultiDiferente.length; i++) {
            //System.out.println(arrayMulti[i]);
            // estando en la fila
            for (int j = 0; j < arrayMultiDiferente[i].length; j++) {
                System.out.print(arrayMultiDiferente[i][j]+" ");
            }
            System.out.println();
        }
    }
}
