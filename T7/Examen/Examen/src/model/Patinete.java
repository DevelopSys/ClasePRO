package model;

import utils.Constantes;
import utils.Estado;

public class Patinete extends Vehiculo implements Reparable, Almacenable {

    private int autonomia;

    public Patinete() {
    }

    public Patinete(int numeroSerie, int precio, String marca, String modelo, Estado estado, int autonomia) {
        super(numeroSerie, precio, marca, modelo, estado);
        this.autonomia = autonomia;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("autonomia " + autonomia);
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public void reparar() {
        this.setPrecio((int) (getPrecio() + (getPrecio() * Constantes.REPARACION_PATINETE)));
    }

    @Override
    public void apilar() {
        System.out.println("Aplicando patinete");
    }

    @Override
    public void desapilar() {
        System.out.println("Sacando patinete");
    }
}
