public class EjercicioBingo {

    public static void main(String[] args) {

        int[][] carton = new int[3][7];
        //Math.random()*100;
        /*for ( int[] fila : carton) {
            for (int numero: fila) {
                numero = (int) (Math.random()*100);
            }
        }*/
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j <carton[i].length; j++) {
                carton[i][j] = (int) (Math.random()*100);
            }
        }

        for (int[] fila: carton ) {
            for ( int numero: fila ) {
                System.out.print(numero+" ");
            }
            System.out.println("");
        }
    }


}
