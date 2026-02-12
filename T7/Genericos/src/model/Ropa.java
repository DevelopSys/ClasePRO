package model;

public class Ropa extends Producto {

    private String tela;
    private boolean procesada;

    public Ropa() {
    }

    public Ropa(int precio, String nombre, String tela, boolean procesada) {
        super(precio, nombre);
        this.tela = tela;
        this.procesada = procesada;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("tela = " + tela);
        System.out.println("procesada = " + procesada);
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public boolean isProcesada() {
        return procesada;
    }

    public void setProcesada(boolean procesada) {
        this.procesada = procesada;
    }
}
