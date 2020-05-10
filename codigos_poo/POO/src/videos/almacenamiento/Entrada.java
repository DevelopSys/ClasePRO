package videos.almacenamiento;

import java.io.*;

public class Entrada {
    public static void main(String[] args) {
        OperacionesCaracteres operacionesCaracteres = new OperacionesCaracteres();
        operacionesCaracteres.leerPalabras(new File("src/videos/almacenamiento/documentos/ASCII.txt"));
    }
}
