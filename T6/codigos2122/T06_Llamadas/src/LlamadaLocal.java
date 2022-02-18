public class LlamadaLocal extends Llamada{

    public LlamadaLocal(long nOrigen, long nDestino, int duracion){
        super(nOrigen,nDestino,duracion);
        /*this.nDestino = nDestino;
        this.nOrigen = nOrigen;
        this.duracion = duracion;*/

    }

    @Override
    protected void calcularCoste() {
        this.coste = 0;
    }
}
