package controller;

import model.Usuario;

import java.io.*;

public class BinariosController {

    public void escribirBinario(){
        File file = new File("src/resources/objetosObjetos.bin");

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

        // CERRARLO!!!!
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            /*Usuario usuario = (Usuario) ois.readObject();
            System.out.println(usuario.toString());
            Usuario usuario2 = (Usuario) ois.readObject();
            System.out.println(usuario2.toString());*/

            Usuario usuarioLectura = null;
            try {
                while ((usuarioLectura = (Usuario) ois.readObject())!=null)
                {
                    System.out.println(usuarioLectura);
                }
            } catch (EOFException e){
                System.out.println("Fichero terminado");
            }

            /*
            * Usuario{nombre='Borja', apellido='Martin', password='1345A'}
            * Usuario{nombre='Pedro', apellido='Herrera', password='1345A'}
            * */
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    * CON MVC hacer un programa que pida usuarios de forma recurrente
    * con todos sus datos (nombre, apellido, pass)
    * hasta que el usuario lo indique
    * Cada vez que el usuario introduzca un usuario se escribira en el
    * fichero
    *
    * Cuando el usuario no quiera meter mas usuarios se pedir si
    * quiere leer el fichero
    *   En caso de decir que si apareceran los datos del usuario
    *   con este formato: Nombre: XXX Apellido: XXX
    *
    * */

    /*MODIFICACION
    *
    * Cuando el sistema arranca, si el fichero de los usuarios existe
    * el sistema deberá de preguntar si se quieren importar los datos que ya estan
    * guardados. Si se dice que si, estos datos pasaran al ArrayList "temporal"
    * 
    * */


}
