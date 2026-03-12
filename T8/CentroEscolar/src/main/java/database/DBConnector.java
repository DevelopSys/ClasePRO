package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    // DBConnector.connection
    private static Connection connection;

    // DBConnector.getConnection() -> connection
    public static Connection getConnection(){
        if (connection == null) {
            createConnection();
        }
        return connection;
    }

    private static void createConnection(){
        String user = "root";
        String pass = "root";
        String host = "127.0.0.1";
        String dbName = "alumnos_ces";
        String urlConection = String.format("jdbc:mysql://%s/%s",host,dbName);
        try {
            connection = DriverManager.getConnection(urlConection,user,pass);
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
            System.out.println(e.getMessage());
        }
    }

    public static void closeConnection(){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

}
