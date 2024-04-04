package lecturaJSON.model;

import java.util.Arrays;

public class Asignatura {

    private String nombre, profesor;
    private int horas;
    private String[] conocimientos;

    public Asignatura(String nombre, String profesor, int horas, String[] conocimientos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.horas = horas;
        this.conocimientos = conocimientos;
    }

    public Asignatura() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String[] getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(String[] conocimientos) {
        this.conocimientos = conocimientos;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", profesor='" + profesor + '\'' +
                ", horas=" + horas +
                ", conocimientos=" + Arrays.toString(conocimientos) +
                '}';
    }
}
