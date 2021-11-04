import java.util.Scanner;

public class EjercicioConsecutivos {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroUno, numeroDos, numeroTres;

        System.out.println("Introduce n1");
        numeroUno = lecturaTeclado.nextInt();

        System.out.println("Introduce n2");
        numeroDos = lecturaTeclado.nextInt();

        System.out.println("Introduce n3");
        numeroTres = lecturaTeclado.nextInt();

        int evaluacion =0;

        if (numeroUno+1 == numeroDos && numeroDos+1 == numeroTres){
            System.out.println("Los numeros son consecutivos");
        } else {
            System.out.println("No son consecutivos");
        }

    }
}
