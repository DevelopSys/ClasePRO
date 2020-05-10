package github.basedatos.database;

import java.sql.*;

public class GestorDB {

    private Connection connection;

    public GestorDB() {
        realizarConexion();
    }

    private void realizarConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
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

    public void realizarInsercion() {
        try {
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                String usuario = "ejemplo";
                String apellido = "ejemplo";
                String query = "INSERT INTO usuario (nombre,apellido,telefono) " +
                        "VALUES ('%s','%s',%d)";
                statement.execute(String.format(query, usuario, apellido, 123));
                statement.close();
                //statement.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void realizarInsercionPrepare() {
        try {
            if (!connection.isClosed()) {
                String query = "INSERT INTO usuario (nombre,apellido,telefono) " +
                        "VALUES (?,?,?)";
                PreparedStatement pStatement = connection.prepareStatement(query);
                String usuario = "ejemplo";
                String apellido = "ejemplo";
                pStatement.setString(1, usuario);
                pStatement.setString(2, apellido);
                pStatement.setInt(3, 123);
                pStatement.execute();
                pStatement.close();

                //pStatement.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void realizarBorrado() {
        try {
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                String usuario = "ejemplo";
                String query = "DELETE FROM usuario" +
                        " WHERE nombre = '%s'";
                int filasAfectadas = statement.executeUpdate(String.format(query, usuario));
                System.out.println("Las filas que se han borrado han sido " + filasAfectadas);
                statement.close();
                statement.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void realizarBorradoPrepare() {
        try {
            if (!connection.isClosed()) {
                String usuario = "ejemplo";
                String query = "DELETE FROM usuario" +
                        " WHERE nombre = ?";
                PreparedStatement pStatement = connection.prepareStatement(query);
                pStatement.setString(1, "ejemplo");
                int filasAfectadas = pStatement.executeUpdate();
                System.out.println("Las filas que se han borrado han sido " + filasAfectadas);
                pStatement.close();
                pStatement.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void realizarActualizacion() {
        try {
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                String usuario = "ejemplo";
                String usuarioNuevo = "ejemploNuevo";
                String query = "UPDATE usuario SET nombre = '%s'" +
                        " WHERE nombre = '%s'";
                int filasAfectadas = statement.executeUpdate(String.format(query, usuarioNuevo, usuario));
                System.out.println("Las filas que se han actualizado han sido " + filasAfectadas);
                statement.close();
                //statement.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void realizarActualizacionPrepare() {
        try {
            if (!connection.isClosed()) {
                String usuario = "ejemplo";
                String usuarioNuevo = "ejemploNuevo";
                String query = "UPDATE usuario SET nombre = ?" +
                        " WHERE nombre = ";
                PreparedStatement pStatement = connection.prepareStatement(query);
                pStatement.setString(1, usuarioNuevo);
                pStatement.setString(2, usuario);
                int filasAfectadas = pStatement.executeUpdate(String.format(query, usuarioNuevo, usuario));
                System.out.println("Las filas que se han actualizado han sido " + filasAfectadas);
                pStatement.close();
                //pStatement.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void realizarConsultaTodos() {
        try {
            if (!connection.isClosed()) {
                String query = "SELECT * FROM usuario";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(String.format(query));
                System.out.println("ejecutado");
                if (resultSet != null) {
                    while (resultSet.next()) {
                        String nombre = resultSet.getString("nombre");
                        String apellido = resultSet.getString("apellido");
                        int telefono = resultSet.getInt("telefono");
                        System.out.printf("el usuario es: %d %s, %s, %d %n", resultSet.getRow(), nombre, apellido, telefono);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void realizarConsultaPrepare() {
        try {
            if (!connection.isClosed()) {
                String query = "SELECT * FROM usuario";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
                System.out.println("ejecutado");
                if (resultSet != null) {
                    while (resultSet.next()) {
                        String nombre = resultSet.getString("nombre");
                        String apellido = resultSet.getString("apellido");
                        int telefono = resultSet.getInt("telefono");
                        System.out.printf("el usuario es: %d %s, %s, %d %n", resultSet.getRow(), nombre, apellido, telefono);
                    }
                }

                resultSet.close();
                preparedStatement.close();
                preparedStatement.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
