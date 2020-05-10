package github.ejercicios;

import java.io.*;
import java.util.List;

public class Listar {

    public void listarRecursivo(File f){

        File[] lista = f.listFiles();
        for (File file:lista) {
            System.out.println(file.getName());
            if (file.isDirectory()){
                listarRecursivo(file);
            }
        }

    }
}
