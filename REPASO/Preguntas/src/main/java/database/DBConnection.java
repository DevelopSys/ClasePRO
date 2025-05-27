package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection()  {
        if (connection == null){
            try {
                createConnection();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (NullPointerException e){

            }
        }

        return connection;
    }

    private static void createConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nBaseDats","root","")
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/nBaseDats","root","")
        connection = DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/%s",ScehemaDB.URL,ScehemaDB.PORT,ScehemaDB.DB_NAME),"root","")
    }
}
