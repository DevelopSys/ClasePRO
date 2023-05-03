package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Ficha {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int anio;

    @Column
    private int mes;
    @Column
    private char etiqueta;
    @Column
    private boolean itv_pasada;

    public Ficha() {
    }

    public Ficha(int anio, int mes, char etiqueta, boolean itv_pasada) {
        this.anio = anio;
        this.mes = mes;
        this.etiqueta = etiqueta;
        this.itv_pasada = itv_pasada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public char getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(char etiqueta) {
        this.etiqueta = etiqueta;
    }

    public boolean isItv_pasada() {
        return itv_pasada;
    }

    public void setItv_pasada(boolean itv_pasada) {
        this.itv_pasada = itv_pasada;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "id=" + id +
                ", anio=" + anio +
                ", mes=" + mes +
                ", etiqueta=" + etiqueta +
                ", itv_pasada=" + itv_pasada +
                '}';
    }
}
