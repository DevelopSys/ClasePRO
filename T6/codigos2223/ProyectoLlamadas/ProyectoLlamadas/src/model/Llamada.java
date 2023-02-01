package model;

public abstract class Llamada {

    private long numeroOrigen, numeroDestino;
    private double coste, duracion;

    public Llamada() {
    }

    public Llamada(long numeroOrigen, long numeroDestino, double duracion) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
        this.cobrar();
    }

    public void mostrarDatos(){
        System.out.println("N origen: "+numeroOrigen);
        System.out.println("N destino: "+numeroDestino);
        System.out.println("Duracion: "+duracion);
        System.out.println("Coste: "+coste);
    }

    // calcular el coste de la llamada
    public abstract void cobrar();


    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
