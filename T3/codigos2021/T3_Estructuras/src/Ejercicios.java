import java.util.Scanner;

public class Ejercicios {

    Scanner teclado;
    int numero;

    public static void main(String[] args) {


        /*
         * Pedir por teclado un entero y guardarlo en una variable llamada a.
         * Comprobar si “a” es par. De serlo, se almacena en la cadena “s” el texto “Es par”.
         * Al final del bloque mostrar el mensaje por pantalla
         * */
        /*
         * Pedir por teclado un entero y guardarlo en una variable llamada a.
         * Comprobar si “a” es par o menor que 10 o menor que 100.
         * De ser par, se incrementa en una unidad “a”;
         * de no ser par, si es menor que 10, se decrementa “a” en una unidad;
         * de no ser par, ni ser menor que 10, si es menor que 100,
         * se duplica el valor de “a” y se incrementa en una unidad;
         * de no ser par, ni menor que 10, ni menor que 100,
         * entonces se le asigna a “a” el valor de 0.
         *  Al final del bloque mostrar el valor de la por pantalla
         * */
        /*
         * Pedir por teclado un entero y guardarlo en una variable llamada a.
         * Comprobar los siguientes casos:
         * 1. Si es menor que 0 imprimir el mensaje "negativo"
         * 2. Si es menor que 10 imprimir el mensaje "un dígito"
         * 3. Si es menor que 99 imprimir el mensaje "dos dígitos"
         * 4. Si es mayor que 99 imprimir el mensaje "tres dígitos"
         * */


        // new Ejercicios().ejercicio1();
    }

    public void ejercicio1() {
        teclado = new Scanner(System.in);
        String palabra = "Es impar";
        System.out.println("Introduce número:");
        numero = teclado.nextInt();
        if (numero % 2 == 0) {
            // ejecuto
            palabra = "Es par";
        }

        System.out.println(palabra);
    }

    public void ejercicio2() {
        System.out.println("Introduce número");
        numero = teclado.nextInt();
        if (numero % 2 == 0) {
            numero++;
        } else {
            if (numero < 10) {
                numero--;
            } else if (numero > 10 && numero < 100) {
                numero *= 2;
                numero++;
            } else {
                numero = 0;
            }
        }

        System.out.printf("El valor de número es %d", numero);
    }

    public void ejercicio3() {

        System.out.println("Introduce número");
        numero = teclado.nextInt();
        if (numero > 99) {
            System.out.println("tres dígitos o más");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("dos dígitos");
        } else if (numero >= 0 && numero < 10) {
            System.out.println("un dígito");
        } else {
            System.out.println("negativo");
        }
    }
}
