package controller;

import database.DBConnection;
import database.Esquema;
import model.Profesor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfesorCrudRespository {

    private Connection connection;

    // INSERT
    public void insertarProfesor(Profesor profesor) {

        // abro conexion
        connection = DBConnection.getConnection();

        // trabajo
        PreparedStatement ps = null;

        String query = String.format("INSERT INTO %s (%s, %s, %s, %s) VALUES (?,?,?,?)",
                Esquema.TAB_PROFESORES,
                Esquema.COL_NOMBRE, Esquema.COL_CORREO, Esquema.COL_SALARIO, Esquema.COL_DIRECCION);
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, profesor.getNombre());
            ps.setString(2, profesor.getCorreo());
            ps.setInt(3, profesor.getSalario());
            ps.setString(4, profesor.getDireccion());
            ps.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ps.close();
            } catch (SQLException | NullPointerException e) {
                System.out.println("Fallo en SQL");
            }
            DBConnection.closeConnection();
            connection = null;
        }


        // cierro conexion


    }

    // UPDATE


    // DELETE

}
