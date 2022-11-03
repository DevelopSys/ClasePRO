import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        //creacionArrays();
        //accesoArray();
        //modificarArray();
        //busquedaArray();
        //accesoArrayPalabras();
        //ejercicioUnoArrays();
        //ejercicioDosArrays();
        //ejercicioTresArrays();
        ejercicioCuatroArrays();
    }

    private static void ejercicioCuatroArrays() {
        /*
        4.- Realiza una aplicacion que simule el funcionamiento de la primitiva
            - La primitiva es unjuego donde el usuario dice cuales son los 5 numeros
            con los que juega [5,34,78,65,86] --> los numeros estan 0-99. En el caso
            de introducir un numero no en rango el sistema pedirá otro [1,6,90,76,98]
            Una vez metidos todos los números el sistema muestra el cupon
            1: 5
            2: 34
            3: 78
            4: 65
            5: 86
            El sistema genera 5 numeros premiados[6,67,23,65,5]
            El sistema evalua cual es el premio que me ha tocado:
            - 0 acuertos: 0
            - 1 acierto:  10
            - 2 aciertos: 100
            - 3 aciertos: 1000
            - 4 aciertos: 10000
            - 5 aciertos: 100000
         */
    }

    private static void busquedaArray() {
        String[] palabras = new String[]{"hola", "adios", "estoy"
                , "en", "clase", "programacion", "java", "la" ,"arrays"};

        /*for ( String item : palabras ) {
            System.out.println(item);
        }*/

        // buscar la/las palabra/s que tiene/n 2 letras
        // ¿cuantas palabras de 2 letras tengo?
        // en el momento que se encuente una, no quiero continuar la busqueda
        // el sistema dirá en que posición está la palabra

        int contador=0;
        int contadorPosicion=0;

        for ( String item : palabras ) {
            if (item.length() == 2){
                System.out.println(item);
                contador++;
                contadorPosicion++;
                break;
            }
            contadorPosicion++;
        }

        System.out.println("El numero de palabras es "+contador);
        System.out.println("El numero de palabras es "+contador);


    }

    private static void ejercicioTresArrays() {
        /*
         * 3. Crear una aplicacion que me pida cuantos numeros quiero introducir
         *       "Cuantos numeros quieres introducir" = 3
         *       introduce el 1 numero = 9
         *       introduce el 2 numero = 4
         *       introduce el 3 numero = 6
         *     introducir el número de números dicho y guardarlos en un array
         *     sacar por consola todos los numeros introducidos
         *     9,4,6
         * */

        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroNumeros;
        System.out.println("Cuantos mumeros quieres introducir");
        numeroNumeros = lecturaTeclado.nextInt();
        int[] numerosIntroducidos = new int[numeroNumeros];
        // 5 --> [6 5 3 8 9]

        for (int i = 0; i < numeroNumeros; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numerosIntroducidos[i] = lecturaTeclado.nextInt();
        }

        for (int item : numerosIntroducidos) {
            System.out.println(item);
        }

    }

    private static void modificarArray() {
        int[] numeros = new int[10];
        // System.out.println(numeros[9]); // 0
        // System.out.println(numeros[2]); // 0
        numeros[9] = 10;
        numeros[2] = 4;
        numeros[0] = 1;
        numeros[1] = 1;
        numeros[3] = 5;
        numeros[numeros.length / 2] = 5;
        for (int item : numeros) {
            System.out.println(item);
        }
    }

    private static void ejercicioUnoArrays() {
        /*
        1.- Crea un array de 10 numeros con los valores que quieras
            Sacar el sumatorio de todos los numeros
            Sacar la media de los numeros
            Sacar el numero más grande
            Sacar el número más pequeño
         */

        int[] numerosEjercicio = new int[]{123, 23, 43, 1, 65, 89, 8, 32, 34, 5, 75, 2, 4};

        int sumatorio = 0;
        int max = -9999;
        int min = 9999;
        double media = 0.0;
        /*for (int i = 0; i < numerosEjercicio.length; i++) {
            sumatorio += numerosEjercicio[i];
            if (numerosEjercicio[i] > max) {
                max = numerosEjercicio[i];
            }
            if (numerosEjercicio[i] < min) {
                min = numerosEjercicio[i];
            }
        }*/

        for (int item : numerosEjercicio) {
            sumatorio += item;
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
        }

        media = (double) sumatorio / numerosEjercicio.length;
        System.out.println("Sumatorio " + sumatorio);
        System.out.println("Maximo " + max);
        System.out.println("Minimo " + min);
        System.out.println("Media " + media);

    }

    private static void ejercicioDosArrays() {
        /*
        2. Crear un array con las letras del abecedario
            Sacar 5 palabras aleatorias de 5 letras
            palabra1 = SHJKF
            palabra2 = ARTYU
            palabra3 = GHJIR
         */

        String palabraUno = generarPalabra();
        String palabraDos = generarPalabra();
        String palabraTres = generarPalabra();
        String palabraCuatro = generarPalabra();
        String palabraCinco = generarPalabra();
    }

    private static String generarPalabra() {

        char[] letras = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Y', 'Z'};

        String palabraGenerada = "";

        for (int i = 0; i < 5; i++) {
            int aleatorio = (int) (Math.random() * letras.length);
            char letra = letras[aleatorio];
            palabraGenerada += letra;
        }

        return palabraGenerada;
    }


    private static void accesoArrayPalabras() {
        String[] palabras = new String[]{"palabraUno", "palabraDos", "palabraTres"};
        //System.out.println(palabras[1].length());
        // inicio ; fin ; incremento
        /*for (int i = 0; i < palabras.length/2; i++) {
            System.out.println(palabras[i]);
        }*/
        for (String element : palabras) {
            System.out.println(element.length());
        }


    }

    private static void accesoArray() {
        int[] numeros = new int[]{3, 6, 324, 2123, 5436, 745534, 123, 123, 123, 123, 12, 3334234, 5345, 3};
        //System.out.println(numeros.length);
        //int lecturaPosicion = numeros[numeros.length-1];
        //System.out.println(lecturaPosicion);
        for (int i = numeros.length - 1; i >= 0; i--) {
            /*if (i%2==0){
                System.out.println(numeros[i]);
            }*/
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

    }

    private static void creacionArrays() {
        // array de numeros
        int[] numeros = new int[10];
        // 0 0 0 0 0 0 0 0 0 0
        int[] numerosIniciados = new int[]{1, 2, 3, 4, 5, 6};
        // 1 2 3 4 5 6
        boolean[] booleanos = new boolean[5];
        // false false false false false
        boolean[] booleanosIniciados = new boolean[]{true, false, true};
        // true false true
        String[] palabras = new String[5];
        // null null null null null
        String[] palabrasIniciadas = new String[]{"uno", "dos", "tres"};
        // uno dos tres
        Object[] elementosGenericos = new Object[]{1, false, "palabra", 'A', 0.0};


    }
}
