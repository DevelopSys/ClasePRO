import controller.AcademiaController;
import database.DBConnection;
import model.Profesor;

import java.sql.Connection;

public class Entrada {

    public static void main(String[] args) {
        // Connection connection = DBConnection.getConnection();
        // System.out.println(connection.toString());
        AcademiaController academiaController = new AcademiaController();
        // academiaController.inscribirAlumno();
        // academiaController.eliminarAlumno();
        /*academiaController.contratarProfesor(new Profesor("Borja",
                "correo@gmail", 1234, "madrid"));*/
        //academiaController.actualizarSueldo(1,40000);
        //academiaController.despedirProfesor(1);
        //academiaController.obtenerAlumnos();
        academiaController.obtenerProfesoresSalario();
    }
}
