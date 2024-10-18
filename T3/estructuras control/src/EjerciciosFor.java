import java.util.Scanner;

public class EjerciciosFor {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ejericio1();
        //ejercicio3();
        // ejercicio4();
        // ejercicio11();
        // ejercicio13();
        ejercicio16();
    }

    public static void ejericio1() {
        // Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
        // Obténgase la media con dos decimales de las temperaturas introducidas por consola.
        System.out.println("Cuantas temperaturas quieres introducir");
        int nTemperaturas = scanner.nextInt();
        int temperatura = 0;
        // acumulador
        int sumatorio = 0;
        double media = 0;
        // -5
        if (nTemperaturas <= 0) {
            nTemperaturas = 10;
        }

        for (int i = 0; i < nTemperaturas; i++) {
            System.out.println("Introduce temperatura");
            temperatura = scanner.nextInt();
            sumatorio += temperatura;
            media = sumatorio / nTemperaturas;
        }

        System.out.println("La suma de todas las temperaturas es: " + sumatorio);
        System.out.println("La media de todas las temperaturas es: " + (float) sumatorio / nTemperaturas);

    }

    public static void ejercicio3() {

        int numero = 8;
        for (int i = 0; i < 11; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (int j = 0; j < 11; j++) {
                // tabla de multiplicar de i
                System.out.printf("\t%d * %d=%d\n", i, j, i * j);
            }
        }

    }

    public static void ejercicio4() {

        System.out.println("Dime cual es el numero inicial");
        int numeroInicial = scanner.nextInt();
        System.out.println("Dime cual es el numero final");
        int numeroFinal = scanner.nextInt();

        if (numeroInicial >= numeroFinal) {
            System.out.println("No se puede proceder a la ejecucion");
        } else {
            for (int i = numeroInicial; i <= numeroFinal; i++) {
                System.out.println("Tabla de multiplicar del " + i);
                for (int j = 0; j < 11; j++) {
                    // tabla de multiplicar de i
                    System.out.printf("\t%d * %d=%d\n", i, j, i * j);
                }
            }
        }

    }

    public static void ejercicio5() {
        System.out.println("Dime la base");
        int base = scanner.nextInt();
        System.out.println("Dime el exponente");
        int exponente = scanner.nextInt();
        int resultado = 1;
        // cualquier cosa elevada a 0
        if (exponente == 0) {
            System.out.println("El resultado de la potencia es 1");
        } else if (base == 0) {
            System.out.println("No se calculan potencias con base 0");
        } else {
            for (int i = 0; i < exponente; i++) {
                // multiplicar tantas veces la base como diga el exponente
                resultado = resultado * base;
            }
            System.out.println("El resultado de la potencia es " + resultado);
        }


    }

    public static void ejercicio6() {
        // Mostrar todos los números pares comprendidos entre dos dados.
        System.out.println("Di desde que numero quieres calcular");
        int numeroIncial = scanner.nextInt();
        ;
        System.out.println("Di hasta que numero quieres calcular");
        int numeroFinal = scanner.nextInt();
        ;
        for (int i = numeroIncial; i <= numeroFinal; i++) {
            // preguntar si es o no par
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void ejercicio7() {
        // Simúlese el lanzamiento de un dado. Se introducirá el número de veces
        // que se lanza el dado (de no ser positivo, se establecerá a 100). (Dado)
        System.out.println("Cuantas veces quieres tirar el dado");
        int numeroVeces = scanner.nextInt();
        if (numeroVeces < 1) {
            System.out.println("No se pueden tirar veces negativas");
            numeroVeces = 100;
        }
        // 0 - 100
        for (int i = 1; i <= numeroVeces; i++) {
            int tirada = (int) (Math.random() * 6) + 1;
            System.out.printf("La tirada numero %d es %d\n", i, tirada);
        }
    }

    public static void ejercicio8() {
        // Pedir 10 números. Mostrar la media de los números positivos,
        // la media de los números negativos y la cantidad de ceros (NumerosTipos)
        int acumuladorPositivos = 0, acumuladorNegativos = 0, numeroCeros = 0, numeroPositivos = 0, numerosNegativos = 0;
        for (int i = 0; i < 10; i++) {
            // pedir 10 numeros
            System.out.println("Por favor introduce el numero que quieres");
            int numero = scanner.nextInt();
            if (numero < 0) {
                acumuladorNegativos += numero;
                numerosNegativos++;
            } else if (numero > 0) {
                acumuladorPositivos += numero;
                numeroPositivos++;
            } else {
                numeroCeros++;
            }
        }

        System.out.println("La media de positivos es " + ((float) acumuladorPositivos / numeroPositivos));
        System.out.println("La media de negativos es " + ((float) acumuladorNegativos / numerosNegativos));
        System.out.println("El numero de 0s es " + numeroCeros);
    }

    public static void ejercicio9() {
        // Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.(Sueldos)
        int sueldosMayores = 0, sumatorioSueldos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("introduce el sueldo");
            int sueldo = scanner.nextInt();
            if (sueldo > 1000) {
                sueldosMayores++;
            }
            sumatorioSueldos += sueldo;
        }
        System.out.println("El numero de sueldos mayores que 1000 son " + sueldosMayores);
        System.out.println("El sumatorio de todos los sueldos es " + sumatorioSueldos);
        System.out.println("La media de todos los sueldos es " + (float) sumatorioSueldos / 10);

    }

    public static void ejercicio10() {
        // Introduce  6 notas, escribir la cantidad de alumnos
        // aprobados,
        // condicionados (=4) y suspensos.(NotasTipos)
        int numeroSS = 0, numeroAP = 0, numeroCD = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce una nota");
            int nota = scanner.nextInt();
            if (nota >= 0 && nota <= 10) {
                if (nota > 4) {
                    numeroAP++;
                } else if (nota < 4) {
                    numeroSS++;
                } else {
                    numeroCD++;
                }
            } else {
                System.out.println("Nota invalida");
            }
        }

        System.out.println("El numero de AP es " + numeroAP);
        System.out.println("El numero de SS es " + numeroSS);
        System.out.println("El numero de CD es " + numeroCD);
    }

    public static void ejercicio11() {
        System.out.println("De que lado quieres el cuadrado");
        int lado = scanner.nextInt();
        for (int i = 0; i < lado; i++) {
            //System.out.println("\t+\t");
            for (int j = 0; j < lado; j++) {
                // primera fila o ultima
                if (i == 0 || i == lado - 1) {
                    System.out.print("\t+\t");
                }
                // primera columna o ultima
                else if (j == 0 || j == lado - 1) {
                    System.out.print("\t+\t");
                } else
                    System.out.print("\to\t");
            }
            System.out.println();
        }
    }

    public static void ejercicio13() {
        System.out.println("Dime de que palabra quieres sacar contraria");
        String palabra = scanner.next();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
    }

    public static void ejecicio14() {

        System.out.println("Dime de que palabra quieres comprobar si es palindromo");
        // String palabra = scanner.next();
        String palabra = "Ejecúción";
        // NO SE TIENEN EN CUENTA MAYUSCULAS NI ACENTOS
        palabra = palabra.toLowerCase().replaceAll("ó", "o")
                .replaceAll("á", "a")
                .replaceAll("í", "i")
                .replaceAll("ú", "u")
                .replaceAll("é", "e");
        String palabraInversa = "";

        /*for (int i = palabra.length()-1; i >=0 ; i--) {
            palabraInversa+=palabra.charAt(i);
        }

        if (palabra.equals(palabraInversa)){
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }*/

        boolean palindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                palindromo = false;
                break;
            }
        }
        // System.out.println("La palabra es palidromo: "+palindromo);
        if (palindromo) {
            System.out.println("Tu palabra es palindromo");
        } else {
            System.out.println("Tu palabra no es palindromo");
        }
    }

    public static void ejercicio15() {
        String frase = "Esta frase vale para poder aprender el for.Esta manera de trabajar me garantiza que entiendo " +
                "el problema.Que todo el mundo este atento. Esto es otra frase.";

        // numero de letras
        int numeroLetras = frase.length();
        // numero de letras sin espacios ni puntos
        int numeroLetrasSinCosas = frase.replaceAll(" ","").replaceAll("\\.","").length();
        // numero de palabras
        // numero de oraciones
        int numeroOraciones=0,numeroPalabras=0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)=='.'){
                numeroOraciones++;
            } else if (frase.charAt(i) == ' ') {
                numeroPalabras++;
            }
        }
        numeroPalabras+= (numeroOraciones-1);

        System.out.println("El numero de frases " +numeroOraciones);
        System.out.println("El numero de palbras "+numeroPalabras);
        System.out.println("El numero de letras "+numeroLetras);
        System.out.println("El numero de letras sin cosas "+numeroLetrasSinCosas);
    }

    public static void ejercicio16(){
        int aleatorio = (int) (Math.random() *30)+1;
        System.out.println(aleatorio);
        int intentos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor dime tu numero");
            int numeroUsuario = scanner.nextInt();
            intentos++;
            if (aleatorio == numeroUsuario){
                System.out.println("Enhorabuena has acertado");
                break;
            } else {
                System.out.println("Lo siento, intentalo de nuevo");
            }
        }
        System.out.println("El numero de intentos gastados es "+intentos);

    }

    public static void ejercicio17(){
        System.out.println("Dime de que numero quieres calcular el factorial");
        int numero = scanner.nextInt();
        int factorial = 1;
        if (numero<1){
            System.out.println("No puedo calcular su factorial");
        } else {
            for (int i = 1; i <=numero  ; i++) {
                factorial = factorial * i;
            }
            System.out.printf("El factorial del numero %d es %d", numero,factorial);
        }
    }
}
