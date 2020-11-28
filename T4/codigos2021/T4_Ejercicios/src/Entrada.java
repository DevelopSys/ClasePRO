import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        new Entrada().menuAlumnos();
        //menuAlumnos();
    }

    public void ejercicio1() {

        //(LlenarArrays) Crear un array de int que tenga 5 posiciones
        // y rellenarla con números aleatorios del 10 al 50. Mostrar
        // por pantalla todos los números generados.

        Scanner teclado = new Scanner(System.in);
        int numerosTotal = teclado.nextInt();
        int[] numeros = new int[numerosTotal];
        for (int i = 0; i < numerosTotal; i++) {
            numeros[i] = (int) (Math.random() * 41) + 10;
            System.out.println(numeros[i]);

        }
    }

    public void ejercicio2() {

        //String[] temario = new String[10];
        String[] temario = {"Tema 1: Introducción"
                , "Tema 2: Identificadores", "Tema 3: Estructuras"
                , "Tema 4: Colecciones", "Tema 5: Orientación a objetos"
                , "Tema 6: Clases y Objetos", "Tema 7; Abstracción"
                , "Tema 8: Herencia y Polimorfismo"
                , "Tema 9: Ficheros y Excepciones"
                , "Tema 10: Bases de datos", "Tema 11: Interfaces"};

        System.out.println("Numero de temas: " + temario.length);
        for (int i = 0; i < temario.length; i++) {
            System.out.println(temario[i]);
        }

    }

    public void ejercicio3() {
        /*
        * (MultiplicarArray) Crear un array de 5 posiciones:

se le pedirá al usuario que introduzca cada unos de los elementos del array
Multiplica cada elemento del array * 2 y vuelve a guardar su valor
Saca por consola la suma de todos los números
Saca la media de todos los elementos
        * */
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        // rellenar
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros[i] = numeroIntro;
        }

        // modificar
        for (int i = 0; i < numeros.length; i++) {
            int multiplicacion = numeros[i] * 2;
            numeros[i] *= 2;
        }

        // mostrarlos
        int sumatorio = 0;
        for (int item : numeros) {
            System.out.println(item);
            sumatorio += item;
        }


        System.out.println(sumatorio);
        System.out.printf("La media de los números generados es: %.2f%n"
                , ((double) sumatorio / (double) numeros.length));


    }

    public void ejercicio4() {
        Scanner teclado = new Scanner(System.in);
        int longitud, maximo = -99999, minimo = 99999;
        int[] numeros;
        System.out.println("Introduce la longitud");
        longitud = teclado.nextInt();
        numeros = new int[longitud];
        // rellenar
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros[i] = numeroIntro;

            /*if (numeros[i]>maximo) {
                maximo = numeros[i];
            }
            if(numeros[i]<minimo){
                minimo = numeros[i];
            }*/
        }
        // 1,23,3123,13,124,234,53,56,4567,58,678,97987564,354,213;
        // comprobar
        for (int item : numeros) {
            if (item > maximo) {
                maximo = item;
            }
            if (item < minimo) {
                minimo = item;
            }
        }
        System.out.println("El máximo es :" + maximo);
        System.out.println("El mínimo es :" + minimo);
    }

    public void ejercicio5() {
        /*
        *pida la longitud de dos arrays de enteros
crea los array de enteros con las longitudes introducidas
crea un tercer array de la misma longitud que los dos anteriores
rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)
        * */

        // 6
        // 1,2,5,8,9,0 --> Array1
        // 4,6,9,9,2,1 --> Array2
        // 5,8,14,17,11,1 --> Array3
        Scanner teclado = new Scanner(System.in);
        int longitud;
        int[] numeros1, numeros2;
        System.out.println("Introduce la longitud");
        longitud = teclado.nextInt();
        numeros1 = new int[longitud];
        numeros2 = new int[longitud];
        // rellenar
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros1[i] = numeroIntro;
        }
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Introduce teclado");
            int numeroIntro = teclado.nextInt();
            numeros2[i] = numeroIntro;
        }

        int[] arraySuma = new int[longitud];
        // relleno el array de suma
        for (int i = 0; i < longitud; i++) {
            arraySuma[i] = numeros1[i] + numeros2[i];
        }
        for (int item : arraySuma) {
            System.out.println(item);
        }

    }

    public void ejercicio6() {

        int[] numeros = {1, 2, 3, 4, 5};
        // {5,1,2,3,4}
        // aux = 5
        // {5,1,2,3,4}

        int aux = numeros[numeros.length - 1];
        // aux = 5

        // desde 4 hasta 1

        // i = 4
        // numeros[4] = numeros[3]
        // i = 3
        // numeros[3] = numeros[2]
        // i = 2
        // numeros[2] = numeros[1]
        // i = 1
        // numeros[1] = numeros[0]
        // i = 0
        // numeros[0] = numeros[4]

        for (int i = numeros.length - 1; i >= 0; i--) {
            if (i == 0) {
                //numeros[i]=numeros[numeros.length - 1];
                numeros[i] = aux;
            } else {
                numeros[i] = numeros[i - 1];
            }
        }
        //numeros[0] = aux;

        for (int item : numeros) {
            System.out.print(item);
        }

        System.out.println("Nueva rotación");
        int aux1 = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                //numeros[i]=numeros[numeros.length - 1];
                numeros[i] = aux1;
            } else {
                numeros[i] = numeros[i + 1];
            }
        }


        for (int item : numeros) {
            System.out.print(item);
        }

    }

    public void ejercicio7() {

        Scanner teclado = new Scanner(System.in);
        int longitud;
        int[] numeros;
        System.out.println("Introduce longitud del array");
        longitud = teclado.nextInt();
        numeros = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = (int) (Math.random() * 10);
            numeros[i] = aleatorio;
            //System.out.println(aleatorio);
        }

        new Entrada().imprimirArray(numeros);
        // +- 1
        System.out.println();
        System.out.println("Sumo uno a los pares y resto uno a los impares ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] = numeros[i] + 1;
            } else {
                numeros[i] = numeros[i] - 1;
            }
        }

        new Entrada().imprimirArray(numeros);

        // Duplicar valores menores que 5
        System.out.println("Duplico valores menores que 5");
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 5 && numeros[i] > 0) {
                numeros[i] = numeros[i] * 2;
            }
        }

        new Entrada().imprimirArray(numeros);
        // Sumo +- 5 a todos
        System.out.println("Sumo más menos 5");
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = (int) (Math.random() * 11) - 5;
            numeros[i] = numeros[i] + aleatorio;
        }

        new Entrada().imprimirArray(numeros);

        // Desplazo
        System.out.println("Desplazo a un lado");
        int aux1 = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                //numeros[i]=numeros[numeros.length - 1];
                numeros[i] = aux1;
            } else {
                numeros[i] = numeros[i + 1];
            }
        }

        new Entrada().imprimirArray(numeros);

        // Roto
        // {1,2,3,4,5,6,7,8,9,10} --> 10 PAR
        // {1,2,3,4,5,6,7,8,9,10,11} --> 11 PAR
        System.out.println("Roto entre parejas");
        boolean sePuede = false;

        if (longitud % 2 == 0) {
            sePuede = true;
            for (int i = 0; i < numeros.length; i++) {
                int aux = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = aux;
                i++;
                // i++
            }
        }


        if (sePuede) {
            new Entrada().imprimirArray(numeros);

        } else {
            System.out.println("No se puede");
        }

        // Inversión
        System.out.println("Invierto");
        for (int i = 0; i < numeros.length / 2; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = aux;
        }

        new Entrada().imprimirArray(numeros);
    }

    public void ejercicio8() {
        String frase = "hola que tal estas yo muy bien";
        String[] palabras = frase.split(" ");
        String palabraMax = palabras[palabras.length - 1], palabraMin = palabras[palabras.length - 1];
        //palabras --> {"hola","que","tal","estas","yo","muy","bien"};
        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() > palabraMax.length()) {
                palabraMax = palabras[i];
            }
            if (palabras[i].length() < palabraMin.length()) {
                palabraMin = palabras[i];
            }
            if (palabras[i].length() == 3) {
                System.out.println(palabras[i]);
            }
        }

        System.out.println("Más grande:" + palabraMax);
        System.out.println("Más pequeña:" + palabraMin);


    }

    public void ejercicio9() {
        Scanner teclado = new Scanner(System.in);
        int longitud;
        String[] palabrasGeneradas;
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        System.out.println("Cuantas palabras quieres generar");
        longitud = teclado.nextInt();
        palabrasGeneradas = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            System.out.println("Longitud de la palabra");
            int longitudPalabra = teclado.nextInt();
            String palabra = "";
            for (int j = 0; j < longitudPalabra; j++) {
                // genero la palabra aleatoria
                int aleatorio = (int) (Math.random() * letras.length);
                char letraAleatoria = letras[aleatorio];
                palabra = palabra + letraAleatoria;
                //System.out.println(palabra);
                palabrasGeneradas[i] = palabra;
            }
        }

        for (String item : palabrasGeneradas) {
            System.out.println("La palabra generada es: " + item);
        }

    }

    public void ejercicio10() {
        // crear un programa que simule el funcionamiento del euromillon. PAra ello se
        // generarán 5 aleatorios y se guardan en una variable.
        // el sistema pedirá que introduzca los numeros con los que juego
        // PREMIOS; 1 acertado (10) 2 acertados (100) 3 acertados(1000)
        // 4 acertados (10000) 5 acertados (100000)

        Scanner teclado = new Scanner(System.in);
        int[] boletoLoteria = new int[5];
        int[] boletoMio = new int[5];
        int aciertos = 0;

        for (int i = 0; i < boletoLoteria.length; i++) {
            int numero = (int) (Math.random() * 10);
            boletoLoteria[i] = numero;
            System.out.println("Introduce un numero de tu boleto");
            int numeroMio = teclado.nextInt();
            boletoMio[i] = numeroMio;
            if (numero == numeroMio) {
                aciertos++;
            }
        }


        /*for (int i = 0; i < boletoLoteria.length; i++) {
            int numero = (int) (Math.random() * 10);
            boletoLoteria[i] = numero;
        }
        imprimirArray(boletoLoteria);
        for (int i = 0; i < boletoMio.length; i++) {
            System.out.println("Introduce un numero de tu boleto");
            int numero = teclado.nextInt();
            boletoMio[i] = numero;
        }

        imprimirArray(boletoMio);
        // 1,9,3,6,4 --> juego
        // 1,5,3,7,8 --> mio

        for (int i = 0; i < boletoLoteria.length; i++) {
            if (boletoLoteria[i] == boletoMio[i]) {
                aciertos++;
            }
        }*/

        // cuantas veces has acertado
        switch (aciertos) {

            case 0:
                System.out.println("No has acertado ninguno");
                break;
            case 1:
                System.out.println("Has ganado 10 euros");
                break;
            case 2:
                System.out.println("Has ganado 100 euros");
                break;
            case 3:
                System.out.println("Has ganado 1000 euros");
                break;
            case 4:
                System.out.println("Has ganado 10000 euros");
                break;
            case 5:
                System.out.println("Has ganado 100000 euros");
                break;
        }


    }

    public void ejercicio10Modificado() {

        // 2347
        // 4325

        Scanner teclado = new Scanner(System.in);
        int numeroLoteria = (int) (Math.random() * 1001);
        int numero;
        System.out.println("Con que numero quieres jugar");
        numero = teclado.nextInt();

        System.out.println(numeroLoteria);
        System.out.println(numero);
        int aciertos = 0;

        String numeroLoteriaComparar = String.valueOf(numeroLoteria);
        String numeroComparar = String.valueOf(numero);

        // 349
        // 193

        if (numeroComparar.charAt(numeroComparar.length() - 1)
                == numeroLoteriaComparar.charAt(numeroLoteriaComparar.length() - 1)) {
            aciertos++;
            if (numeroComparar.charAt(numeroComparar.length() - 2)
                    == numeroLoteriaComparar.charAt(numeroLoteriaComparar.length() - 2)) {
                aciertos++;
                if (numeroComparar.charAt(numeroComparar.length() - 3)
                        == numeroLoteriaComparar.charAt(numeroLoteriaComparar.length() - 3)) {
                    aciertos++;
                }
            }

        } else {
            System.out.println("No has acertado nada");
        }

        for (int i = 0; i < numeroLoteriaComparar.length(); i++) {
            if (numeroLoteriaComparar.charAt(i) == numeroComparar.charAt(i)) {
                aciertos++;
            }
        }

        switch (aciertos) {

        }


    }

    public void ejercicio11() {

        Scanner teclado = new Scanner(System.in);
        String palabraJugar;
        String letra;
        int vidas = 3;
        String[] palabras = {"patata", "programacion", "sistemas", "pelicula"};
        int aleatorio = (int) (Math.random() * palabras.length); // 0-3
        palabraJugar = palabras[aleatorio];
        String[] letrasPalabra = palabraJugar.split("");
        String[] acertadas = new String[letrasPalabra.length];

        do {

            System.out.println("Introduce una letra");
            letra = teclado.next();
            System.out.println(letra);
            // p
            // _ _ _ _ _ _ _

            for (int i = 0; i < letrasPalabra.length; i++) {

                //System.out.print(" _ ");
                if (letrasPalabra[i].equals(letra)) {
                    System.out.printf(" %s ", letra);
                    acertadas[i] = letra;
                } else {
                    boolean esta = false;
                    for (int j = 0; j < acertadas.length; j++) {
                        if (letrasPalabra[i].equals(acertadas[j])) {
                            esta = true;
                            break;
                        }
                    }
                    if (esta) {

                    } else {

                    }
                    // rutura de ejecucion;
                }
            }
            //vidas--;
            System.out.println();
        } while (vidas > 0);


    }

    public void ejercicio12() {
        String[] bombo1 = {"Barcelona", "PSG", "Bayern", "Manchester City",
                "Juventus", "RB Leizpzig", "Valencia", "Liverpool"};
        String[] bombo2 = {"Real Madrid", "Tottenham", "Nápoles", "B. Dortmund",
                "O. Lyon", "Chelsea", "Atalanta", "Atético de Madrid"};
        boolean existe = false;
        int[] sacados = new int[bombo1.length];

        do {
            int aleatorio1 = (int) (Math.random() * bombo1.length);
            for (int i = 0; i < sacados.length; i++) {
                if (sacados[i] == aleatorio1) {
                    existe = true;
                }
            }
            System.out.println(bombo1[aleatorio1]);
        } while (existe);
    }

    public void ejercicio14() {

        Scanner teclado = new Scanner(System.in);
        int filas = 0, columnas = 0;
        int[][] numeros;
        do {
            System.out.println("Cuantas filas");
            filas = teclado.nextInt();
            System.out.println("Cuantas columnas");
            columnas = teclado.nextInt();
        } while (filas < 1 || columnas < 1);
        numeros = new int[filas][columnas];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 101);
            }
        }

        int contandor = 0;
        for (int[] fila : numeros) {
            for (int numero : fila) {
                System.out.printf("%d ", numero);
            }
            System.out.println();
            if (contandor != numeros.length - 1) {
                System.out.println("**************");
            }
            contandor++;
        }
    }

    // realizar un programa que realiza la traduccion entre palabras
    /*
    {{"hola","hello","asdasd"},{"hola","hello","asdasd"}
    ,{"hola","hello","asdasd"},{"hola","hello","asdasd"}}

    dime palabra a traducir: hola
    en ingles es: hello
    en aleman es: sadasd
    en finlandes es: asdasd


     */

    public void traductor() {
        String[][] diccionario = {
                {"hola", "hola_ingles", "hola_frances", "hola_aleman"},
                {"adios", "adios_ingles", "adios_frances", "adios_aleman"},
                {"comer", "comer_ingles", "comer_frances", "comer_aleman"}
        };

        // sacar todas las palabras originaleS???

        /*for (int i = 0; i < diccionario.length ; i++) {
            System.out.println(diccionario[i][3]);
        }*/

        // saber si la palabra hola está entre las originales
        // y si está sacar sus traducciones

        Scanner teclado = new Scanner(System.in);
        System.out.println("Que palabra quieres traducir");
        String palabra = teclado.next();
        int contador = 0;
        boolean esta = false;

        for (int i = 0; i < diccionario.length; i++) {
            if (diccionario[i][0].equals(palabra)) {
                System.out.println(diccionario[i][0]);
                System.out.println("Y sus traducciones son");
                for (int j = 1; j < diccionario[i].length; j++) {
                    System.out.println(diccionario[i][j]);
                }
                esta = true;
                break;
            }

        }

        if (!esta) {
            System.out.println("La palabra no está");
        }


        if (!palabra.equals("asdasd")) {

        }
    }

    public void menuAlumnos() {

        Scanner teclado = new Scanner(System.in);
        Object[][] alumnos = null;
        int contadorAlumno = 0;
        int opcion = 0;

        do {

            System.out.println("1- Indicar número alumnos");
            System.out.println("2- Registrar alumnos");
            System.out.println("3- Media de todos los alumnos");
            System.out.println("4- Ver datos alumno");
            System.out.println("5- Media asignatura 1");
            System.out.println("6- Media asignatura 2");
            System.out.println("7- Media asignatura 3");
            System.out.println("8- Salir");
            System.out.println("Introduce una opción");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    if (alumnos != null) {
                        System.out.println("La coleccion ya está inicializada");
                    } else {
                        System.out.println("Cuantos alumnos quieres registrar");
                        int numeroAlumnos = teclado.nextInt();
                        if (numeroAlumnos < 1) {
                            System.out.println("No es posible");
                        } else {
                            alumnos = new Object[numeroAlumnos][4];
                            listarArrayMulti(alumnos);
                        }
                    }
                    break;

                case 2:

                    if (alumnos == null) {
                        System.out.println("No has iniciado la coleccion");
                    }
                    else {
                        if (contadorAlumno < alumnos.length) {
                            String nombre;
                            double nota1, nota2, nota3;
                            System.out.println("Dime el nombre del alumno");
                            nombre = teclado.next();
                            System.out.println("Dime la nota1 del alumno");
                            nota1 = teclado.nextDouble();
                            System.out.println("Dime la nota2 del alumno");
                            nota2 = teclado.nextDouble();
                            System.out.println("Dime la nota3 del alumno");
                            nota3 = teclado.nextDouble();
                            alumnos[contadorAlumno][0] = nombre;
                            alumnos[contadorAlumno][1] = nota1;
                            alumnos[contadorAlumno][2] = nota2;
                            alumnos[contadorAlumno][3] = nota3;
                            contadorAlumno++;
                            listarArrayMulti(alumnos);
                        } else {
                            System.out.println("no hay espacio para el alumno");
                        }
                    }

                    break;
                case 3:

                    if (alumnos== null){
                        System.out.println("No puedo sacar medias");
                    } else {
                        //[["borja",1,3,4],["borja",1,3,4],[null],[null]]
                        double media;

                        for (int i = 0; i < alumnos.length; i++) {
                            System.out.println("Alumno");
                            media=0.0;
                            for (int j = 1; j < alumnos[i].length; j++) {
                                media = media + (double)alumnos[i][j];
                            }
                            System.out.printf("la media del alumno es %.2f %n",media/3);
                        }

                    }

                    break;

            }

        } while (opcion != 8);

    }

    public void listarArrayMulti(Object[][] array) {

        for (Object[] elemento : array) {
            System.out.println("Elemento");
            for (Object item : elemento) {
                System.out.println(item);
            }
            System.out.println();
        }

    }

    public void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.printf("%d, ", array[i]);
            }
        }
    }
}
