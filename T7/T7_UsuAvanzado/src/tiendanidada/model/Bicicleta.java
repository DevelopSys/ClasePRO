package tiendanidada.model;

import tiendanidada.utils.Tamanio;
import tiendanidada.utils.Tipo;

public abstract class Bicicleta<T>{

    private Tipo tipo;
    private Tamanio tamanio;
    private int pulgadas,velocidades;
    private boolean estado;

    public Bicicleta() {
    }

    public Bicicleta(Tipo tipo, Tamanio tamanio, int pulgadas, int velocidades, boolean estado) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.pulgadas = pulgadas;
        this.velocidades = velocidades;
        this.estado = estado;
    }

    public void mostrarDatos(){
        System.out.println("tipo = " + tipo.name());
        System.out.println("tamaño = " + tamanio.name());
        System.out.println("estado = " + estado);
        System.out.println("velocidades = " + velocidades);
        System.out.println("pulgadas = " + pulgadas);
    }

    public abstract T reparar();

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
