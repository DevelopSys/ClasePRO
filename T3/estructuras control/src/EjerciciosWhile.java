import java.util.Scanner;

public class EjerciciosWhile {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio5y6();
    }

    public static void ejercicio1() {

        int numero;
        int sumaPositivos = 0;
        int numerosIntroducidos = 0;

        do {
            System.out.println("Introduce valor");
            numero = scanner.nextInt();
            numerosIntroducidos++;
            if (numero > 0) {
                sumaPositivos += numero;
            }
        } while (numero != 0);
        System.out.println("La suma de los positivos es " + sumaPositivos);
        System.out.println("Los intentos introducidos son  " + numerosIntroducidos);
    }

    public static void ejercicio3() {


        // Generar números enteros aleatorios entre 0 y 100
        int aleatorio, numeroMax = -1, numeroMin = 101;
        do {
            // Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0.
            aleatorio = (int) (Math.random() * 101); // (int)52,91
            // El programa mostrará cada uno de los datos generados
            System.out.println(aleatorio);
            // y obtendrá el mayor de los números generados. (MayorNumero)
            if (aleatorio > numeroMax) {
                numeroMax = aleatorio;
            }
            if (aleatorio < numeroMin) {
                numeroMin = aleatorio;
            }

        } while (aleatorio != 0);

        System.out.println("El numero mas grande es " + numeroMax);
        System.out.println("El numero mas paqueño es " + numeroMin);
    }

    public static void ejercicio5y6() {

        // Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y
        // lo guarde en una variable. El sistema irá pidiendo números al usuario hasta que
        // coincida con el aleatorio generado (en caso de no coincidir mostrará el mensaje
        // "Lo siento, intentalo de nuevo"). Cuando coincida el sistema deberá mostar el mensaje
        // "Enhorabuena, has acertado el número en 5 intentos" (Adivina)

        // una vez que termine el juego
        // pregunte si quiero repetirlo
        String repetir;

        do {
            int numeroGenerado = (int) (Math.random() * 21);
            System.out.println(numeroGenerado);
            int numeroUsuario = 0;
            int intentosUsuario = 0;
            int numeroIntentos = 10;
            int record = 11;
            // solo tengo 5 intentos
            do {
                System.out.println("Por favor introduce numero");
                numeroUsuario = scanner.nextInt();
                intentosUsuario++;
                numeroIntentos--;
                if (numeroGenerado == numeroUsuario) {
                    System.out.println("Enhorabuena, lo has acertado");
                } else {
                    System.out.println("Lo siento, has fallado, intenta de nuevo");
                }
            } while (numeroGenerado != numeroUsuario && numeroIntentos > 0);

            System.out.println("Quieres volver a jugar (S/N");
            repetir = scanner.next();
        } while (repetir.equalsIgnoreCase("s"));


    }
}
