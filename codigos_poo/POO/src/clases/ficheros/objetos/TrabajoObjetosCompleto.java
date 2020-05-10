package clases.ficheros.objetos;

import clases.ficheros.objetos.utils.ListaUsuarios;
import clases.ficheros.objetos.utils.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TrabajoObjetosCompleto {

    public void escribirObjeto(File file){

        Usuario usuario = new Usuario("Borja","Martin","asdasd",123);


        // flujo de bytes
        FileOutputStream fos = null;
        // "traductor"
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            //oos.writeObject(usuario);
            oos.writeObject(1);
            //oos.writeUTF("asdasd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
    public void leerObjeto(File file){

        // flujo bytes
        FileInputStream fis = null;
        // traductor
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Usuario obj =  (Usuario) ois.readObject();
            System.out.println(obj.getNombre());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
        } catch (ClassCastException e){
            System.out.println("tipos incompatibles, lo siento no se puede hacer este casteo");
        }

    }

    public void escribirArrayList(File file){

        ListaUsuarios lista = new ListaUsuarios();
        Scanner sc = new Scanner(System.in);
        String  nombre = sc.next();
        String  ap = sc.next();
        String  dn = sc.next();

        int  tf = sc.nextInt();

        lista.agregarUsuario(new Usuario(nombre,"Martin","asdasd",123));
        lista.agregarUsuario(new Usuario("asd","Martin","asdasd",123));
        lista.agregarUsuario(new Usuario("fwer","Martin","asdasd",123));
        lista.agregarUsuario(new Usuario("yre","Martin","asdasd",123));
        lista.agregarUsuario(new Usuario("7ytg","Martin","asdasd",123));
        lista.agregarUsuario(new Usuario("123","Martin","asdasd",123));

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            /*for (Usuario usuario: listaUsuarios) {
                oos.writeObject(usuario);
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void leerArrayList(File file){
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            ListaUsuarios listaUsuarios = (ListaUsuarios) ois.readObject();
            listaUsuarios.listarObjetos();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (ClassCastException e){
            System.out.println("no se puede");
        }
    }

}
