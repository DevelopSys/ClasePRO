package model;

import javax.swing.plaf.PanelUI;
import java.io.Serializable;

public class Usuario implements Serializable {

    private final static long serialVersionUID = 9L;

    private String nombre, apellido, correo;
    private int telefono;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String correo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void mostradDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("correo = " + correo);
        System.out.println("telefono = " + telefono);
    }

    @Override
    public String toString() {
        return getNombre()+","+getApellido()+","+getCorreo()+","+getTelefono();
    }
}
