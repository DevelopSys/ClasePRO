package model;

abstract public class Consumicion {
    // tiene que tener un metodo abs?

    private String nombre;
    private int precio;
    public Consumicion() {
    }

    public Consumicion(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);
    }
    public abstract void calculoEnergetico();
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
}
