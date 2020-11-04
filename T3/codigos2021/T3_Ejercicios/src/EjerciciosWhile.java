import java.util.Scanner;

public class EjerciciosWhile {

    public static void main(String[] args) {

        new EjerciciosWhile().ejercicio5();
    }

    public void ejercicio1() {
        /*
         * Leer números enteros hasta introducir un 0.
         *  El programa obtendrá la suma de todos los números positivos.
         * (SumarPositivos)
         * */

        Scanner teclado = new Scanner(System.in);
        int numero, positivos = 0;

        do {

            numero = teclado.nextInt();
            if (numero > 0) {
                positivos += numero;
            }

        } while (numero != 0);

        System.out.println(positivos);


    }

    public void ejercicio2() {
        /*
        Calcúlese el mínimo común múltiplo de dos números entre 1 y 100.
        Para obtener el mcm se tomará uno de los valores introducidos
        y se irá multiplicando por 1, 2, 3, etc,
        hasta que el valor obtenido sea múltiplo del otro número,
        que sería el valor buscado. (MinimoComunMultiplo)
         */

        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce numero1");
        num1 = teclado.nextInt();
        System.out.println("Introduce numero2");
        num2 = teclado.nextInt();

        // 4  - 99
        // 4*1 ? modulo 99
        // 4*2 ? modulo 99
        // 4*3 ? modulo 99
        // 4*4 ? modulo 99
        // 4*5 ? modulo 99
        // 4*6 ? modulo 99
        // 4*7 ? modulo 99
        // 4*8 ? modulo 99
        // 4*9 ? modulo 99
        // 4*10 ? modulo 99

        int resultado = 0;
        int indice = 1;

        //2 y el 10

        if (num1 > num2) {

            do {
                indice++;
                resultado = num2 * indice;

            } while (num1 % resultado != 0);

            System.out.println("El mcm es " + (indice));

        } else if (num2 > num1) {

        } else {
            System.out.println("Los numeros son iguales");
        }

    }

    public void ejercicio3() {
        /*
         * Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0.
         * El programa mostrará cada uno de los datos generados y obtendrá el mayor de
         * los números generados. (MayorNumero)
         * */

        int numero, maximo = 0, contador = 0, acumulador = 0;
        do {
            numero = (int) (Math.random() * 100);
            if (numero > maximo) {
                maximo = numero;
            }
            System.out.println(numero);
            acumulador += numero;
            contador++;
        } while (numero != 0);
        System.out.println("El máximo es " + maximo);
        System.out.printf("El número medio es: %.2f%n", (double) acumulador / (double) contador - 1);
        System.out.println("SALIENDO");


    }

    public void ejercicio4() {
        /*
         * Introducir un entero no negativo, y convertirlo a binario, octal y hexadecimal.
         * (BinarioOctalHexadecimal)
         * */

        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce número");
        int numero = teclado.nextInt();
        int resto = 0;
        String conversion = "";
        int base;

        System.out.println(Integer.toBinaryString(numero));
        Integer.parseInt("100001010", 10);

        /*
        Introduce numero =123
        Intrduce base a la que queres pasar: 16
         */


        if (numero > 0) {

            do {
                resto = numero % 16;
                numero = numero / 16;
                if (resto == 10) {
                    conversion = "A" + conversion;
                } else if (resto == 11) {
                    conversion = "B" + conversion;

                } else if (resto == 12) {
                    conversion = "C" + conversion;

                } else if (resto == 13) {
                    conversion = "D" + conversion;

                } else if (resto == 14) {
                    conversion = "E" + conversion;

                } else if (resto == 15) {
                    conversion = "F" + conversion;

                } else {
                    conversion = resto + conversion;
                }
                //System.out.println(resto);
            } while (numero > 0);

            System.out.println(conversion);

        } else {
            System.out.printf("No puedo hacer la conversión");
        }


    }

    public void ejercicio5() {
        /*
         * Crea un programa que genere un número aleatorio
         * (entre 0 y 20) de entrada y lo guarde en una variable.
         * El sistema irá pidiendo números al usuario hasta que coincida
         * con el aleatorio generado (en caso de no coincidir mostrará
         * el mensaje "Lo siento, intentalo de nuevo").
         * Cuando coincida el sistema deberá mostar el mensaje
         * "Enhorabuena, has acertado el número en 5 intentos" (Adivina)
         * */

        /*

        Si termino

         */

        /*Scanner teclado = new Scanner(System.in);
        int aleatorio = (int) (Math.random()*21);
        System.out.println("El aleatorio a acertar es: "+aleatorio);
        int numero=0, acumulador=0;
        do {
            System.out.println("Introduce numero para el intento");
            numero = teclado.nextInt();
            if (aleatorio!=numero){
                System.out.println("Lo siento, intentalo de nuevo");
            }
            acumulador++;
        }while(aleatorio != numero);

        System.out.println("Enhorabuena, lo has conseguido en: "+acumulador);*/
        String continuar = "y";
        int numero, acumulador, record=99999;
        Scanner teclado = new Scanner(System.in);

        do {
            int aleatorio = (int) (Math.random() * 21);
            System.out.println("El aleatorio a acertar es: " + aleatorio);
            numero = 0;
            acumulador = 0;
            do {
                System.out.println("Introduce numero para el intento");
                numero = teclado.nextInt();
                if (aleatorio != numero) {
                    System.out.println("Lo siento, intentalo de nuevo");
                }
                acumulador++;
            } while (aleatorio != numero);
            System.out.println("Enhorabuena, lo has conseguido en: " + acumulador);
            if (acumulador<record){
                record = acumulador;
                System.out.println("Has superado el record");
            }

            System.out.println("Quieres volver a probar (y/n)");
            continuar = teclado.next();

        } while (continuar.equalsIgnoreCase("y"));

    }
}
