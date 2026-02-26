package controller;

import model.Contacto;

import java.io.*;

public class GestorFicheros {
    private File file;
    private BufferedReader reader;
    private FileWriter writer;
    private PrintWriter printWriter;

    public void escribirContacto(Contacto contacto) {
        file = new File("src/resources/usuarios.txt");

        try {
            printWriter = new PrintWriter(new FileWriter(file, true));
            // nombre,apellido,dni
            printWriter.println(contacto);
            // falla
        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero");
        } finally {
            try {
                printWriter.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }

        /*try {
            writer = new FileWriter(file);
            writer.write("23");
        } catch (IOException e) {
            System.out.println("Error en la creacion del fichero");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("Error en la IO del fichero");
            }
        }*/

    }


}
