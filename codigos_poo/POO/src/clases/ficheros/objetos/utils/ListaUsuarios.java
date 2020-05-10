package clases.ficheros.objetos.utils;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaUsuarios implements Serializable {

    ArrayList<Usuario> listaUsuarios;

    public ListaUsuarios() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public void listarObjetos(){
        for (Usuario usuario: listaUsuarios) {
            System.out.println(usuario.getNombre());
        }
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}
