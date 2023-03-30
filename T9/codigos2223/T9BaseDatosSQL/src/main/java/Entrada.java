import database.Conexion;

import java.sql.Connection;

public class Entrada {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Connection connection = conexion.getConnection();


    }
}
