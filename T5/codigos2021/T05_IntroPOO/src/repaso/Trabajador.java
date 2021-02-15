package repaso;

public class Trabajador {

    private double sueldo;
    private String dni, nombre, puesto;

    // constructores

    public Trabajador() {

    }

    public Trabajador(String dni, String nombre, String puesto, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    // métodos

    public void mostrarDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("DNi: "+this.dni);
        System.out.println("Puesto: "+this.puesto);
        System.out.println("Sueldo: "+this.sueldo);
    }

    // getters setters

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
