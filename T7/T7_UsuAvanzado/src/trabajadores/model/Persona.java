package trabajadores.model;

public abstract class Persona {

    private String nombre, apellido, dni;

    public Persona() {
    }

    public void mostrarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellido);
        System.out.println("DNI "+dni);
    }


    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
