public final class Jefe extends Trabajador implements Comision{

    private int numeroTrabajadores;

    public Jefe() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero trabajadores: "+numeroTrabajadores);
    }

    public Jefe(String dni, String nombre, String apellido, double sueldo, Departamento departamento, int numeroTrabajadores) {
        super(dni, nombre, apellido, sueldo, departamento);
        this.numeroTrabajadores = numeroTrabajadores;
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo;
    }

    @Override
    public double votar(int voto) {

        return 0;
    }

    @Override
    public void obtenerBeneficio() {

    }
}
