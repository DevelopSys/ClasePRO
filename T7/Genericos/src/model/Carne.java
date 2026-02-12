package model;

public class Carne extends Producto{

    private int calidad;
    private int peso;

    public Carne() {

    }

    public Carne(int precio, String nombre, int calidad, int peso) {
        super(precio, nombre);
        this.calidad = calidad;
        this.peso = peso;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("calidad = " + calidad);
        System.out.println("peso = " + peso);
        super.mostrarDatos();
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
