package ejercicios.alumnos;

public class Profesor {

    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion((int) (Math.random()*11));
        alumno.getAsignatura2().setCalificacion((int) (Math.random()*11));
        alumno.getAsignatura3().setCalificacion((int) (Math.random()*11));
    }

    public double calcularMedia(Alumno alumno){
        double media = (alumno.getAsignatura1().getCalificacion()
                + alumno.getAsignatura2().getCalificacion()
                + alumno.getAsignatura3().getCalificacion())/3;

        return media;
    }
}
