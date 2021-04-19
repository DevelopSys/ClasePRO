package supermercadoGenerico;

import java.util.ArrayList;

public class Supermercado<T extends Invetariable> {

    private ArrayList<T> listaProductos;

    public Supermercado() {
        listaProductos = new ArrayList<>();
    }

    public void registrarProducto(T prducto){
        listaProductos.add(prducto);
    }

    public void calcularPrecios(){
        double precioFinal=0;
        for (T itemProducto: listaProductos) {
            precioFinal += itemProducto.calcularPrecio();
        }
    }
}
