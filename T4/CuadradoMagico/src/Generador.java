import java.util.Scanner;

public class Generador {
    private Scanner scanner = new Scanner(System.in);
    private int rango;

    private int[][] cuadrado;

    public void iniciarCuadrado() {
        System.out.println("Cuanto tamaño quieres que tenga el cuadrado");
        int tamanio = scanner.nextInt();
        cuadrado = new int[tamanio][tamanio];
        rango = 0;
        do {
            System.out.println("Que rango de aleatorios quires introducir");
            rango = scanner.nextInt();
        } while (rango < Math.pow(tamanio, 2));


        do{
            genererCuadrado();
        }while (!esMagico());

        imprimirCuadrado();

        // empieza la generacion
        // generar un cuadrado con numeros aleatorios

    }

    private void genererCuadrado() {
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random() * (rango + 1));
                } while (estaNumero(aleatorio)==true);

                cuadrado[i][j] = aleatorio;
            }
        }
    }

    private boolean estaNumero(int numero) {

        // recorro y compruebo
        for (int[] fila : cuadrado) {
            for (int item : fila) {
                if (item == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    private void imprimirCuadrado() {
        for (int[] fila : cuadrado) {
            for (int item : fila) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    private boolean esMagico(){
        int sumaGeneral=0;
        for (int i = 0; i < cuadrado.length; i++) {
            sumaGeneral += cuadrado[0][i];
        }

        // comprobar filas
        for (int i = 1; i < cuadrado.length; i++) {
            int sumaFila=0;
            for (int j = 0; j < cuadrado.length; j++) {
                sumaFila += cuadrado[i][j];
            }
            if (sumaGeneral!=sumaFila){
                return false;
            }
        }
        // comprobar columnas
        for (int i = 0; i < cuadrado.length; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < cuadrado.length; j++) {
                sumaColumna += cuadrado[j][i];
            }

            if (sumaGeneral!=sumaColumna){
                return false;
            }
        }
        // comprobar diagonal1
        int sumaDiagonal1 = 0;
        for (int i = 0; i < cuadrado.length; i++) {
            sumaDiagonal1 += cuadrado[i][i];
        }

        if (sumaGeneral != sumaDiagonal1){
            return false;
        }

        // comprobar diagonal2
        int sumaDiagonal2=0;

        for (int i = cuadrado.length-1; i >=0 ; i--) {
            sumaDiagonal2 += cuadrado[cuadrado.length-1-i][i];
        }

        if (sumaGeneral != sumaDiagonal2){
            return false;
        }
        return true;
    }
}
