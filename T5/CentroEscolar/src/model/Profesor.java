package model;

public class Profesor {
    public Profesor() {
    }

    public void ponerNotas(Alumno alumno) {
        alumno.getA1().setCalificacion(Math.random() * 10);
        alumno.getA2().setCalificacion(Math.random() * 10);
        alumno.getA3().setCalificacion(Math.random() * 10);
    }

    public double calcularMedia(Alumno alumno) {
        double media = (alumno.getA1().getCalificacion()
                + alumno.getA2().getCalificacion()
                + alumno.getA3().getCalificacion())/3;
        return media;
    }

}
