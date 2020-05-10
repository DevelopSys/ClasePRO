package clases.basedatos;

import clases.basedatos.database.Conexion;

import java.sql.Connection;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conexion conexion = new Conexion();
        //conexion.verSchema();
        //Connection connection = Conexion.getConnectionExterno();
        //System.out.println(connection.toString());
        System.out.println("introduce nombre");
        String nombre= teclado.next();
        //System.out.println("introduce nombre nuevo");
        //String nombreNuevo= teclado.next();
        /*System.out.println("introduce apellido");
        String apellido= teclado.next();
        System.out.println("introduce telefono");
        int telefono= teclado.nextInt();
        //conexion.insertarDatos(nombre,apellido,telefono);
        conexion.insertarDatosPrepare(nombre,apellido,telefono);*/

        //conexion.borradoDatos(nombre);
        //conexion.actualizacion(nombre,nombreNuevo);
        //conexion.consultarDatos();
        //conexion.consultarDatosSelect(nombre);
        conexion.verSchema();
    }

}
