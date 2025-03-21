package model;

import utils.Sabores;

public class Batido {

    private Sabores sabor;
    private int precio;
    private int cantidad;

    public Batido(Sabores sabor, int precio, int cantidad) {
        this.sabor = sabor;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Sabores getSabor() {
        return sabor;
    }

    public void setSabor(Sabores sabor) {
        this.sabor = sabor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
