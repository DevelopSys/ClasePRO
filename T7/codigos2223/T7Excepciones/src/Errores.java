import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Errores {

    private void operar(int op1, int op2) {
        double division = (double) op1 / op2;
        System.out.println(division);
    }

    private void accesoArray() throws ArrayIndexOutOfBoundsException {
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numeros[19]);
    }

    public void recepcionDatos() throws InputMismatchException {
        System.out.println("Introduce datos");
        // int = "asd"

        int edad = new Scanner(System.in).nextInt();
        System.out.println("El nombre introducido es: " + edad);
    }

    public void ejecutarCosas() {
        //operar(0,8);
        try {
            recepcionDatos();
            accesoArray();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fallo encontrado array");
        } catch (InputMismatchException e) {
            System.out.println("Fallo encontrado de entrada");
        }

    }

    public void lecturaFichero() {

        File file = null;
        FileReader reader = null;
        try {
            file = new File("");
            reader = new FileReader(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
