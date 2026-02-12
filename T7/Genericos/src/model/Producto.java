package model;

public abstract class Producto {

    private int precio;
    private String nombre;


    public Producto() {
    }

    public Producto(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
