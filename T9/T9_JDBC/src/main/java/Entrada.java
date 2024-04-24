import controller.AcademiaController;
import database.DBConnection;

import java.sql.Connection;

public class Entrada {

    public static void main(String[] args) {
        // Connection connection = DBConnection.getConnection();
        // System.out.println(connection.toString());
        AcademiaController academiaController = new AcademiaController();
        academiaController.inscribirAlumno();
        academiaController.inscribirAlumno();
    }
}
