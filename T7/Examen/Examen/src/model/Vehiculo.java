package model;

import utils.Estado;

public abstract class Vehiculo {

    private int numeroSerie, precio;
    private String marca, modelo;
    private Estado estado;

    public Vehiculo() {
    }

    public Vehiculo(int numeroSerie, int precio, String marca, String modelo, Estado estado) {
        this.numeroSerie = numeroSerie;
        this.precio = (int) (precio + (precio * estado.getIncremento()));
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;

    }

    public void mostrarDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Precio: "+precio);
        System.out.println("Estado: "+estado.name());
        System.out.println("Numero serie " + numeroSerie);
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
