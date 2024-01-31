package llamadas.model;

public class Local extends Llamada{

    public Local(){

    }
    public Local(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    public void calcularCoste() {
        setCoste(0);
    }
}
