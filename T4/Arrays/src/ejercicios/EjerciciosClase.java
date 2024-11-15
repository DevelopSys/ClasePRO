package ejercicios;


import javax.management.ValueExp;
import java.rmi.MarshalException;
import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosClase {

    public static void main(String[] args) {
        // ejercicio1();
        ejercicio9();
        // int alumno = (int) (Math.random()*29);

    }

    private static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int sumatorio = 0;

        // rellenar
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero");
            numeros[i] = scanner.nextInt();
        }

        // operaciones
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
            sumatorio += numeros[i];
        }

        System.out.println("Los numeros obtenidos son");
        for (int item : numeros) {
            System.out.println(item);
        }
        System.out.println("La suma de todos es " + sumatorio);
        System.out.println("La media es " + ((double) sumatorio / numeros.length));
    }

    public static void ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que longitud quieres guardar");
        int longitudArray = scanner.nextInt();
        int[] numeros = new int[longitudArray];
        for (int i = 0; i < longitudArray; i++) {
            System.out.println("Introduce numero");
            numeros[i] = scanner.nextInt();
        }
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int item : numeros) {
            if (item < menor) {
                menor = item;
            }
            if (item > mayor) {
                mayor = item;
            }
        }
        System.out.println("El numero mas grande es " + mayor);
        System.out.println("El numero mas pequeño es " + menor);
        /*Arrays.sort(numeros);
        System.out.println("El numero mas pequeño es "+numeros[0]);
        System.out.println("El numero mas grande es "+numeros[numeros.length-1]);*/

    }

    public static void ejercicio9() {
        /*
        1. (MenuArray)Crear un programa que mediante un menú permita:
    - Crear un array de números enteros con n posiciones pedidas.
    - Rellenar el array creado con números aleatorios.
    - Rellenar el array creado con números pedidos por consola.
    - Ordenar el array de mayor a menor
    - Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud (si esta es inferior a la que la existe continuar pidiendo)
    - Mover todas las posiciones (pedir al usuario que seleccione la orientación)
    - Mostrar por pantalla el array invertido
         */

        Scanner scanner = new Scanner(System.in);
        int opcion;
        int[] numeros = null;

        do {
            System.out.println("1. Crear array");
            System.out.println("2. Rellenar aleatorios");
            System.out.println("3. Rellenar consola");
            System.out.println("4. Ordenar array");
            System.out.println("5. Clonar array");
            System.out.println("6. Mover izq");
            System.out.println("7. Mover derecha");
            System.out.println("8. Mover por pares");
            System.out.println("9. Invertir");
            System.out.println("10. Imprimir");
            System.out.println("11. Salir");
            System.out.println("Dime que accion queres realizar");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Vas a generar el array");
                    System.out.println("Cuantas posiciones quieres reservar");
                    int posiciones = scanner.nextInt();
                    numeros = new int[posiciones];
                    System.out.println("Creado correctamente");
                    break;
                case 2:
                    if (numeros != null) {
                        System.out.println("Vas a rellenar con aleatorios");
                        for (int i = 0; i < numeros.length; i++) {
                            numeros[i] = (int) (Math.random() *21);
                        }
                    } else {
                        System.out.println("Imposible, inicia el array antes");
                    }

                    break;
                case 3:
                    if (numeros != null) {
                        System.out.println("Vas a rellenar con aleatorios");
                        for (int i = 0; i < numeros.length; i++) {
                            System.out.println("Introduce el numero de la posicion "+i);
                            numeros[i] = scanner.nextInt();
                        }
                    } else {
                        System.out.println("Imposible, inicia el array antes");
                    }

                    break;
                case 4:
                    Arrays.sort(numeros);
                    break;
                case 5:
                    System.out.println("Cual es la nueva longitud del array");
                    int nuevaLongitud = scanner.nextInt();
                    numeros = Arrays.copyOf(numeros,nuevaLongitud);
                    break;
                case 6:
                    if (numeros!=null){

                        System.out.println("Vas a rotar a la izq");
                        int temporal = numeros[0];
                        for (int i = 0; i < numeros.length-1; i++) {
                            numeros[i] = numeros[i+1];
                        };
                        numeros[numeros.length-1]=temporal;

                    } else {
                        System.out.println("No se puede rotar");
                    }
                    break;
                case 7:
                    if (numeros!=null){
                        int temporal = numeros[numeros.length-1];
                        for (int i = numeros.length-1; i >0 ; i--) {
                            numeros[i] = numeros[i-1];
                        }
                        numeros[0] = temporal;
                    } else {
                        System.out.println("No se puede mover, array nulo");
                    }
                    break;
                case 8:
                    if (numeros!=null){
                        for (int i = 0; i < numeros.length; i+=2) {
                            int temporal = numeros[i];
                            numeros[i] = numeros[i+1];
                            numeros[i+1] = temporal;
                        }
                    } else {
                        System.out.println("El elemento es nulo");
                    }
                    break;
                case 9:
                    if (numeros!=null){
                        for (int i = 0; i < numeros.length/2; i++) {
                            int temporal = numeros[i];
                            numeros[i] = numeros[numeros.length-1-i];
                            numeros[numeros.length-1-i] = temporal;
                        }
                    }else {
                        System.out.println("No se puede realizar");
                    }
                    break;
                case 10:
                    if (numeros!=null){
                        for ( int item : numeros ) {
                            System.out.print(item+" ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("No se ha inicializado el array");
                    }

                    break;
                case 11:
                    System.out.println("Saliendo");
                    break;
            }
        } while (opcion != 11);
    }
}
