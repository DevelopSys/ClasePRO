import controller.FicherosController;

import java.io.File;
import java.io.IOException;

public class Entrada {

    public static void main(String[] args) {
        File file = null;
        File directory = null;
        File directory2 = null;
        file = new File("/Users/borjam/Desktop/ficheros/fichero.txt");
        directory = new File("/Users/borjam/Desktop/ficheros");
        directory2 = new File("/Users/borjam/Desktop/ficheros_nuevo");

        FicherosController ficherosController = new FicherosController();
        //ficherosController.getFileInfo(file);
        //ficherosController.getDirectoryInfo(directory2);
        //ficherosController.lecturaFichero(file);
        ficherosController.lecturaBuffer(file);





    }
}
