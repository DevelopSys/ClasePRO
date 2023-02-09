package model;

public class Actor {

    private String nombre, apellido;
    private int numeroOscars;

    public Actor() {
    }

    public Actor(String nombre, String apellido, int numeroOscars) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroOscars = numeroOscars;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Número Oscars: "+numeroOscars);
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

    public int getNumeroOscars() {
        return numeroOscars;
    }

    public void setNumeroOscars(int numeroOscars) {
        this.numeroOscars = numeroOscars;
    }
}
