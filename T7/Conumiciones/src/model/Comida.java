package model;

final public class Comida extends Consumicion{

    // nombre y precio??????

    private int calorias;

    public Comida() {
    }

    public Comida(String nombre, int precio, int calorias) {
        super(nombre, precio);
        this.calorias = calorias;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("calorias = " + calorias);
    }

    @Override
    public void calculoEnergetico() {
        System.out.println("El calculo energetico de la comida es "+this.calorias);
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
