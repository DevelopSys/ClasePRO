package model;

public class Perfil {

    private int id;
    private String nombre;

    public Perfil(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Perfil() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
