package ejercicios.ejercicioTrabajadoresInterfaz;

public abstract class Persona {

    protected String dni, nombre, apellido;
    public Persona(){}
    public Persona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarDatos(){
        System.out.println("DNI: "+dni);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
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
}
