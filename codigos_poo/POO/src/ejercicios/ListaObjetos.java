package ejercicios;

import ejercicios.utils.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaObjetos implements Serializable {

    private ArrayList<Usuario> listaUsuarios;
    private Scanner teclado;

    public ListaObjetos() {
        teclado = new Scanner(System.in);
        importarDatos();
        if (listaUsuarios.size() > 0) {
            System.out.println("Listado los usuarios existentes");
            listarTodos();
        }
    }

    private void importarDatos() {

        File f = new File("src/ejercicios/documentos/objetos.obj");

        FileInputStream fileInputStream = null;
        ObjectInputStream ois = null;

        try {
            fileInputStream = new FileInputStream(f);
            ois = new ObjectInputStream(fileInputStream);
            listaUsuarios = (ArrayList<Usuario>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado, inicializando arraylist");
            this.listaUsuarios = new ArrayList<>();

            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Error en el casteo del objeto recuperado");
        }


        // this.listaUsuarios = new ArrayList<>();

    }

    private void listarTodos() {
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.toString());
        }
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void agregarUsuario() {

        String continuar = null;

        do {
            String nombre, apellido;
            int telefono;


            System.out.println("Intro nombre");
            nombre = teclado.next();
            System.out.println("Intro apellido");
            apellido = teclado.next();
            System.out.println("Intro telefono");
            telefono = teclado.nextInt();
            Usuario u = new Usuario(nombre, apellido, telefono);
            listaUsuarios.add(u);
            System.out.println("Continuar (si/no)");
            continuar = teclado.next();
        } while (continuar.toLowerCase().equals("si"));

        System.out.println("quieres exportar la lista de usuarios (si/no)");
        continuar = teclado.next();
        if (continuar.toLowerCase().equals("si")) {
            // TODO exportar todos los datos;
            exportarDatos();


        } else {
            System.out.println("saliendo sin exportar");
        }

    }

    public void exportarDatos() {
        File file = new File("src/ejercicios/documentos/objetos.obj");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listaUsuarios);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public String toString() {
        return "ListaObjetos{" +
                "listaUsuarios=" + listaUsuarios +
                '}';
    }
}
