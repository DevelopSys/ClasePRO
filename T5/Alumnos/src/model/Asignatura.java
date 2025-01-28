package model;

public class Asignatura {

    private int identificador;
    private double calificacion;

    public Asignatura(){}
    public Asignatura(int identificador){
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
