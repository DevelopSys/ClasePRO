package model;

public class Mueble extends Producto implements Vendible{

    private int tamanio;
    private String categoria;

    public Mueble() {
    }

    public Mueble(int precio, String nombre, int tamanio, String categoria) {
        super(precio, nombre);
        this.tamanio = tamanio;
        this.categoria = categoria;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("tamanio = " + tamanio);
        System.out.println("categoria = " + categoria);
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public double vender() {
        return getPrecio()*1.75;
    }
}
