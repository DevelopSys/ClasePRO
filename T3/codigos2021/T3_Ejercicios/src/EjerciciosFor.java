import java.util.Scanner;

public class EjerciciosFor {


    public static void main(String[] args) {
        new EjerciciosFor().ejercicioCuadrados();
    }

    public void ejercicio1() {

        Scanner teclado = new Scanner(System.in);
        int nTempereturas = 0;
        double temperatura = 0, acumuladorTemperaturas = 0;
        System.out.println("Cuantas temperaturas vas a leer?");
        nTempereturas = teclado.nextInt();
        //
        if (nTempereturas <= 0) {
            nTempereturas = 10;
        }
        // nTemp = 5
        // i desde 0 hasta menor que 5
        for (int i = 0; i < nTempereturas; i++) {

            System.out.println("Introduce la temperatura número " + (i + 1));
            temperatura = teclado.nextDouble();
            acumuladorTemperaturas += temperatura;
            //i++
        }

        System.out.printf("La media es: %.2f%n", acumuladorTemperaturas / nTempereturas);
    }

    public void ejercicio2() {
        int nInicial, nFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce rango inicial");
        nInicial = teclado.nextInt();
        System.out.println("Introduce rango final");
        nFinal = teclado.nextInt();


        //  0 - 10      8-26
        //  6 - 3
        // 2-4
        // (inicial (0-9)      y      nFinal(1-10))       y     //4-2
        if (((nInicial >= 0 && nInicial <= 9) && (nFinal > 0 && nFinal <= 10)) && (nInicial < nFinal)) {
            System.out.println("ejecución correcta");

            for (int i = nInicial; i <= nFinal; i++) {
                System.out.printf("La tabla del número %d%n", i);
                for (int x = 0; x <= 10; x++) {
                    System.out.printf("%d * %d = %d%n", i, x, (i * x));
                }
            }

        } else {
            System.out.println("algun dato es erroneo");
        }

    }

    public void ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        int base, exponente;
        System.out.println("Introduce la base");
        base = teclado.nextInt();
        System.out.println("Introduce el exponente");
        exponente = teclado.nextInt();

        if (base > 0 && base < 6 && exponente > 0 && exponente < 6) {

            // base = 2
            // exponente = 3
            int potencia = 1;
            for (int i = 0; i < exponente; i++) {
                // para hacer tres ejecuciones
                potencia *= base;
            }

            System.out.println(potencia);

        } else {
            System.out.println("Error");
        }
    }

    public void ejercicio4() {
        //Dadas 6 notas entre 0 y 10, escribir la cantidad de alumnos aprobados,
        // condicionados (=4) y suspensos.(NotasTipos)

        Scanner teclado = new Scanner(System.in);
        int nota, aprobados = 0, suspensos = 0, condicionados = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Introduce la nota: ");
            nota = teclado.nextInt();
            if (nota >= 0 && nota <= 10) {
                if (nota >= 5) {
                    aprobados++;
                } else if (nota == 4) {
                    condicionados++;
                } else {
                    suspensos++;
                }
            } else {
                System.out.println("nota no valida");
            }
        }

        System.out.printf("El número de aprobados es: %d%n" +
                "El número de condicionados es: %d%n" +
                "El número de suspensos es: %d%n", aprobados, condicionados, suspensos);

    }

    public void ejercicio5() {
        //Dadas 6 notas entre 0 y 10, escribir la cantidad de alumnos aprobados,
        // condicionados (=4) y suspensos.(NotasTipos)

        Scanner teclado = new Scanner(System.in);
        int nSueldos, sueldoLeido = 0, max = 0;
        System.out.println("Introduce número de sueldos");
        nSueldos = teclado.nextInt();
        for (int i = 0; i < nSueldos; i++) {
            sueldoLeido = teclado.nextInt();
            if (sueldoLeido > max) {
                max = sueldoLeido;
            }
        }
        ;

        System.out.println("El sueldo más grande es " + max);
    }

    public void ejercicioCuadrados() {

        // lados = 4
        /*
        +   +   +   +
        +   +   +   +
        +   +   +   +
        +   +   +   +
         */

        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                if (x==0 || x==3 || i ==0 || i==3) {
                    System.out.print("\t+");
                }else {
                    System.out.print("\t-");
                }
            }
            System.out.println();
        }
    }


}
