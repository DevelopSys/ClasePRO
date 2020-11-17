import java.util.Scanner;

public class Entrada {

    Scanner teclado;

    // intentar para mañana
    /* sacar las tablas de multiplicar de todos los numeros
       pedir por teclado un número y calcular su factorial
       4 = 4*3*2*1
       7 = 7*6*5*4*3*2*1
     */

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
        //new Entrada().menuIterativo();
        //new Entrada().estructuraFOR();
        //new Entrada().ejecricioMultiplicacion();
        //new Entrada().estructuraFORANIDADO();
        //new Entrada().ejercicioAcumulador();
        //new Entrada().ejercicioAleatorios();
        //new Entrada().estructuraFOREACH();
        //new Entrada().ejercicioTablas();
        //new Entrada().ejercicioFactorial();
        new Entrada().trabajoPalabras();
    }

    public void ejercicioTablas() {

        for (int i = 0; i <= 10; i++) {
            System.out.println("La tabla del " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
            System.out.println("Terminada tabla del " + i);

        }

    }

    public void ejercicioFactorial() {

        // 4 --> 4*3*2*1
        // 6 --> 6*5*4*3*2*1
        int factorial = 1;
        int numero = 5; // 3*2*1
        int resultadoFacto = 1;
        for (int i = numero - 1; i >= 1; i--) {
            // 3*2 -- sumo al factorial
            // 3*1
            int resultado = numero * i;
            //int resultadoFactorial *= resultado;
            System.out.printf("%d * %d = %d%n", numero, i, resultado);
            resultadoFacto *= resultado;
        }

        System.out.println(resultadoFacto);
        /*for (int i=numero;i>1;i--){
            // 3*1
            // 3*2
            // 3*1

            int resultado = numero *i;
            System.out.printf("%d * %d%n ", factorial,i);


            //factorial *= i;
            //facfactoRecursivo(i);
        }*/

        /*
        factorial = 1
        1 - factorial = 1*4 --> 4
        2 - factorial = 4*3 --> 12
        3 - factorial = 12*2 --> 24
        4 - factorial = 24*1 --> 24
         */

        System.out.println(factorial);

    }

    public int factoRecursivo(int indice) {

        return 0;
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
                //new Entrada().metodo(n1, 2);
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

    public void estructuraFOR() {
        System.out.println("Ejecución por sentencia FOR");
        /*
        linea 1
        for(inicio; final; incremento){
            // ejecutar
            linea 2
        }
        linea 3
         */

        //int aleatorio = (int) (Math.random()*1001);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Ejecucion dentro del for " + i);
            // se incremente i en 1
        }

        System.out.println("Saliendo del FOR");


    }

    public void estructuraFORANIDADO() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Menu " + i);
            for (int x = 0; x <= 5; x++) {
                System.out.println("SubMenu " + " " + i + " " + x);
                // incrementa x
            }
            // incrementa i
        }
        /*
        i=1
        System.out.println("Menu 1");
        System.out.println("SubMenu 0");
        System.out.println("SubMenu 1");
        System.out.println("SubMenu 2");
        System.out.println("SubMenu 3");
        System.out.println("SubMenu 4");
        System.out.println("SubMenu 5");
        System.out.println("Menu 2");



         */

    }

    public void estructuraFOREACH() {
        double numero = 5;
        int[] numeros = {1, 2, 234, 234, 5};
        //numeros.length; -> 5
        /*System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);*/

        /*for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
            // numeros[5]
        }*/
        // 123,3123,123,21312,123
        for (int item : numeros) {
            System.out.println(item);
        }


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
            switch (opcion) {
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
                    char letra;
                    do {
                        System.out.println("Estas seguro que quieres salir (y/n)");
                        letra = teclado.next().charAt(0);
                        switch (letra) {
                            case 'y':
                                System.out.println("saliendo del caso 4");
                                break;
                            case 'n':
                                System.out.println("Repitiendo menú");
                                break;
                        }
                    } while (letra != 'y');

                    // realizar cambios iterativos
                    break;
                default:
                    System.out.println("Caso no contemplado");
                    System.out.println("Saliendo......");
                    opcion = 5;
                    break;
            }
        } while (opcion != 5);


    }

    public void ejecricioMultiplicacion() {

        teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduce el número del que quieres ver su tabla");
        numero = teclado.nextInt();
        if (numero > 10 || numero < 0) {
            System.out.println("Dato incorrecto");
        } else {
            // 0,1,2,3,4,5,6,7,8,9,10
            int resultado;

            System.out.printf("La tabla del número %d es:%n", numero);
            for (int i = 0; i <= 10; i++) {
                // repetido 11 veces
                resultado = numero * i;
                System.out.printf("%d * %d = %d%n", numero, i, resultado);
            }
        }
    }

    public void ejercicioAcumulador() {
        int numero = 0, sumatorio = 0;
        teclado = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce numero");
            numero = teclado.nextInt();
            sumatorio += numero;
        }

        System.out.println("La suma total es: " + sumatorio);
    }

    public void ejercicioAleatorios() {
        //Math.random(); // genera un numero aleatorio entre 0 y 0.99
        int contadorPares = 0, contadorImpares = 0, aleatorio;
        //System.out.println((int)(Math.random()*1001));

        for (int i = 0; i < 100; i++) {
            aleatorio = (int) (Math.random() * 1001);
            System.out.println(aleatorio);
            if (aleatorio % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        System.out.printf("El núemro de pares es: %d%n", contadorPares);
        System.out.printf("El núemro de impares es: %d%n", contadorImpares);

    }

    public void trabajoPalabras() {
        // longitud de la palabra
        //System.out.println(palabra.length());
        // la letra de una posición
        //palabra.charAt(3);
        // EJERCICIO CLASE
        // Introduzco una letra y me dice
        // si esta o no en una palabra
        // cuantas veces aparece en una palabra
        /*char letra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce letra");
        letra = teclado.next().charAt(0);
        int contador=0;
        for (int i=0;i<palabra.length();i++){
            //System.out.println(palabra.charAt(i));
            if (String.valueOf(palabra.charAt(i)).toLowerCase().equals(String.valueOf(letra))){
               contador++;
            }
        }

        if (contador>0){
            System.out.printf("la letra esta y son %d veces%n",contador);
        } else {
            System.out.println("Lo siento, la letra no está");
        }*/

        /*boolean estaPalabra = palabra.contains("e");
        if (palabra.contains("e")){
            System.out.println("La letra esta en la palabra");
        } else {
            System.out.println("La letra no esta en la palabra");
        }*/

        //char letraPalabra = palabra.toUpperCase().charAt(0);
        //System.out.println(palabra.toLowerCase().charAt(0));
        //System.out.println(palabra);
        //String frase = "HOLA esto es UN ejemplo DE frase";
        //String[] palabras = frase.toLowerCase().split(" ");
        //System.out.println(frase.length());
        /*for (String item :palabras) {
            System.out.println(item);
        }*/

        //frase.equals("HOLA");
        //System.out.println(frase.substring(5,9));
        // pedir dos letras por teclado y
        // sacar el substring comprendido entre esas dos letras
        // o s
        // se tiene que imprimir o es
        //String frase = "HOLA esto es UN ejemplo DE frase";
        // indexOF (primera coincidencia) o --> 8
        // indexOF (s, 8) s --> 11
        // lastIndexOF(s)
        // lastIndexOF(s, 14)
        /*Scanner teclado = new Scanner(System.in);
        char letraInicio, letraFin;
        System.out.println("Introduce letra inicial");
        letraInicio = teclado.next().charAt(0);
        System.out.println("Introduce letra final");
        letraFin = teclado.next().charAt(0);
        int posicionLetraInicio = frase.indexOf(letraInicio);
        int posicionLetraFinal  = frase.indexOf(letraFin,posicionLetraInicio);
        System.out.println(frase.substring(posicionLetraInicio,posicionLetraFinal+1));
        //System.out.println(frase.substring(frase.indexOf(letraInicio),frase.indexOf(letraFin)+1));
*/

        //String pFormateo = String.format("Esto es un ejemplo de formateo %s",palabra);
        //System.out.println(pFormateo);
        teclado = new Scanner(System.in);
        System.out.println("Introduce letra");
        char letra = teclado.next().charAt(0);
        String frase = "HOLA esto es UN ejemplo DE frase";
        //char letraUno = 'A';
        //char letraDos = 'o';
        // System.out.println(frase.substring(letraUno,letraDos));
        // solo se tendría que hacer cuando la u está en la frase,
        // si no está que me diga algo
        if (frase.contains(String.valueOf(letra))) {
            System.out.println("dime la nueva letra");
            char letraNueva = teclado.next().charAt(0);
            frase = frase.replace(letra, letraNueva);
        } else {
            System.out.println("La letra no está contenida");
        }

        // dada una frase guardada en variable, contar el número de
        // vocales, consonantes y espacios
        String fraseEvaluar = "Esta FraSe,es la que VoY a utilizar PArA evaluar" +
                "el,ejercicio de,conteo";
        fraseEvaluar = fraseEvaluar.toLowerCase();
        int vocales = 0, consonantes = 0, espacios = 0;
        //fraseEvaluar.charAt(0); --> e

        /*for (int i = 0; i < fraseEvaluar.length(); i++) {
            String letraEv = String.valueOf(fraseEvaluar.charAt(i));
            if (!letraEv.equals(",")) {
                if (letraEv.equals("a") || letraEv.equals("e")
                        || letraEv.equals("i") || letraEv.equals("o") || letraEv.equals("u")) {
                    vocales++;
                } else if (letraEv.equals(" ")) {
                    espacios++;
                } else {
                    consonantes++;
                }
            }
        }*/

        /*for (int i = 0; i < fraseEvaluar.length(); i++) {
            String letraEv = String.valueOf(fraseEvaluar.charAt(i));
            if (!Character.isDigit(fraseEvaluar.charAt(i))) {
                if (letraEv.equals("a") || letraEv.equals("e")
                        || letraEv.equals("i") || letraEv.equals("o") || letraEv.equals("u")) {
                    vocales++;
                } else if (letraEv.equals(" ")) {
                    espacios++;
                } else {
                    consonantes++;
                }
            }*/


        //System.out.println("Las vocales son "+vocales);
        //System.out.println("Las consonantes son "+consonantes);
        //System.out.println("Los espacions son "+espacios);


        //System.out.println(frase);


        //frase = frase.replace('u','a');
        System.out.println(frase);


    }
}




