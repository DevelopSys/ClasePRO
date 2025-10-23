import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OperacionesArrays {
    int[] temperaturas;

    public void iniciarArray() {
        // int[] numeros = new int[4];
        // int[] numeros = new int[]{5,9,10,20};
        int[] numeros = {5, 9, 10, 20};
        numeros[0] = 1;
        // {1,9,10,20}
        numeros[3] = 15;
        // {1,9,10,15}
        System.out.println("La longitud del array es " + numeros.length);
        System.out.println("El primer elemento " + numeros[0]);
        System.out.println("El ultimo elemento " + numeros[numeros.length - 1]);
        System.out.println("Procedemos a listar los elementos");
        // 0 1 2 3 X


        // sirve parar recorrer (buscar, evalua)
        for (int item : numeros) {
            if (item == 100) {
                item = 100;
            }
            System.out.println("El elemento recorrido es " + item);
        }

        // sirve para recorrer y modificar (buscar, evaluar)
        System.out.println("Comprobacion con for");
        for (int i = 0; i < numeros.length; i++) {
            /*if(i==2){
                numeros[i] = 100;
            }*/
            System.out.println("El elemento de la posicion " + i + " es " + numeros[i]);
        }
        // {1,9,100,15}

    }

    public void realizarBusqueda() {
        int[] numeros = {1, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // 70 buscar si en un array el numero 70 está presente
        // en caso de no estar se mostrara un mensaje
        // indicando que no esta
        // en caso de si estar se mostrará un mensaje
        // indicando que si esta
        /*
        boolean esta=false;
        for (int item : numeros) {
            if (item==170){
                System.out.println("Encontrado");
                esta = true;
                break;
            }
        }

        if (!esta){
            System.out.println("No esta el elemento");
        }
        // saber si no ha estado para imprimir el mensaje

         */
        if (estaElemento(1000, numeros)) {
            System.out.println("El numero esta");
        } else {
            System.out.println("El numero no esta");
        }
    }

    public void arrayRuben() {
        int[] numeros = {10, 20, 30, 40};
        for (int item : numeros) {
            if (item == 20) {
                numeros[item] = 3;
            }
        }
        // {1,30,3,4}
        // 1 2 30 4

        System.out.println("Comprobacion del array");

        for (int item : numeros) {
            System.out.println(item);
        }
    }

    public boolean estaElemento(int numeroBuscar, int[] arrayBuscar) {

        // 9
        // 1,2,3,4,5,6

        for (int item : arrayBuscar) {
            if (item == numeroBuscar) {
                return true;
            }
        }
        return false;
    }

    public void ejercicioTemperaturas() {
        Scanner scanner = new Scanner(System.in);
        // pedir al usuario cuantas temperaturas va a introducir. 10
        System.out.println("Cuantas temperaturas vas a introducir");
        int numeroTemperaturas = scanner.nextInt();
        temperaturas = new int[numeroTemperaturas];
        // Pido las 10 temperaturas y las guardo
        for (int i = 0; i < numeroTemperaturas; i++) {
            System.out.println("Introduce temperatura");
            int temperatura;
            do {
                temperatura = scanner.nextInt();
                if (temperatura < 0) {
                    System.out.println("Temperatura incorrecta, vuelve a introducir");
                }
            } while (temperatura < 0);

            temperaturas[i] = temperatura;
        }

        // Arrays.sort(temperaturas);

        int max = temperaturas[0], min = temperaturas[0];
        for (int item : temperaturas) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
        }

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
        }

    }

    // Que quieres hacer
    //  1. Sacar temperatura max
    //  2. Sacar temperatura min
    //  3. Sacar temperatura media
    //  4. Contar cuantas temperaturas-> 23 -> 5veces 23
    //  5- Listar todas las temperaturas

    // NO SE PUEDEN METER TEMPERATURAS NEGATIVAS.
    //  En caso de introducir una temperatura negativa volvera
    //  a pedirla
    public void ejercicioRotacion() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        do {
            System.out.println("Indica en que sentido quieres rotar");
            System.out.println("1-Rotacion izquierda");
            System.out.println("2-Rotacion derecha");
            System.out.println("3-Mostrar resultado");
            System.out.println("4-Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    int aux = numeros[0];
                    for (int i = 0; i < numeros.length-1; i++) {
                        numeros[i] = numeros[i+1];
                    }
                    numeros[numeros.length-1]=aux;
                }
                case 2 -> {
                    int aux = numeros[numeros.length - 1];
                    for (int i = numeros.length - 1; i > 0; i--) {
                        // i=4
                        numeros[i]=numeros[i-1];
                    }
                    numeros[0] = aux;
                }
                case 3 -> {
                    for (int item : numeros) {
                        System.out.print(item + " ");
                    }
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("Saliendo....");
                }
            }
        } while (opcion != 4);


    }

}
