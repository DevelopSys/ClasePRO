package model;

public final class Patinete extends Vehiculo{

    private int autonomia;

    public Patinete() {
    }

    public Patinete(String numeroSerie, String estado, String marca, String modelo, double precio, int autonomia) {
        super(numeroSerie, estado, marca, modelo, precio);
        this.autonomia = autonomia;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("autonomia = " + autonomia);
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
}
