package ejercicio1.controller;

import ejercicio1.model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OperacionesUsuario {

    ArrayList<Usuario> listaUsuarios;

    public OperacionesUsuario() {
        this.listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario u){
        listaUsuarios.add(u);
    }
    public void exportarDatos(){
        File file = new File("src/resources/usuarios.txt");
        FileWriter fileWriter = null;

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error en permisos");
            }
        }

        try {
            fileWriter = new FileWriter(file,true);
            for (Usuario usuario :  listaUsuarios ){
                fileWriter.write(usuario.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
