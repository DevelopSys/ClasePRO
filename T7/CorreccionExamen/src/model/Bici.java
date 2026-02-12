package model;

public abstract class Bici {

    private int velocidades, pulgadas, peso;
    private Tamanio tamanio;
    private int precio;
    private boolean estado;

    public Bici() {
    }

    public Bici(int velocidades, int pulgadas, int peso,
                Tamanio tamanio, int precio) {
        this.velocidades = velocidades;
        this.pulgadas = pulgadas;
        this.peso = peso;
        this.tamanio = tamanio;
        this.precio = precio;
        estado = true;
    }

    public abstract double reparar();

    public void mostarDatos(){
        System.out.println("velocidades = " + velocidades);
        System.out.println("pulgadas = " + pulgadas);
        System.out.println("peso = " + peso);
        System.out.println("precio = " + precio);
        System.out.println("estado = " + estado);
        System.out.println("tamanio = " + tamanio.getDescripcion());
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
