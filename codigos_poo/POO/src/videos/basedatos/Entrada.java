package videos.basedatos;

import videos.basedatos.database.GestorDB;

public class Entrada {

    public static void main(String[] args) {
        GestorDB gestorDB = new GestorDB();
        // gestorDB.insercion();
        // gestorDB.insercionPrepare();
        gestorDB.borrado();
    }
}
