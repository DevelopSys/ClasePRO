package github.flujodatos.utils;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Agenda implements Serializable {

    private ArrayList<Usuario> usuarios;

    public Agenda() {
        usuarios = new ArrayList();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarUsuario(Usuario usuario) {

        Object[] existe = existeUsuario(usuario.getDni());
        if ((boolean) existe[0]) {
            System.out.println("el usuario ya existe");
        } else {
            usuarios.add(usuario);
        }
    }

    public void borrarUsuario(String dni) {
        Object[] existe = existeUsuario(dni);
        if ((boolean) existe[0]) {
            System.out.println("el usuario ya existe");
            usuarios.remove((int) existe[1]);
        } else {
            System.out.println("este usuario no existe");
        }
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.print(usuario.mostrarDatos());
        }
    }

    private Object[] existeUsuario(String dni) {

        int i = 0;


        for (Usuario usuario : usuarios) {
            if (usuario.getDni().equals(dni)) {
                return new Object[]{true, i};
            }
            i++;
        }

        return new Object[]{false, i};

    }

    public void exportarAgenda(File f) {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importarAgenda(File f) {
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new FileInputStream(f));
            usuarios = (ArrayList<Usuario>) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
