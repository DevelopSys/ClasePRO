package agenda.model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private static final Long serialVersionID = 910149867L;

    private String nombre, apellido, correo;
    int media;
    private int telefono;


    public Usuario(String nombre, String apellido, String correo, int media, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.media = media;
        this.telefono = telefono;
    }

    public Usuario() {
    }


    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
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
}
