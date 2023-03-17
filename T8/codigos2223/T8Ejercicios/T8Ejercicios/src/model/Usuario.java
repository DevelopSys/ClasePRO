package model;

public class Usuario {

    private String nombre, apellido, dni;
    private int edad, telefono;

    public Usuario(String nombre, String apellido, String dni, int edad, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.telefono = telefono;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("DNI: "+dni);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+telefono);
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + '\n' +
                "apellido= " + apellido + '\n' +
                "dni= " + dni + '\n' +
                "edad= " + edad + '\n'+
                "telefono= " + telefono;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
