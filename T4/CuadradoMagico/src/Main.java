import java.util.Scanner;

public class Main {

    public static int[][] cuadrado;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que dimension queres del array");
        int dimension = scanner.nextInt();
        // int [][] cuadradoM = new int[][]{{1,2,3,4},{1,2},{1,1,1,1,1,1}};
        // genera cuadradro mientras no sea magico
        int intento = 0;
        do {
            intento++;
            System.out.println("Intento " + intento);
            rellenarCuadrado(dimension);
        } while (!esMagico());
        mostrarCuadrado();
    }

    public static void rellenarCuadrado(int dimension) {
        // recoorrer filas
        // cuadrado.length -> cuantas filas
        cuadrado = new int[dimension][dimension];
        for (int i = 0; i < cuadrado.length; i++) {
            // recorrer columnas
            for (int j = 0; j < cuadrado[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random() * 100) + 1;
                } while (estaNumero(aleatorio));
                // no esta el aleatorio en la matriz
                cuadrado[i][j] = aleatorio;
            }
        }
        // asignar valor
    }

    public static boolean estaNumero(int aleatorio) {
        for (int[] row : cuadrado) {
            for (int data : row) {
                if (data == aleatorio) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void mostrarCuadrado() {
        // recorrer filas
        for (int[] row : cuadrado) {
            for (int data : row) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
        // recorre columna
        // saca celda
    }

    public static boolean esMagico() {

        int magico = 0;
        for (int i = 0; i < cuadrado.length; i++) {
            magico += cuadrado[i][0];
        }
        System.out.println("La suma magica es "+magico);

        // filas magicas
        for (int[] row : cuadrado) {
            int sumaRow = 0;
            for (int data : row) {
                sumaRow += data;
            }
            if (sumaRow != magico) {
                return false;
            }
        }
        System.out.println("Filas ok");

        // columnas magicas
        for (int i = 0; i < cuadrado.length; i++) {
            int sumaCol = 0;
            for (int j = 0; j < cuadrado.length; j++) {
                sumaCol += cuadrado[j][i];
            }
            if (sumaCol != magico) {
                return false;
            }
        }
        System.out.println("Columnas ok");

        // diagonal principal
        int sumaDiagonal = 0;
        for (int i = 0; i < cuadrado.length; i++) {
            sumaDiagonal += cuadrado[i][i];
        }
        if (sumaDiagonal != magico) {
            return false;
        }

        System.out.println("Diagonal1 ok");

        // diagonal secundaria
        int sumaDiagonal2 = 0;
        for (int i = 0; i < cuadrado.length; i++) {
            sumaDiagonal2 += cuadrado[i][cuadrado.length - i - 1];
        }
        if (sumaDiagonal2 != magico) {
            return false;
        }
        System.out.println("Diagonal2 ok");


        return true;
    }
}
