package model;

import utils.Posicion;

public class Top extends Persona implements Seleccionable {

    private Posicion posicion;

    public Top() {
    }

    public Top(String nombre, String dni, Posicion posicion) {
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

    @Override
    public void seleccionar() {
        System.out.println("Tu seleccion te ha llamado, solo tu seras la estrella");
    }
}
