import java.util.Arrays;
import java.util.Scanner;

public class EntradaAlgoritmos {

    public static void main(String[] args) {
        
        int[] numeros = new int[]{1,23,42,53,123,653,87,198,43,56};

        // 154,23,42,43,53,56,87,123,198,653
        for (int i = 0; i < numeros.length; i++) {
            // para i=1
            for (int j = 0; j < numeros.length-i-1; j++) {
                if (numeros[j]>numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }

        int[] arrayClone1 = new int[] {1,231,231,3123,123,1,32};
        int[] arrayClone2 = new int[] {1,231,231,3123,123,1,32};

        // 7 -> 10
        //arrayClone = Arrays.copyOf(arrayClone,10);
        //int[] arrayCopy = Arrays.copyOfRange(arrayClone,0,8);
        int diferencia = Arrays.compare(arrayClone1, arrayClone2);
        System.out.println(diferencia);
        /*for (int item: arrayCopy) {
            System.out.print(item+" ");
        }*/








        /*int[] numerosInvertir = new int[]{1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numerosInvertir.length; i++) {
            // i=0
            int aux = numerosInvertir[i];
            numerosInvertir[i] = numerosInvertir[numerosInvertir.length-1-i];
            numerosInvertir[numerosInvertir.length-1-i] = aux;
            //numerosInvertir[0] = numerosInvertir[4];
        }
        for (int item: numerosInvertir) {
            System.out.print(item +" ");
        }*/






        int[] extremos = calcularExtremos(numeros);
        // max
        System.out.println("El mas grande es: "+extremos[1]);
        // min
        System.out.println("El mas pequeño es: "+extremos[0]);
        // buscar un numero;
            // mediante métodos buscar un numero introducido por el usuario
            // el sistema dira:
                // Si el numero no esta: "Numero no encontrado"
                // El numero está en la posición X

        // 42
        // El numero esta en la posicion 2
        // 48
        // El numero no esta

        Scanner scanner = new Scanner(System.in);
        int numeroUsuario;
        Object[] respuesta;

        do {
            System.out.println("Introduce numero a buscar");
            numeroUsuario = scanner.nextInt();
            respuesta = estaNumero(numeroUsuario,numeros); // Objet[]


            if ((boolean)respuesta[0]){
                System.out.println("El numero esta en la posicion "+((int)respuesta[1]+5));
            } else {
                System.out.println("El numero no esta");
            }
        } while (!(boolean)respuesta[0]);

    }

    public static int[] calcularExtremos( int[] numeros ){
        int max = numeros[0];
        int min = numeros[0];

        for ( int item : numeros ) {
            if (item<min){
                min = item;
            }
            if (item>max) {
                max=item;
            }
        }

        return new int[]{min,max};
    }
    public static Object[] estaNumero(int numeroBuscado, int[] numeros){

        // esta? posicion?
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==numeroBuscado){
                // encontrado -> true , i
                return new Object[]{true,i};
            }
        }

        return new Object[]{false,-1};

    }
}
