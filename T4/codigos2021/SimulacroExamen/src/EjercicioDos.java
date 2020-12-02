import java.util.Arrays;
import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        int[] numeros = null;

        do {
            System.out.println("1. Rellena");
            System.out.println("2. Obtener posicion");
            System.out.println("3. Listar");
            System.out.println("4. Listar ordenado");
            System.out.println("5. Rotar");
            System.out.println("6. Salir");
            System.out.println("Que quieres hacer");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    if (numeros == null) {
                        // llamar a un método y que lo cree, lo rellene y me lo dé
                        numeros = new EjercicioDos().crearArray();
                        /*for (int i = 0; i < numeros.length; i++) {
                            System.out.println("Introduce valor");
                            int numero = teclado.nextInt();
                            numeros[i] = numero;
                        }*/


                    } else {
                        System.out.println("Ya tienes valores");
                    }
                    break;
                case 2:

                    if (numeros != null) {
                        /*System.out.println("Que posición quieres comprobar");
                        int pocicion = teclado.nextInt();
                        if (pocicion>=numeros.length){
                            System.out.println("posicion inaccesible");
                        } else {
                            System.out.println(numeros[pocicion]);
                        }*/
                        new EjercicioDos().obtenerPosicion(numeros);
                    }
                    break;
                case 3:
                    new EjercicioDos().listarNormal(numeros);
                    break;
                case 4:
                    //Arrays.sort(numeros);
                    int elementos = numeros.length;
                    while(elementos>0){
                        for (int i = 0; i < (numeros.length - 1); i++) {
                            System.out.println("ordeno para " + i);
                            for (int j = 0; j < numeros.length - i - 1; j++) {
                                System.out.println("ordeno para j:" + j);

                                if (numeros[i] > numeros[i + 1]) {
                                    int aux = numeros[i + 1];
                                    numeros[i + 1] = numeros[i];
                                    numeros[i] = aux;
                                }
                            }
                        }
                        elementos--;
                    }

                    new EjercicioDos().listarNormal(numeros);
                    break;
                case 5:
                    break;
            }

        } while (opcion != 6);
    }

    public int[] crearArray() {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce valor");
            int numero = teclado.nextInt();
            array[i] = numero;
        }
        return array;
    }

    public void obtenerPosicion(int[] array) {
        int posicion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce posición");
        posicion = teclado.nextInt();
        if (posicion >= array.length) {
            System.out.println("Error");
        } else {
            System.out.println(array[posicion]);
        }
    }

    public void listarNormal(int[] numeros) {
        for (int item : numeros) {
            System.out.println(item);
        }
    }
}
