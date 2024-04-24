package controller;


import database.DBConnection;
import database.Esquema;
import model.Alumno;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoCrudRepository {

    // C -> Create -> INSERT
    // R -> Read -> SELECT
    // U -> Update -> UPDATE
    // D -> Delete -> DELETE

    private Connection connection;

    public void darAltaAlumno(Alumno alumno) {

        // Abrir la conexion
        connection = DBConnection.getConnection();
        // Trabajo
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String query = String.format("INSERT INTO %s (%s,%s,%s,%s) VALUES ('%s','%s','%s',%d)",
                    Esquema.TAB_ALUMNOS,
                    Esquema.COL_NOMBRE, Esquema.COL_APELLIDO, Esquema.COL_CORREO, Esquema.COL_TELEFONO,
                    alumno.getNombre(),alumno.getApellido(), alumno.getCorreo(), alumno.getTelefono()
                    );
            statement.execute(query);
        } catch (SQLException e) {
            System.out.println("Error de ejecucion SQL");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (statement!=null){
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error en cerrado");
            }
        }

        // Cerrar la conexion
        DBConnection.closeConnection();
        connection = null;

    }

    // DELETE https://www.w3schools.com/sql/sql_delete.asp

    // UPDATE https://www.w3schools.com/sql/sql_update.asp
}
