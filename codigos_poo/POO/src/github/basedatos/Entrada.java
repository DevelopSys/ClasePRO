package github.basedatos;

import github.basedatos.database.GestorDB;

public class Entrada {

    public static void main(String[] args) {
        GestorDB gestorDB = new GestorDB();
        gestorDB.realizarInsercion();
        gestorDB.realizarInsercionPrepare();
        //gestorDB.realizarBorrado();
        gestorDB.realizarActualizacion();
        gestorDB.realizarConsultaTodos();

    }
}
