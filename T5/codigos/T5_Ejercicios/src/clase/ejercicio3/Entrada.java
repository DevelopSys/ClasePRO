package clase.ejercicio3;

import clase.ejercicio3.model.Alumno;
import clase.ejercicio3.model.Asignatura;
import clase.ejercicio3.model.Profesor;

import java.util.ArrayList;

public class Entrada {


    public static void main(String[] args) {

        Asignatura programacion = new Asignatura(1, "Programacion");
        Asignatura sistemas = new Asignatura(2, "Sistemas");
        Asignatura datos = new Asignatura(3, "Base de datos");

        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        asignaturas.add(programacion);
        asignaturas.add(sistemas);
        asignaturas.add(datos);

        //Alumno alumno = new Alumno(programacion,sistemas,datos);
        //Alumno alumno1 = new Alumno(new Asignatura(asignaturas.get(0), new Asignatura(2, "Sistemas"), new Asignatura(3, "Base de datos"));
        Alumno alumno2 = new Alumno(new Asignatura(1, "Programacion"), new Asignatura(2, "Sistemas"), asignaturas.get(0));
        Profesor profesor = new Profesor("Borja");
        //profesor.ponerNotas(alumno1);
        //profesor.ponerNotas(alumno2);
        //alumno1.mostrarDatos();
        //System.out.println(profesor.calcularMedia(alumno)); // LA MEDIA
        System.out.println(profesor.calcularMedia(alumno2)); // LA MEDIA
        //alumno.mostrarDatos();
    }
}
