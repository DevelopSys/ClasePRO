package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {

    /*
     * Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una variable.
     * El sistema irá pidiendo números al usuario hasta que coincida con el aleatorio generado (en caso de no coincidir
     * mostrará el mensaje "Lo siento, intentalo de nuevo"). Cuando coincida el sistema deberá mostar el mensaje
     * "Enhorabuena, has acertado el número en 5 intentos"
     * */

    /*Modifica el ejercicio anterior para que una vez adivinado el número el sistema muestre el siguiente mensaje:
    "Quieres volver a jugar (S/N)":
            - En caso de introducir N la aplicación se detendrá
            - En caso de introducir S la aplicación empezará de nuevo
            (generando un aleatorio, pidiendo números hasta acertar el generado, etc...)
            Cuando el usuario acierte el número generado se mostrará un mensaje diciendo si ha superado el record
            de intentos (si ha hecho menos intentos que las veces anteriores) (AdivinaRecord)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String repetir = "S";
        int record = 10000;
        do {
            int intentos = 0;
            int numero;
            int aleatorio = (int) (Math.random() * 21);
            System.out.println(aleatorio);
            do {
                System.out.println("Introduce numero");
                numero = scanner.nextInt();
                if (numero != aleatorio) {
                    System.out.println("Intentalo de nuevo");
                }
                intentos++;
            } while (numero != aleatorio);
            System.out.printf("Enhorabuena, has acertado el número en %d intentos\n", intentos);
            if (intentos < record) {
                System.out.println("Has superado el record");
                record = intentos;
            }

            System.out.println("Quieres volver a jugar (S/N)");
            repetir = scanner.next();

        } while (repetir.toLowerCase().equals("s"));


    }
}
