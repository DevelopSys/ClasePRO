import java.util.Scanner;

public class CorreccionExamen {


    public static void main(String[] args) {
        new CorreccionExamen().ejercicioDificil3();
    }

    public void ejercicioDificil1() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números de Fibonnacci a generar");
        int numeros = teclado.nextInt();

        int num1 = 0, num2 = 1, fibonancci = 1;
        System.out.print(num1);

        for (int i = 1; i < numeros; i++) {
            System.out.print(fibonancci);
            fibonancci = num1 + num2;
            num1 = num2;
            num2 = fibonancci;
        }

    }

    public void ejercicioDificil2() {

        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print(" introduzca un numero: ");
        numero = teclado.nextInt();

        int auxDrecha = 1, i = 0, auxEspacios = numero - 1;

        while (auxDrecha <= numero) {
            for (i = 1; i <= auxEspacios; i++) {

                System.out.print(" ");
            }
            for (i = 1; i < auxDrecha; i++) {

                System.out.print(i);
            }
            for (i = auxDrecha; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();
            auxDrecha++;
            auxEspacios--;
        }
    }

    public void ejercicioDificil3() {
        int clave = 1234;
        String auxClave = String.valueOf(clave);
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        String auxNumero = String.valueOf(numero);
        int intentos = 0;

        if (auxNumero.length() < 4) {
            for (int i = 0; i <= 4 - auxNumero.length(); i++) {
                auxNumero = "0" + auxNumero;
            }
        }


        if (auxClave.charAt(0) == auxNumero.charAt(0)
                && auxClave.charAt(1) == auxNumero.charAt(1) && auxClave.charAt(2) == auxNumero.charAt(2)
                && auxClave.charAt(3) == auxNumero.charAt(3)) {
            System.out.println("Acertados todos");
        } else if (auxClave.charAt(0) == auxNumero.charAt(0)
                && auxClave.charAt(1) == auxNumero.charAt(1) && auxClave.charAt(2) == auxNumero.charAt(2)) {
            System.out.println("Acertados casi todos");
        } else if (auxClave.charAt(0) == auxNumero.charAt(0)
                && auxClave.charAt(1) == auxNumero.charAt(1)) {
            System.out.println("Acertados dos");
        } else if (auxClave.charAt(0) == auxNumero.charAt(0)) {
            System.out.println("Acertados uno");
        } else {
            System.out.println("Ni uno");
        }


    }
}

