package controller;

import model.Alumno;
import model.Profesor;

import java.util.ArrayList;

public class AcademiaController {

    private AlumnoCrudRepository alumnoRepository;
    private ProfesorCrudRespository profesorRespository;

    // todas las tareas que se pueden ejecutar en la academia



    public AcademiaController() {

        this.alumnoRepository = new AlumnoCrudRepository();
        this.profesorRespository = new ProfesorCrudRespository();
    }


    public void actualizarSueldo(int id, int salario){

        // logica de ejecucion
        profesorRespository.actualizarProfesor(id,salario);

    }

    public void despedirProfesor(int id){
        // existe el profesor
        profesorRespository.eliminarProfesor(id);
        // mandas un correo
        // haces papeleos
    }

    public void obtenerAlumnos(){
        ArrayList<Alumno> resultado = alumnoRepository.obtenerAlumnos();
        for ( Alumno item: resultado ) {
            System.out.println(item.toString());
        }
    }

    public void obtenerProfesoresSalario(){
        ArrayList<Profesor> listado = profesorRespository.obtenerProfesores(30000);
        for ( Profesor item : listado ) {
            System.out.println(item.getNombre() + " "+item.getSalario());
        }
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
