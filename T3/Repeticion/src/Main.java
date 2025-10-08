import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // variable de control, la defino dentro del for
        // el final del recorrido
        // el incremento de la variable de control
        // rango actual: [0,9]
        // rango actual: [0,10)
        System.out.println("Rango incremental");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d-Ejecucion del for%n", i);
        }

        System.out.println("Rango decremental");
        for (int i = 10; i >= 0; i -= 5) {
            System.out.printf("%d-Ejecucion del for%n", i);
        }

        // la tabla de multiplicar del 7
        System.out.println("La tabla de multiplicar del 7 es ");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d*7=%d%n", i, 7 * i);
        }

        // las tablas de multiplicar del 0 al 10
        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.printf("\t%d * %d = %d%n", i, j, i * j);
            }
        }

        // pedir al usuario una frase por consola y contar cuantas vocales tiene

        String frase = "Esta frase es para poder analizarla"; // 14

        frase = frase.replaceAll(" ", "");
        frase = frase.toLowerCase();
        int numeroVocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            // si es la a, que me salte un aviso
            char letraActual = frase.charAt(i);
            if (letraActual == 'a' || letraActual == 'e'
                    || letraActual == 'i' || letraActual == 'u'
                    || letraActual == 'o') {
                numeroVocales++;
            }

        }

        System.out.println("El numero de vocales de la frases es " + numeroVocales);

        // pedir al usuario una frase y comprobar si es palindromo
        String frasePalindromo = "elli ves Sevilla";
        //allivessevilla
        frasePalindromo = frasePalindromo.toLowerCase()
                .replaceAll(" ", "");

        boolean esPalidromo = false;
        for (int i = 0; i < frasePalindromo.length() / 2; i++) {
            if (frasePalindromo.charAt(i) ==
                    frasePalindromo.charAt(frasePalindromo.length() - 1 - i)) {
                esPalidromo = true;
            } else {
                esPalidromo = false;
                System.out.println("La palabra no es palindromo");
                break;
            }
        }

        if (esPalidromo) {
            System.out.println("La palabra es palindromo");
        }

        // generar un numero aleatorio entre 1 y 1000 -> Math.random()*1001 -> el numero de la caja fuerte
        // pedir al usuario cuantos intentos tiene
        // pedir por consola n veces (intentos) el numero para ver si puedo abrir la cajo
        // en caso de abrirla poner un mensaje de: Caja abierta en X intentos
        // en caso de superer los intentos poner un mensaje de: caja bloqueada
        Scanner scanner = new Scanner(System.in);
        int numeroIntentos = 5;
        int numeroCaja = (int) (Math.random() * 1001);
        boolean bloqueada = false;
        int intentos = 0;
        int numeroUsuario = 0;

        for (int i = 0; i < numeroIntentos; i++) {

            intentos++;
            System.out.println("Por favor introduce el intento numero " + (i + 1));
            numeroUsuario = scanner.nextInt();
            if (numeroUsuario == numeroCaja) {
                System.out.printf("Enhorabuena,la caja queda abierta en %d intentos%n", numeroIntentos);
                break;
            } else {
                System.out.println("Vuelve a intentarlo de nuevo");
                if (numeroIntentos == intentos){
                    bloqueada = true;
                }
            }
        }

        if (bloqueada){
            System.out.println("La caja ha quedado bloqueada");
        }



    }


    // luz azul

    // Anita lava la tina
}
