
import java.util.Scanner;
import java.util.Arrays;

public class EjercicioUno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // declaro el array
        int[] numeros = new int[10];
        // {1,2,3,4,5,6,7,8,9,10}
        //  0,1,2,3,4,5,6,7,8,9
        //  0-----------------(10-1)
        // i=0----------------i<longitud
        int opcion = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 21);
            System.out.println(numeros[i]);
        }

        do {
            System.out.println("Opciones");
            System.out.println("1. Extremos");
            System.out.println("2. Par/Imar");
            System.out.println("3. Repeticiones");
            System.out.println("4. Salir");
            System.out.println("Introduce opcion");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Calculando extremos");
                    int max = 0, min = 21;
                    Arrays.sort(numeros);
                    min = numeros[0];
                    max = numeros[numeros.length - 1];
                    /*for (int i = 0; i < numeros.length; i++) {

                        if (numeros[i] < min){
                            min = numeros[i];
                        }

                        if (numeros[i] > max){
                            max = numeros[i];
                        }
                    }*/

                    System.out.printf("El máximo es %d%n", max);
                    System.out.printf("El minimo es %d%n", min);


                    break;
                case 2:
                    int numeroPares = 0, numeroImpares = 0;
                    //numeros[i]%2 == 0
                    for (int i = 0; i < numeros.length; i++) {
                        if (numeros[i] % 2 == 0) {
                            numeroPares++;
                        } else {
                            numeroImpares++;
                        }
                    }

                    System.out.println("El numero de pares es: " + numeroPares);
                    System.out.println("El numero de impares es: " + numeroImpares);

                    break;
                case 3:

                    int introducido = teclado.nextInt();
                    int veces =0;
                    for (int i = 0; i < numeros.length; i++) {
                        if (numeros[i] == introducido){
                            veces++;
                        }
                    }

                    System.out.printf("El número %d está %d veces %n",introducido,veces);

                    break;

                default:
                    if (opcion != 4) {
                        System.out.println("Opcion no contemplada");
                        opcion = 4;
                    }
                    break;

            }

        } while (opcion != 4);

    }
}
