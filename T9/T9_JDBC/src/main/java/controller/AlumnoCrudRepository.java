package controller;


import database.DBConnection;
import database.Esquema;
import model.Alumno;

import java.sql.*;
import java.util.ArrayList;

public class AlumnoCrudRepository {

    // C -> Create -> INSERT
    // R -> Read -> SELECT
    // U -> Update -> UPDATE
    // D -> Delete -> DELETE

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void ejemplo() throws SQLException {
        // statement = connection.createStatement();
        // statement.execute("INSERT INTO alumnos VALUES (asdasd,'asdasd',123,'asdasd)");
        String query = "INSERT into alumnos VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(2,23);
        preparedStatement.setString(1,"asdasdasd");
        preparedStatement.setString(3,"asdasdasd");
        preparedStatement.setString(4,"asdasdasd");
        preparedStatement.execute();

    }

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

    public void darBajaAlumno(int id) {

        // Abrir la conexion
        connection = DBConnection.getConnection();
        // connection.setAutoCommit(true);
        // Trabajo
        try {
            statement = connection.createStatement();
            String query = "DELETE FROM "+Esquema.TAB_ALUMNOS+" WHERE id="+id;
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

    public void actualizarAlumno(int id, String nombre) {

        // Abrir la conexion
        connection = DBConnection.getConnection();
        // connection.setAutoCommit(true);
        // Trabajo
        try {
            statement = connection.createStatement();
            String query = String.format("UPDATE FROM %s SET %s=%s WHERE %s=%d",
                    Esquema.TAB_ALUMNOS,
                    Esquema.COL_NOMBRE, nombre,
                    "id",id);
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

    public ArrayList<Alumno> obtenerAlumnos(){
        String query = "SELECT * FROM "+Esquema.TAB_ALUMNOS;
        ArrayList<Alumno> listaResultado = new ArrayList<>();

        connection = DBConnection.getConnection();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int id = resultSet.getInt(Esquema.COL_ID);
                String nombre = resultSet.getString(Esquema.COL_NOMBRE);
                String apellido = resultSet.getString(Esquema.COL_APELLIDO);
                String correo = resultSet.getString(Esquema.COL_CORREO);
                int telefono = resultSet.getInt(Esquema.COL_TELEFONO);
                Alumno alumno = new Alumno(id, nombre,apellido,correo,telefono);
                listaResultado.add(alumno);

            }



        } catch (SQLException e) {
            System.out.println("Error en ejecicion SQL");
            System.out.println(e.getMessage());
        }


        DBConnection.closeConnection();
        connection = null;

        return listaResultado;
    }

    // DELETE https://www.w3schools.com/sql/sql_delete.asp

    // UPDATE https://www.w3schools.com/sql/sql_update.asp
}
