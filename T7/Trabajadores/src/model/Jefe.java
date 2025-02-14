package model;

public class Jefe extends Trabajador implements Empleador{

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, int numeroSS, double salario) {
        super(nombre, apellido, numeroSS, salario);
    }

    @Override
    public void calcularSalarioMes() {
        System.out.println("El salario mensual es :"+getSalario());
    }

    @Override
    public void realizarTrabajo() {

    }
}
