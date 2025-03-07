package model;

final public class Bebida extends Consumicion implements Inventariable{

    private int mililitros;
    public Bebida() {
    }

    public Bebida(String nombre, int precio, int mililitros) {
        super(nombre, precio);
        this.mililitros = mililitros;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("mililitros = " + mililitros);
    }

    @Override
    public void calculoEnergetico() {
        System.out.println("El calculo energetico de la bebida es "+this.mililitros*3);
    }

    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    @Override
    public void almacenar() {
        System.out.println("Esta consumicion se almacena apilandola en el almacen");
    }
}
