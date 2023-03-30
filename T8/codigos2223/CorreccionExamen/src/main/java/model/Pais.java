package model;

public class Pais {

    private double probabilidad;
    private String id;

    public Pais(double probabilidad, String id) {
        this.probabilidad = probabilidad;
        this.id = id;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
