package genericos;

public interface InterfazGenerica<T,S> {

    //CREATE
    void agregarElemento(T elemento);
    //READ
    void buscarElemento(S id);
    //UPDATE
    void modificarElemento(T elemento);
    //DELETE
    void borrarElemento(T elemento);
}
