package ejercicio3;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        Asignatura sistemas = new Asignatura(2);
        Asignatura baseDato = new Asignatura(3);

        Alumno alumno1 = new Alumno(programacion,sistemas,baseDato);
        Alumno alumno2 = new Alumno(4,5,6);

        Profesor profesor1 = new Profesor();

        profesor1.ponerNotas(alumno1);
        profesor1.ponerNotas(alumno2);

        System.out.println("Pulsa enter para ver los resultados");
        new Scanner(System.in).next();

        alumno1.mostrarNotas();
        System.out.println("Media alumno1: "+profesor1.calcularMedia(alumno1));

        alumno2.mostrarNotas();
        System.out.println("Media alumno2: "+profesor1.calcularMedia(alumno1));
    }
}
