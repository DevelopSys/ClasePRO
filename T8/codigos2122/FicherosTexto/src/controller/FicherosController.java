package controller;

import java.io.File;
import java.io.IOException;

public class FicherosController {

    public void getFileInfo(File file){
        System.out.println("Informacion de fichero");
        System.out.println("Es directorio? "+file.isDirectory());
        System.out.println("Es fichero? "+file.isFile());
        System.out.println("Existe? "+file.exists());
        System.out.println("Padre "+file.getParent());
        System.out.println("Nombre "+file.getName());
        System.out.println("Ruta Absoluta "+file.getAbsolutePath());
        System.out.println("Ruta Relativa "+file.getPath());
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void getDirectoryInfo(File file){
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.isDirectory()){
            String[] nombreFicheros = file.list();
            File[] ficheros = file.listFiles();
            for ( File fichero :ficheros) {
                System.out.println(fichero.getName());
            }
            //System.out.println(ficheros);
            //System.out.println(nombreFicheros);
            /*for ( String nombre : nombreFicheros ) {
                System.out.println(nombre);
            }*/
        }
    }

}
