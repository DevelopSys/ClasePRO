package model;

import java.util.ArrayList;

public class Vehiculo {
    // variables -> caracteristicas que cualifican el elemento
    private String marca, modelo, tipo;
    private int cc, cv;
    private int ruedas;
    private ArrayList<String> listaAccesorios;

    // constructor -> metodos especiales que permiten hacer
    // realizad los objetos de la clase
    public Vehiculo() {
        listaAccesorios = new ArrayList<>();
    }

    public Vehiculo(String marca, String modelo) {
        listaAccesorios = new ArrayList<>();
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String marca, String modelo, String tipo) {
        listaAccesorios = new ArrayList<>();
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.ruedas = 4;
    }

    public Vehiculo(String marca, String modelo, String tipo, int cv,
                    int cc) {
        listaAccesorios = new ArrayList<>();
        this.marca = marca;
        this.modelo = modelo;
        this.cc = cc;
        this.cv = cv;
        this.tipo = tipo;
        this.ruedas = 0;
    }


    public String getModelo(){
        // logica de comprobacion
        return this.modelo;
    }


}
