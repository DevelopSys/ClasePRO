package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static Connection connection;

    // plantear un patron singleton

    // getConnection -> retorna la conexion

    public static Connection getConnection(){

        if (connection == null){
            createConnection();
        }

        return connection;
    }

    // createConnection -> crea la conecxion
    private static void createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String uri = String.format("jdbc:mysql://%s/%s", Esquema.HOST, Esquema.DB_NAME);
            connection = DriverManager.getConnection(uri,"root","");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encuentra el driver");
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la conexion a la base de datos");
            System.out.println(e.getMessage());
        }
        // Cargar el Driver Class.forName("")
        // url = ""
        // DriverManager.connect(uri, user, pass)
    }


    // closeConnecion -> cierra la conexion
    public static void closeConnection(){
        try {
            connection.close();
            connection = null;
        } catch (SQLException | NullPointerException e) {
            System.out.println("error al cerrar la base de datos");
        }
    }
}
