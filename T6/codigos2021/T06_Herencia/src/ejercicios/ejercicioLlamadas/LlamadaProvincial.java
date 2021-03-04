package ejercicios.ejercicioLlamadas;

public class LlamadaProvincial extends Llamada {

    public LlamadaProvincial() {
    }

    public LlamadaProvincial(long nOrigen, long nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);

    }

    @Override
    public void calcularCoste() {
        this.coste = 0.15*this.duracion;
    }
}
