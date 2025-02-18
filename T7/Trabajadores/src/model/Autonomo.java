package model;

public class Autonomo extends Trabajador implements Sindicador{

    private int coutaSS;

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, int numeroSS, double salario, int coutaSS) {
        super(nombre, apellido, numeroSS, salario);
        this.coutaSS = coutaSS;
    }

    public int getCoutaSS() {
        return coutaSS;
    }

    public void setCoutaSS(int coutaSS) {
        this.coutaSS = coutaSS;
    }

    @Override
    public void calcularSalarioMes() {
        double salarioMes = getSalario() - (coutaSS*12);
        System.out.println("El salario mensual es" +salarioMes);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("coutaSS = " + coutaSS);
    }

    @Override
    public void realizarHuelga() {
        System.out.println("El autonomo secunda la huelga automaticamente");
    }
}
