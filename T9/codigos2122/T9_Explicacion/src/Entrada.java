import java.sql.*;

public class Entrada {

    public static void main(String[] args) {

        String connectionURL = "jdbc:mysql://127.0.0.1/colegio";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionURL
                    ,"root","");

            //CREAR
            String queryCreate = "INSERT INTO usuario (nombre,apellido,telefono) VALUES ('Borja','Martin',1234)";
            Statement statementCreate = connection.createStatement();

            statementCreate.executeUpdate(queryCreate); // me da un int
            statementCreate.execute(queryCreate); // boolean
            // solo lo utilizo si hago una query de SELECT
            statementCreate.executeQuery(queryCreate); // resulset

            //ACTUALIZAR

            //BORRAR

            //SELECCIONAR

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
