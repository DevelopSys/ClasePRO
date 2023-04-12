import controller.OperacionesDB;
import database.Conexion;

import java.sql.Connection;

public class Entrada {

    public static void main(String[] args) {

        OperacionesDB operacionesDB = new OperacionesDB();
        //operacionesDB.insercioAlumno();
        //operacionesDB.insercioMasiva();
        //operacionesDB.actualizacionDatos();
        operacionesDB.borradoDatos();



    }
}
