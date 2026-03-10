package controller;

import model.Product;

import java.io.*;
import java.util.ArrayList;

public class FileController {
    ObjectOutputStream objectOutputStream;
    ObjectInputStream objectInputStream;
    public void exportarDatos(ArrayList<Product> lista){
        try {
            objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("src/main/java/controller/carrito.obj"));
            objectOutputStream.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Ruta de creacion incorrecta");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public ArrayList<Product> importarLista(){
        ArrayList<Product> lista = new ArrayList<>();
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("src/main/java/controller/carrito.obj"));
            lista = (ArrayList<Product>) objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println("Error en ruta");
        } catch (ClassNotFoundException e) {
            System.out.println("");
        }
        return lista;
    }
}
