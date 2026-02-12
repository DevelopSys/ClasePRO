package controller;

import java.io.File;

public class OperacionesFicheros {

    public void informacionFichero(String path) {
        // src/resources/carpeta1
        File file = new File(path);
        System.out.println("Es un fichero?? " + file.isFile());
        System.out.println("Es una carpeta?? " + file.isDirectory());
        System.out.println("Puedo leerlo?? " + file.canRead());
        System.out.println("Tamaño?? " + file.length());
        System.out.println("Existe?? " + file.exists());


        // si es una carpeta quiero obtener cuantos elementos tengo dentro
        if (file.isDirectory()) {
            System.out.println("El numero de elementos que hay dentro es de: " + file.list().length);
            for (File item : file.listFiles()) {
                System.out.println(item.getName());
                if (item.isDirectory()) {

                }
            }
        }
    }

    public void listarFicheros(String path) {

        File file = new File(path);
        System.out.println("\t"+file.getName());
        if (file.isDirectory()) {
            System.out.println("Listando el contenido");
            for (File item : file.listFiles()) {
                // cada nivel le pongo un \t adicional
                listarFicheros(item.getAbsolutePath());
            }
        }
    }
}
