package controller;

import dto.AlumnoDTO;
import model.Alumno;

import java.sql.SQLException;
import java.util.Scanner;

public class ControllerCentro {

    private AlumnoDTO alumnoDTO;
    public ControllerCentro(){
        this.alumnoDTO = new AlumnoDTO();
    }
    // la logica contra base de datos
    // quiero hacer una insercion y actuar si el dato no se inserta
    public void registrarAlumno(Alumno alumno){
        System.out.println("Procedemos a insertar el usuario");
        try {
            alumnoDTO.addUserPS(alumno);
        } catch (SQLException e){
            System.out.println("El mail esta duplicado, quieres indicarme otro correo");
            Scanner scanner = new Scanner(System.in);
            String correo = scanner.next();
            alumno.setCorreo(correo);
            registrarAlumno(alumno);
        }
    }


    public boolean matricularUsuario(Alumno alumno, String localidad){
        int rows = alumnoDTO.getNumeroUsuarioLocalidad(localidad);
        switch (localidad){
            case "Madrid":

                break;
            case "Barcelona":
                break;
            case "Valencia":
                break;
        }
    }
}
