package controller;

import database.DBConnection;
import database.Esquema;
import model.Profesor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfesorCrudRespository {

    private Connection connection;
    private PreparedStatement ps;

    private ResultSet rs;

    // INSERT
    public void insertarProfesor(Profesor profesor) {

        // abro conexion
        connection = DBConnection.getConnection();

        // trabajo


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
    public void actualizarProfesor(int id, int salario) {

        connection = DBConnection.getConnection();

        String query = String.format("UPDATE %s SET %s=? WHERE %s=?", Esquema.TAB_PROFESORES,
                Esquema.COL_SALARIO,
                Esquema.COL_ID);

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, salario);
            ps.setInt(2, 1);
            int numeroUpdate = ps.executeUpdate();
            System.out.println("Actualizados con exito: " + numeroUpdate);

        } catch (SQLException e) {
            System.out.println("Error en SQL");
        }

        DBConnection.closeConnection();
        connection = null;

    }

    // DELETE

    public void eliminarProfesor(int id) {

        connection = DBConnection.getConnection();

        String query = String.format("DELETE FROM %s WHERE %s=?", Esquema.TAB_PROFESORES,
                Esquema.COL_ID);

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            int numeroUpdate = ps.executeUpdate();
            System.out.println("Eliminados con exito: " + numeroUpdate);

        } catch (SQLException e) {
            System.out.println("Error en SQL");
        }

        DBConnection.closeConnection();
        connection = null;

    }

    public ArrayList<Profesor> obtenerProfesores(int salario) {

        ArrayList<Profesor> listaResultados = new ArrayList<>();
        connection = DBConnection.getConnection();
        String query = String.format("SELECT * FROM %s WHERE %s>?", Esquema.TAB_PROFESORES, Esquema.COL_SALARIO);
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, salario);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(Esquema.COL_ID);
                String nombre = rs.getString(Esquema.COL_NOMBRE);
                ;
                String correo = rs.getString(Esquema.COL_CORREO);
                ;
                String direccion = rs.getString(Esquema.COL_DIRECCION);
                ;
                int salarioOBJ = rs.getInt(Esquema.COL_SALARIO);
                Profesor profesor = new Profesor(id, nombre, correo, salarioOBJ, direccion);
                listaResultados.add(profesor);
            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        DBConnection.closeConnection();
        connection = null;
        return listaResultados;
    }
}
