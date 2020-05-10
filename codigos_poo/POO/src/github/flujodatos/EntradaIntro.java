package github.flujodatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EntradaIntro {

    public static void main(String[] args) {
        System.out.println("Introduce el nombre del fichero que quieres crear: ");
        String nombre = new Scanner(System.in).next();
        File f = new File("src/github/flujodatos/documentos/programacion.txt");
        FileReader fileReader = null;
        if (!f.exists()){
            try {
                //f.createNewFile();
                fileReader = new FileReader(f);
                System.out.println(fileReader.read());
            } catch (IOException e) {
                System.out.println("Carpeta innaccesible");
            } finally {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


}
