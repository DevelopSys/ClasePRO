package model;

public class Vehiculo {
    // variables -> caracteristicas que cualifican el elemento
    private String marca, modelo;
    private int cc, cv, ruedas;

    // constructor -> metodos especiales que permiten hacer
    // realizad los objetos de la clase
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = 4;
    }
}
