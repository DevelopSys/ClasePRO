package model;

public class Profesor {
    private String nombre;
    private String apellidos;
    private String dni;

    private int aniosDocencia;


    public Profesor() {
    }

    public Profesor(String nombre, String apellidos, String dni, int aniosDocencia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.aniosDocencia = aniosDocencia;
    }

    public int getAniosDocencia() {
        return aniosDocencia;
    }

    public void setAniosDocencia(int aniosDocencia) {
        this.aniosDocencia = aniosDocencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
