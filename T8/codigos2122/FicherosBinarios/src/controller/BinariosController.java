package controller;

import model.Usuario;

import java.io.*;

public class BinariosController {

    public void escribirBinario(){
        File file = new File("src/resources/objetos.bin");

        // CERRARLO!!!!
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file,true));
            oos.writeObject(new Usuario("Borja", "Martin","1345A"));
            oos.writeObject(new Usuario("Pedro", "Herrera","234567"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // ABSOLUTA --> DESDE LA RAIZ "/User/borja/Desktop/ficheros/fichero.obj"
        // RELATIVA --> DESDE DONDE ESTOY UBICADO "../resoruces/fichero.obj"


    }
    public void lecturaBiniario(){
        File file = new File("src/resources/objetos.bin");
    }


}
