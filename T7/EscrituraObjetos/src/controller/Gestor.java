package controller;

import model.Usuario;

import java.io.*;

public class Gestor {
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;

    public void escribirObjeto(Usuario usuario){

        try {
            objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("src/ficheros/objetos.obj"));
            objectOutputStream.writeObject(usuario);
        } catch (IOException e) {
            System.out.println("La ruta no es correcta");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void leerObjeto(){
        try {
            objectInputStream =
                    new ObjectInputStream(new FileInputStream("src/ficheros/objetos.obj"));

            Usuario usuario = (Usuario) objectInputStream.readObject();
            usuario.mostrarDatos();

        } catch (IOException e) {
            System.out.println("Error en la lectura fichero");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException | ClassCastException e) {
            System.out.println("Error en la clase asociada");
        }
    }
}
