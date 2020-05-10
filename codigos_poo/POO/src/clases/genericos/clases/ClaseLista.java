package clases.genericos.clases;

import java.util.ArrayList;

public class ClaseLista <T,S> {

    ArrayList<T> lista;

    public ClaseLista() {
        lista = new ArrayList<>();
    }

    public void agregarElemento(T elemento){
        lista.add(elemento);
    }

    public void eliminar(T elemento){
        lista.remove(elemento);
    }

    public void hacerAlgo(S dato){

    }
}
