package dto;

import database.DBConnector;
import model.Alumno;
import utils.SchemDB;

import java.sql.*;

public class AlumnoDTO {

    // create
    // read
    // update
    // delete
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public boolean addUser(Alumno alumno) {
        connection = DBConnector.getConnection();
        try {
            statement = connection.createStatement();
            String query = String.format("INSERT INTO %s (%s,%s,%s,%s) " +
                    "VALUES ('%s','%s','%s',%d)",
                    SchemDB.TAB_USER,
                    SchemDB.COL_NAME,SchemDB.COL_SURNAME,SchemDB.COL_MAIL,SchemDB.COL_PHONE,
                    alumno.getNombre(),alumno.getApellido(),alumno.getCorreo(),alumno.getTelefono()
                    );
            Boolean resultado =  statement.execute(query);
            return resultado;
        } catch (SQLException e) {
            System.out.println("Error en la creacion del ST");
        }

        return true;
    }
}
