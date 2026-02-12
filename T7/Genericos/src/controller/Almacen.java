package controller;

import model.Producto;
import model.Vendible;

import java.util.ArrayList;

public class Almacen<T extends Producto, S extends Vendible> {
    private ArrayList<T> listaProductos;
    private ArrayList<S> listaProductosStock;
    private double caja;

    public Almacen(){
        this.listaProductos =new ArrayList();
        this.listaProductosStock = new ArrayList<>();
    }

    public void agregarProductos(T producto){
        this.listaProductos.add(producto);
    }

    public void agregaStock(S producto){
        this.listaProductosStock.add(producto);
    }
    public void venderCosas(){
        for ( S item : listaProductosStock ) {
            caja+= item.vender();
        }
    }
}
