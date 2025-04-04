package model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private final static long serialVersionUID = -5673816542793472397L;

    private String nombre, apellido;
    private int telefono, edad;


    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
