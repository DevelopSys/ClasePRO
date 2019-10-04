import java.util.Scanner;

public class EstructuraIF {

    // Ámbito de clase
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        double nota;
        System.out.println("Por favor introduce la nota que quiere evaluar");
        nota = teclado.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("error");
        } else {
            if (nota < 5) {
                System.out.println("ss");
            } else if (nota >= 5 && nota < 7) {
                System.out.println("ap");
            } else if (nota >= 7 && nota < 9) {
                System.out.println("nt");
            } else if (nota >= 9 && nota < 10) {
                System.out.println("sb");
            } else {
                System.out.println("mh");
            }
        }

        /*if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Aprobado");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("Sobresaliente");
        } else if (nota == 10) {
            System.out.println("Matricula");
        } else {
            System.out.println("Nota no valida");
        }*/

        //System.out.printf("%s y su valor es %d",saludo,numero);


    }
}
    
