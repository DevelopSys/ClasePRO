import java.util.Scanner;

public class ComprobacionSuma {


    /*
     * Permítase introducir tres números reales de dos decimales.
     * Compruébese (mostrándose verdadero o falso)
     * si la suma de los dos primeros valores es igual al tercero.


     * */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean esSuma;
        double numeroUno, numeroDos, numeroTres;
        System.out.println("Introduce primer valor");
        numeroUno = teclado.nextDouble();
        System.out.println("Introduce segundo valor");
        numeroDos = teclado.nextDouble();
        System.out.println("Introduce tercer valor");
        numeroTres = teclado.nextDouble();
        esSuma = (numeroUno+numeroDos) == numeroTres;
        System.out.printf("La suma de %.2f y %.2f es igual a %.2f: %b%n",numeroUno,numeroDos,numeroTres,esSuma );

    }
}
