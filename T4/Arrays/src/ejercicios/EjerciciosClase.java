package ejercicios;


import javax.management.ValueExp;
import java.rmi.MarshalException;
import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosClase {

    public static void main(String[] args) {
        // ejercicio1();
        ejercicio2();
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
        System.out.println("La suma de todos es "+sumatorio);
        System.out.println("La media es "+((double)sumatorio/ numeros.length));
    }
    public static void ejercicio2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que longitud quieres guardar");
        int longitudArray= scanner.nextInt();
        int[] numeros = new int[longitudArray];
        for (int i = 0; i < longitudArray; i++) {
            System.out.println("Introduce numero");
            numeros[i] = scanner.nextInt();
        }
        int mayor=numeros[0];
        int menor=numeros[0];

        for ( int item: numeros ) {
            if (item<menor){
                menor = item;
            }
            if (item>mayor){
                mayor=item;
            }
        }
        System.out.println("El numero mas grande es "+mayor);
        System.out.println("El numero mas pequeño es "+menor);
        /*Arrays.sort(numeros);
        System.out.println("El numero mas pequeño es "+numeros[0]);
        System.out.println("El numero mas grande es "+numeros[numeros.length-1]);*/

    }
}
