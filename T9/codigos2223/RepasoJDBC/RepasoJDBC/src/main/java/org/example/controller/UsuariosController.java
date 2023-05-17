package org.example.controller;

import org.example.database.DatabaseUtil;
import org.example.database.SchemeDB;
import org.example.model.Usuario;

import java.sql.*;

public class UsuariosController {
    private Connection connection;

    public UsuariosController() {
        connection = new DatabaseUtil().getInstance();
    }

    public void insertarUsario(Usuario usuario) {
        // statement o preparestatement
        try {
            Statement statement = connection.createStatement();
            statement.execute(String.format("INSERT INTO %s (%s, %s, %s) VALUES ('%s','%s','%s')",
                    SchemeDB.TAB_USER_NAME,
                    SchemeDB.COL_NAME, SchemeDB.COL_MAIL, SchemeDB.COL_PASS,
                    usuario.getNombre(), usuario.getCorreo(), usuario.getPass()
            ));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertarUsuarioPS(Usuario usuario) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement
                    (String.format("INSERT INTO %s (%s, %s, %s) VALUES (?,?,?)",
                    SchemeDB.TAB_USER_NAME,
                    SchemeDB.COL_NAME, SchemeDB.COL_MAIL, SchemeDB.COL_PASS));
            preparedStatement.setString(1,usuario.getNombre());
            preparedStatement.setString(2,usuario.getCorreo());
            preparedStatement.setString(3,usuario.getPass());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void seleccionUsuarios(String nombre, String pass){
        // st o ps
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    String.format("SELECT * FROM %s WHERE %s = '%s' AND %s = '%s'",
                    SchemeDB.TAB_USER_NAME,
                    SchemeDB.COL_NAME, nombre,
                    SchemeDB.COL_PASS, pass
                    ));
            int rows = 0;
            while (resultSet.next()){
                rows++;
                String nombreResultado = resultSet.getString(SchemeDB.COL_NAME);
                String correoResultado = resultSet.getString(SchemeDB.COL_MAIL);
                String passResultado = resultSet.getString(SchemeDB.COL_PASS);
                System.out.printf("%s %s %s%n",nombreResultado,correoResultado, passResultado);
            }

            if (rows==1){
                System.out.println("Puedes hacer login");
            } else {
                System.out.println("Error");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void seleccionUsuariosInt(String nombre, String pass){

        // st o ps
        try {
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(
                    String.format("SELECT * FROM %s WHERE %s = '%s' AND %s = '%s'",
                            SchemeDB.TAB_USER_NAME,
                            SchemeDB.COL_NAME, nombre,
                            SchemeDB.COL_PASS, pass
                    ));
            System.out.println(rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
