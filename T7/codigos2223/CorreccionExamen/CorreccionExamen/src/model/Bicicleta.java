package model;

public abstract class Bicicleta {

    private Tipo tipo;
    private Tamanio tamanio;
    private int velocidades;
    private int pulgadas;
    private boolean estado;

    private int precio;

    public Bicicleta() {
    }

    public Bicicleta(Tipo tipo, Tamanio tamanio, int velocidades, int pulgadas, boolean estado, int precio) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.velocidades = velocidades;
        this.pulgadas = pulgadas;
        this.estado = estado;
        this.precio = precio;
    }

    public void mostrarDatos(){
        System.out.println("Tipo "+tipo.name());
        System.out.println("Tamanio "+tamanio.name());
        System.out.println("Pulgadas "+pulgadas );
        System.out.println("Velicidades "+velocidades);
        System.out.println("PRecio "+precio);
    }

    public abstract int reparar();

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
