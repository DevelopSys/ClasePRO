package videos.genericos;

import java.util.ArrayList;

public class ClaseLista <T> {

    ArrayList<T> lista;

    public ClaseLista() {
        lista = new ArrayList<>();
    }

    public void agragarElemento(T elemento){
        lista.add(elemento);
    }

    public void eliminarElemento(T elemento){
        lista.remove(elemento);
    }
}
