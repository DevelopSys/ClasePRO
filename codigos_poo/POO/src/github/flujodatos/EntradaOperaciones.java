package github.flujodatos;

import github.flujodatos.TrabajoFicheros;

import java.io.File;
import java.io.IOException;

public class EntradaOperaciones {
    public static void main(String[] args) {
        TrabajoFicheros trabajoFicheros = new TrabajoFicheros();
        //trabajoFicheros.lecturaFichero(new File("src/github/flujodatos/documentos/programacion.txt"));
        //trabajoFicheros.lecturaFicheroSimple(new File("src/github/flujodatos/documentos/seccionado.txt"));
            //trabajoFicheros.lecturaFicherosascii(new File("src/github/flujodatos/documentos/ascii.txt"));
            trabajoFicheros.escribirFichero(new File("src/github/flujodatos/documentos/asciicodigo.txt"));

    }
}
