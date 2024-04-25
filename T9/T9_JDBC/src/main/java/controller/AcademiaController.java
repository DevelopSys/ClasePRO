package controller;

import model.Alumno;
import model.Profesor;

public class AcademiaController {

    private AlumnoCrudRepository alumnoRepository;
    private ProfesorCrudRespository profesorRespository;

    // todas las tareas que se pueden ejecutar en la academia



    public AcademiaController() {

        this.alumnoRepository = new AlumnoCrudRepository();
        this.profesorRespository = new ProfesorCrudRespository();
    }


    public void contratarProfesor(Profesor profesor){

        // comprobar que el profesor tiene doctorado, si lo tiene le sumas 1000 euros al sueldo
        profesorRespository.insertarProfesor(profesor);
    }
    public void inscribirAlumno() {
        alumnoRepository.darAltaAlumno(new Alumno("Borja", "Martin", "correo@gmail.com", 123123));
    }

    public void eliminarAlumno() {
        alumnoRepository.darBajaAlumno(1);
    }
}
