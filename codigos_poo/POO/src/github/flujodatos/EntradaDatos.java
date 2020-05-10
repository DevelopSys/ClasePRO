package github.flujodatos;

import github.flujodatos.documentos.TrabajoFicheroDatos;

import java.io.File;

public class EntradaDatos {

    public static void main(String[] args) {
        TrabajoFicheroDatos trabajoFicheroDatos = new TrabajoFicheroDatos();
        //trabajoFicheroDatos.escribirDatos(new File("src/github/flujodatos/documentos/ficherodatos.txt"));
        trabajoFicheroDatos.leerDatos(new File("src/github/flujodatos/documentos/ficherodatos.txt"));
    }
}
