package github.genericos.especializados;

import github.genericos.especializados.abstractas.Clasificable;

import java.util.ArrayList;

public class InventarioGenerico<I> {

    ArrayList<I> listaTodos;

    public InventarioGenerico() {
        this.listaTodos = listaTodos;
    }

    public void agregarElemento(I clasificable){
        listaTodos.add(clasificable);
    }


}
