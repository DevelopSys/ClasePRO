package ejercicios;

public class EjerciciosMultidimensionales {

    public static void main(String[] args) {
        // definir un array con filas 5 y columnas aleatorias entre 2-6
        // rellenar el array (entero) con aleatorios
        int filas = (int) (Math.random()*5)+2;
        int[][] numeros = new int[5][filas];

        for (int i = 0; i <numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random()*21);
            }
        }
        imprimirArray(numeros);
        /*
        1,3,4,6
        2,3,5,7
        6,7,6,7
        4,1,2,3
         */
        // al array hay que quitarle uno a cada posicion
        // y volver a imprimir
        /*
        0,2,3,5
        1,2,4,6
        5,6,5,6
        3,0,1,2
         */
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                // numeros[i][j] = numeros[i][j] -1;
                numeros[i][j] -= 1;
            }
        }
        System.out.println("Imprimiendo modificado");
        imprimirArray(numeros);

        // Mofidificar e imprimir el array 8 veces, donde
        // cada vez el usuariario indica cuantas unidades se quitan
    }

    public static void imprimirArray(int[][] array){
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element +"\t");
            }
            System.out.println();
        }
    }
}
