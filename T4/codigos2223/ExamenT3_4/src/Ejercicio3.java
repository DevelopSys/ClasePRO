import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        int posicionArray=0;


        do {
            System.out.println("1. Rellenar posiciones");
            System.out.println("2. Mostrar posicion");
            System.out.println("3. Mostrar array");
            System.out.println("4. Ordenar array");
            System.out.println("5. Rotar");
            System.out.println("6. Salir");
            System.out.println("Que opcion queres hacer");
            opcion = lectura.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Introduce numero de la posicion "+(i+1));
                        posicionArray = lectura.nextInt();
                        numeros[i]=posicionArray;
                    }
                    break;
                case 2:
                    System.out.println("Indica que posicion quieres sacar");
                    posicionArray = lectura.nextInt();
                    System.out.printf("El numero en la posicion %d es %d%n",posicionArray,numeros[posicionArray] );
                    break;
                case 3:
                    System.out.println("Mostrar array");
                    for (int item: numeros) {
                        System.out.println(item);
                    }
                    break;
                case 4:
                    System.out.println("Ordenar array");

                    //Arrays.sort(numeros);
                    for (int i = 0; i < numeros.length-1; i++) {
                        for (int j = 0; j < numeros.length-1-i; j++) {
                            if (numeros[j]>numeros[j+1]){
                                int aux = numeros[j+1];
                                numeros[j+1] = numeros[j];
                                numeros[j] = aux;
                            }
                        }
                    }

                    break;
                case 5:

                    int primero = numeros[0];
                    for (int i = 0; i < numeros.length-1; i++) {
                        numeros[i] = numeros[i+1];
                    }
                    numeros[numeros.length-1] = primero;
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 6);



    }
}
