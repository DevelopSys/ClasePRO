import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        new Entrada().ejercicio4();
        // crear un programa que simule el funcionamiento del euromillon. PAra ello se
        // generarán 5 aleatorios y se guardan en una variable.
        // el sistema pedirá que introduzca los numeros con los que juego
        // PREMIOS; 1 acertado (10) 2 acertados (100) 3 acertados(1000)
        // 4 acertados (10000) 5 acertados (100000)

    }

    public void ejercicio1(){

        //(LlenarArrays) Crear un array de int que tenga 5 posiciones
        // y rellenarla con números aleatorios del 10 al 50. Mostrar
        // por pantalla todos los números generados.

        Scanner teclado = new Scanner(System.in);
        int numerosTotal = teclado.nextInt();
        int[] numeros = new int[numerosTotal];
        for (int i=0;i<numerosTotal;i++){
            numeros[i] = (int) (Math.random()*41)+10;
            System.out.println(numeros[i]);

        }
    }
    public void ejercicio2(){

        //String[] temario = new String[10];
        String[] temario = {"Tema 1: Introducción"
                ,"Tema 2: Identificadores","Tema 3: Estructuras"
                ,"Tema 4: Colecciones","Tema 5: Orientación a objetos"
                , "Tema 6: Clases y Objetos", "Tema 7; Abstracción"
                , "Tema 8: Herencia y Polimorfismo"
                , "Tema 9: Ficheros y Excepciones"
                , "Tema 10: Bases de datos", "Tema 11: Interfaces"};

        System.out.println("Numero de temas: "+temario.length);
        for (int i=0;i<temario.length;i++){
            System.out.println(temario[i]);
        }

    }
    public void ejercicio3(){
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
        for (int i=0;i<numeros.length;i++){
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros[i] = numeroIntro;
        }

        // modificar
        for(int i=0;i<numeros.length;i++){
            int multiplicacion = numeros[i]*2;
            numeros[i] *= 2;
        }

        // mostrarlos
        int sumatorio =0;
        for (int item :numeros) {
            System.out.println(item);
            sumatorio += item;
        }


        System.out.println(sumatorio);
        System.out.printf("La media de los números generados es: %.2f%n"
                ,((double)sumatorio/(double) numeros.length));


    }
    public void ejercicio4(){
        Scanner teclado = new Scanner(System.in);
        int longitud, maximo=-99999, minimo=99999;
        int[] numeros;
        System.out.println("Introduce la longitud");
        longitud = teclado.nextInt();
        numeros = new int[longitud];
        // rellenar
        for (int i=0;i<numeros.length;i++){
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
        for (int item: numeros) {
           if (item>maximo) {
               maximo = item;
           }
           if(item<minimo){
               minimo = item;
           }
        }
        System.out.println("El máximo es :"+maximo);
        System.out.println("El mínimo es :"+minimo);
    }
    public void ejercicio5(){
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
        for (int i=0;i<numeros1.length;i++){
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros1[i] = numeroIntro;
        }
        for (int i=0;i<numeros2.length;i++){
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros2[i] = numeroIntro;
        }

        int[] arraySuma = new int[longitud];
        // relleno el array de suma
        for(int i=0;i<longitud;i++){
            arraySuma[i] = numeros1[i]+numeros2[i];
        }
        for (int item:arraySuma) {
            System.out.println(item);
        }

    }
}
