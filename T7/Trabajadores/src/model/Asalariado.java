package model;

public class Asalariado extends Trabajador{


    private double retencion; // 0.21
    private int numeroPagas;

    public Asalariado(String nombre, String apellido, int numeroSS, double salario,
                      double retencion, int numeroPagas) {
        super(nombre, apellido, numeroSS, salario);
        this.retencion = retencion;
        this.numeroPagas = numeroPagas;
    }

    public Asalariado(String nombre, String apellido, int numeroSS, double salario) {
        super(nombre, apellido, numeroSS, salario);
        this.numeroPagas = 12;
        this.retencion = 0.02;
    }

    public Asalariado() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("retencion = " + retencion);
        System.out.println("numeroPagas = " + numeroPagas);
    }

    @Override
    public void calcularSalarioMes() {
        double salarioMes = (getSalario()-(getSalario()*retencion))/numeroPagas;
        System.out.println("El salario mensual es: "+salarioMes);
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }
}
