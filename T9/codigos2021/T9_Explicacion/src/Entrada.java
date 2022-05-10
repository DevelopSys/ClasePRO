
import java.sql.*;
import database.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        String connectionURL = "jdbc:mysql://127.0.0.1/colegio";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionURL
                    ,"root","");
            /*
            CREAR
            Scanner teclado = new Scanner(System.in);
            System.out.println("intro nombre");
            String nombre = teclado.next();
            System.out.println("intro apellido");
            String apellido = teclado.next();
            System.out.println("intro telefono");
            int telefono = teclado.nextInt();

            String queryCreate = "INSERT INTO "+ SchemaDB.DB_TAB_USER +"("+SchemaDB.COL_NAME_USER_TAB
                    +","+SchemaDB.COL_SUR_USER_TAB+","+SchemaDB.COL_PHO_USER_TAB
                    +") VALUES ('"+nombre+"','"+apellido+"',"+4567+")";*/

            /*String queryCreatePat = "INSERT INTO %s (%s,%s,%s) VALUES ('%s','%s',%d)";
            String queryCreate = String.format(queryCreatePat,
                    SchemaDB.DB_TAB_USER,
                    SchemaDB.COL_NAME_USER_TAB,SchemaDB.COL_SUR_USER_TAB,SchemaDB.COL_PHO_USER_TAB,
                    nombre,apellido,telefono);

            Statement statementCreate = connection.createStatement();
            System.out.println(statementCreate.executeUpdate(queryCreate));


            System.out.println("intro nombre nuevo");
            String nombreNuevo = teclado.next();
            System.out.println("intro nombre antiguo");
            String nombreAntiguo = teclado.next();
            String queryUpdatePat = "UPDATE %s SET %s = '%s' WHERE %s = '%s'";
            String queryUpdate = String.format(queryUpdatePat,SchemaDB.DB_TAB_USER,
                    SchemaDB.COL_NAME_USER_TAB,nombreNuevo,
                    SchemaDB.COL_NAME_USER_TAB,nombreAntiguo);
            Statement statementUpdate = connection.createStatement();
            System.out.println(statementUpdate.executeUpdate(queryUpdate));


            System.out.println("intro nombre a borrar");
            String nombreBorrar = teclado.next();
            String queryDeletePat = "DELETE FROM %s WHERE %s = '%s'";
            String queryDelete = String.format(queryDeletePat,SchemaDB.DB_TAB_USER,SchemaDB.COL_NAME_USER_TAB,nombreBorrar);
            Statement statementDelete = connection.createStatement();
            statementDelete.executeUpdate(queryDelete);

            //SELECCIONAR

            String querySelectPat = "SELECT * FROM %s WHERE %s='%s'";
            Statement statementSelect = connection.createStatement();
            //ResultSet resultadoQuery = statementSelect.executeQuery(String.format(querySelectPat,SchemaDB.DB_TAB_USER, SchemaDB.COL_NAME_USER_TAB,"Pedro"));
            ResultSet resultadoQuery = statementSelect.executeQuery(String.format(querySelectPat,SchemaDB, SchemaDB.COL_NAME_USER_TAB,"Pedro"));

            ArrayList listaUsuarios = new ArrayList();

            for ( Object item : listaUsuarios ) {

                Statement statement = connection.createStatement();
                statement.executeQuery("INSERT INTO USUARIO (col,col,col) VALUES ('%s','%s',%d)");
            }


            while (resultadoQuery.next()){
                String nombreResultado  = resultadoQuery.getString(SchemaDB.COL_NAME_USER_TAB);
                String apellidoResultado = resultadoQuery.getString(SchemaDB.COL_SUR_USER_TAB);
                System.out.printf("El registro es %s - %s%n",nombreResultado, apellidoResultado);
                //Usuario user = new Usuario(nombreResultado,apellidoResultado);
                //listaUsuarios.add(user)
            }


        */
            String insertPreparePat = "INSERT INTO %s (%s,%s,%s) VALUES (?,?,?)";
            PreparedStatement prepareInsert = connection.prepareStatement(String.format(insertPreparePat,
                    SchemaDB.DB_TAB_USER,
                    SchemaDB.COL_NAME_USER_TAB,
                    SchemaDB.COL_SUR_USER_TAB,
                    SchemaDB.COL_PHO_USER_TAB));

            String nombre;

            /*for (int i = 0; i < 3; i++) {
                String.format(SchemaDB.queryInsertar,"asd","asd");
                //prepareInsert.setString(i,nombre);
            }*/
            prepareInsert.setString(1,"borjaps");
            prepareInsert.setString(2,"martinps");
            prepareInsert.setInt(3,123123);
            prepareInsert.executeUpdate();


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
