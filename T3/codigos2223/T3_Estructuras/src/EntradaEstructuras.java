import java.util.Scanner;

public class EntradaEstructuras {

    public static void main(String[] args) {

        //estructuraIF();
        //calcularNota();
        //calculoIMC();
        //estrucuturaSwitch();
        //ejercicioMenu();
        //estructuraFor();
        //ejercicioFor();
        //multiplicaciones();
        //ejercicioAleatorios();
        //estructuraWhile();
        //ejercicioWhile();
        //estructuraDoWhile();
        //ejercicioDoWhile();
        //estructuraBreak();
        //System.out.println(metodoRuptura());


    }

    private static void estructuraBreak() {


        int numerosGenerados = 0;

        for (int i = 0; i < 100; i++) {

            int aleatorio = (int) (Math.random() *91);
            numerosGenerados++;
            System.out.println(aleatorio);
            if (aleatorio == 50){
                break;
            }

        }

        System.out.println("Saliendo del bucle");
        System.out.println("Generados: "+numerosGenerados);
    }

    public static int metodoRuptura(){
        int numerosGenerados = 0;

        for (int i = 0; i < 100; i++) {

            int aleatorio = (int) (Math.random() *91);
            numerosGenerados++;
            //System.out.println(aleatorio);
            if (aleatorio == 50){
                return numerosGenerados;
            }

        }

        return numerosGenerados;
    }

    private static void ejercicioDoWhile() {
        // HACER UN MENU --> switch
            // 1. Sumar
            // 2. Restar
            // 3. Multiplicar
            // 4. Dividir
            // 5. Salir
            // Que opcion queres hacer
            // 1
            // Opcion sumar --> me pide dos numeros y me muestra el resultado
            
    }

    private static void estructuraDoWhile() {

        int numero = 9;

        do {
            //System.out.println("Ejecucion en do-while");
            System.out.println("Ejecucion con numero valor: "+numero);
            numero++;
        }while (numero<15);
    }

    private static void ejercicioWhile() {
        // Pedir por consola numeros hasta introducir un negativo.
        // Cuando termine el programa me mostrará
        //      cuantos numeros he introducido
        //      cuantos han sido multiplos de 4
        //      cuantos han sido impares

        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroIntroducido=0;
        int multiplosCuatro=0;
        int impares=0;
        int numeros=0;

        while (numeroIntroducido>=0){
            System.out.println("Introduce numero");
            numeroIntroducido = lecturaTeclado.nextInt();
            // impar? multiplo? suma --> cuando sea > 0
            numeros++;
            if (numeroIntroducido>=0){
                if (numeroIntroducido%2 != 0){
                    impares++;
                } else if (numeroIntroducido %4 ==0) {
                    multiplosCuatro++;
                }
            }

        }

        System.out.printf("Has introducido %d numeros%n",numeros);
        System.out.printf("De los cuales %d son impares%n",impares);
        System.out.printf("De los cuales %d son multiplos de 4%n",multiplosCuatro);


    }

    private static void estructuraWhile() {
        // mientras se cumpla condicion ejecuta
        // vuelve a evaluar la condicion

        int numero = 10;

        while (numero>0){
            System.out.println("Ejecucion con valor de numero "+numero);
            numero--;
        }



    }

    private static void ejercicioAleatorios() {


        // CREAR UN PROGRAMA QUE PIDA POR CONSOLA EL RANGO MINIMO Y MAXIMO
        // EL MIN DEBE SER MAS PEQUEÑO QUE EL GRANDE, SINO AVISO Y PARA
        // QUE GENERE N ALEATORIOS
        // OBTENER  LA SUMA DE LOS ALEATORIOS GENERADOS
        //          LA MEDIA DE LOS ALEATORIOS GENERADOS
        //          EL MAX GENERADO
        //          EL MIN GENERADO

        Scanner lecturaTeclado = new Scanner(System.in);
        int maxRango = 0;
        int minRango = 0;

        System.out.println("Introduce el rango minimo");
        minRango = lecturaTeclado.nextInt();
        System.out.println("Introduce el rango maximo");
        maxRango = lecturaTeclado.nextInt();

        if (minRango < maxRango) {
            int sumatorioAleatorios = 0;
            double mediaAleatorios = 0.0;
            int max = minRango, min = maxRango;

            int numeroNumeros = maxRango - minRango;
            int repeticiones = (int) (Math.random() * 16) + 5;
            System.out.printf("Se van a realizar %d repeticiones%n",repeticiones);
            for (int i = 0; i < repeticiones; i++) {
                System.out.printf("Repeticion %d",i);
                int aleatorio = (int) (Math.random() * (numeroNumeros + 1)) + minRango;
                System.out.println(" Aleatorio generado "+aleatorio);
                sumatorioAleatorios += aleatorio;

                if (aleatorio<min){
                    min = aleatorio;
                } else if (aleatorio>max) {
                    max = aleatorio;
                }

            }
            mediaAleatorios = (double) sumatorioAleatorios / repeticiones;

            System.out.printf("La suma de todos los aleatorios es: %d%n",sumatorioAleatorios);
            System.out.printf("La media de todos los aleatorios es: %.2f%n",mediaAleatorios);
            System.out.printf("El max de los generados es: %d%n",max);
            System.out.printf("El min de los generados es: %d%n",min);



        } else {
            System.out.println("Rango incompatible, terminando programa");
        }


        //System.out.println(Math.random()*10);
        //0-9 (0.9999999999999999)
        for (int i = 0; i < 10000; i++) {

        }


    }

    private static void multiplicaciones() {

        // DE QUE NUMERO QUIERES SACAR LA TABLA: 7
        // 7x0=0
        // 7x1=7
        // 7x1=7
        // 7x1=7
        // 7x1=7
        // 7x1=7
        // 7x1=7
        // 7x1=7
        // 7x1=7
        // 7x10=70
        /*Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("De que numero quieres ver la tabla");
        int numeroTabla = lecturaTeclado.nextInt();
        System.out.println("TABLA DEL "+numeroTabla);

        for (int i = 0; i < 11; i++) {
            System.out.printf("\tLa multiplicacion de %dx%d=%d%n",numeroTabla,i,numeroTabla*i);
        }*/

        System.out.println("Tablas de multipicar");

        for (int i = 0; i < 11; i++) {
            // saca las tablas
            System.out.println("TABLA DEL " + i);
            for (int j = 0; j < 11; j++) {
                // sacar los valores de cada tabla
                System.out.printf("\t%dx%d=%d%n", i, j, i * j);
            }

        }

    }

    private static void ejercicioFor() {
        // REALIZAR UN PROGRAMA QUE PIDA POR CONSOLA EN NUMERO DE VECES
        // QUE TENGO QUE INTRODUCIR DATOS

        // SEGUN EL N VECES INDICADO PEDIRA TANTOS NUMEROS COMO SE INDIQUE
        // LA CAPTURA DEL NUMERO SERA CON EL SIGUIENTE MENSAJE
        // "Introduce el valor de la posicion 1: " --> INTRODUZCO
        // "Introduce el valor de la posicion 2"  -->  INTRODUZCO
        // "Introduce el valor de la posicion 3"  -->  INTRODUZCO
        // "Introduce el valor de la posicion 4"  -->  INTRODUZCO

        // MOD1: Calcular el sumatorio de todos los numeros introducidos
        // Calcular el número medio introducido
        // APARECER EL MENSAJE DE   "LA SUMA DE LOS NUMEROS ES 130"
        //                          "LA MEDIA DE LOS NUMEROS ES 5,7"

        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroDatos = 0;

        System.out.println("cuantos datos quieres introducir");
        numeroDatos = lecturaTeclado.nextInt();

        int sumatorioValores = 0;

        for (int i = 0; i < numeroDatos; i++) {
            System.out.printf("Por favor introduce el dato de la posicion %d%n", i + 1);
            int numeroIntroducido = lecturaTeclado.nextInt();
            sumatorioValores += numeroIntroducido;
        }

        System.out.println("La suma de todos los numeros es " + sumatorioValores);
        double media = (double) sumatorioValores / numeroDatos;
        System.out.println("La media de todos los numeros es " + media);

    }

    private static void estructuraFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Incremental");
            System.out.println("Ejecucion " + i);
        }
    }

    private static void ejercicioMenu() {
        Scanner lecturaTeclado = new Scanner(System.in);
        int opcion, opcionSubmenu;
        System.out.println("1. Menu1\n2. Menu2\n3. Menu3\n4. Menu4");
        System.out.println("Que opcion quieres ejecutar");
        opcion = lecturaTeclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Imprimiendo menu 1");
                System.out.println("1.1 Submenu\n1.2 Submenu\n1.3 Submenu");
                opcionSubmenu = lecturaTeclado.nextInt();
                switch (opcionSubmenu) {
                    case 1:
                        System.out.println("imprimiendo submenu 1.1");
                        break;
                    case 2:
                        System.out.println("imprimiendo submenu 1.2");
                        break;
                    case 3:
                        System.out.println("imprimiendo submenu 1.3");
                        break;
                }
                break;
            case 2:
                System.out.println("Imprimiendo menu 2");
                break;
            case 3:
                System.out.println("Imprimiendo menu 3");
                break;
            case 4:
                System.out.println("Imprimiendo menu 4");
                break;
            default:
                System.out.println("Opcion incorrecta");

        }
    }

    private static void estrucuturaSwitch() {

        int numero = 4;

        switch (numero) {
            case 1:
                // si numero = 1
                int variableCase = 10;
                System.out.println("El numero tiene un valor de 1");
                System.out.println(variableCase);
                break;
            case 2:
                System.out.println("El numero tiene un valor de 2");
                break;
            case 7:
                System.out.println("El numero tiene un valor de 7");
                break;

            default:
                System.out.println("Caso no contemplado");

        }

        // MODIFICA EL EJERCICIO DEL IMC Y UTILIZAR UN SWITCH

        // REALIZAR UN MENU POR CONSOLA

        /*
         * Que opcion quieres ejerucar: [1-4]
         * MENU OPCION 1
         *   que opcion del menu 1 quieres ejecutar
         *   opcion: [1-3]
         *   SUBMENU 1.1
         *   SUBMENU 1.2
         *   SUBMENU 1.3
         *   Opcion no reconocida
         * MENU OPCION 2
         * MENU OPCION 3
         * MENU OPCION 4
         * Opcion no reconocida
         * */

    }

    private static void calculoIMC() {

        Scanner lecturaTeclado = new Scanner(System.in);
        String nombre, apellido;
        int edad, altura;
        double peso, IMC;
        String sexo;

        System.out.println("Por favor introduce tu nombre");
        nombre = lecturaTeclado.next();
        System.out.println("Por favor introduce tu apellido");
        apellido = lecturaTeclado.next();
        System.out.println("Por favor introduce tu edad");
        edad = lecturaTeclado.nextInt();
        System.out.println("Por favor introduce tu altura");
        altura = lecturaTeclado.nextInt();

        System.out.println("Por favor introduce tu peso");
        peso = lecturaTeclado.nextDouble();
        System.out.println("Por favor introduce tu sexo (M/F)");
        sexo = lecturaTeclado.next();
        IMC = calculoIMC(peso, (double) altura / 100); // calcularIMC() -->  valor del retorno
        System.out.printf("Hola Borja tu IMC teniendo en cuenta tu altura de %dcm y tu peso de %.2fkg, tiene\n" +
                "un valor de %.2f%n", altura, peso, IMC);

        if (sexo.equals("M")) {
            // hombres
            /*
            18,5–24,9    Peso normal
            25.0–29.9    Pre-obesidad o Sobrepeso
            30.0–34.9    Obesidad clase I
            35,0–39,9    Obesidad clase II
            Por encima de 40    Obesidad clase III
            * */
            if (IMC < 18.50) {
                System.out.println("Por debajo de lo normal ");
            } else if (IMC < 25) {
                System.out.println("Peso normal ");
            } else if (IMC < 30) {
                System.out.println("Sobrepeso ");
            } else if (IMC < 35) {
                System.out.println("Obesidad clase I ");
            } else if (IMC < 40) {
                System.out.println("Obesidad clase II ");
            } else {
                System.out.println("Obesidad clase III ");
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            // mujeres
            if (IMC < 16.50) {
                System.out.println("Por debajo de lo normal ");
            } else if (IMC < 23) {
                System.out.println("Peso normal ");
            } else if (IMC < 26) {
                System.out.println("Sobrepeso ");
            } else if (IMC < 31) {
                System.out.println("Obesidad clase I ");
            } else if (IMC < 34) {
                System.out.println("Obesidad clase II ");
            } else {
                System.out.println("Obesidad clase III ");
            }
        } else {
            // sexo diferente
            System.out.println("Letra incorrecta");
        }


    }

    private static void calculoIMCSwitch() {

        Scanner lecturaTeclado = new Scanner(System.in);
        String nombre, apellido;
        int edad, altura;
        double peso, IMC;
        String sexo;

        System.out.println("Por favor introduce tu nombre");
        nombre = lecturaTeclado.next();
        System.out.println("Por favor introduce tu apellido");
        apellido = lecturaTeclado.next();
        System.out.println("Por favor introduce tu edad");
        edad = lecturaTeclado.nextInt();
        System.out.println("Por favor introduce tu altura");
        altura = lecturaTeclado.nextInt();

        System.out.println("Por favor introduce tu peso");
        peso = lecturaTeclado.nextDouble();
        System.out.println("Por favor introduce tu sexo (M/F)");
        sexo = lecturaTeclado.next();
        IMC = calculoIMC(peso, (double) altura / 100); // calcularIMC() -->  valor del retorno
        System.out.printf("Hola Borja tu IMC teniendo en cuenta tu altura de %dcm y tu peso de %.2fkg, tiene\n" +
                "un valor de %.2f%n", altura, peso, IMC);

        switch (sexo.charAt(0)) {
            case 'M':
                if (IMC < 18.50) {
                    System.out.println("Por debajo de lo normal ");
                } else if (IMC < 25) {
                    System.out.println("Peso normal ");
                } else if (IMC < 30) {
                    System.out.println("Sobrepeso ");
                } else if (IMC < 35) {
                    System.out.println("Obesidad clase I ");
                } else if (IMC < 40) {
                    System.out.println("Obesidad clase II ");
                } else {
                    System.out.println("Obesidad clase III ");
                }
                break;
            case 'F':
                if (IMC < 16.50) {
                    System.out.println("Por debajo de lo normal ");
                } else if (IMC < 23) {
                    System.out.println("Peso normal ");
                } else if (IMC < 26) {
                    System.out.println("Sobrepeso ");
                } else if (IMC < 31) {
                    System.out.println("Obesidad clase I ");
                } else if (IMC < 34) {
                    System.out.println("Obesidad clase II ");
                } else {
                    System.out.println("Obesidad clase III ");
                }
                break;
            default:
                System.out.println("Letra incorrecta");

        }


    }

    public static double calculoIMC(double peso, double altura) {

        double IMC = peso / (altura * altura);
        //return IMC;
        //return peso / Math.pow(altura,2);
        return peso / (altura * altura);
    }


    public static void estructuraIF() {
        // IF

        int numeroUno = -1, numeroDos = 20;
        System.out.println("Ejecucion de un if simple");
        // que el numeroUno este entre 0 y 15 y que ademas el n2 sea par
        // [0-15]
        if (numeroUno >= 0 && numeroUno <= 15) {

            System.out.println("El número es positivo y por lo tanto ejecuto");
            // no es accesible desde fuera del bloque
            int numeroTres = 50;
            numeroUno++;
        } else {
            System.out.println("No se cumple la condición");
        }

        System.out.println("Continuacion del programa");
        System.out.println("El valor de numeroUno es: " + numeroUno);


        numeroUno = 22;
        numeroDos = 10;

        if (numeroUno > 10) {
            System.out.println("El numero es más grande que 10");
        } else if (numeroUno >= 0 && numeroUno <= 10) {
            System.out.println("El numero está entre 0 y 10");
        } else if (numeroUno < 0 && numeroUno > -10) {
            System.out.println("El numero es negativo");
        } else {
            // siempre el n será <-10
            System.out.println("El numero es un negativo grande");
        }

        // pedir por consola una nota
        // si la nota es valida = [0-10]
        // 0-4.99 --> examen suspenso
        // 5-6.99 --> examen aprobado
        // 7-8.99 --> examen notable
        // 9-9.99 --> examen sobresaliente
        // 10 --> examen de matricula
        // de no serlo avisa
    }

    public static void calcularNota() {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Que nota has sacado");
        double nota = lecturaTeclado.nextDouble();

        if (nota >= 0 && nota <= 10) {
            // 0-10
            if (nota < 5) {
                System.out.println("Examen suspenso");
            } else if (nota < 7) {
                System.out.println("Examen aprobado");
            } else if (nota < 9) {
                System.out.println("Examen notable");
            } else if (nota < 10) {
                System.out.println("Examen sobresaliente");
            } else {
                System.out.println("MH");
            }
        } else {
            System.out.println("Nota no valida");
        }

    }

}


