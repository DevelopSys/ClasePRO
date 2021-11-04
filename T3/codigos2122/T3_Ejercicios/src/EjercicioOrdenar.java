import java.util.Scanner;

public class EjercicioOrdenar {

    public static void main(String[] args) {
        int numeroUno, numeroDos, numeroTres, orden;

        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce n1");
        numeroUno = lecturaTeclado.nextInt();

        System.out.println("Introduce n2");
        numeroDos = lecturaTeclado.nextInt();

        System.out.println("Introduce n3");
        numeroTres = lecturaTeclado.nextInt();

        System.out.println("Orden (0/1)");
        orden = lecturaTeclado.nextInt();

        if (orden!= 0 || orden != 1){
            // error
        } else {
            // calculos
        }


    }
}
