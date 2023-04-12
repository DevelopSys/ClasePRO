package controller;

import database.Conexion;
import database.SchemeDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class OperacionesDB {

    Conexion conexion;
    Connection connection;

    public OperacionesDB(){
        conexion = new Conexion();
        connection = conexion.getConnection();
    }

    // preparado para trabajar;

    public void insercioAlumno(){
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
        String queryFormateada = String.format(query,SchemeDB.TABLE_ALUMNO,
                SchemeDB.COL_NAME,SchemeDB.COL_SURNAME,SchemeDB.COL_EMAIL, SchemeDB.COL_PHONE,
                nombre,apellido,correo,telefono);
        String queryFormateadaPrepared = String.format(queryPrepared,SchemeDB.TABLE_ALUMNO,
                SchemeDB.COL_NAME,SchemeDB.COL_SURNAME,SchemeDB.COL_EMAIL, SchemeDB.COL_PHONE);
        try {
            Statement statementInsert = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(queryFormateadaPrepared);
            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2,apellido);
            preparedStatement.setString(3,correo);
            preparedStatement.setInt(4,telefono);
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

}
