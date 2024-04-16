package controller;

import java.io.File;
import java.io.IOException;

public class OperacionesFicheros {


    public void lecturaInformacion(String fichero) {
        File file = new File(fichero);
        // tamaño
        // modificacion, creacion, propietario, permisos, extension
        // ruta, nombre, directorio()
        // leer

        //String nombre = file.getName();
        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta: " + file.getAbsolutePath());
        System.out.println("Escribir??: " + file.canWrite());
        System.out.println("Leer??: " + file.canWrite());
        System.out.println("Directorio: " + file.isDirectory());
        System.out.println("Existe: " + file.exists());
        if (!file.exists()){
            try {
                file.createNewFile();
                lecturaInformacion(fichero);
            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        }

        System.out.println("Terminando informacion del fichero");

        // en el caso en el que el fichero no esté creado | esté creado
        // se ejecuta lo que hace el método ahora
        // si no esta creado lo crea y vuelve a sacar su informacion
        // EL METODO SOLO TIENE UNA LINEA DE CÓDIGO ADICIONAL
        // HAY QUE CAMBIAR LA FIRMA DEL METODO


    }
    public void lecturaDirectorio(String fichero){
        File file = new File(fichero);
        if (file.isDirectory()){
            /*for ( String nombre :file.list()){
                System.out.println(nombre);
            }*/

            for ( File f :file.listFiles()){
                System.out.println(f.getAbsolutePath());
                if (f.isDirectory()){
                    lecturaDirectorio(f.getAbsolutePath());
                }
            }
        }

    }

}
