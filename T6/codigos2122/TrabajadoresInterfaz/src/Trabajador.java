public abstract class Trabajador extends Persona {

    protected double sueldo;
    protected Departamento departamento;

    public Trabajador() {
    }

    public Trabajador(String dni, String nombre, String apellido, double sueldo, Departamento departamento) {
        super(dni, nombre, apellido);
        this.sueldo = sueldo;
        this.departamento = departamento;
        calcularSueldo();
    }

    public abstract void calcularSueldo();

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Departamento: "+departamento.getNombre());
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
