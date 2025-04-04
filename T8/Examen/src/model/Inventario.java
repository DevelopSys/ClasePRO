package model;

import java.util.ArrayList;

public class Inventario<T> {

    private ArrayList<T> lista;

    public Inventario(){
        this.lista = new ArrayList<>();
    }

    public void agregar(T elemento) {
        this.lista.add(elemento);
    }

    public void mostrarInventario(){
        for (T producto: lista) {
            // TODO
            System.out.println(producto.toString());
        }
    }

    public class Producto {
        private String nombre;
        private int precio, stock;

        public Producto() {
        }

        public Producto(String nombre, int precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        @Override
        public String toString() {
            return "Producto{" +
                    "nombre='" + nombre + '\'' +
                    ", precio=" + precio +
                    ", stock=" + stock +
                    '}';
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }
    }
}
