package model;

public final class Moto extends Vehiculo {
    private String transmision;
    private double peso;

    public Moto() {
    }

    public Moto(String numeroSerie, String estado, String marca, String modelo,
                double precio, String transmision, double peso) {
        super(numeroSerie, estado, marca, modelo, precio);
        this.transmision = transmision;
        this.peso = peso;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("transmision = " + transmision);
        System.out.println("peso = " + peso);
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
