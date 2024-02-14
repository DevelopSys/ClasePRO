package model;

import utils.Posicion;

public abstract class Jugador extends Persona {

    private Posicion posicion;

    public Jugador() {
    }

    public Jugador(String nombre, String dni, Posicion posicion) {
        super(nombre, dni);
        this.posicion = posicion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Posicion " + posicion.name());
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
