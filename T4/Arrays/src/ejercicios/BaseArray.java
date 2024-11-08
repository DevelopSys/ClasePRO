package ejercicios;

import java.util.Scanner;

public class BaseArray {
    public static void main(String[] args) {
        ejercicio6();
    }

    public static void ejercicio1() {
        /*Realiza un programa que pida 10 números por teclado
        y que los almacene en un array.
        A continuación se mostrará el contenido de ese array
        junto al índice (0 – 9)*/
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el numero");
            numeros[i] = scanner.nextInt();
        }

        // FOR O FOREACH???
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("El numero en la posicion %d es %d\n", i + 1, numeros[i]);
        }

    }

    public static void ejercicio2() {

        int[] numeros = new int[30];
        int sumatorioPuntos = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
            sumatorioPuntos += numeros[i];
        }

        double media = (double) sumatorioPuntos / numeros.length;
        System.out.println("Los puntos son " + sumatorioPuntos);
        System.out.println("La media de los puntos son " + media);


    }

    public static void ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Los numeros en orden normal son");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        /*for ( int item: numeros ) {
            System.out.println(item);
        }*/
        System.out.println("Los numeros en orden inverso son");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

    public static void ejercicio4() {
        int[] numero = new int[20]; // 20 ceros
        int[] cubo = new int[numero.length]; // 20 ceros
        int[] cuadrado = new int[numero.length]; // 20 ceros

        // rellenar aleatorios
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 101);
            System.out.println("El numero es " + numero[i]);
            // rellena cuadrados
            // cuadrado[i] = (int) Math.pow(numero[i], 2);
            // rellena cubos
            // cubo[i] = (int) Math.pow(numero[i], 3);
        }
        // rellenar cuadrados
        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);
        }

        // rellenar cuadrados
        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3);
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Numero\t\t\t\t\tCuadrado\t\t\t\t\tCubo");
            System.out.printf("%d\t\t\t\t\t%d\t\t\t\t\t%d\n", numero[i], cuadrado[i], cubo[i]);
        }


    }

    public static void ejercicio5() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Introduce 8 enteros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] % 2 == 0) {
                System.out.println("- Par");
            } else {
                System.out.println("- Impar");
            }
        }
    }

    public static void ejercicio6() {
        int[] numeros = new int[20];
        int modificaciones = 0;
        for (int i = 0; i < numeros.length; i++) {
            int random = (int) (Math.random() * 31);
            numeros[i] = random;
        }

        for (int item : numeros) {
            System.out.print(item + " ");
        }
        System.out.println();
        // modificaciones
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 6) {
                numeros[i] = 8;
                modificaciones++;
            } else if (numeros[i] == 7) {
                numeros[i] = 15;
                modificaciones++;
            } else if (numeros[i] == 20) {
                numeros[i] = 10;
                modificaciones++;
            }
        }
        for (int item : numeros) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("El numero de modificaciones " + modificaciones);

    }

    public static void ejercicio7() {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[10]; // 10 nulls
        int opcion = 0;
        int numeroLetras = 0;
        int mediaLetas = 0;
        int palabraMayorLong = 0;
        int palabraMenorLong = 100;
        String palabraMayor = "";
        String palabraMenor = "";
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce palabra");
            palabras[i] = scanner.next();
            if (palabras[i].length() > palabraMayor.length()) {
                palabraMayor = palabras[i];
            }
            if (palabras[i].length() < palabraMenorLong) {
                palabraMenor = palabras[i];
                palabraMenorLong = palabraMenor.length();
            }
            numeroLetras += palabras[i].length();
        }

        double media = (double) numeroLetras / palabras.length;
        do {
            System.out.println("1 ver palabras");
            System.out.println("2 Mostrar al azar");
            System.out.println("3 Letras totales");
            System.out.println("4 MEdia letras");
            System.out.println("5 Palabra mas grande");
            System.out.println("6 Palabra mas pequeña");
            System.out.println("7 Salir");
            System.out.println("Introduce la opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    for ( String palabra : palabras ) {
                        System.out.println("La palabra guardada es "+palabra);
                    }
                    break;
                case 2:
                    // aleatoria ->
                    String aleatoria = palabras[(int) (Math.random()*palabras.length)];
                    System.out.println(palabras[(int) (Math.random()*palabras.length)]);
                    break;
                case 3:
                    System.out.println("Las letras totales es "+numeroLetras);
                    break;
                case 4:
                    System.out.println("La media de palabras es "+media);
                    break;
                case 5:
                    System.out.println("La palabra mas grade es: "+palabraMayor);
                    break;
                case 6:
                    System.out.println("La palabra mas corta es: "+palabraMenor);
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("No contemplada");
            }
        } while (opcion != 7);

    }
}
