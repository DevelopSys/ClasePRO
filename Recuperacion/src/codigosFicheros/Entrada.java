package codigosFicheros;

import java.io.File;

public class Entrada {

    public static void main(String[] args) {

       TrabajoFicheros trabajoFicheros = new TrabajoFicheros();
       trabajoFicheros.leerFicheroBuffer(new File("src/resources/ejemplo.txt"));

    }
}
