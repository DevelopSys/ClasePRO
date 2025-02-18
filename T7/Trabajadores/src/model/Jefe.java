package model;

public class Jefe extends Trabajador implements Empleador, Beneficiario{

    private double acciones;
    public Jefe() {
    }

    public Jefe(String nombre, String apellido, int numeroSS, double salario, double acciones) {
        super(nombre, apellido, numeroSS, salario);
        this.acciones = acciones;
    }

    @Override
    public void calcularSalarioMes() {
        System.out.println("El salario mensual es :"+getSalario());
    }


    @Override
    public boolean realizarTrabajo(int nHoras) {

        System.out.println("El jefe se dispone a trabajar un numero de horas determinadas");
        if (nHoras>2){
            return false;
        }
        return true;
    }

    public double getAcciones() {
        return acciones;
    }

    public void setAcciones(double acciones) {
        this.acciones = acciones;
    }

    public void despedir(Trabajador trabajador){
        if (trabajador instanceof Asalariado){
            ((Asalariado)trabajador).setContratado(false);
        } else {
            ((Autonomo)trabajador).setContratado(false);
        }
    }

    @Override
    public void repartirBeneficio(int beneficio) {
        double beneficioTotal = acciones * beneficio;
        setSalario(getSalario()+beneficioTotal);
    }
}
