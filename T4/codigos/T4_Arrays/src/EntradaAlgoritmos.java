import java.util.Scanner;

public class EntradaAlgoritmos {

    public static void main(String[] args) {

        int[] numeros = new int[]{1,23,42,53,123,653,87,198,43,56};

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
