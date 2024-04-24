package controller;

import model.Alumno;

public class AcademiaController {

    private AlumnoCrudRepository alumnoRepository;

    // todas las tareas que se pueden ejecutar en la academia


    public AcademiaController() {
        this.alumnoRepository = new AlumnoCrudRepository();
    }

    public void inscribirAlumno() {
        alumnoRepository.darAltaAlumno(new Alumno("Borja", "Martin", "correo@gmail.com", 123123));
    }
}
