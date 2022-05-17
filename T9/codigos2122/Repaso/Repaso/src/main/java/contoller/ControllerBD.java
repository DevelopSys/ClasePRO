package contoller;

import database.SchemeDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ControllerBD {


    Connection connection;

    private void getConnection() {
        /*String newConnectionURL = "jdbc:mysql://" + SchemeDB.host + "/" + SchemeDB.dtbs
                + "?" + "user=" + SchemeDB.user + "&password=" + SchemeDB.pass;*/
        try {
            connection = DriverManager.getConnection(SchemeDB.url);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertarPerfiles(){
        //Statement --> no trata tipos
        //PrepareStatement --> trata tipos
        Statement statement = null;
        getConnection();
        try {
            statement = connection.createStatement();
            // execute --> bool
            // executeUpdate --> int (afectadas)
            String query1 = "INSERT INTO %s (%s) VALUES ('Gerente')";
            statement.execute(String.format(query1,SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
            String query2 = "INSERT INTO %s (%s) VALUES ('Trabajador')";
            statement.execute(String.format(query2,SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
            String query3 = "INSERT INTO %s (%s) VALUES ('Director')";
            statement.execute(String.format(query3,SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            closeConnection();
        }
    }

}
