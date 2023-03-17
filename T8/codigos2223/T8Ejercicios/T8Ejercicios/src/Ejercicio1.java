import model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> agenda = new ArrayList<>();
        String nombre, apellido, dni;
        int edad, telefono;
        String contestacion= "";

        do {
            System.out.println("introduce nombre");
            nombre = scanner.next();
            System.out.println("introduce apellido");
            apellido = scanner.next();
            System.out.println("introduce dni");
            dni = scanner.next();
            System.out.println("introduce edad");
            edad = scanner.nextInt();
            System.out.println("introduce telefono");
            telefono = scanner.nextInt();
            Usuario usuario = new Usuario(nombre, apellido, dni, edad, telefono);
            agenda.add(usuario);
            System.out.println("Quieres continuar añadiendo");
            contestacion = scanner.next();
        }while(contestacion.equalsIgnoreCase("s"));

        // no continuo introducioendo --> guardar a fichero

        File fichero = new File("src/ficheros/agenda.txt");
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(fichero,true);
            printWriter = new PrintWriter(fileWriter);
            // cada uno de los usuarios del array
            int contador = 1;
            for ( Usuario item : agenda ) {
                printWriter.println("usuario "+contador);
                printWriter.println(item.toString());
                contador++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                printWriter.close();
            } catch (NullPointerException e){
                System.out.println("Fallo al cerrar");
            }

        }


    }
}
