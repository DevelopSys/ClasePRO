package dto;

import database.DBConnector;
import model.Alumno;
import utils.SchemDB;

import java.sql.*;
import java.util.ArrayList;

public class AlumnoDTO {

    // create
    // read
    // update
    // delete
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public boolean addUser(Alumno alumno) throws SQLException {
        connection = DBConnector.getConnection();

        statement = connection.createStatement();
        String query = String.format("INSERT INTO %s (%s,%s,%s,%s) " +
                        "VALUES ('%s','%s','%s',%d)",
                SchemDB.TAB_USER,
                SchemDB.COL_NAME, SchemDB.COL_SURNAME, SchemDB.COL_MAIL, SchemDB.COL_PHONE,
                alumno.getNombre(), alumno.getApellido(), alumno.getCorreo(), alumno.getTelefono()
        );
        Boolean resultado = statement.execute(query);
        return resultado;

    }

    public int addUserPS(Alumno alumno) throws SQLException {
        connection = DBConnector.getConnection();
        String query = String.format("INSERT INTO %s (%s,%s,%s,%s) " +
                        "VALUES (?,?,?,?)",
                SchemDB.TAB_USER,
                SchemDB.COL_NAME, SchemDB.COL_SURNAME, SchemDB.COL_MAIL, SchemDB.COL_PHONE
        );
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, alumno.getNombre());
        preparedStatement.setString(2, alumno.getApellido());
        preparedStatement.setString(3, alumno.getCorreo());
        preparedStatement.setInt(4, alumno.getTelefono());
        return preparedStatement.executeUpdate();
    }

    public int deleteFromLocalidad(String localidad) {
        connection = DBConnector.getConnection();
        // 1 crea la query
        String query = String.format("DELETE FROM %s WHERE %s = ?"
                , SchemDB.TAB_USER, SchemDB.COL_LOCATE);

        try {
            // 2 crea el ejecutor de querys partiendo de la conexion
            preparedStatement = connection.prepareStatement(query);
            // 3 parametriza
            preparedStatement.setString(1, localidad);
            // 4 ejecuto query
            int rows = preparedStatement.executeUpdate();

            return rows;
        } catch (SQLException e) {
            System.out.println("Query incorrecta");
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public ArrayList<Alumno> getAllAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        connection = DBConnector.getConnection();
        // 1 creo query
        String query = "SELECT * FROM " + SchemDB.TAB_USER;
        // 2 creo el ejecutor
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String nombre = resultSet.getString(SchemDB.COL_NAME);
                String apellido = resultSet.getString(SchemDB.COL_SURNAME);
                String correo = resultSet.getString(SchemDB.COL_MAIL);
                String localidad = resultSet.getString(SchemDB.COL_LOCATE);
                int telefono = resultSet.getInt(SchemDB.COL_PHONE);
                int couta = resultSet.getInt(SchemDB.COL_COUT);
                Alumno alumno = new Alumno(nombre, apellido, correo, telefono);
                alumnos.add(alumno);
            }
            return alumnos;

        } catch (SQLException e) {
            System.out.println("Error en la SQL");
            System.out.println(e.getMessage());
        }
        return null;
    }

    public int getNumeroUsuarioLocalidad(String localidad){
        // SELECT * FROM usuarios WHERE localidad = ?
        return 1;
    }


}
