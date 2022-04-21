package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class EjercicioController {

    private ArrayList<Usuario> listaUsuarios;

    public EjercicioController(){
        listaUsuarios = new ArrayList<>();
    }

    public void addUsuario(Usuario usuario){
        this.listaUsuarios.add(usuario);
    }
    public void addUsuario(String nombre, String apellido, String pass){
        this.listaUsuarios.add(new Usuario(nombre, apellido, pass));
    }

    public void escrituraUsuarios(){
        File file = new File("src/resources/usuarios.bin");
        FileOutputStream fos;
        ObjectOutputStream oos = null;


        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            for (Usuario itemUser: listaUsuarios) {
                oos.writeObject(itemUser);
            }

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

    }

    public void mostrarDatosUsuario(Usuario usuario){
        System.out.println("Nombre: "+usuario.getNombre());
        System.out.println("Apellido: "+usuario.getApellido());
    }

    public void lecturaFichero(){
        File file = new File("src/resources/usuarios.bin");
        FileInputStream fis = null;
        ObjectInputStream ois =null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Usuario item = null;
            try {
                while ((item = (Usuario) ois.readObject())!=null){
                    mostrarDatosUsuario(item);
                }
            } catch (EOFException e){
                System.out.println("Terminado de leer fichero");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
