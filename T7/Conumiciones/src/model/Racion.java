package model;

final public class Racion extends Consumicion{

    private int tamanio;

    public Racion() {
    }

    public Racion(String nombre, int precio, int tamanio) {
        super(nombre, precio);
        this.tamanio = tamanio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("tamanio = " + tamanio);
    }

    @Override
    public void calculoEnergetico() {
        System.out.println("El calculo energetico de la rac es "+this.tamanio*2);
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
