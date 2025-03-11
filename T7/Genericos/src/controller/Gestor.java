package controller;

import model.Coche;
import model.Gestionable;

import java.util.ArrayList;

public class Gestor<S,B,Y> {

    private ArrayList<S> listado;

    public void anadirElemento(S dato){
        this.listado.add(dato);
    }


}
