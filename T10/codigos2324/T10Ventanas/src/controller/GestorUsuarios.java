package controller;

import model.Usuario;

import java.util.ArrayList;

public class GestorUsuarios {

    private ArrayList<Usuario> listaUsuarios;

    public GestorUsuarios() {
        listaUsuarios = new ArrayList<>();
    }

    public boolean realizarLogin(String correo, int telefono){
        // login ok cuando se encuetra en lista
        // login no ok cuando no se encuetra en lista

        for ( Usuario item : listaUsuarios ) {
            if (item.getCorreo().equalsIgnoreCase(correo) && item.getTelefono()==telefono){
                return true;
            }
        }

        return false;
    }

    public void listarUsuarios(){
        for ( Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
    }

    public void agregarUsuario(Usuario usuario){
        this.listaUsuarios.add(usuario);
    }


    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
