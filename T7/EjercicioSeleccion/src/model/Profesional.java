package model;

import utils.Posicion;

public class Profesional extends Jugador implements Seleccionable{

    private boolean estrella;
    private int precio;

    public Profesional() {
    }

    public Profesional(String nombre, String dni, Posicion posicion,
                       boolean estrella, int precio) {
        super(nombre, dni, posicion);
        this.estrella = estrella;
        this.precio = precio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Estrella " + estrella);
        System.out.println("Precio " + precio);
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void seleccionar() {
        System.out.println("Has sido llamado por la seleccion");
        estrella = true;
    }
}
