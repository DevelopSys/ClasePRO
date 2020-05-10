package clases.genericos.clases;

import java.util.ArrayList;

public class ClaseListaInteger {

    ArrayList<Integer> lista;

    public ClaseListaInteger() {
        lista = new ArrayList<>();
    }

    public void agregarElemento(Integer elemento){
        lista.add(elemento);
    }

    public void eliminar(Integer elemento){
        lista.remove(elemento);
    }
}
