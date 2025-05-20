package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection(){

        if(connection == null){
            createConnection();
        }
        return connection;
    }

    private static void createConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos","root","");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
