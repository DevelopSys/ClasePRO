package ejercicios.ejercicioCentralita;

public class LlamadaLocal {

    private long numeroOrigen,  numeroDestino;
    private double duracion, coste;

    // constructor / es

    public LlamadaLocal(){

    }

    public LlamadaLocal(long numeroOrigen, long numeroDestino, double duracion){
        this.numeroDestino = numeroDestino;
        this.numeroOrigen = numeroOrigen;
        this.duracion = duracion;
        this.coste = (0.15*this.duracion) + 0.50;
    }

    // metodos

    public void mostrarDatos(){
        System.out.println("Número origen "+this.numeroOrigen);
        System.out.println("Número destino "+this.numeroDestino);
        System.out.println("Duración "+this.duracion);
        System.out.println("Coste "+this.coste);
    }

    // getters y setters

    public double getCoste() {
        return coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }
}
