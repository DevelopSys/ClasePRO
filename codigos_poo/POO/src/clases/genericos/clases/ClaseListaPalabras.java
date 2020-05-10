package clases.genericos.clases;

import java.util.ArrayList;

public class ClaseListaPalabras {

    ArrayList<String> lista;

    public ClaseListaPalabras() {
        lista = new ArrayList<>();
    }

    public void agregarElemento(String elemento){
        lista.add(elemento);
    }

    public void eliminar(String elemento){
        lista.remove(elemento);
    }
}
