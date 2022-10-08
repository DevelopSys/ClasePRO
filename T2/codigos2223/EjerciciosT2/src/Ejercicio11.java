import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroUno, numeroDos, numeroTres;
        System.out.println("Introduce primer numero");
        numeroUno = lecturaTeclado.nextInt();
        System.out.println("Introduce segundo numero");
        numeroDos = lecturaTeclado.nextInt();
        System.out.println("Introduce tercer numero");
        numeroTres = lecturaTeclado.nextInt();

        boolean comprobacionSuma = (numeroUno+numeroDos) == numeroTres;
        System.out.println("La suma de los dos primeros, es el tercero?: "+comprobacionSuma);

    }
}
