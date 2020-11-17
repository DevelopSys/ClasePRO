import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        new Entrada().ejercicio8();
        // crear un programa que simule el funcionamiento del euromillon. PAra ello se
        // generarán 5 aleatorios y se guardan en una variable.
        // el sistema pedirá que introduzca los numeros con los que juego
        // PREMIOS; 1 acertado (10) 2 acertados (100) 3 acertados(1000)
        // 4 acertados (10000) 5 acertados (100000)

    }

    public void ejercicio1() {

        //(LlenarArrays) Crear un array de int que tenga 5 posiciones
        // y rellenarla con números aleatorios del 10 al 50. Mostrar
        // por pantalla todos los números generados.

        Scanner teclado = new Scanner(System.in);
        int numerosTotal = teclado.nextInt();
        int[] numeros = new int[numerosTotal];
        for (int i = 0; i < numerosTotal; i++) {
            numeros[i] = (int) (Math.random() * 41) + 10;
            System.out.println(numeros[i]);

        }
    }

    public void ejercicio2() {

        //String[] temario = new String[10];
        String[] temario = {"Tema 1: Introducción"
                , "Tema 2: Identificadores", "Tema 3: Estructuras"
                , "Tema 4: Colecciones", "Tema 5: Orientación a objetos"
                , "Tema 6: Clases y Objetos", "Tema 7; Abstracción"
                , "Tema 8: Herencia y Polimorfismo"
                , "Tema 9: Ficheros y Excepciones"
                , "Tema 10: Bases de datos", "Tema 11: Interfaces"};

        System.out.println("Numero de temas: " + temario.length);
        for (int i = 0; i < temario.length; i++) {
            System.out.println(temario[i]);
        }

    }

    public void ejercicio3() {
        /*
        * (MultiplicarArray) Crear un array de 5 posiciones:

se le pedirá al usuario que introduzca cada unos de los elementos del array
Multiplica cada elemento del array * 2 y vuelve a guardar su valor
Saca por consola la suma de todos los números
Saca la media de todos los elementos
        * */
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        // rellenar
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros[i] = numeroIntro;
        }

        // modificar
        for (int i = 0; i < numeros.length; i++) {
            int multiplicacion = numeros[i] * 2;
            numeros[i] *= 2;
        }

        // mostrarlos
        int sumatorio = 0;
        for (int item : numeros) {
            System.out.println(item);
            sumatorio += item;
        }


        System.out.println(sumatorio);
        System.out.printf("La media de los números generados es: %.2f%n"
                , ((double) sumatorio / (double) numeros.length));


    }

    public void ejercicio4() {
        Scanner teclado = new Scanner(System.in);
        int longitud, maximo = -99999, minimo = 99999;
        int[] numeros;
        System.out.println("Introduce la longitud");
        longitud = teclado.nextInt();
        numeros = new int[longitud];
        // rellenar
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros[i] = numeroIntro;

            /*if (numeros[i]>maximo) {
                maximo = numeros[i];
            }
            if(numeros[i]<minimo){
                minimo = numeros[i];
            }*/
        }
        // 1,23,3123,13,124,234,53,56,4567,58,678,97987564,354,213;
        // comprobar
        for (int item : numeros) {
            if (item > maximo) {
                maximo = item;
            }
            if (item < minimo) {
                minimo = item;
            }
        }
        System.out.println("El máximo es :" + maximo);
        System.out.println("El mínimo es :" + minimo);
    }

    public void ejercicio5() {
        /*
        *pida la longitud de dos arrays de enteros
crea los array de enteros con las longitudes introducidas
crea un tercer array de la misma longitud que los dos anteriores
rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)
        * */

        // 6
        // 1,2,5,8,9,0 --> Array1
        // 4,6,9,9,2,1 --> Array2
        // 5,8,14,17,11,1 --> Array3
        Scanner teclado = new Scanner(System.in);
        int longitud;
        int[] numeros1, numeros2;
        System.out.println("Introduce la longitud");
        longitud = teclado.nextInt();
        numeros1 = new int[longitud];
        numeros2 = new int[longitud];
        // rellenar
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros1[i] = numeroIntro;
        }
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros2[i] = numeroIntro;
        }

        int[] arraySuma = new int[longitud];
        // relleno el array de suma
        for (int i = 0; i < longitud; i++) {
            arraySuma[i] = numeros1[i] + numeros2[i];
        }
        for (int item : arraySuma) {
            System.out.println(item);
        }

    }

    public void ejercicio6() {

        int[] numeros = {1, 2, 3, 4, 5};
        // {5,1,2,3,4}
        // aux = 5
        // {5,1,2,3,4}

        int aux = numeros[numeros.length - 1];
        // aux = 5

        // desde 4 hasta 1

        // i = 4
        // numeros[4] = numeros[3]
        // i = 3
        // numeros[3] = numeros[2]
        // i = 2
        // numeros[2] = numeros[1]
        // i = 1
        // numeros[1] = numeros[0]
        // i = 0
        // numeros[0] = numeros[4]

        for (int i = numeros.length - 1; i >= 0; i--) {
            if (i == 0) {
                //numeros[i]=numeros[numeros.length - 1];
                numeros[i] = aux;
            } else {
                numeros[i] = numeros[i - 1];
            }
        }
        //numeros[0] = aux;

        for (int item : numeros) {
            System.out.print(item);
        }

        System.out.println("Nueva rotación");
        int aux1 = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                //numeros[i]=numeros[numeros.length - 1];
                numeros[i] = aux1;
            } else {
                numeros[i] = numeros[i + 1];
            }
        }


        for (int item : numeros) {
            System.out.print(item);
        }

    }

    public void ejercicio7() {

        Scanner teclado = new Scanner(System.in);
        int longitud;
        int[] numeros;
        System.out.println("Introduce longitud del array");
        longitud = teclado.nextInt();
        numeros = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = (int) (Math.random() * 10);
            numeros[i] = aleatorio;
            //System.out.println(aleatorio);
        }

        new Entrada().imprimirArray(numeros);
        // +- 1
        System.out.println();
        System.out.println("Sumo uno a los pares y resto uno a los impares ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] = numeros[i] + 1;
            } else {
                numeros[i] = numeros[i] - 1;
            }
        }

        new Entrada().imprimirArray(numeros);

        // Duplicar valores menores que 5
        System.out.println("Duplico valores menores que 5");
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 5 && numeros[i] > 0) {
                numeros[i] = numeros[i] * 2;
            }
        }

        new Entrada().imprimirArray(numeros);
        // Sumo +- 5 a todos
        System.out.println("Sumo más menos 5");
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = (int) (Math.random() * 11) - 5;
            numeros[i] = numeros[i] + aleatorio;
        }

        new Entrada().imprimirArray(numeros);

        // Desplazo
        System.out.println("Desplazo a un lado");
        int aux1 = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                //numeros[i]=numeros[numeros.length - 1];
                numeros[i] = aux1;
            } else {
                numeros[i] = numeros[i + 1];
            }
        }

        new Entrada().imprimirArray(numeros);

        // Roto
        // {1,2,3,4,5,6,7,8,9,10} --> 10 PAR
        // {1,2,3,4,5,6,7,8,9,10,11} --> 11 PAR
        System.out.println("Roto entre parejas");
        boolean sePuede = false;

        if (longitud % 2 == 0) {
            sePuede = true;
            for (int i = 0; i < numeros.length; i++) {
                int aux = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = aux;
                i++;
                // i++
            }
        }


        if (sePuede) {
            new Entrada().imprimirArray(numeros);

        } else {
            System.out.println("No se puede");
        }

        // Inversión
        System.out.println("Invierto");
        for (int i = 0; i < numeros.length / 2; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = aux;
        }

        new Entrada().imprimirArray(numeros);
    }

    public void ejercicio8(){
        String frase = "hola que tal estas yo muy bien";
        String[] palabras = frase.split(" ");
        String palabraMax=palabras[palabras.length-1], palabraMin=palabras[palabras.length-1];
        //palabras --> {"hola","que","tal","estas","yo","muy","bien"};
        for (int i=0;i<palabras.length;i++){

            if(palabras[i].length() > palabraMax.length()){
                palabraMax = palabras[i];
            }
            if(palabras[i].length()<palabraMin.length()){
                palabraMin = palabras[i];
            }
            if (palabras[i].length()==3){
                System.out.println(palabras[i]);
            }
        }

        System.out.println("Más grande:"+palabraMax);
        System.out.println("Más pequeña:"+palabraMin);



    }

    public void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.printf("%d, ", array[i]);
            }
        }
    }
}
