package model;

import utils.Sabores;

public class Helado {

    private int precio;
    private Sabores sabor;

    public Helado(int precio, Sabores sabor) {
        this.precio = precio+sabor.getPrecio();
        this.sabor = sabor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Sabores getSabor() {
        return sabor;
    }

    public void setSabor(Sabores sabor) {
        this.sabor = sabor;
    }
}
