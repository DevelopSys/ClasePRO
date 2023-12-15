package model;

public class Circuito {

    private String nombre;
    private int kmTotales, vueltas, record;

    public Circuito(){}
    public Circuito(String nombre, int kmTotales, int vueltas){
        this.nombre = nombre;
        this.kmTotales = kmTotales;
        this.vueltas = vueltas;
        // record = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }
}
