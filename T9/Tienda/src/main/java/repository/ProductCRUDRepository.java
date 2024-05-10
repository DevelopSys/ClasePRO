package repository;

import com.google.gson.Gson;
import database.DBConnection;
import database.Esquema;
import model.Producto;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;

public class ProductCRUDRepository {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet resultSet;

    public ProductCRUDRepository() {

    }

    public void importarProductos() {
        if (!hayProductos()){
            lecturaJSON();
        }
    }

    public boolean hayProductos(){

        connection = DBConnection.getConnection();
        boolean estaProdutos = false;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(String.format("SELECT * FROM "+Esquema.TAB_PRODUCTOS));
            estaProdutos = resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBConnection.closeConnection();
            resultSet=null;
        }


        return estaProdutos;
    }

    public void lecturaJSON() {

        String urlT = "https://dummyjson.com/products";
        try {
            URL url = new URL(urlT);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                builder.append(linea);
            }

            // [{rockets: []}]
            // JARRAY[0].rockets

            JSONObject jsonObject = new JSONObject(builder.toString());
            JSONArray productos = jsonObject.getJSONArray("products");
            for (int i = 0; i < productos.length(); i++) {
                JSONObject producto = productos.getJSONObject(i);
                Producto producto1 = new Gson().fromJson(producto.toString(), Producto.class);
                // INSETAR EL PRODUCTO EN BD
                insertarProduto(producto1);

            }


        } catch (MalformedURLException e) {
            System.out.println("Fallo en la URL");
        } catch (IOException e) {
            System.out.println("Fallo de conexion");
        }
        // leer todos los productos
        // inserto productos
    }

    public void insertarProduto(Producto producto) {
        // inserto producto
        connection = DBConnection.getConnection();
        // INSERT INTO PRODUCTOS (title, price) VALUES ('produto.getTitle()',producto.getPrice())
        String query = String.format("INSERT INTO %s (%s, %s) VALUES (?,?)",
                Esquema.TAB_PRODUCTOS,
                Esquema.COL_NOMBRE, Esquema.COL_PRECIO);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,producto.getTitle());
            preparedStatement.setInt(2,producto.getPrice());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBConnection.closeConnection();
            preparedStatement = null;
        }

    }


}
