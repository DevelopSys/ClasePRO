package model;

public class Usuario {

    private String nombre, apellido;
    private int telefono;
    private String pais;

    public Usuario(String nombre, String apellido, int telefono, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
