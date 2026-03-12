import database.DBConnector;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Connection connection = DBConnector.getConnection();
        try {
            System.out.println(connection.getCatalog());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
