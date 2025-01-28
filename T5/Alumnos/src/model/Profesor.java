package model;

public class Profesor {

    public Profesor(){}
    public void ponerNotas(Alumno alumno){
        // pongo nota a la asignatura1 del alumno
        alumno.getAsignatura1().setCalificacion(Math.random()*11);
        alumno.getAsignatura2().setCalificacion(Math.random()*11);
        alumno.getAsignatura3().setCalificacion(Math.random()*11);
    }

    public double calcularMedia(Alumno alumno){
        return (alumno.getAsignatura1().getCalificacion() +
                alumno.getAsignatura2().getCalificacion() +
                alumno.getAsignatura3().getIdentificador())/3;
    }

}
