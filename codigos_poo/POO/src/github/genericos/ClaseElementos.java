package github.genericos;

import java.util.ArrayList;

public class ClaseElementos<T> implements InterfazOperaciones<T> {

    ArrayList<T> listaElementos;

    public ClaseElementos() {

        listaElementos = new ArrayList();
    }

    @Override
    public void agregarElemento(T elemento) {
        listaElementos.add(elemento);
    }

    @Override
    public void elimnarElemento(T elemento) {
        listaElementos.remove(elemento);
    }

    @Override
    public void mostrarDatos() {
        for (T elemento: listaElementos
        ) {
            System.out.println(elemento);
        }
    }
}
