public final class Asalariado extends Trabajador {

    private int numeroPagas;

    public Asalariado() {
    }

    public Asalariado(String dni, String nombre, String apellido, double sueldo, Departamento departamento, int numeroPagas) {
        super(dni, nombre, apellido, sueldo, departamento);
        this.numeroPagas = numeroPagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Pagas: "+numeroPagas);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Administracion.IRPF);
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }
}
