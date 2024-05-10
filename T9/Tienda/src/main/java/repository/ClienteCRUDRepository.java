package repository;

import database.DBConnection;
import database.Esquema;

import java.sql.*;

public class ClienteCRUDRepository {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public boolean obtenerClienteCorreo(String correo){
        boolean estaCliente = false;
        connection = DBConnection.getConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(String.format("SELECT * FROM %s WHERE %s='%s'",
                    Esquema.TAB_CLIENTES,
                    Esquema.COL_CORREO,correo));
            estaCliente = resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error en la consulta del correo");
            System.out.println(e.getMessage());
        }

        return estaCliente;
    }

    public void insertarCliente(String correo, String pass){

        connection = DBConnection.getConnection();
        //
        String query = String.format("INSERT INTO %s (%s, %s) VALUES (?, ?)",
                Esquema.TAB_CLIENTES,
                Esquema.COL_CORREO, Esquema.COL_PASS);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,correo);
            preparedStatement.setString(2,pass);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Fallo en insercion de cliente");
            System.out.println(e.getMessage());
        } finally {
            DBConnection.closeConnection();
            preparedStatement = null;
        }

    }

    public int obtenerIdUsuario(String correo, String pass){
        int idCliente = -1;
        connection = DBConnection.getConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(String.format("SELECT * FROM %s WHERE %s='%s' AND %s='%s'",
                    Esquema.TAB_CLIENTES,
                    Esquema.COL_CORREO,correo,
                    Esquema.COL_PASS,pass));

            while (resultSet.next()){
                idCliente = resultSet.getInt(Esquema.COL_ID);
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta del correo");
            System.out.println(e.getMessage());
        }

        return idCliente;
    }

}
