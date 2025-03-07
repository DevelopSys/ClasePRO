import utils.TelefonoException;

import java.io.IOException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args)  {
        /*Scanner scanner = new Scanner(System.in);
        String[] cosas = new String[]{"Dato1", "Dato2", "Dato3"};
        int numero1 = 2;
        int numero2 = 0;
        String nombre;
        System.out.println("A que posicion quieres acceder");
        int posicion = scanner.nextInt();

        try {
            System.out.println(cosas[posicion]);
            int resultado = numero1/numero2;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El size es mas pequeño que la posicion indicada");
        } catch (ArithmeticException e){
            System.out.println("Error en la division entre 0");
        } finally {
            System.out.println("Terminando proceso");
        }

        System.out.println("Terminando el programa");

        // System.out.println("El numero de letras de tu nombre es "+nombre.length());*/
        Operaciones operaciones = new Operaciones();
        try {
            operaciones.crearFichero("ejemplo.txt");
            operaciones.lanzarExcepcion("error",12345678);
        } catch (IOException e) {
            System.out.println("Error en la creacion del fichero");
        } catch (TelefonoException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Terminando la ejecicion");
        /*try {
            operaciones.divisionEntre0(8);
        } catch (ArithmeticException e) {
            System.out.println("Error en la ejecucion del metodo");
        }*/
    }
}
