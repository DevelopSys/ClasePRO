import model.Alumno;
import model.Asignatura;
import model.Profesor;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        // como haria para tener 5 alumnos
        // se matriculen en las mismas asignaturas
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        asignaturas.add(new Asignatura(1));
        asignaturas.add(new Asignatura(2));
        asignaturas.add(new Asignatura(3));

        Alumno borja = new Alumno( asignaturas.get(0).getIdentificador(),2,3);
        Alumno juan = new Alumno(1,2,3);
        // Alumno borja1 = new Alumno(1,2,3);
        Profesor profesor = new Profesor();
        profesor.ponerNotas(borja);
        profesor.ponerNotas(juan);
        /*System.out.println("La nota de la asignatura PRO es "
                +borja.getAsignatura1().getCalificacion());
        System.out.println("La nota de la asignatura PRO es "
                +juan.getAsignatura1().getCalificacion());*/

        System.out.println("La media del alumno es "
                +profesor.calcularMedia(borja));
        System.out.println("La media del alumno es "
                +profesor.calcularMedia(juan));
    }
}
