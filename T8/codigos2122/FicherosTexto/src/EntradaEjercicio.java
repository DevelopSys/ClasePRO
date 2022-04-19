import controller.EjericicioController;

import java.io.File;

public class EntradaEjercicio {

    public static void main(String[] args) {
        EjericicioController ejericicioController = new EjericicioController();
        //ejericicioController.listParentDirectory();
        //ejericicioController.cifrarLinea();
        File file = new File("/Users/borjam/Desktop/ficheros/ficherorw.txt");

        ejericicioController.ejercicioLecturaEscritura(file);
    }
}
