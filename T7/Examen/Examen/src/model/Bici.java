package model;

import utils.Constantes;
import utils.Estado;
import utils.Tipo;

public class Bici extends Vehiculo implements Reparable{

    private Tipo tipo;

    public Bici() {
    }

    public Bici(int numeroSerie, int precio, String marca, String modelo, Estado estado, Tipo tipo) {
        super(numeroSerie, precio, marca, modelo, estado);
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("tipo " + tipo.name());
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void reparar() {
        setPrecio((int) (getPrecio() + (getPrecio() * Constantes.REPARACION_BICI)));
    }
}
