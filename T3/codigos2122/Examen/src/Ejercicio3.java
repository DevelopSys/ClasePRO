import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroAleatorios, suma=0;
        double media;
        System.out.println("Cuantos aleatorios quieres generar");
        numeroAleatorios = lecturaTeclado.nextInt();

        for (int i = 0; i < numeroAleatorios; i++) {
            int aleatorio = (int)(Math.random() *101);
            suma += aleatorio;
        }

        media = (double) suma / (double) numeroAleatorios;

        System.out.printf("La suma es %d %n",suma);
        System.out.printf("La media es %.2f %n",media);


    }
}
