package trabajo_objetos.controller;

import ejercicio1.model.Usuario;
import trabajo_objetos.model.Tarea;

import java.io.*;

public class OperacionesFicheros {

    public void escribirObjeto() {
        File file = new File("src/trabajo_objetos/resources/tareas.obj");

        ObjectOutputStream objectOutputStream = null;
        //FileOutputStream fileOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(new Tarea("Tarea 1", "Descripcion de la tarea1", false));
            objectOutputStream.writeObject(new Tarea("Tarea 2", "Descripcion de la tarea2", true));
        } catch (IOException e) {
            System.out.println("Error en el acceso");
        } finally {
            try {
                assert objectOutputStream != null;
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }
    public void lecturaObjeto(){
        File file = new File("src/trabajo_objetos/resources/tareas.obj");
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            /*Tarea tarea = (Tarea) objectInputStream.readObject();
            System.out.println(tarea);
            tarea = (Tarea) objectInputStream.readObject();
            System.out.println(tarea);
            // CERRADO
            tarea = (Tarea) objectInputStream.readObject();
            System.out.println(tarea);*/
            Tarea tarea = null;

            while ((tarea = (Tarea) objectInputStream.readObject())!=null){
                System.out.println(tarea);
            }
        } catch (IOException e) {
            System.out.println("error de acceso");
        } catch (ClassNotFoundException e) {
            System.out.println("Error en la lectura");
        } catch (ClassCastException e){
            System.out.println("Tipos incompatibles");
        } finally {
            try {
                assert objectInputStream != null;
                objectInputStream.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

}
