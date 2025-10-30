public class Main {


    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        cuadrado[0][0] = 1;
        cuadrado[0][2] = 3;
        cuadrado[2][0] = 7;
        cuadrado[2][2] = 9;

        System.out.println("El numero de filas es "+cuadrado.length);
        System.out.println("El ultipo elemento del cuadrado es "+cuadrado[2][2]);

        // guardar dentro del array numeros aleatorios entre 0-10
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                cuadrado[i][j] = (int)(Math.random()*11);
                System.out.print(cuadrado[i][j]);
            }
            System.out.println();
        }

        /*for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                if (j==1){
                    cuadrado[i][j]=5;
                }
                System.out.print(cuadrado[i][j]);
            }
            System.out.println();
        }*/

        int suma = 0;
        for ( int[] fila : cuadrado ) {
            for ( int item : fila ) {
                System.out.print(item+"\t");
                suma+=item;
            }
            System.out.println();
        }
        System.out.println("La suma de todos los elementos del array es "+suma);
    }
}
