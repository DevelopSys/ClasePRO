import database.DBConnector;

import java.sql.Connection;

public class Entrada {
    public static void main(String[] args) {
        Connection connection = DBConnector.getConnection();

    }
}
