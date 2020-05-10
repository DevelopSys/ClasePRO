package clases.basedatos.database;

import java.sql.*;

public class Conexion {

    private Connection connection;

    public Conexion() {
        getConnection();
    }

    public void getConnection() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver");
            String host = "127.0.0.1";
            String dbname = "inicial";
            String url = "jdbc:mariadb://" + host + "/" + dbname;
            String username = "programacion";
            String password = "cesjpsegundo";
            //Connection conn = null;
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha podido cargar el driver");
            //e.printStackTrace();
        }
    }

    public void verConexion(){
        System.out.println(connection.toString());
    }

    /*public Connection getConnectionExterno() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String host = "192.168.64.2:3306";
            String dbname = "inicial";
            String url = "jdbc:mariadb://" + host + "/" + dbname;
            String username = "programacion";
            String password = "cesjpsegundo";
            //Connection conn = null;
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            System.out.println("No se ha podido cargar el driver");
            //e.printStackTrace();
        }


    }*/

    public void operaciones() {
        // CreateReadUpdateDelete
        // CUD -- escrituras
        // R -- lectura

        // ResultSet --> lecturas
        // Statement --> escrituras;
        // PreparedStatement -- escrituras;

    }

    public void insertarDatos(String n, String a, int t) {
        try {
            if (!connection.isReadOnly()) {
                connection.setAutoCommit(true);
                //TODO escritura
                Statement statement = connection.createStatement();
                //String nombre= "Borja";
                //String apellido= "Martin";
                //int telefono= 123;
                String query_modelo = "INSERT INTO %s (%s,%s,%s) VALUES ('%s','%s',%d)";
                boolean exito = statement.execute(String.format(query_modelo, SchemaDB.TAB_USUARIO,
                        SchemaDB.COL_USUARIO_NOM, SchemaDB.COL_USUARIO_APE, SchemaDB.COL_USUARIO_TLF,
                        n, a, t));

                if (!exito) {
                    System.out.println("la query se ha ejecutado correctamente");
                } else {
                    System.out.println("la query no se ha ejecutado correctamente");
                }
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertarDatosPrepare(String n, String a, int t) {
        try {
            if (!connection.isClosed()) {
                String query_modelo = "INSERT INTO ? (?,?,?) VALUES (?,?,?)";
                String query_modelo_format = String.format("INSERT INTO %s (%s,%s,%s) VALUES (?,?,?)",
                        SchemaDB.TAB_USUARIO, SchemaDB.COL_USUARIO_NOM, SchemaDB.COL_USUARIO_APE, SchemaDB.COL_USUARIO_TLF);
                PreparedStatement preparedStatement = connection.prepareStatement(query_modelo_format);
                // para el nombre
                preparedStatement.setString(1, n);
                preparedStatement.setString(2, a);
                preparedStatement.setInt(3, t);
                boolean existo = preparedStatement.execute();
                if (!existo) {
                    System.out.println("Query ejecutada con existo");
                } else {
                    System.out.println("Query no ejecutada");

                }

                preparedStatement.close();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borradoDatos(String nombre) {

        try {
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                String query_modelo = "DELETE FROM %s WHERE %s='%s'";
                int afectadas = statement.executeUpdate(String.format(query_modelo,
                        SchemaDB.TAB_USUARIO, SchemaDB.COL_USUARIO_NOM, nombre));
                if (afectadas > 0) {
                    System.out.printf("Se han visto afectadas %d filas %n", afectadas);
                } else {
                    System.out.println("No habia datos que se borrasen");
                }

            } else {
                getConnection();
                borradoDatos(nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borradoDatosPrepare(String nombre) {

        try {
            if (!connection.isClosed()) {
                String query_modelo = "DELETE FROM %s WHERE %s=?";
                PreparedStatement statement = connection.prepareStatement(query_modelo);

                int afectadas = statement.executeUpdate(String.format(query_modelo,
                        SchemaDB.TAB_USUARIO, SchemaDB.COL_USUARIO_NOM, nombre));
                if (afectadas > 0) {
                    System.out.printf("Se han visto afectadas %d filas %n", afectadas);
                } else {
                    System.out.println("No habia datos que se borrasen");
                }

            } else {
                getConnection();
                borradoDatos(nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizacion(String nombre, String nombreNuevo) {
        try {
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                String query_modelo = "UPDATE %s SET %s = '%s' WHERE %s = '%s'";
                int afectadas = statement.executeUpdate(String.format(query_modelo, SchemaDB.TAB_USUARIO, SchemaDB.COL_USUARIO_NOM,
                        nombreNuevo, SchemaDB.COL_USUARIO_NOM, nombre));
                statement.close();
                if (afectadas > 0) {
                    System.out.printf("el número de filas actualizadas es de: %d %n",afectadas);
                } else
                {
                    System.out.println("No hay nada que actualizar");
                }
            } else {
                getConnection();
                actualizacion(nombre, nombreNuevo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consultarDatos(){

        try {
            if (!connection.isClosed()){

                String query_modelo = "SELECT * FROM %s";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(String.format(query_modelo,SchemaDB.TAB_USUARIO));
                /*resultSet.close();
                resultSet.next();
                resultSet.first();
                resultSet.getRow();
                resultSet.last();
                resultSet.getInt(1);
                resultSet.getInt("apellido");*/

                if (resultSet!=null){
                    while (resultSet.next()){
                        String nombre = resultSet.getString(SchemaDB.COL_USUARIO_NOM);
                        String apellido = resultSet.getString(SchemaDB.COL_USUARIO_APE);
                        int telefono = resultSet.getInt(SchemaDB.COL_USUARIO_TLF);
                        System.out.printf("%d - %s %s %d %n",resultSet.getRow(),nombre,apellido,telefono);
                    }
                    System.out.println("Terminada la lectura");
                } else {
                    System.out.println("No se ha podido leer");
                }






            }else{
                getConnection();
                consultarDatos();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void consultarDatosSelect(String nombreP){

        try {
            if (!connection.isClosed()){

                String query_modelo = "SELECT * FROM %s WHERE %s='%s'";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(String.format(query_modelo,SchemaDB.TAB_USUARIO,
                        SchemaDB.COL_USUARIO_NOM, nombreP));
                /*resultSet.close();
                resultSet.next();
                resultSet.first();
                resultSet.getRow();
                resultSet.last();
                resultSet.getInt(1);
                resultSet.getInt("apellido");*/

                if (resultSet!=null){
                    while (resultSet.next()){
                        String nombre = resultSet.getString(SchemaDB.COL_USUARIO_NOM);
                        String apellido = resultSet.getString(SchemaDB.COL_USUARIO_APE);
                        int telefono = resultSet.getInt(SchemaDB.COL_USUARIO_TLF);
                        System.out.printf("%d - %s %s %d %n",resultSet.getRow(),nombre,apellido,telefono);
                    }
                    System.out.println("Terminada la lectura");
                } else {
                    System.out.println("No se ha podido leer");
                }






            }else{
                getConnection();
                consultarDatos();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public void verSchema() {

        System.out.println(connection.toString());

    }

}
