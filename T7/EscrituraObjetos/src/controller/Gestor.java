package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;

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

    public ArrayList<Usuario> importarLista(){
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(new File("src/ficheros/agenda.obj")));
            lista = (ArrayList<Usuario>) objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println("El fichero no se puede leer");
        } catch (ClassNotFoundException e) {
            System.out.println("El objeto no se puede leer");
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return lista;
    }

    public void exportarListar(ArrayList<Usuario> lista){

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("src/ficheros/agenda.obj")));
            objectOutputStream.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error en la ruta indicada");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
