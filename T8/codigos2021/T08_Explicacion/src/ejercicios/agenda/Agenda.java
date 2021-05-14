package ejercicios.agenda;

import java.io.*;
import java.util.ArrayList;

public class Agenda {

    private ArrayList<Usuario> listaUsuarios;

    public Agenda() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario u){
        listaUsuarios.add(u);
    }

    public void listarUsarios(){
        for ( Usuario itemUsuario  : listaUsuarios ) {
            itemUsuario.mostrarDatos();
        }
    }

    public void importarAgenda(){
        // FILE --> FILEINPUTSTREAM --> OBJECTINPUTSTREAM
        File file = new File("src/resources/agenda.obj");

        if (file.exists()){
            // leas e importas
            FileInputStream fis = null;
            ObjectInputStream ois = null;

            try {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                listaUsuarios = (ArrayList<Usuario>) ois.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } else {
            System.out.println("no se han importado datos porque no existe");
        }



    }

    public void exportarAgenda(){
        // FILE --> FILEOUTPUTSTREAM --> OBJECTOUTPUTSTREAM
        File file = new File("src/resources/agenda.obj");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
