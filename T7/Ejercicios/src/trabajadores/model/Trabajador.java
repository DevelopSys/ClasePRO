package trabajadores.model;

public abstract class Trabajador extends Persona{

    private double sueldo;

    public Trabajador() {}

    public Trabajador(String nombre, String apellido, String dni, double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo: "+sueldo);
    }

    public abstract void calcularSueldo();

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
