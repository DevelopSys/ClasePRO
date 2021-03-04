package ejercicios.ejercicioLlamadas;

public abstract class Llamada {

    // variables
    protected long nOrigen, nDestino;
    protected int duracion;
    protected double coste;

    // constructores
    public Llamada(){

    }
    public Llamada(long nOrigen, long nDestino, int duracion){
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
        calcularCoste();
    }

    // metodos
    public void mostrarDatos(){
        System.out.println("Nº Origen: "+nOrigen);
        System.out.println("Nº Destino: "+nDestino);
        System.out.println("Duración: "+duracion);
        System.out.println("Coste: "+coste);
    }

    public abstract void calcularCoste();

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
