package model;

public final class Utilitario extends Coche {

    private int numeroAsientos;

    public Utilitario() {
    }

    public Utilitario(String marca, String modelo, int cv, int cc, int velocidad, int numeroAsientos) {
        super(marca, modelo, cv, cc, velocidad);
        this.numeroAsientos = numeroAsientos;
    }


    @Override
    public void decelerar(int velocidad) {
        setVelocidad((int) (getVelocidad()-velocidad*0.8));
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nº asientos: " + numeroAsientos);
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
}
