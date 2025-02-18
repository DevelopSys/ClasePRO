package model;

abstract public class Persona {

    private String nombre, apellido;
    private int numeroSS;

    public Persona(String nombre, String apellido, int numeroSS) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSS = numeroSS;
    }

    public Persona() {
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("numeroSS = " + numeroSS);
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

    public int getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(int numeroSS) {
        this.numeroSS = numeroSS;
    }
}
