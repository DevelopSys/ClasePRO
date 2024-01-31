package llamadas.model;

public abstract class Llamada {

    // caract comunes -> origen destino duracion coste
    private int nOrigen, nDestino, duracion;
    private double coste;

    public Llamada(){}

    public Llamada(int nOrigen, int nDestino, int duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
        calcularCoste();
    }

    public void mostrarDatos(){
        System.out.println("Numero origen "+nOrigen);
        System.out.println("Numero destino "+nDestino);
        System.out.println("Numero duracion "+duracion);
        System.out.println("Numero coste "+coste);
    }

    public abstract void calcularCoste();


    public int getnOrigen() {
        return nOrigen;
    }

    public void setnOrigen(int nOrigen) {
        this.nOrigen = nOrigen;
    }

    public int getnDestino() {
        return nDestino;
    }

    public void setnDestino(int nDestino) {
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
