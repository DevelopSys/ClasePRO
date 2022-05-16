package controller;

import model.Personaje;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ControllerEj2 {

    public void lecturaObjetos(){
        File file = new File("src/main/resources/personajes_vf.bin");
        //FileInputStream
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Personaje personaje = null;

            while ((personaje = (Personaje) objectInputStream.readObject())!=null){
                System.out.printf(personaje.getName());
                System.out.printf(personaje.getPhoto());
            }


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
