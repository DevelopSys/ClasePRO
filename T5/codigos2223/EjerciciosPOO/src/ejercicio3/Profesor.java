package ejercicio3;

public class Profesor {

    // constructor por defecto
    // public Profesor(){}

    public void ponerNotas (Alumno alumno){
        alumno.getAsignatura1().setCalificacion((Math.random()*10)+1);
        alumno.getAsignatura2().setCalificacion((Math.random()*10)+1);
        alumno.getAsignatura3().setCalificacion((Math.random()*10)+1);
    }

    public double calcularMedia(Alumno alumno){
        double media = (alumno.getAsignatura1().getCalificacion()
                +alumno.getAsignatura2().getCalificacion()
                +alumno.getAsignatura3().getCalificacion())/3;
        return media;
    }
}
