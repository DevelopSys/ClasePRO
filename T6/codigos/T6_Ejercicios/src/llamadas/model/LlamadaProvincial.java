package llamadas.model;

import llamadas.constantes.Costes;

public class LlamadaProvincial extends Llamada{

    public LlamadaProvincial(){}

    public LlamadaProvincial(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    public void calcularCoste() {
        setCoste(getDuracion()* Costes.COSTE_PROVINCIAL);
    }
}
