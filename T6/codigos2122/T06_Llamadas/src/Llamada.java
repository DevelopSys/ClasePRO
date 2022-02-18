public abstract class Llamada {

    protected long nOrigen, nDestino;
    protected int duracion;
    protected double coste;

    public Llamada(){}

    public Llamada(long nOrigen, long nDestino, int duracion){
        this.nDestino = nDestino;
        this.nOrigen = nOrigen;
        this.duracion = duracion;
        calcularCoste();

    }

    protected abstract void calcularCoste();

    public void mostrarDatos(){
        System.out.println("Origen: "+nOrigen);
        System.out.println("Destino: "+nDestino);
        System.out.println("Duracion: "+duracion);
        System.out.println("Coste: "+coste);
    }

    public long getnOrigen() {
        return nOrigen;
    }

    public void setnOrigen(long nOrigen) {
        this.nOrigen = nOrigen;
    }

    public long getnDestino() {
        return nDestino;
    }

    public void setnDestino(long nDestino) {
        this.nDestino = nDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
