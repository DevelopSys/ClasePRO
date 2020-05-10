package ejercicios.basedatos.database;

import ejercicios.basedatos.Usuario;
import videos.basedatos.database.GestorDB;

import java.sql.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class GestionBD {

    Connection connection;
    ArrayList<Usuario> listaUsuarios;

    public GestionBD() {
        realizarConexion();
    }

    private void realizarConexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String user = "programacion";
            String pass = "cesjpsegundo";
            String host = "192.168.64.2:3306";
            String dbName = "ejercicio";
            String url = "jdbc:mariadb://" + host + "/" + dbName;
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarDatos() {
        Statement st = null;
        try {
            st = connection.createStatement();
            String querySt = "INSERT INTO %s (%s) VALUE ('%s')";
            st.execute(String.format(querySt, SchemaDB.TAB_NAME_PE, SchemaDB.TAB_PE_NOM, "director"));
            st.execute(String.format(querySt, SchemaDB.TAB_NAME_PE, SchemaDB.TAB_PE_NOM, "trabajador"));
            st.execute(String.format(querySt, SchemaDB.TAB_NAME_PE, SchemaDB.TAB_PE_NOM, "gerente"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        PreparedStatement preparedStatement = null;
        String queryPs = " INSERT INTO %s (%s,%s,%s,%s) VALUE (?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(String.format(queryPs, SchemaDB.TAB_NAME_US,
                    SchemaDB.TAB_US_NOM, SchemaDB.TAB_US_APE, SchemaDB.TAB_US_TEL, SchemaDB.TAB_US_PA));
            // primer registro
            preparedStatement.setString(1,"Heide-Marie");
            preparedStatement.setString(2,"Rausch");
            preparedStatement.setInt(3,2145024);
            preparedStatement.setString(4,"Holanda");
            preparedStatement.execute();

            // segundo registro
            preparedStatement.setString(1,"Liam");
            preparedStatement.setString(2,"Montgomery");
            preparedStatement.setInt(3,234234);
            preparedStatement.setString(4,"España");
            preparedStatement.execute();

            // tercero registro
            preparedStatement.setString(1,"Ioanna");
            preparedStatement.setString(2,"Van der Gaag");
            preparedStatement.setInt(3,978229);
            preparedStatement.setString(4,"Belgica");
            preparedStatement.execute();

            // cuarto registro
            preparedStatement.setString(1,"Eloane");
            preparedStatement.setString(2,"Bourgeois");
            preparedStatement.setInt(3,595439);
            preparedStatement.setString(4,"Francia");
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public void actualizar(){
        Statement statement = null;

        try {

            statement = connection.createStatement();
            // Actualiza aquellos sueldos de los usuarios que son de España y pongo a 10000
            String query = "UPDATE %s SET %s = %d WHERE %s = '%s' ";
            statement.execute(String.format(query,SchemaDB.TAB_NAME_US,SchemaDB.TAB_US_SUE
                    ,10000,SchemaDB.TAB_US_PA,"España"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {

            statement = connection.createStatement();
            //Actualiza aquellos sueldos de los usuarios que son de Alemania y su nombre es Leah y pongo a 5000
            String query = "UPDATE %s SET %s = %d WHERE %s = '%s' AND %s = '%s'";
            statement.execute(String.format(query,SchemaDB.TAB_NAME_US,SchemaDB.TAB_US_SUE
                    ,5000,SchemaDB.TAB_US_PA,"Alemania",SchemaDB.TAB_US_NOM,"Leah"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void consultar(){

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // resultSet = connection.prepareStatement().executeQuery();
            statement = connection.createStatement();
            // Muestra todos los usuarios que son de España
            String query = "SELECT * FROM %s WHERE %s = '%s'";
            String querySelect = "SELECT %s,%s,%s,%s FROM %s WHERE %s = '%s'";
            // resultSet = statement.executeQuery(String.format(query,SchemaDB.TAB_NAME_US,SchemaDB.TAB_US_PA,"España"));
            resultSet = statement.executeQuery(String.format(querySelect,
                    SchemaDB.TAB_US_NOM, SchemaDB.TAB_US_APE,SchemaDB.TAB_US_TEL,SchemaDB.TAB_US_SUE
                    ,SchemaDB.TAB_NAME_US
                    ,SchemaDB.TAB_US_PA,"España"));

            // recorro de uno en uno
            while (resultSet.next()){
                // saco la información de la posición donde estoy
                // int id= resultSet.getInt(SchemaDB.TAB_US_ID);
                String nom= resultSet.getString(SchemaDB.TAB_US_NOM);
                String ape= resultSet.getString(SchemaDB.TAB_US_APE);
                int telef= resultSet.getInt(SchemaDB.TAB_US_TEL);
                int sueldo= resultSet.getInt(SchemaDB.TAB_US_SUE);
                //String pais= resultSet.getString(SchemaDB.TAB_US_PA);
                //int id_perfil= resultSet.getInt(SchemaDB.TAB_US_IDPER);

                Usuario usuario = new Usuario(nom,ape,telef,sueldo);
                System.out.println(usuario.toString());
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void guardarArrayList(){


        listaUsuarios = new ArrayList<>();

        ResultSet resultSet = null;
        String query = "SELECT * FROM %s";

        try {
            resultSet = connection.createStatement().executeQuery(String.format(query,SchemaDB.TAB_NAME_US));
            while (resultSet.next()){

                int id= resultSet.getInt(SchemaDB.TAB_US_ID);
                String nom= resultSet.getString(SchemaDB.TAB_US_NOM);
                String ape= resultSet.getString(SchemaDB.TAB_US_APE);
                int telef= resultSet.getInt(SchemaDB.TAB_US_TEL);
                int sueldo= resultSet.getInt(SchemaDB.TAB_US_SUE);
                String pais= resultSet.getString(SchemaDB.TAB_US_PA);
                int id_perfil= resultSet.getInt(SchemaDB.TAB_US_IDPER);
                Usuario usuario = new Usuario(id,nom,ape,telef,sueldo,pais,id_perfil);
                listaUsuarios.add(usuario);
                System.out.println("usuario añadido correctamente");
            }

            System.out.printf("El número de elementos de la lista es de %d %n",listaUsuarios.size());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Los usuarios recuperados y guardados en el arraylist son:");
        for (Usuario usuario:listaUsuarios) {
            System.out.println(usuario.toString());
        }
    }

    public void eliminarExportar(){

        guardarArrayList();
        Statement statement = null;
        FileOutputStream fileOutputStream =null;
        ObjectOutputStream objectOutputStream =null;

        try {
            statement = connection.createStatement();
            String query = "DELETE FROM %s";
            int i = statement.executeUpdate(String.format(query,SchemaDB.TAB_NAME_US));
            System.out.printf("Borradas %d filas %n",i);

            File f = new File("src/ejercicios/basedatos/database/contenido.obj");


            fileOutputStream = new FileOutputStream(f);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listaUsuarios);




        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

    public void importarRegistros(){

        File f = new File("src/ejercicios/basedatos/database/contenido.obj");
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream  = null;
        ResultSet resultSet = null;
        Statement statement =null;

        try {
            String query = "SELECT * FROM %s";
            resultSet = connection.createStatement().executeQuery(String.format(query,SchemaDB.TAB_NAME_US));
            int filas=0;
            while (resultSet.next()){
                // si hay alguna fila
                filas++;
            }

            if (filas==0){
                // no hay resultados
                fileInputStream = new FileInputStream(f);
                objectInputStream = new ObjectInputStream(fileInputStream);
                listaUsuarios = (ArrayList<Usuario>) objectInputStream.readObject();
                statement = connection.createStatement();
                String queryInsert = "INSERT INTO %s (%s,%s,%s,%s,%s,%s) VALUE ('%s','%s',%d,%d,'%s',%d)";
                for (Usuario usuario:listaUsuarios) {
                    statement.execute(String.format(queryInsert,SchemaDB.TAB_NAME_US,
                            SchemaDB.TAB_US_NOM,SchemaDB.TAB_US_APE,SchemaDB.TAB_US_TEL,SchemaDB.TAB_US_SUE,SchemaDB.TAB_US_PA,SchemaDB.TAB_US_IDPER,
                            usuario.getNombre(),usuario.getApellido(),usuario.getTelefono(),usuario.getSueldo(),usuario.getPais(),usuario.getId_perfil()
                            ));
                    // una ejecución por cada uno de los usuarios del arraylist leido del objeto
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                objectInputStream.close();
                resultSet.close();
                statement.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void actualizarUsuario() {
        //Introduce el id del usuario a actualizar
        //Id: 1 // metido por teclado
        //// en el caso de no encontrar el id saltará un mensaje de error
        //Usuario Borja recuperado
        //Introduce su correo electrónico
        //Correo: Borja.martin@cesjuanpablosegundo.es // introducido por teclado
        //Introduce su password
        //Correo: Ejemplo1@ // introducido por teclado

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el id del usuario a actualizar");
        int id = teclado.nextInt();
        System.out.println("introduce el correo para el usuario");
        String correo = teclado.next();
        System.out.println("introduce la contraseña para el usuario");
        String pass = teclado.next();

        String query = "UPDATE %s SET %s = '%s', %s = '%s' WHERE %s = %d";
        Statement statement = null;


        try {
            statement = connection.createStatement();

            int i = statement.executeUpdate(String.format(query,SchemaDB.TAB_NAME_US,
                    SchemaDB.TAB_US_EM,correo,
                    SchemaDB.TAB_US_PASS, pass,
                    SchemaDB.TAB_US_ID, id));

            System.out.printf("El número de usuarios actualizados es de %d %n",i);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public void realizarLogin(){


        String query = "SELECT * FROM %s WHERE %s='%s' AND %s='%s'";
        ResultSet resultSet = null;

        int filas=0;
        do {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el correo del login");
            String correo = teclado.next();
            System.out.println("introduce la pass del usuario");
            String pass = teclado.next();
            try {
                resultSet = connection.createStatement().executeQuery(String.format(query, SchemaDB.TAB_NAME_US,
                        SchemaDB.TAB_US_EM, correo,
                        SchemaDB.TAB_US_PASS, pass));

                while (resultSet.next()) {
                    filas++;
                }

                if (filas > 0) {
                    System.out.println("Login correcto, ususario y pass correctas");
                } else {
                    System.out.println("usuario y pass incorretos");
                }


            } catch (SQLException e) {
                e.printStackTrace();
            }
        } while (filas==0);

    }
}
