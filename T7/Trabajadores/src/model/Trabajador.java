package model;

abstract public class Trabajador extends Persona {


    private double salario;

    public Trabajador(String nombre, String apellido, int numeroSS, double salario) {
        super(nombre, apellido, numeroSS);
        this.salario = salario;
    }

    public Trabajador() {
    }

    public abstract void calcularSalarioMes();

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("salario = " + salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
