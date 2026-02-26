package model;

public class Contacto {

    private String dni, nombre, apellido;

    public Contacto() {
    }

    public Contacto(String nombre, String apellido,String dni) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarDatos() {
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);
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

    // TODO toString para la exportacion

    public String exportarDatos(){
        return String.format("%s,%s,%s",nombre,apellido,dni);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s",nombre,apellido,dni);
    }
}
