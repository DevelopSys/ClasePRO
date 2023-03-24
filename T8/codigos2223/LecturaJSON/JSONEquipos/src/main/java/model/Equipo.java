package model;

public class Equipo {

    private String nombre, posicion, id;

    public Equipo(String nombre, String posicion, String id) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
