package repository;

import database.DBConnection;

import java.sql.*;

public class PedidoCRUDRepository {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet resultSet;


    public void comprarProducto(int idProducto, int idCliente){

        connection = DBConnection.getConnection();
        try {
            statement = connection.createStatement();
            // INSERT INTO PEDIDO (id_pro, id_clie) VALUES (idPro, idCli)
            String query = String.format("INSERT INTO %s (%s, %s) VALUES (%d, %d)",
                    "pedidos",
                    "id_producto","id_cliente",
                    idProducto,idCliente);
            statement.execute(query);

        } catch (SQLException e) {
            System.out.println("Fallo en la insercion del pedido");
            System.out.println(e.getMessage());
        } finally {
            DBConnection.closeConnection();
            resultSet = null;
        }

    }

}
