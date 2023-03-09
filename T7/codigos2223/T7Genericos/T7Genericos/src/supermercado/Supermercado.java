package supermercado;

import java.util.ArrayList;

public class Supermercado<T extends Producto> {

    private int caja;
    private ArrayList<T> listaProdctos;


    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public ArrayList<T> getListaProdctos() {
        return listaProdctos;
    }

    public void setListaProdctos(ArrayList<T> listaProdctos) {
        this.listaProdctos = listaProdctos;
    }

    public Supermercado() {
        listaProdctos = new ArrayList<>();
    }

    public void agregarProducto(T producto){
        this.listaProdctos.add(producto);
    }

    public void listarProdcutos(){
        for ( T item : listaProdctos ) {
            // T es de tipo producto por narices
            item.mostrarDatos();
        }
    }

    public void vaciarAlmacen(){
        for ( T item : listaProdctos ) {
            // T es de tipo producto por narices
            caja += item.getPrecio();
            // FALLA --> listaProdctos.remove(item);
        }

        listaProdctos.clear();
        System.out.println(getCaja());
    }


}
