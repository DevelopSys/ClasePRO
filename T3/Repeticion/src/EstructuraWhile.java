import java.util.Scanner;

public class EstructuraWhile {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);
        int contadorPares = 0, contadorImpares = 0, contadorNumero = 0, sumatorio = 0;
        int numeroLeido = 0;
        double media;

        while (numeroLeido >= 0) {
        System.out.println("Introduce numero");
        numeroLeido = lectorTeclado.nextInt();
            if (numeroLeido >= 0) {
                sumatorio += numeroLeido;
                contadorNumero++;
                if (numeroLeido % 2 == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
            }

        }
        media = (double) sumatorio / contadorNumero;
        System.out.println("El numero de positivos leidos es " + contadorNumero);
        System.out.println("El numero de pares leidos es " + contadorPares);
        System.out.println("El numero de impares leidos es " + contadorImpares);
        System.out.println("El numero sumario es " + sumatorio);
        System.out.println("El numero medio es " + media);


        /*System.out.println("Cuantas veces quieres ejecutar");
        int numero = lectorTeclado.nextInt();
        boolean condicion = true;
        while (numero>0){
            // cuerpo de repeticion
            System.out.println("Repitiendo el bucle while");
            numero--; // numero = numero-1
            int numeroInterno;
        }*/

        // Realizar una lectura por teclado de numeros
        // Se leeran numeros hasta que el usuario introduzca un negativo

        // una vez introducido el negativo el sistema mostrara:
        // cuantos positivos he metido
        // cuantos negativos he metido -> SOBRA
        // cuantos pares
        // cuantos impares
        // la suma de todos los numeros
        // la media de numeros introducidos
    }
}
