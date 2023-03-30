package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection connection;

    private void createConnection(){
        String url = "jdbc:mysql://localhost/programacion";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,"root","");
            System.out.println("Conexion correcta");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Conexion incorrecta");
        }
    }

    public Connection getConnection() {
        if (connection==null){
            createConnection();
        }
        return connection;
    }
}
