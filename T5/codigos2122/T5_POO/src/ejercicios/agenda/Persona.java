package ejercicios.agenda;

public class Persona {
    private String nombre, dni;
    private int telefono;

    public Persona(){}
    public Persona(String nombre, String dni, int telefono){
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(dni);
        System.out.println(telefono);
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
