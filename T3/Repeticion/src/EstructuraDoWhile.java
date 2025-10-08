import java.util.Scanner;

public class EstructuraDoWhile {

    public static void main(String[] args) {
        Scanner lectorNumero = new Scanner(System.in);
        /*int numeroLeido;
        do {
            System.out.println("Introduce numero");
            numeroLeido = lectorNumero.nextInt();
            System.out.println("Ejecutando cosas del do");
        } while (numeroLeido != -1);*/
        // realizar un programa que pida al usuario palaras por teclaro
        // el usuario deberá introoducir tantas palabras como el sistema
        // permita. El sistema parara de pedir de palabras
        // cuando el usuario introduzca una palabra con 10 letras
        /*String palabra;
        do {
            System.out.println("Introduce la palabra");
            palabra = lectorNumero.next();
        } while (palabra.length() != 10);
        System.out.println("Terminando el programa");*/
        // declarar una variable con la palabra secreta = "programacion"
        // pide al usuario palabras por teclaro
        // el usuario tiene 5 intentos para abrir la caja
        // la caja se abre cuando he acertado la palabra secreta en menos de 5 intentos
        // si lo hago en 6 inentos, aparece el mensaje de caja bloqueada
        // si lo hago en <= 5 intentos, aparece el mensaje de caja abierta

        String palabraSecreta = "programacion";
        String palabraUsuario;
        int intentos=0;
        do{
            System.out.println("Indica la clave a introducir");
            palabraUsuario = lectorNumero.next();
            intentos++;
            if (palabraUsuario.equalsIgnoreCase(palabraSecreta)){
                System.out.println("Palabra acerta, has abierto la caja");
                break;
            }
            if (intentos==5){
                System.out.println("Caja bloqueada");
            }
        }while (intentos<5);

        System.out.println("Terminando programa de palabra secreta");
    }
}
