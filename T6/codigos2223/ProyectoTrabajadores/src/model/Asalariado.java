package model;

import constantes.DatosEmpresa;

public final class Asalariado extends Trabajador {

    // nombre, trabajador, dni, sueldo, contratado
    private int numeroPagas;

    public Asalariado() {
    }


    public Asalariado(String nombre, String apellido, String dni, double sueldo, boolean contratado, int numeroPagas) {
        super(nombre, apellido, dni, sueldo, contratado);
        this.numeroPagas = numeroPagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero pagas "+numeroPagas);
    }

    @Override
    public double calcularNetoAnual() {
        double netoAnual = getSueldo() - (getSueldo() * DatosEmpresa.IVA_ASALARIADOS);
        //System.out.println("El neto anual es de "+netoAnual);
        return netoAnual;
    }

    public void pedirAumento(int aumento){
        int aleatorio = (int) (Math.random() *2);
        if (aleatorio == 1){
            setSueldo(getSueldo()+aumento);
        }
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }
}
