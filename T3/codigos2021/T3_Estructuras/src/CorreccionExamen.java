import java.util.Scanner;

public class CorreccionExamen {


    public static void main(String[] args) {
        new CorreccionExamen().ejercicioFacil4();
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

        while (intentos < 5) {
            if (auxClave.charAt(0) == auxNumero.charAt(0)
                    && auxClave.charAt(1) == auxNumero.charAt(1)
                    && auxClave.charAt(2) == auxNumero.charAt(2)
                    && auxClave.charAt(3) == auxNumero.charAt(3)) {
                System.out.println("Acertados todos");
                break;
            } else {
                intentos++;
            }
            /*else if (auxClave.charAt(0) == auxNumero.charAt(0)
                    && auxClave.charAt(1) == auxNumero.charAt(1) && auxClave.charAt(2) == auxNumero.charAt(2)) {
                System.out.println("Acertados casi todos");
            } else if (auxClave.charAt(0) == auxNumero.charAt(0)
                    && auxClave.charAt(1) == auxNumero.charAt(1)) {
                System.out.println("Acertados dos");
            } else if (auxClave.charAt(0) == auxNumero.charAt(0)) {
                System.out.println("Acertados uno");
            } else {
                System.out.println("Ni uno");
            }*/
        }

        if (intentos == 4) {
            System.out.println("bloqueada");
        }


    }

    public void ejercicioFacil1() {
        // menu: suma, potencia, tablas, salir
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Suma");
            System.out.println("2. Potencia");
            System.out.println("3. Tablas");
            System.out.println("4. Salir");
            System.out.println("Introduce la opción");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:

                    break;
                case 2:
                    int base, exponente, potencia = 1;
                    System.out.println("Dime base");
                    base = teclado.nextInt();
                    System.out.println("Dime exponente");
                    exponente = teclado.nextInt();
                    //System.out.println("El resultado es "+Math.pow(base,exponente));
                    for (int i = 0; i < exponente; i++) {
                        potencia = base * potencia;
                    }
                    System.out.println("El resultado es " + potencia);

                    break;
                case 3:
                    for (int i = 0; i < 11; i++) {
                        System.out.printf("La tabla del %d es %n", i);
                        for (int j = 0; j < 11; j++) {
                            System.out.printf("%t %d * %d = %d %n", i, j, (i * j));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Te has confundido, lo siento hasta luego");
                    opcion = 4;
                    break;
            }
        } while (opcion != 4);

    }

    public void ejercicioFacil2() {
        Scanner teclado = new Scanner(System.in);
        int numero, sumatorio = 0;
        System.out.println("introduce numero");
        numero = teclado.nextInt();
        for (int i = numero; i < numero + 100; i++) {
            sumatorio += i;
        }
        System.out.println(sumatorio);

    }

    public void ejercicioFacil3() {

        Scanner teclado = new Scanner(System.in);
        int clave = 1234;
        int claveMia, intentos = 4;

        while (intentos > 0) {
            System.out.println("Dime la clave que quieres meter");
            claveMia = teclado.nextInt();
            if (clave==claveMia){
                System.out.println("Enhorabuena has abierto la caja");
                break;
            }else {
                intentos--;
            }
        }

        if (intentos==0){
            System.out.println("Caja bloqueada");
        }


    }

    public void ejercicioFacil4(){

        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio, sumatorio=0;
        System.out.println("Cuantos aleatorios queres generar");
        numeroAleatorio = teclado.nextInt();

        for (int i = 0; i < numeroAleatorio; i++) {
            int aleatorio = (int) (Math.random()*101);
            sumatorio += aleatorio;
        }

        System.out.printf("La suma es %d %n",sumatorio);
        System.out.printf("La media es %.2f %n",(double)sumatorio/(double) numeroAleatorio);

    }
}

