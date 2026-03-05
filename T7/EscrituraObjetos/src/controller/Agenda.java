package controller;

import model.Usuario;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Usuario> contactos;
    private Gestor gestor;

    public Agenda() {
        contactos = new ArrayList<>();
        gestor = new Gestor();
    }

    // añadir
    // borrar
    // buscar

    // importar
    public void importarDatos(){
        contactos = gestor.importarLista();
    }

    // exportar
    public void exportarDatos(){
        gestor.exportarListar(contactos);
    }
}
