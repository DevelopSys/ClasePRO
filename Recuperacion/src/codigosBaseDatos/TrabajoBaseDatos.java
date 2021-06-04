package codigosBaseDatos;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.Scanner;

public class TrabajoBaseDatos {

    Connection conexion;

    public void conectarBaseDatos(){
        //URL
        //user
        //pass
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/repaso","root","");
            System.out.println("Conectando con base de datos");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void insertarDatos(){
        if (conexion != null){

            try {
                /*Statement statementInsert = conexion.createStatement();
                statementInsert.executeUpdate("INSERT INTO usuario (nombre,apellido,telefono) VALUE ('Borja','Martin',123456)");*/
                /*PreparedStatement preparedInsert = conexion.prepareStatement("INSERT INTO usuario (nombre,apellido,telefono) VALUE (?,?,?)");
                preparedInsert.setString(1,"Borja");
                preparedInsert.setString(2,"Martin");
                preparedInsert.setInt(3,1234);
                preparedInsert.execute();*/
                Scanner scanner = new Scanner(System.in);
                System.out.println("Dime nomnbre");
                String nombre = scanner.next();
                System.out.println("Dime apellido");
                String apellido = scanner.next();
                System.out.println("Dime telefono");
                int telefono = scanner.nextInt();

                /*Statement statement = conexion.createStatement();
                statement.execute("INSERT INTO "+ SchemaDB.NOM_TAB_USER +" (nombre,apellido,telefono)" +
                        " VALUES ('"+nombre+"','"+apellido+"',"+telefono+")");*/
                /*PreparedStatement preparedStatement = conexion.prepareStatement("INSERT INTO usuario (nombre,apellido,telfono)" +
                        " VALUES (?,?,?)");
                preparedStatement.setString(1,nombre);
                preparedStatement.setString(2,apellido);
                preparedStatement.setInt(3,telefono);
                preparedStatement.execute();*/
                Statement statement = conexion.createStatement();
                String queryInsert = "INSERT INTO %s (%s,%s,%s) VALUE ('%s','%s',%d)";
                statement.execute(String.format(queryInsert
                        ,SchemaDB.NOM_TAB_USER
                        ,SchemaDB.NOM_COL_NOMBRE,SchemaDB.NOM_COL_APELLIDO, SchemaDB.NOM_COL_TELEFONO
                        ,nombre,apellido,telefono));

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } else {
            System.out.println("No hay conexion establecida");
            conectarBaseDatos();
            insertarDatos();
        }

    }

    public void leerDatos(){
        if (conexion!=null){
            try {
                Statement statementSelect = conexion.createStatement();
                String querySelect = "SELECT * FROM %s WHERE telefono=%d";
                ResultSet resultSet = statementSelect.executeQuery(String.format(querySelect,SchemaDB.NOM_TAB_USER,123456));
                if (resultSet!= null){
                    while (resultSet.next()){

                        String nombre = resultSet.getString(SchemaDB.NOM_COL_NOMBRE);
                        int telefono = resultSet.getInt(SchemaDB.NOM_COL_TELEFONO);
                        System.out.println(nombre +" "+telefono);
                    }
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            conectarBaseDatos();
            leerDatos();
        }
    }


    public void cerrarBaseDatos(){
        if (conexion!=null){
            try {
                conexion.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
