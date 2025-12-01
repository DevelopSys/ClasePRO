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

    public Vehiculo(String marca, String modelo, String tipo, int cc, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cc = cc;
        this.cv = cv;
        listaAccesorios = new ArrayList<>();
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        listaAccesorios = new ArrayList<>();
    }

    public Vehiculo(String marca, String modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        listaAccesorios = new ArrayList<>();
    }

    public Vehiculo() {
        listaAccesorios = new ArrayList<>();
    }


    public void mostrarDatos(){
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("CV "+cv);
        System.out.println("CC "+cc);
        System.out.println("Ruedas "+ruedas);
        System.out.println("Numero accesorios "+ listaAccesorios.size());
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public ArrayList<String> getListaAccesorios() {
        return listaAccesorios;
    }

    public void setListaAccesorios(ArrayList<String> listaAccesorios) {
        this.listaAccesorios = listaAccesorios;
    }
}
