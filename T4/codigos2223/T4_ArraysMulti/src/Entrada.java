import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        //ejercicioNumeros();
        ejercicioAlumnos();

    }

    private static void ejercicioAlumnos() {
        // nombre, nota1, nota2, cv
        // nombre, nota1, nota2, cv
        // nombre, nota1, nota2, cv
        // nombre, nota1, nota2, cv
        Object[][] datosAlumnos = new Object[][]{
                {"Borja",5,7,false},
                {"Luis",7,9,true},
                {"Celia",10,7,true},
                {"Claudia",9,9,true}
        };

        datosAlumnos[2][2] = 10;

        /*for ( Object[] alumno : datosAlumnos ) {
            for ( Object dato : alumno ) {
                System.out.print(dato+"\t\t");
            }
            System.out.println();
        }*/
        for (int i = 0; i < datosAlumnos.length; i++) {
            for (int j = 0; j < datosAlumnos[i].length; j++) {
                if ((boolean)datosAlumnos[i][3]) {
                    System.out.print(datosAlumnos[i][j]+"\t\t");
                }
            }
            System.out.println();
        }
        // sacar los datos de los alumnos tienen la asignatura cv

    }

    private static void ejercicioNumeros() {
        // pidais por consola el nunmero de filas, el numero de columnas
        // crear un array[][] de int con los datos introducidos
        // rellenar dicho array con numeros aleaotrios 0-10 (todas las fila)
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Indica le numero de filas");
        int numeroFilas = lecturaTeclado.nextInt();
        System.out.println("Indica le numero de columnas");
        int numeroColumnas = lecturaTeclado.nextInt();
        int[][] arrayNumeros = new int[numeroFilas][numeroColumnas];

        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                arrayNumeros[i][j] = (int)(Math.random()*11);
            }
        }

        /*for ( int[] fila : arrayNumeros ) {
            for ( int numero : fila ) {
                numero = (int) (Math.random()*11);
            }
        }*/

        /*
        7   8   9   8   6
        5   7   9   0   6
        4   3   21  9   5

        7   8   9   8   6
        7       8       9       8       6
        5   7   9   0   6
         */

        int numMax = -1;
        int numMin = 11;
        int sumatorioFila = 0;

        for ( int[] fila : arrayNumeros ) {
            numMax = -1;
            numMin = 11;
            sumatorioFila = 0;
            for ( int numero : fila ) {
                if (numMax<numero){
                    numMax = numero;
                }
                if (numMin>numero){
                    numMin = numero;
                }
                sumatorioFila+=numero;
                System.out.print(numero+"\t\t");
            }
            System.out.printf("Max: %d Min: %d Suma %d%n",numMax,numMin,sumatorioFila );
        }

        // sacar el max y min de cada fila
        // sacar el sumatorio de cada fila

    }

    public static void inicioMulti(){
        // tipo[][] nombre = new tipo[5][5]
        // tipo[][] nombre = new tipo[][]{ {1,2,3,4},{5,6,7,0},{8,9,10,0} }
        // tipo[][] nombre = new tipo[3][4]

        //String[][] multidimensionalArray = new String[3][3];
        String[][] multidimensionalArray = new String[][]{
                {"Elemento 1_1", "Elemento1_2", "Elemento1_3","Elemento1_4"},
                {"Elemento 2_1", "Elemento2_2", "Elemento2_3"},
                {"Elemento 3_1", "Elemento3_2", "Elemento3_3"},
                {"Elemento 4_1", "Elemento4_2", "Elemento4_3"}

        };
        multidimensionalArray[2][2] = "Fila 3_Columna 3";
        //System.out.println(multidimensionalArray[2][2]);
        // multidimensionalArray.length --> 4
        for (int i = 0; i < multidimensionalArray.length ; i++) {
            // recorrer filas
            for (int j = 0; j < multidimensionalArray[i].length; j++) {
                // recorrer columnas
                System.out.print(multidimensionalArray[i][j]+"\t\t");
            }
            // cambio de fila
            System.out.println();
        }



        int[][] multidimensionalNumeros = new int[5][5];


    }
}
