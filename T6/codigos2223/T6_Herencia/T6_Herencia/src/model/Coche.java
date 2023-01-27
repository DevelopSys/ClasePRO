package model;

import javax.sound.midi.Soundbank;

public abstract class Coche {

    // molde de lo que será un objeto de tipo coche

    private String marca;
    private String modelo;
    private boolean encendido;

    public Coche() {
    }

    public Coche(String marca, String modelo) {
        //this.encendido = false;
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarDatos(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Encendido: "+this.encendido);
    }
    public void encender(){
        if (encendido){
            System.out.println("El coche ya está encendido");
        } else {
            System.out.println("Encencendiendo coche");
            this.encendido = true;
        }

    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", encendido=" + encendido +
                '}';
    }
}
