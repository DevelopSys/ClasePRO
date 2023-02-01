package model;

public class LlamadaLocal extends Llamada{

    public LlamadaLocal() {
    }

    public LlamadaLocal(long nOrigen, long nDestino, double duracion){
        super(nOrigen,nDestino,duracion);
    }

    @Override
    public void cobrar() {
        this.setCoste(0.50 + (getDuracion() *0.15));
        //this.coste = (0.50 + (this.duracion *0.15));
    }

}
