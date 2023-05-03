package org.example.model;

import jakarta.persistence.*;

@Table (name = "ficha_tecnica")
@Entity
public class Ficha {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int anio;
    @Column
    private int mes;
    @Column (name = "itv")
    private boolean itvPasada;
    @Column
    private char etiqueta;

    @OneToOne (mappedBy = "ficha")
    private Vehiculo vehiculo;

    public Ficha() {
    }

    public Ficha(int anio, int mes, boolean itvPasada, char etiqueta) {
        this.anio = anio;
        this.mes = mes;
        this.itvPasada = itvPasada;
        this.etiqueta = etiqueta;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
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

    public boolean isItvPasada() {
        return itvPasada;
    }

    public void setItvPasada(boolean itvPasada) {
        this.itvPasada = itvPasada;
    }

    public char getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(char etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "id=" + id +
                ", anio=" + anio +
                ", mes=" + mes +
                ", itvPasada=" + itvPasada +
                ", etiqueta=" + etiqueta +
                ", vehiculo=" + vehiculo.getModelo() +
                '}';
    }
}
