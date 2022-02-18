public class LlamadaLocal extends Llamada{

    public LlamadaLocal(long nOrigen, long nDestino, int duracion){
        super(nOrigen,nDestino,duracion);

    }

    @Override
    protected void calcularCoste() {
        this.coste = 0;
    }
}
