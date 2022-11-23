import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        // relleno
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*21);
        }

        // max min
        int min=20, max=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>max){
                max = numeros[i];
            }
            if (numeros[i]<min){
                min = numeros[i];
            }
        }

        // par impar
        int numeroPares=0, numeroImpares=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0){
                numeroPares++;
            }else {
                numeroImpares++;
            }
        }

        System.out.println("Introduce el nunero que quieres buscar");
        Scanner lectura = new Scanner(System.in);
        int numeroBuscar = lectura.nextInt();
        int contadorRepeticion=0;
        for ( int item : numeros ) {
            if ( numeroBuscar == item){
             contadorRepeticion++;
            }
        }

    }

}
