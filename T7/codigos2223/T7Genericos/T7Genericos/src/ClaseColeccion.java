import java.util.ArrayList;

public class ClaseColeccion<T,S extends Number> {

    private ArrayList<T> listaElementos;

    public ClaseColeccion(ArrayList<T> listaElementos) {
        this.listaElementos = listaElementos;
    }

    public void listarElementos(){
        for ( T item : listaElementos ) {
            System.out.println(item);
        }
    }

    public void agregarElemento(T elemento, S ejemplo){
        this.listaElementos.add(elemento);
    }


}
