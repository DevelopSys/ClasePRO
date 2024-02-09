package model;

import utils.Estado;

public final class Moto extends Vehiculo implements Almacenable {

    private String transmision;
    private int peso;


    public Moto() {
    }

    public Moto(int numeroSerie, int precio, String marca, String modelo, Estado estado,
                String transmision, int peso) {
        super(numeroSerie, precio, marca, modelo, estado);
        this.transmision = transmision;
        this.peso = peso;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Transmision " + transmision);
        System.out.println("Peso " + peso);
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void apilar() {
        System.out.println("Almacenando moto");
    }

    @Override
    public void desapilar() {
        System.out.println("Sacando moto");
    }
}
