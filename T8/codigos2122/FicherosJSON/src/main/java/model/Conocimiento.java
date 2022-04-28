package model;

import java.util.Arrays;

public class Conocimiento {

    private String concepto;
    private int experiencia;
    private String[] detalles;

    public Conocimiento() {
    }

    public Conocimiento(String concepto, int experiencia, String[] detalles) {
        this.concepto = concepto;
        this.experiencia = experiencia;
        this.detalles = detalles;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String[] getDetalles() {
        return detalles;
    }

    public void setDetalles(String[] detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Conocimiento{" +
                "concepto='" + concepto + '\'' +
                ", experiencia=" + experiencia +
                ", detalles=" + Arrays.toString(detalles) +
                '}';
    }
}
