package ejercicios.ejercicioAsignaturas;

public class Profesor {

    // variables
    // construtores --> por defecto (porque no hay ningún otro)
    // métodos

    public void ponerNotas(Alumno alumno){
        Asignatura a1 = alumno.getAsignaturaUno();
        a1.setCalificacion((int)(Math.random()*11));

        Asignatura a2 = alumno.getAsignaturaDos();
        a2.setCalificacion((int)(Math.random()*11));

        alumno.getAsignaturaTres().setCalificacion((int)(Math.random()*11));
    }

    public double calcularMedia(Alumno alumno){

        double media = (alumno.getAsignaturaUno().getCalificacion()
                + alumno.getAsignaturaDos().getCalificacion()
                + alumno.getAsignaturaTres().getCalificacion()) / 3;

        return media;

    }

}
