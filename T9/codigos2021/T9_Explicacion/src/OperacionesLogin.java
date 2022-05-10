
import java.sql.*;
import java.sql.Date;
import java.util.*;
import database.SchemaDB;
import org.apache.commons.codec.digest.*;

import javax.xml.crypto.Data;

public class OperacionesLogin {
    Connection connection = null;

    public void conectarDB() {
        String connectionURL = "jdbc:mysql://127.0.0.1/colegio";
        try {
            connection = DriverManager.getConnection(connectionURL
                    , "root", "");
        } catch (SQLException throwables) {
            //throwables.printStackTrace();
            System.out.println("Fallo en la conexion con la base de datos");
        }
    }

    public void insertarUsuario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce correo");
        String correo = teclado.next();
        System.out.println("Introduce pass");
        String pass = teclado.next();
        String passSHA = DigestUtils.sha256Hex(pass);
        Date date = new Date(Calendar.getInstance().getTimeInMillis());

        String queryInsertPat = "INSERT INTO %s (%s,%s,%s) VALUES (?,?,?)";
        try {
            PreparedStatement prepareStetement = connection.prepareStatement(
                    String.format(queryInsertPat,
                            SchemaDB.DB_TAB_LOGIN,
                            SchemaDB.COL_EMAIL_LOG_TAB,
                            SchemaDB.COL_PASS_LOG_TAB,
                            SchemaDB.COL_LOG_LOG));
            prepareStetement.setString(1,correo);
            prepareStetement.setString(2,passSHA);
            prepareStetement.setDate(3,date);
            prepareStetement.executeUpdate();
        } catch (SQLException throwables) {
            //throwables.printStackTrace();
            // CAMPOS REPETIDOS
            System.out.println("usuario existente");
        }
    }

    public void cerrarConexion(){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void realizarLogin(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce correo");
        String correo = teclado.next();
        System.out.println("Introduce pass");
        String pass = teclado.next();
        try {
            Statement statement = connection.createStatement();
            String selectPat = "SELECT * FROM %s WHERE %s='%s' AND %s='%s'";

            ResultSet resultSet = statement.executeQuery(String.format(selectPat,SchemaDB.DB_TAB_LOGIN,
                    SchemaDB.COL_EMAIL_LOG_TAB,
                    correo,
                    SchemaDB.COL_PASS_LOG_TAB,
                    DigestUtils.sha256Hex(pass)));
            if (resultSet.next()){
                //System.out.println("login correcto");
                String correoLogin = resultSet.getString(SchemaDB.COL_EMAIL_LOG_TAB);
                String passLogin = resultSet.getString(SchemaDB.COL_PASS_LOG_TAB);
                System.out.println(correoLogin);
                System.out.println(passLogin);
            }else {
                System.out.println("login incorrecto");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
