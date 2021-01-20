package ejercicios.ejercicioAsignaturas;

public class Asignatura {

    private int identificador;
    private double calificacion;

    // const

    public Asignatura(int identificador){
        this.identificador = identificador;
        // calificacion = 0
    }

    // get y set


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


    public int toId() {
        return getIdentificador();
    }
}
