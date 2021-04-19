package genericos;

import java.util.ArrayList;

public interface InterfazGenerica<T,S> {

    //ArrayList<T> lista = new ArrayList<>();
    //CREATE
    void agregarElemento(T elemento);
    //READ
    void buscarElemento(S id);
    //UPDATE
    void modificarElemento(T elemento);
    //DELETE
    void borrarElemento(T elemento);
}
