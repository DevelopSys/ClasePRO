package database;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionDB {

    private Connection connection;

    private void createConnection(){

        String url = String.format("jdbc:mysql://localhost/%s",SchemeDB.DB_NAME);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,"root","");
            //System.out.println("Conexion correcta");
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

    public void closeConnecion(){
        try {
            if (connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
