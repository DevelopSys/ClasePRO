package ejercicios.ejercicioTrabajadoresInterfaz;

public final class Asalariado extends Trabajador{

    private int numeroPagas;

    public Asalariado(){}
    public Asalariado(String dni, String nombre, String apellido, int id, int sueldo, int numeroPagas) {
        super(dni, nombre, apellido, id, sueldo);
        this.numeroPagas = numeroPagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero pagas: "+numeroPagas);
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }
}
