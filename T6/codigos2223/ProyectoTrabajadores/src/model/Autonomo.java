package model;

import constantes.DatosEmpresa;

public final class Autonomo extends Trabajador {

    // nombre, apellido, dni, sueldo, contratado
    private double cuotaSS;
    private int ayudas;

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, double sueldo, boolean contratado, double cuotaSS) {
        super(nombre, apellido, dni, sueldo, contratado);
        this.cuotaSS = cuotaSS;
    }

    @Override
    public double calcularNetoAnual() {
        double netoAnual = getSueldo() - (getSueldo() * DatosEmpresa.IVA_AUTONOMO) - (this.cuotaSS *12);
        //System.out.println("Su neto anual es de "+netoAnual);
        return netoAnual+ayudas;
    }

    public void pedirAyudas(){
        int aletorio = (int) (Math.random()*2);
        if (aletorio == 1){
            if (aletorio == 1){
                ayudas = (int) (Math.random()*201)+100;
            }
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero pagas "+cuotaSS);
    }

    public double getCuotaSS() {
        return cuotaSS;
    }

    public void setCuotaSS(double cuotaSS) {
        this.cuotaSS = cuotaSS;
    }
}
