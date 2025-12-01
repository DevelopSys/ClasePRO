import model.Alumno;
import model.Asignatura;
import model.Profesor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        /*
        Asignatura a1 = new Asignatura(1);
        Asignatura a2 = new Asignatura(2);
        Asignatura a3 = new Asignatura(3);
        */

        // Alumno borja = new Alumno(1,2,3);
        Alumno borja = new Alumno(new Asignatura(1), new Asignatura(2), new Asignatura(3));
        // Alumno maria = new Alumno(1,2,3);
        Alumno maria = new Alumno(new Asignatura(1), new Asignatura(2), new Asignatura(3));

        listaAlumnos.add(borja);
        listaAlumnos.add(maria);


        Profesor profesor1 = new Profesor();

        System.out.println("Calificando");
        for (Alumno alumno: listaAlumnos) {
            profesor1.ponerNotas(alumno);
        }

        System.out.println("Mostrando medias");
        for (Alumno alumno: listaAlumnos) {
            // System.out.println("La media del alumno es "+profesor1.calcularMedia(alumno));
            alumno.mostrarExpediente();
        }
        //System.out.printf("La media del alumno es %.2f\n",profesor1.calcularMedia(borja));

        /*
        borja.getA1().setCalificacion(4.0);
        borja.getA2().setCalificacion(7.0);
        borja.getA3().setCalificacion(9.0);
        borja.mostrarExpediente();
         */
        // Alumno borja = new Alumno(1,2,3);
        // Alumno maria = new Alumno(1,2,3);
        // System.out.println("La calificacion de la asignatura es "+a3.getCalificacion());
    }
}
