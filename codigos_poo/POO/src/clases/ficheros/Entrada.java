package clases.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        // lectura;


        TrabajoFicheros trabajoFicheros = new TrabajoFicheros();
        trabajoFicheros.listarFichero(new File("src/asdasda")); // --> Arraylist


        // trabajo con el Arraylist
        File f = new File("src/clases/ficheros/documentos/escritura.txt");
        File f2 = new File("C:\\");
        //trabajoFicheros.evaluarFichero(f);
        //trabajoFicheros.listarFichero(f2);
        //trabajoFicheros.leerFicheroReader(f);
        //trabajoFicheros.leerFicheroBuffer(f);
        //trabajoFicheros.leerASCII(f);
        //trabajoFicheros.escribirFichero(new File("src/clases/ficheros/documentos/escritura.txt"));
        trabajoFicheros.escribirBuffer(f);

        // salgo
        // escribo en el fichero todo lo que he trabajado del arrayslist

    }
}
