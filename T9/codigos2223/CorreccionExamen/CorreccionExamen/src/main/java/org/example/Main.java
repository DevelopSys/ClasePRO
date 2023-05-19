package org.example;

import org.example.controller.ControllerExamen;
import org.example.model.Alumno;
import org.example.model.Ciclo;
import org.example.model.Matricula;
import org.example.model.Profesor;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        ControllerExamen controllerExamen = new ControllerExamen();
        // String nombre, String apellido, String correo, int telefono, Matricula matricula, Ciclo ciclo
        /*controllerExamen.insercionAlumnos(new Alumno("Borja","Martin","correo@borja.com",
                123, new Matricula(123),new Ciclo("DAM","Desarrollo de App")));

        controllerExamen.insercionAlumnos(new Alumno("Celia","Martin","correo@celia.com",
                234, new Matricula(234),new Ciclo("DAW","Desarrollo de Web")));*/

        // String nombre, String apellido, String correo, String titulacion, int telefono, int sueldo, boolean doctorado, Ciclo ciclo
        /*controllerExamen.insercionProfesor(new Profesor("Profesor1", "Apellido1", "correo@profesor.com",
                "ingeniero",123123,10000,true, new Ciclo("ASIR", "Sistemas")));*/

        Profesor p = new Profesor("Profesor2", "Apellido2", "correo@profesor2.com",
                "ingeniero",123123,10000,true);


        //controllerExamen.insercionProfesor(p);
        controllerExamen.getAlumnosMatriculados();



    }

}