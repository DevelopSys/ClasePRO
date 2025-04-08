package dto;

import database.DBConnector;
import database.SchemaDB;
import model.Usuario;

import java.sql.*;

public class UsuarioDTO {

    // representa el servicio contra la base de datos

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public UsuarioDTO() {
        connection = DBConnector.getConnection();
    }

    // comun: db_name, col_name

    // CREATE ->
    // INSERT INTO usuarios (nombre, apellido, correo, pass, perfil) VALUES ('Borja','Martin','correo','pass',5)
    public void insertarUsuarios(Usuario usuario) {
        try {
            statement = connection.createStatement();
            //String query = "INSERT INTO " + SchemaDB.TAB_USER + " (" + SchemaDB.COL_NAME + ", " + SchemaDB.COL_SURNAME + ", " + SchemaDB.COL_MAIL + ", " + SchemaDB.COL_PASS + ", " + SchemaDB.COL_PROFILE + ") VALUES ('"+usuario.getNombre()+"','Martin','correo','pass',"+usuario.getPerfil()+")";
            String query = "INSERT INTO %s (%s, %s, %s, %s, %s) VALUES ('%s','%s','%s','%s',%d)";
            String queryFormateado = String.format(query, SchemaDB.TAB_USER,
                    SchemaDB.COL_NAME, SchemaDB.COL_SURNAME, SchemaDB.COL_MAIL, SchemaDB.COL_PASS, SchemaDB.COL_PROFILE,
                    usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getPass(), usuario.getPerfil());
            statement.execute(queryFormateado);

        } catch (SQLException e) {
            System.out.println("Error en la query");
            System.out.println(e.getMessage());
        } finally {
            /*try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }*/
            DBConnector.closeConnection();
        }
    }

    public void insertarUsuariosPS(Usuario usuario) throws SQLIntegrityConstraintViolationException, SQLException {
        String query = "INSERT INTO %s (%s, %s, %s, %s, %s) VALUES (?,?,?,?,?)";
        String queryFormateada = String.format(query, SchemaDB.TAB_USER,
                SchemaDB.COL_NAME, SchemaDB.COL_MAIL, SchemaDB.COL_SURNAME, SchemaDB.COL_PASS, SchemaDB.COL_AMOUNT);

        preparedStatement = connection.prepareStatement(queryFormateada);
        preparedStatement.setString(1, usuario.getNombre());
        preparedStatement.setString(2, usuario.getCorreo());
        preparedStatement.setString(3, usuario.getApellido());
        preparedStatement.setString(4, usuario.getPass());
        preparedStatement.setInt(5, 10000);
        preparedStatement.execute();

    }

    public int borrarUsuario(int venta) {
        int despidos = 0;
        String query = String.format("DELETE FROM %s WHERE %s<?"
                , SchemaDB.TAB_USER, SchemaDB.COL_AMOUNT);
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, venta);
            despidos = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Fallo de ese SQL");
        }

        return despidos;

    }

    public void listarUsuarios() {
        // SELECT * FROM USUARIOS
        String query = ("SELECT * FROM " + SchemaDB.TAB_USER);
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String nombre = resultSet.getString(SchemaDB.COL_NAME);
                String correo = resultSet.getString(SchemaDB.COL_MAIL);
                String pass = resultSet.getString(SchemaDB.COL_PASS);
                System.out.printf("Nombre: %s correo: %s pass: %s%n", nombre, correo, pass);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int realizarLogin(String mail, String pass) {
        // SELECT correo, pass FROM usuarios WHERE correo=XXX AND pass=XXX
        // resultset.next()
        String query = String.format("SELECT %s FROM %s WHERE %s=? AND %s=?", "id_perfil",
                SchemaDB.TAB_USER,
                SchemaDB.COL_MAIL, SchemaDB.COL_PASS
        );
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, pass);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("id_perfil");
            }
        } catch (SQLException e) {
            System.out.println("Fallo en ejecucion");
        }

        return -1;
    }
}
