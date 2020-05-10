package clases.ficheros.objetos;

import javax.sound.midi.ShortMessage;
import java.io.*;

public class Entrada {

    public static void main(String[] args) {

        //TrabajoObjetos trabajoObjetos = new TrabajoObjetos();
        //trabajoObjetos.escribirDatos(new File("src/clases/ficheros/objetos/ficheros/ejemplo.bin"));
        //trabajoObjetos.escribirDatoFinal(new File("src/clases/ficheros/objetos/ficheros/datos.dat"));
        //trabajoObjetos.leerDatoFinal(new File("src/clases/ficheros/objetos/ficheros/datos.dat"));
        TrabajoObjetosCompleto trabajoObjetosCompleto = new TrabajoObjetosCompleto();
        //trabajoObjetosCompleto.escribirObjeto(new File("src/clases/ficheros/objetos/ficheros/objetos.obj"));
        //trabajoObjetosCompleto.leerObjeto(new File("src/clases/ficheros/objetos/ficheros/objetos.obj"));
        //trabajoObjetosCompleto.escribirArrayList(new File("src/clases/ficheros/objetos/ficheros/arraylist.obj"));
        //trabajoObjetosCompleto.leerArrayList(new File("src/clases/ficheros/objetos/ficheros/arraylist.obj"));

        File file = new File("src/clases/ficheros/objetos/ficheros/arraylist.obj");
        if (file.exists()){
            trabajoObjetosCompleto.leerArrayList(file);
        } else{
            System.out.println("no existe base de datos aún, la quiere crear?");
        }


    }
}
