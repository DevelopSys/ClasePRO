package controller;

import database.Conexion;
import database.SchemeDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OperacionesDB {

    Conexion conexion;
    Connection connection;

    public OperacionesDB() {
        conexion = new Conexion();
        connection = conexion.getConnection();
    }

    // preparado para trabajar;

    public void insercioAlumno() {
        // INSERT INTO alumno (nombre, apellido, correo, telefono)
        // VALUES ('nombre','apellido','correo@correo',12345)
        // Borja, Martin, correo@ces.com, 1234
        String nombre = "Borja";
        String apellido = "Martin";
        String correo = "correo@ces.com";
        int telefono = 12345;
        String query = "INSERT INTO %s (%s,%s,%s,%s)" +
                "VALUES ('%s','%s','%s',%d)";
        String queryPrepared = "INSERT INTO %s (%s,%s,%s,%s)" +
                "VALUES (?,?,?,?)";
        String queryFormateada = String.format(query, SchemeDB.TABLE_ALUMNO,
                SchemeDB.COL_NAME, SchemeDB.COL_SURNAME, SchemeDB.COL_EMAIL, SchemeDB.COL_PHONE,
                nombre, apellido, correo, telefono);
        String queryFormateadaPrepared = String.format(queryPrepared, SchemeDB.TABLE_ALUMNO,
                SchemeDB.COL_NAME, SchemeDB.COL_SURNAME, SchemeDB.COL_EMAIL, SchemeDB.COL_PHONE);
        try {
            Statement statementInsert = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(queryFormateadaPrepared);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, correo);
            preparedStatement.setInt(4, telefono);
            int rows = preparedStatement.executeUpdate();
            /*int rows =  statementInsert.executeUpdate(queryFormateada);
            if (rows>0){
                System.out.printf("El numero de filas afectadas es de %d%n",rows);
            } else {
                System.out.printf("Insercion incorrecta%n");
            }*/

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    // INSERTAR 5 alumnos pedidos por consola, dos de ellos con el mismo nombre

    // pedir el nombre de un alumno (el que se ha repetido)
    // y pedir el nuevo correo para ACTUALIZARSELO. Mostrar el numero de alumnos que se han visto afectados

    // pedir por consola un nombre y telefono y BORRAR aquel alumno con dicho dato
    // en el caso de borrar algun alumno, mostrar el mensaje "alumno borrado correctamente"
    // en el caso de no borrar ninguno, mostrar el mesaje "no hay telefonos coincidentes"

    public void insercioMasiva() {

        String query = String.format("INSERT INTO %s (%s,%s,%s,%s) VALUES (?,?,?,?)", SchemeDB.TABLE_ALUMNO,
                SchemeDB.COL_NAME, SchemeDB.COL_SURNAME, SchemeDB.COL_EMAIL, SchemeDB.COL_PHONE);
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido, correo;
        int telefono;
        try {

            for (int i = 0; i < 5; i++) {
                System.out.println("Introduce nombre");
                nombre = scanner.next();
                System.out.println("Introduce apellido");
                apellido = scanner.next();
                System.out.println("Introduce correo");
                correo = scanner.next();
                System.out.println("Introduce telefono");
                telefono = scanner.nextInt();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, nombre);
                preparedStatement.setString(2, apellido);
                preparedStatement.setString(3, correo);
                preparedStatement.setInt(4, telefono);
                int rows = preparedStatement.executeUpdate();
                if (rows > 0) {
                    System.out.printf("Insercion del alumno %s correcta%n", nombre);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void actualizacionDatos(){
        Scanner scanner = new Scanner(System.in);
        String nombre, correo;
        System.out.println("Introduce el nombre del valor a actualizar");
        nombre = scanner.next();
        System.out.println("Introduce el nuevo correo para el usuario con nombre "+nombre);
        correo = scanner.next();
        String query = String.format("UPDATE %s SET %s = '%s' WHERE %s = '%s'",
                SchemeDB.TABLE_ALUMNO,
                SchemeDB.COL_EMAIL,correo,
                SchemeDB.COL_NAME, nombre) ;
        try {
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(query);

            if (rows>0){
                System.out.printf("El numero de filas afectas es de %d%n",rows);
            } else {
                System.out.printf("No hay datos a actualizar%n");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void borradoDatos(){

        String query = String.format("DELETE FROM %s WHERE %s = ? AND %s = ?",
                SchemeDB.TABLE_ALUMNO,
                SchemeDB.COL_NAME, SchemeDB.COL_PHONE);
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int telefono;
        System.out.println("Introduce el nombre del valor a borrar");
        nombre = scanner.next();
        System.out.println("Introduce el nuevo telefono para el usuario");
        telefono = scanner.nextInt();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,nombre);
            preparedStatement.setInt(2,telefono);
            if (!preparedStatement.execute()){
                System.out.println("Uusario borrado correctamente");
            } else {
                System.out.println("No hay coincidencias");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void seleccion(){
        String query = "SELECT * FROM alumno";
    }

}
