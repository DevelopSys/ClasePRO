package github.genericos;

public interface InterfazOperaciones<T> {

    void agregarElemento(T elemento);
    void elimnarElemento(T elemento);
    void mostrarDatos();

}
