package model;

import utils.TiposVehiculos;

public abstract class Vehiculo {

    private TiposVehiculos tipo;
    private int numeroRuedas, cv, peso;

    public Vehiculo() {
    }

    public Vehiculo(TiposVehiculos tipo, int numeroRuedas, int cv, int peso) {
        this.tipo = tipo;
        this.numeroRuedas = numeroRuedas;
        this.cv = cv;
        this.peso = peso;
    }

    public void mostrarDatos(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Numero ruedas: "+numeroRuedas);
        System.out.println("CV: "+cv);
        System.out.println("Peso: "+peso);
    }

    public abstract void reprogramarMotor();

    public TiposVehiculos getTipo() {
        return tipo;
    }

    public void setTipo(TiposVehiculos tipo) {
        this.tipo = tipo;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
