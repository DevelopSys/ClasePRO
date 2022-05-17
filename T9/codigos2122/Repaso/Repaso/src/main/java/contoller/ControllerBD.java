package contoller;

import database.SchemeDB;
import model.Usuario;

import java.sql.*;

public class ControllerBD {


    Connection connection;

    private void getConnection() {
        /*String newConnectionURL = "jdbc:mysql://" + SchemeDB.host + "/" + SchemeDB.dtbs
                + "?" + "user=" + SchemeDB.user + "&password=" + SchemeDB.pass;*/
        try {
            connection = DriverManager.getConnection(SchemeDB.url);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertarPerfiles(){
        //Statement --> no trata tipos
        //PrepareStatement --> trata tipos
        Statement statement = null;
        getConnection();
        try {
            statement = connection.createStatement();
            // execute --> bool
            // executeUpdate --> int (afectadas)
            String query1 = "INSERT INTO %s (%s) VALUES ('Gerente')";
            statement.execute(String.format(query1,SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
            String query2 = "INSERT INTO %s (%s) VALUES ('Trabajador')";
            statement.execute(String.format(query2,SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
            String query3 = "INSERT INTO %s (%s) VALUES ('Director')";
            statement.execute(String.format(query3,SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            closeConnection();
        }
    }

    public void agregarUsuario(){
        addUserIndividual(new Usuario("Heide-Marie","Rausch","Holanda",2145024,1));
        addUserIndividual(new Usuario("Liam","Montgomery","España",1216977,2));
        addUserIndividual(new Usuario("Ioanna"," Van der Gaag","Belgica",978229,3));
    }

    public void selectSueldos(int sueldoParam){
        getConnection();
        Statement statement = null;

        try {
            statement = connection.createStatement();
            String query = "SELECT * FROM %s WHERE %s > %d";
            String queryFormat = String.format(query,SchemeDB.TAB_USUARIOS,
                    SchemeDB.COL_SUELDO,sueldoParam);
            ResultSet rows = statement.executeQuery(queryFormat);
            //rows.first();

            while (rows.next()){
                String nombre = rows.getString(SchemeDB.COL_NOMBRE) ;
                int sueldo  = rows.getInt(SchemeDB.COL_SUELDO);
                Usuario usuario = new Usuario(nombre,sueldo);
                System.out.println(usuario.getNombre());
                
            };

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void addUserIndividual(Usuario usuario){
        getConnection();
        String query = "INSERT INTO %s (%s,%s,%s,%s,%s) VALUE (?,?,?,?,?)";
        String queryFormat = String.format(query,SchemeDB.TAB_USUARIOS
                ,SchemeDB.COL_NOMBRE,SchemeDB.COL_APELLIDO,SchemeDB.COL_TELEFONO,
                SchemeDB.COL_PAIS, SchemeDB.COL_FK_ID);
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(queryFormat);
            preparedStatement.setString(1,usuario.getNombre());
            preparedStatement.setString(2,usuario.getApellido());
            preparedStatement.setInt(3,usuario.getTelefono());
            preparedStatement.setString(4,usuario.getPais());
            preparedStatement.setInt(5,usuario.getId_perfil());
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            closeConnection();
        }
    }


}
