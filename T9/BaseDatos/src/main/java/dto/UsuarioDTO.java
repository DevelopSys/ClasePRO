package dto;

import database.DBConnector;
import database.SchemaDB;
import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDTO {

    // representa el servicio contra la base de datos

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

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
            String queryFormateado = String.format(query,SchemaDB.TAB_USER,
                    SchemaDB.COL_NAME, SchemaDB.COL_SURNAME, SchemaDB.COL_MAIL, SchemaDB.COL_PASS, SchemaDB.COL_PROFILE,
                    usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getPass(), usuario.getPerfil());
            statement.execute(queryFormateado);
        } catch (SQLException e) {
            System.out.println("Error en la query");
            System.out.println(e.getMessage());

        }
    }


}
