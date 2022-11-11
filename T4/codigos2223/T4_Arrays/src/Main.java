import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creacionArrays();
        //ejercicio1Arrays();
        //ejercicio2Arrays();
        //ejercicio3Array();
        //busquedaArray();
        //ejercicio4Arrays();
        //ejercicioCincoArrays();
        //ejercicioCincosArrays();
        //ejercicioSeisArrays();
        //ejercicioSieteArrays();
        //ejercicioMover();
        //ejercicioOrdenar();
        //ejercicioSumaArrays();
        ejercicioOperacionesArray();
    }

    private static void ejercicioOperacionesArray() {
        int[]numeros = new int[10];
        numeros = rellenarArray(numeros);
        imprimirArrayComa(numeros);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2 ==0){
                //numeros[i] +=1;
                numeros[i] = numeros[i]+1;
            } else {
                numeros[i] = numeros[i]-1;
            }
        }
        imprimirArrayComa(numeros);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>=0 && numeros[i]<5){
                //numeros[i] +=1;
                numeros[i] = numeros[i]*2;
            }
        }
        imprimirArrayComa(numeros);
        for (int i = 0; i < numeros.length; i++) {
                int aleatorio = (int) (Math.random()*11)-5;
                numeros[i] = numeros[i]+aleatorio;
        }
        imprimirArrayComa(numeros);
    }

    private static void imprimirArrayComa(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i< array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void ejercicioSumaArrays() {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce la longitud de los array");
        int longitud = lecturaTeclado.nextInt();

        int[] arrayUno = new int[longitud];
        int[] arrayDos = new int[longitud];
        int[] arrayResultado = new int[longitud];

        /*for (int i = 0; i < longitud; i++) {
            int aleatorio = (int) (Math.random() * 10)+1;
            arrayUno[i] = aleatorio;
            aleatorio = (int) (Math.random() * 10)+1;
            arrayDos[i] = aleatorio;
        }*/

        arrayUno = rellenarArray(arrayUno);
        arrayDos = rellenarArray(arrayDos);

        for (int i = 0; i < longitud; i++) {
            arrayResultado[i] = arrayUno[i]+arrayDos[i];
        }

        System.out.println("Array1");
        imprimirArrayEj(arrayUno);
        System.out.println("Array2");
        imprimirArrayEj(arrayDos);
        System.out.println("ArrayR");
        imprimirArrayEj(arrayResultado);
    }

    private static void imprimirArrayEj(int[] array){
        for (int item: array) {
            System.out.print(item+" ");
        }
        System.out.println();
    }

    private static int[] rellenarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10)+1;;
        }

        return array;
    }

    private static void ejercicioOrdenar() {
        int[] numeros = {3,6,1,9,2,4,0,11,10};

        Arrays.sort(numeros);
        /*int[]nuevo = Arrays.copyOf(numeros,15);
        // {3,6,1,9,2,4,0,11,10,0,100,0,0,0,0}
        nuevo[10] = 100;
        System.out.println(Arrays.compare(numeros,nuevo));*/

        for (int i = 0; i < numeros.length-1; i++) {
         // i=0 i=1 i=2
            for (int j = 0; j < numeros.length-1-i; j++) {
                // comparaciones
                if (numeros[j]>numeros[j+1]){
                    int temporal = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = temporal;
                }
            }
        }
        
        

        for (int item: numeros) {
            System.out.print(item+" ");
        }
    }

    private static void ejercicioMover() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int primero = numeros[0];

        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }

        primero = numeros[0];

        //numeros = {1,2,3,4,5,6,7,8,9,10};

        int ultimo = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i >= 1; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = ultimo;

        for (int element : numeros) {
            System.out.print(element + " ");
        }

    }

    private static void ejercicioSieteArrays() {
        // modificaciones array

        int modificaciones = 0;

        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++) {
            numeros[i] = (int) (Math.random() * 31);
        }

        imprimirArray(numeros);

        // moficacicion
        System.out.println("Modificacion 6 --> 8");
        numeros = modificarArray(numeros, 6, 8);
        imprimirArray(numeros);

        // modificacion
        System.out.println("Modificacion 7 --> 15");
        numeros = modificarArray(numeros, 7, 15);
        imprimirArray(numeros);
        // moficacion
        System.out.println("Modificacion 20 --> 10");
        numeros = modificarArray(numeros, 20, 10);
        imprimirArray(numeros);
        System.out.println("El número de modificaciones es: " + modificaciones);

    }


    private static int[] modificarArray(int[] numeros, int numero, int modificar) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                numeros[i] = modificar;
            }
        }

        return numeros;
    }

    private static void imprimirArray(int[] numeros) {
        // algoritmo de impresion de array
        for (int item : numeros) {
            System.out.println(item);
        }
    }

    private static void ejercicioSeisArrays() {
        // cuadrado cubo

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = (int) Math.pow(numero[i], 2);
            cubo[i] = (int) Math.pow(numero[i], 3);
        }


        System.out.println("Numero\t\tCuadrado\t\tCubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%d\t\t\t%d\t\t\t\t%d%n", numero[i], cuadrado[i], cubo[i]);
        }


    }

    public static void creacionArrays() {
        int[] numeros = new int[10];
        int[] numeosInciados = {1, 2, 3, 4, 5, 6};
        boolean[] booleanos = new boolean[5];
        boolean[] booleanosIniciados = {true, false, true};
        String[] palabra = new String[5];
        String[] palabrainicializada = {"as", "ne"};

    }

    public static void accesoArray() {
        String[] numeros = new String[10];

        for (String element : numeros) {
        }
    }

    public static void ejercicio1Arrays() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;
        int masGrande = numeros[0];
        int masPequeño = numeros[0];

        for (int element : numeros) {
            suma += element;
            if (element > masGrande) {
                masGrande = element;
            }
            if (element < masPequeño) {
                masPequeño = element;
            }
        }
        System.out.printf("El sumatorio es :%d%n", suma);
        System.out.printf("La media es :%d%n", suma / numeros.length);
        System.out.printf("El mayor es :%d%n", masGrande);
        System.out.printf("El menor es :%d%n", masPequeño);
    }

    public static void ejercicio2Arrays() {
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'ñ', 'l', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int a = 0; a < 5; a++) {


            for (int i = 0; i < 5; i++) {
                int posicion = (int) (Math.random() * 26);
                System.out.printf("%c", letras[posicion]);
            }
            System.out.printf(" %n");
        }
    }

    public static void modificarArray() {
        int[] numeros = new int[10];
        numeros[0] = 10;
        // CUANTOS N QUIERO INTRODUCIR, EL N DE N PEDIDOS,SACAR TODOS LOS NUMEROS INTRODUCIDOS
    }

    public static void ejercicio3Array() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros desea introducir?");
        int cuantos[] = new int[teclado.nextInt()];
        int vueltas = 0;
        for (int element : cuantos) {
            vueltas = vueltas + 1;
            System.out.printf("introduce el numero %d%n", vueltas);
            cuantos[vueltas - 1] = teclado.nextInt();
        }
        for (int element : cuantos) {
            System.out.println(element);
        }
    }

    public static void busquedaArray() {
        String[] palabras = {"hola", "adios", "luego", "no", "puede", "mañana", "perro", "mono", "sus"};
        int contador = 0;
        for (String item : palabras) {
            if (item.length() == 2) {
                contador++;
                System.out.println("la palabra co dos letras se encuentra en la posicion " + contador);
                break;
            }
            contador++;
        }
    }


    public static void ejercicio4Arrays() {
        Scanner teclado = new Scanner(System.in);

        int cuantos[] = new int[5];
        int aciertos = 0;

        for (int i = 0; i < 5; i++) {
            do {
                System.out.printf("introduce el numero %d%n", i + 1);
                cuantos[i] = teclado.nextInt();
            } while (cuantos[i] < 0 || cuantos[i] > 99);
        }

        int numerosAzar[] = new int[5];
        for (int i = 0; i < 5; i++) {
            numerosAzar[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 5; i++) {
            if (cuantos[i] == numerosAzar[i]) {
                aciertos += 1;
            }
        }
        switch (aciertos) {
            case 0:
                System.out.println("no has ganado nada");
                break;
            case 1:
                System.out.println("has ganado 10$");
                break;
            case 2:
                System.out.println("has ganado 100$");
                break;
            case 3:
                System.out.println("has ganado 1000$");
                break;
            case 4:
                System.out.println("has ganado 10000$");
                break;
            case 5:
                System.out.println("has ganado 100000$");
                break;
        }
    }

    private static void ejercicioCincoArrays() {
        String[] bombo1 = {"Napoles", "Oporto", "B.Munich", "Tottenham", "Chelsea", "R.Madrid", "M. City", "Benfica"};
        String[] bombo2 = {"Liverpool", "Brujas", "Inter", "Entracht F.", "AC. Milan", "RB. Leipzig", "B. Dortmund", "PSG"};

        boolean[] bombo1com = new boolean[8];
        boolean[] bombo2com = new boolean[8];

        for (int i = 0; i < 8; i++) {

            int azar = (int) (Math.random() * 9);
            int azar2 = (int) (Math.random() * 9);
            if (!bombo1com[azar] && !bombo2com[azar2])
                bombo1com[azar] = true;
            bombo2com[azar2] = true;
            System.out.println(bombo1[azar] + "vs" + bombo2[azar2]);
        }

    }

    private static void ejercicioCincosArrays() {
        String[] bombo1 = {"Napoles", "Oporto", "B.Munich", "Tottenham", "Chelsea", "R.Madrid", "M. City", "Benfica"};
        String[] bombo2 = {"Liverpool", "Brujas", "Inter", "Entracht F.", "AC. Milan", "RB. Leipzig", "B. Dortmund", "PSG"};

        boolean[] bombo1com = {false, false, false, false, false, false, false, false};
        boolean[] bombo2com = {false, false, false, false, false, false, false, false};

        int azar = 0;
        int azar2 = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println(i);
            do {
                azar = (int) (Math.random() * 8);
                azar2 = (int) (Math.random() * 8);
                if (!bombo1com[azar] && !bombo2com[azar2]) {
                    bombo1com[azar] = true;
                    bombo2com[azar2] = true;
                    System.out.println("partido" + (i + 1) + " " + bombo1[azar] + " vs " + bombo2[azar2]);
                }
            } while (!bombo1com[azar] || !bombo2com[azar2]);
        }

        for (boolean item : bombo1com) {
            System.out.println(item);
        }

    }
}
