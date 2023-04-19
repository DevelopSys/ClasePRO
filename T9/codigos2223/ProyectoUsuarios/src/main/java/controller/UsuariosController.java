package controller;

import database.ConexionDB;
import database.SchemeDB;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.plaf.nimbus.State;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;

public class UsuariosController {

    Connection connection;

    public UsuariosController(){
        connection = new ConexionDB().getConnection();
    }

    public void insertarPerfiles(){
        try {
            Statement st = connection.createStatement();
            String queryPerfil = "INSERT INTO %s (%s) VALUES ('%s')";
            st.executeUpdate(String.format(queryPerfil, SchemeDB.TABLE_PROFILE,SchemeDB.COL_DESCRIPTION,"trabajador"));
            st.executeUpdate(String.format(queryPerfil, SchemeDB.TABLE_PROFILE,SchemeDB.COL_DESCRIPTION,"director"));
            st.executeUpdate(String.format(queryPerfil, SchemeDB.TABLE_PROFILE,SchemeDB.COL_DESCRIPTION,"gerente"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertarUsuarios(){


        String queryUsuario = "INSERT INTO %s (%s, %s, %s, %s) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(String.format(queryUsuario,SchemeDB.TABLE_USER,
                    SchemeDB.COL_NAME,SchemeDB.COL_SURNAME, SchemeDB.COL_PHONE, SchemeDB.COL_CONTRY));
            ps.setString(1,"Heide-Marie");
            ps.setString(2,"Rausch");
            ps.setInt(3,2145024);
            ps.setString(4,"Holanda");
            ps.execute();

            ps.setString(1,"Liam");
            ps.setString(2,"Montgomery");
            ps.setInt(3,16977);
            ps.setString(4,"España");
            ps.execute();

            ps.setString(1,"Ioanna");
            ps.setString(2,"Van der Gaag");
            ps.setInt(3,978229);
            ps.setString(4,"Belgica");
            ps.execute();

            ps.setString(1,"Eloane");
            ps.setString(2,"Bourgeois");
            ps.setInt(3,595439);
            ps.setString(4,"Francia");
            ps.execute();

            ps.setString(1,"Mina");
            ps.setString(2,"Rieger");
            ps.setInt(3,8154354);
            ps.setString(4,"Alemania");
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void realizarOperaciones(){
        try {
            Statement st = connection.createStatement();
            // actualizar usuarios de España y ponerlos a 10000
            String queryUPDATE = "UPDATE %s SET %s=%d WHERE %s='%s'";
            int rows = st.executeUpdate(String.format(queryUPDATE,SchemeDB.TABLE_USER,
                    SchemeDB.COL_SALARY,10000,
                    SchemeDB.COL_CONTRY,"España"));
            if (rows>0){
                System.out.println("El número de usuarios de España actualizados es de "+rows);
            }
            queryUPDATE = "UPDATE %s SET %s=? WHERE %s=?";
            PreparedStatement ps = connection.prepareStatement(String.format(queryUPDATE,SchemeDB.TABLE_USER,
                    SchemeDB.COL_SALARY,
                    SchemeDB.COL_CONTRY));
            ps.setInt(1,5000);
            ps.setString(2,"Alemania");
            rows = ps.executeUpdate();
            if (rows>0){
                System.out.println("El número de usuarios de Alemania actualizados es de "+rows);
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void consularDatos(){
        String query = "SELECT * FROM %s WHERE %s = '%s'";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(String.format(query,SchemeDB.TABLE_USER,SchemeDB.COL_CONTRY,"España"));
            while (rs.next()){
                String nombre = rs.getString(SchemeDB.COL_NAME);
                int sueldo = rs.getInt(SchemeDB.COL_SALARY);
                System.out.printf("El nombre es: %s el salario es: %d%n",nombre,sueldo);
            }
            System.out.println("ORDENADOS");
            query = "SELECT * FROM %s ORDER BY %s";
            st = connection.createStatement();
            rs = st.executeQuery(String.format(query,SchemeDB.TABLE_USER,SchemeDB.COL_SALARY));
            while (rs.next()){
                String nombre = rs.getString(SchemeDB.COL_NAME);
                int sueldo = rs.getInt(SchemeDB.COL_SALARY);
                System.out.printf("El nombre es: %s el salario es: %d%n",nombre,sueldo);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void getAllProductos(){
        String urlString = "https://dummyjson.com/products";


        try {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format("INSERT INTO %s (%s, %s, %s, %s) VALUES (?,?,?,?)",
                    SchemeDB.TABLE_PRODUCT,
                    SchemeDB.COL_NAME, SchemeDB.COL_DESCRIPTION, SchemeDB.COL_PRICE, SchemeDB.COL_CATEGORY));
            URL url = new URL(urlString);
            HttpURLConnection connectionHttp = (HttpURLConnection) url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionHttp.getInputStream()));
            String linea = null;
            StringBuilder builder = new StringBuilder();
            while ((linea = bufferedReader.readLine())!= null){
                builder.append(linea);
            }
            JSONObject objectResponse = new JSONObject(builder.toString());
            JSONArray arrayProducts = objectResponse.getJSONArray("products");
            for (int i = 0; i < arrayProducts.length(); i++) {
                JSONObject producto = arrayProducts.getJSONObject(i);
                String name = producto.getString("title");
                String descrition = producto.getString("description");
                String category = producto.getString("category");
                int price = producto.getInt("price");
                preparedStatement.setString(1,name);
                preparedStatement.setString(2,descrition);
                preparedStatement.setInt(3,price);
                preparedStatement.setString(4,category);
                preparedStatement.execute();
            }



        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
