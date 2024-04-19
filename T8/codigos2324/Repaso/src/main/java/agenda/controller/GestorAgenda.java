package agenda.controller;

import agenda.model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class GestorAgenda {

    // escribir un objeto
    /*public void guardarUsuario() {
        // FILE -> OBJECTOUTPUTSTREAM -> FILEOUTPUTSTREAM -> FILE
        // FILE -> BUFFEREDWRITER     -> FILEWRITER       -> FILE
        File file = new File("src/main/java/agenda/resources/agenda.obj");

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file, true));
            // realizo acciones
            oos.writeObject(new Usuario("Borja", "Martin", "correo@gmail.com", 123));
        } catch (IOException e) {
            System.out.println("Error en la IO");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }

        }

    }*/

    public void leerUsuarios() {

        // OBJECTINPUTSTREAM -> FILEINPUTSTREAM -> FILE

        File file = new File("src/main/java/agenda/resources/agenda.obj");
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Usuario usuario = (Usuario) ois.readObject();
            System.out.println(usuario.toString());
            usuario = (Usuario) ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de IO");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } catch (ClassNotFoundException e) {
            System.out.println("Error en la lectura de la clase");
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            }
        }

    }

    public void guardarUsuarioArrayList(Usuario usuario) {
        // FILE -> OBJECTOUTPUTSTREAM -> FILEOUTPUTSTREAM -> FILE
        // FILE -> BUFFEREDWRITER     -> FILEWRITER       -> FILE
        File file = new File("src/main/java/agenda/resources/agenda.obj");

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            // realizo acciones
            ArrayList<Usuario> listado = null;
            if (getArraylistUsuarios()==null){
                listado = new ArrayList<>();
            } else {
                listado = getArraylistUsuarios();
            }
            listado.add(usuario);
            oos.writeObject(listado);
        } catch (IOException e) {
            System.out.println("Error en la IO");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }

        }

    }

    public void leerUsuariosArrayList() {

        // OBJECTINPUTSTREAM -> FILEINPUTSTREAM -> FILE

        File file = new File("src/main/java/agenda/resources/agenda.obj");
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) ois.readObject();
            for ( Usuario usuario : listaUsuarios) {
                System.out.println(usuario);
            }


        } catch (IOException e) {
            System.out.println("Error de IO");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } catch (ClassNotFoundException e) {
            System.out.println("Error en la lectura de la clase");
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            }
        }

    }

    public ArrayList<Usuario> getArraylistUsuarios(){

        File file = new File("src/main/java/agenda/resources/agenda.obj");
        ArrayList<Usuario> listado = null;
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            listado = (ArrayList<Usuario>) ois.readObject();
        } catch (IOException e) {
            System.out.println("Error en IO");
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println();
        } finally {
            try {
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                System.out.println();
            }
            System.out.println(listado);
            return listado;
        }
    }
}
