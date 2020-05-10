package github.flujodatos.utils;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre, apellido, dni;
    private int telefono;


    public Usuario(String nombre, String apellido, String dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String mostrarDatos(){
        return String.format("nombre: %s, apellidos: %s, teléfono: %d %n", getNombre(), getApellido(), getTelefono());
    }
}
