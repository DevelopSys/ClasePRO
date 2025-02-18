package model;

public class Accionista extends Persona implements Beneficiario{

    private double acciones;

    public Accionista(String nombre, String apellido, int numeroSS, double acciones) {
        super(nombre, apellido, numeroSS);
        this.acciones = acciones;
    }

    public Accionista() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("acciones = " + acciones);
    }

    @Override
    public void repartirBeneficio(int beneficio) {
        double beneficioTotal = beneficio*acciones;
        System.out.println("El total del beneficio es "+beneficioTotal);
    }
}
