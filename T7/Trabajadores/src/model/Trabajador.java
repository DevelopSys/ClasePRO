package model;

abstract public class Trabajador {

    private String nombre, apellido;
    private int numeroSS;
    private double salario;

    public Trabajador(String nombre, String apellido, int numeroSS, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSS = numeroSS;
        this.salario = salario;
    }

    public Trabajador() {
    }

    public abstract void calcularSalarioMes();

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("numeroSS = " + numeroSS);
        System.out.println("salario = " + salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(int numeroSS) {
        this.numeroSS = numeroSS;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
