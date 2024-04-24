package ejercicio3.model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private static final Long serialVersionID = 123123123123L;
    private String nombre, apellido, correo;
    int media;

    public Usuario(String nombre, String apellido, String correo, int media) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.media = media;
    }

    public Usuario() {
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

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", media=" + media +
                '}';
    }
}
