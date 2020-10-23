import java.util.Scanner;

public class Entrada {

    Scanner teclado;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa de estructuras de control");
        // new Entrada().estructuraIF();
        // new Entrada().estructraELSEIF();
        // new Entrada().estructuraIFELSEIF();
        /*System.out.println("Introduce número a evaluar");
        int numero = teclado.nextInt();
        //new Entrada().esParUnNumero(numero); // true o false
        if (new Entrada().esParUnNumero(numero)){
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }*/
        /*
        Realizar un menú con la siguiente estructura

        1. Comprobar si es par
        2. Comprobar si es impar
        3. Comprobar si es positivo
        4. Comprobar si es negativo
        5. Realizar operaciones
        0. Salir
        Introduce la opción:
        1


        1- Pide un int por teclado y muestra si es par
        2- Pide un int por teclado y muestra si es impar
        3- Pide un int por teclado y muestra si es pos
        4- Pide un int por teclado y muestra si es neg
        5- Pide dos int por teclado y muestra sus operaciones (+,- ,*, /) llamadas por métodos con
        argumentos y retornos


         */
        new Entrada().estructuraSwitch();

    }

    public void estructuraIF(){
        /*
        linea 1
        linea 2
        if (condicion) {
            // ejecuciones
            linea 3
            linea 4
        }
        linea 5
         */
        int numero = 6;
        System.out.println("Ejecución por sentencia IF");
        if(numero>=0 && numero<=10){
            System.out.println("El número está entre 0 y 10");
        }
        if(numero<15){
            System.out.println("El numero es menor que 15");
        }
        System.out.println("Saliedo del IF");
    }
    public void estructraELSEIF(){
        /* linea 1
        * if (condicion){
        *   linea 2
        * } else {
        *   linea 3
        * }
        * linea 4
        * */
        int numero = -7;
        System.out.println("Ejecución por sentencia ELSE-IF");
        if (numero>=0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        System.out.println("Saliendo de la estructura ELSE-IF");
    }
    public void estructuraIFELSEIF(){
        /*
           linea 1
        * if(condicion){
        *   linea 2
        * } else if(condicion){
        *   linea 3
        * } else if(condicion){
        *   linea 4
        * } else{
        *   linea 5
        * }
        *   linea 6
        * */

        int nota = 6;

        /*if (nota<5 && nota>0){
            System.out.println("Suspenso");
        } else if (nota>=5 && nota<6){
            System.out.println("Aprobado");
        } else if (nota>=6 && nota<9){
            System.out.println("Notable");
        } else if (nota>=9 && nota<10){
            System.out.println("Sobresaliente");
        } else if (nota ==10) {
            System.out.println("MH");
        } else {
            System.out.println("Numero incorrecto");
        }*/
        // -1 11
        if (nota<0 || nota >10){
            System.out.println("Incorrecto");
        } else { // 0-10
            if (nota<5){
                System.out.println("SS");
            } else if (nota>=5 && nota<6){

            } else if (nota>=6 && nota<9){

            } else if (nota>=9 && nota<10){

            } else {
                // 10
            }
        }

        System.out.println("Saliendo de estrucutra IFELSEIF");

    }
    public boolean esParUnNumero(int numeroComprobar){
        return numeroComprobar%2 == 0;
    }
    public void estructuraSwitch(){
        /*
        int valor = 1
        switch(valor) --> int, char, string{
            case 1:
                ejecuciones
            case 10:
                ejecuciones
            break;
            case 100:
                ejecuciones
            break;
            case 1000:
                ejecuciones
            break;
            default:
                ejecuciones
            break;
        }
        linea 7
         */
        teclado = new Scanner(System.in);
        System.out.println("Ejecución por sentencia SWITCH");
        int numero;
        System.out.println("Introduce un número");
        numero = teclado.nextInt();
        switch (numero){
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                int n1 = teclado.nextInt();
                new Entrada().metodo(n1,2);
                break;
            default:
                System.out.println("numero incorrecto");
                break;
        }
    }

    public int metodo(int n1, int n2){
        return 4;
    }
}
