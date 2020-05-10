package videos.basedatos.database;

import org.mariadb.jdbc.Driver;

import java.sql.*;

public class GestorDB {

    private Connection connection;

    public GestorDB() {
        realizarConexion();
    }

    private void realizarConexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String user = "programacion";
            String pass = "cesjpsegundo";
            String host = "192.168.64.2:3306";
            String dbName = "inicial";
            String url = "jdbc:mariadb://" + host + "/" + dbName;
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void insercion(){

        // statement ó preparestatement --> execute (query)
        Statement statement = null;
        //PreparedStatement preparedStatement = null;

        try {
            statement = connection.createStatement();
            String query = "INSERT INTO %s (%s,%s,%s) VALUES ('%s','%s',%d)";
            statement.execute(String.format(query,SchemaDB.NOM_TABLA,SchemaDB.COL_NOM,SchemaDB.COL_APE,SchemaDB.COL_TEL,
                    "Borja","Martin",123));
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void insercionPrepare(){

        // statement ó preparestatement --> execute (query)
        PreparedStatement preparedStatement = null;
        //PreparedStatement preparedStatement = null;

        try {
            String query = "INSERT INTO %s (%s,%s,%s) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(String.format(query,SchemaDB.NOM_TABLA,SchemaDB.COL_NOM,
                    SchemaDB.COL_APE,SchemaDB.COL_TEL));
            preparedStatement.setString(1,"BorjaP");
            preparedStatement.setString(2,"MartinP");
            preparedStatement.setInt(3,123);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrado(){

        // statement ó preparestatement --> execute (query)
        Statement statement = null;
        //PreparedStatement preparedStatement = null;

        try {
            statement = connection.createStatement();
            String query = "DELETE FROM %s WHERE %s = '%s'";
            int filasAfectadas = statement.executeUpdate(String.format(query,SchemaDB.NOM_TABLA,SchemaDB.COL_NOM,"BorjaP"));
            System.out.println(filasAfectadas);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }


}
