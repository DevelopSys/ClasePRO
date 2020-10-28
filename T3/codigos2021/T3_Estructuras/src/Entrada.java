import java.util.Scanner;

public class Entrada {

    Scanner teclado;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa de estructuras de control");
        // new Entrada().estructuraIF();
        // new Entrada().estructraELSEIF();
        // new Entrada().estructuraIFELSEIF();
        /*System.out.println("Introduce número a evaluar");
        int numero = teclado.nextInt();
        //new Entrada().esParUnNumero(numero); // true o false
        if (new Entrada().esParUnNumero(numero)){
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }*/
        /*
        Realizar un menú con la siguiente estructura

        1. Comprobar si es par
        2. Comprobar si es impar
        3. Comprobar si es positivo
        4. Comprobar si es negativo
        5. Realizar operaciones
        0. Salir
        Introduce la opción:
        1


        1- Pide un int por teclado y muestra si es par
        2- Pide un int por teclado y muestra si es impar
        3- Pide un int por teclado y muestra si es pos
        4- Pide un int por teclado y muestra si es neg
        5- Pide dos int por teclado y muestra sus operaciones (+,- ,*, /) llamadas por métodos con
        argumentos y retornos


         */
        //new Entrada().estructuraSwitch();
        //new Entrada().ejercicioSW();
        //new Entrada().estructuraWHILE();
        //new Entrada().estrucutraDOWHILE();
        new Entrada().menuIterativo();
    }

    public void ejercicioSW() {
        Scanner teclado = new Scanner(System.in);
        int opcion, opcion2, numero1, numero2;
        System.out.println("1. Comprobar par");
        System.out.println("2. Comprobar impar");
        System.out.println("3. Comprobar positivo");
        System.out.println("4. Comprobar negativo");
        System.out.println("5. Hacer operaciones");
        System.out.println("Introduce número");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Comprobación Par");
                System.out.println("Introduce número a comprobar");
                numero1 = teclado.nextInt();
                if (numero1 % 2 == 0) {
                    System.out.println("Es par");
                }

                break;
            case 2:
                System.out.println("Comprobación Impar");
                System.out.println("Introduce número a comprobar");
                numero1 = teclado.nextInt();
                if (numero1 % 2 != 0) {
                    System.out.println("Es impapar");
                }
                break;
            case 3:
                System.out.println("Comprobación Postivo");
                System.out.println("Introduce número a comprobar");
                numero1 = teclado.nextInt();
                if (numero1 >= 0) {
                    System.out.println("Es positivo");
                }
                break;
            case 4:
                System.out.println("Comprobación Negativo");
                System.out.println("Introduce número a comprobar");
                numero1 = teclado.nextInt();
                if (numero1 < 0) {
                    System.out.println("Es negativo");
                }
                break;
            case 5:
                System.out.println("Comprobación Operaciones");
                System.out.println("Introduce operando 1");
                numero1 = teclado.nextInt();
                System.out.println("Introduce operando 2");
                numero2 = teclado.nextInt();
                System.out.println("1. Para sumar");
                System.out.println("2. Para restar");
                System.out.println("3. Para multiplicar");
                System.out.println("4. Para dividir");
                System.out.println("5. Todas");
                System.out.println("Introduce opcion");
                opcion2 = teclado.nextInt();
                switch (opcion2) {
                    case 1:
                        System.out.printf("El resultado de la suma es %d %n", new Entrada().suma(numero1, numero2));
                        break;
                    case 2:
                        System.out.printf("El resultado de la resta es %d %n", new Entrada().resta(numero1, numero2));
                        break;
                    case 3:
                        System.out.printf("El resultado de la multiplicacion es %d %n", new Entrada().multiplicacion(numero1, numero2));
                        break;
                    case 4:
                        System.out.printf("El resultado de la division es %.2f %n", new Entrada().division(numero1, numero2));
                        break;
                    case 5:
                        System.out.printf("El resultado de la suma es %d %n", new Entrada().suma(numero1, numero2));
                        System.out.printf("El resultado de la resta es %d %n", new Entrada().resta(numero1, numero2));
                        System.out.printf("El resultado de la multiplicacion es %d %n", new Entrada().multiplicacion(numero1, numero2));
                        System.out.printf("El resultado de la division es %.2f %n", new Entrada().division(numero1, numero2));
                        break;
                }

                break;
        }
    }

    public int suma(int op1, int op2) {
        int resultado = op1 + op2;
        return resultado;
    }

    public int resta(int op1, int op2) {
        int resultado = op1 - op2;
        return resultado;
    }

    public int multiplicacion(int op1, int op2) {
        int resultado = op1 * op2;
        return resultado;
    }

    public double division(int op1, int op2) {
        double resultado = (double) op1 / (double) op2;
        return resultado;
    }


    public void estructuraIF() {
        /*
        linea 1
        linea 2
        if (condicion) {
            // ejecuciones
            linea 3
            linea 4
        }
        linea 5
         */
        int numero = 6;
        System.out.println("Ejecución por sentencia IF");
        if (numero >= 0 && numero <= 10) {
            System.out.println("El número está entre 0 y 10");
        }
        if (numero < 15) {
            System.out.println("El numero es menor que 15");
        }
        System.out.println("Saliedo del IF");
    }

    public void estructraELSEIF() {
        /* linea 1
         * if (condicion){
         *   linea 2
         * } else {
         *   linea 3
         * }
         * linea 4
         * */
        int numero = -7;
        System.out.println("Ejecución por sentencia ELSE-IF");
        if (numero >= 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        System.out.println("Saliendo de la estructura ELSE-IF");
    }

    public void estructuraIFELSEIF() {
        /*
           linea 1
        * if(condicion){
        *   linea 2
        * } else if(condicion){
        *   linea 3
        * } else if(condicion){
        *   linea 4
        * } else{
        *   linea 5
        * }
        *   linea 6
        * */

        int nota = 6;

        /*if (nota<5 && nota>0){
            System.out.println("Suspenso");
        } else if (nota>=5 && nota<6){
            System.out.println("Aprobado");
        } else if (nota>=6 && nota<9){
            System.out.println("Notable");
        } else if (nota>=9 && nota<10){
            System.out.println("Sobresaliente");
        } else if (nota ==10) {
            System.out.println("MH");
        } else {
            System.out.println("Numero incorrecto");
        }*/
        // -1 11
        if (nota < 0 || nota > 10) {
            System.out.println("Incorrecto");
        } else { // 0-10
            if (nota < 5) {
                System.out.println("SS");
            } else if (nota >= 5 && nota < 6) {

            } else if (nota >= 6 && nota < 9) {

            } else if (nota >= 9 && nota < 10) {

            } else {
                // 10
            }
        }

        System.out.println("Saliendo de estrucutra IFELSEIF");

    }

    public boolean esParUnNumero(int numeroComprobar) {
        return numeroComprobar % 2 == 0;
    }

    public void estructuraSwitch() {
        /*
        int valor = 1
        switch(valor) --> int, char, string{
            case 1:
                ejecuciones
            case 10:
                ejecuciones
            break;
            case 100:
                ejecuciones
            break;
            case 1000:
                ejecuciones
            break;
            default:
                ejecuciones
            break;
        }
        linea 7
         */
        teclado = new Scanner(System.in);
        System.out.println("Ejecución por sentencia SWITCH");
        int numero;
        System.out.println("Introduce un número");
        numero = teclado.nextInt();
        switch (numero) {
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                int n1 = teclado.nextInt();
                new Entrada().metodo(n1, 2);
                break;
            default:
                System.out.println("numero incorrecto");
                break;
        }
    }

    public void estructuraWHILE() {
        /*
        Cuantas veces se puede ejecutar esto? Desde 0 hasta n
        linea 1
        while (condicion){
            linea 2
        }
        linea 3
         */
        //int numero = 50;
        teclado = new Scanner(System.in);
        int numeroDesde, numeroHasta;
        System.out.println("Ejecución por sentencia WHILE");
        System.out.println("Dime desde que numero");
        numeroDesde = teclado.nextInt();
        //teclado.nextLine();
        System.out.println("Dime hasta que numero");
        numeroHasta = teclado.nextInt();
        // mostar todos los pares entre un rango pedido ambos incluido
        while (numeroDesde <= numeroHasta) {
            //System.out.printf("dentro del bloque con valor %d %n",numero);
            if (numeroDesde % 2 == 0) {
                System.out.println(numeroDesde);
            }
            numeroDesde++;
        }
        System.out.println("Saliendo del while.....");


    }

    public void estrucutraDOWHILE() {
        /* Se ejecuta entre 1 y n veces
        linea 1
        do{
            linea 2
        }while(condicion)
         linea 3
         */
        teclado = new Scanner(System.in);
        int numero = 50;
        System.out.println("Ejecución por sentencia DOWHILE");
        do {
            //System.out.println("Ejecutando dentro del do-while");
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 100);

        System.out.println("Saliendo del do-while");
    }

    public void menuIterativo() {
        /*
        System.out.println("1. Opcion1");
        System.out.println("2. Opcion2");
        System.out.println("3. Opcion3");
        System.out.println("4. Opcion4");
        System.out.println("5. Salir");
        System.out.println("Introduce opcion");
         */

        teclado = new Scanner(System.in);
        int opcion;


        do {
            System.out.println("1. Opcion1");
            System.out.println("2. Opcion2");
            System.out.println("3. Opcion3");
            System.out.println("4. Opcion4");
            System.out.println("5. Salir");
            System.out.println("Introduce opcion");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Trabajando con OP1");
                    System.out.println("Estas seguro que quieres salir del caso (y/n)");
                    break;
                case 2:
                    System.out.println("Trabajando con OP2");
                    break;
                case 3:
                    System.out.println("Trabajando con OP3");
                    break;
                case 4:
                    System.out.println("Trabajando con OP4");
                    // realizar cambios iterativos
                    break;
                default:
                    System.out.println("Caso no contemplado");
                    System.out.println("Saliendo......");
                    opcion = 5;
                    break;
            }
        } while (opcion!=5);


    }

    public int metodo(int n1, int n2) {
        return 4;
    }
}
