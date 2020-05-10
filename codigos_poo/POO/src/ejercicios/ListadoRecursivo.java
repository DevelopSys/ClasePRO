package ejercicios;

import sun.lwawt.macosx.CSystemTray;

import java.io.*;
import java.util.Scanner;

public class ListadoRecursivo {

    private Scanner teclado;
    private int elementos;

    public ListadoRecursivo() {
        teclado = new Scanner(System.in);
        elementos = 0;
    }

    public void listarRec(File file) {

        if (file.isDirectory()) {
            File[] listaFicheros = file.listFiles();
            for (File fileItem : listaFicheros) {
                if (fileItem.isDirectory()) {
                    System.out.printf("Es un directorio con nombre %s y contenido: %n", fileItem.getName());
                    listarRec(fileItem);
                } else {
                    if (!fileItem.isHidden()) {
                        System.out.printf("Fichero con nombre: %s %n", fileItem.getName());
                    }
                }
            }
        } else {
            System.out.printf("Fichero con nombre: %s %n", file.getName());
        }

    }

    public void listarRecManual() {

        File file = new File("src");
        if (file.isDirectory()) {
            File[] listaFicheros1 = file.listFiles();
            for (File file1 : listaFicheros1) {
                if (file1.isDirectory()) {
                    File[] listaFicheros2 = file1.listFiles();
                    for (File file2 : listaFicheros2) {

                    }
                } else {
                    System.out.println(file1.getName());
                }
            }
        } else {
            System.out.println(file.getName());
        }

    }

    public void listarPeticion(File file) {

        int opcion = 0;
        File[] listaDirectorios = file.listFiles();
        for (int i = 0; i < listaDirectorios.length; i++) {
            System.out.printf("%d - %s %n", i, listaDirectorios[i].getName());
        }
        System.out.printf("%d - %s %n", listaDirectorios.length, "Volver");

        System.out.println("introduce cual quieres ver");
        opcion = teclado.nextInt();

        if (opcion == listaDirectorios.length) {
            listarPeticion(file.getParentFile());
        } else {
            if (!listaDirectorios[opcion].isDirectory()) {
                System.out.println("se trata de un fichero");
            } else {
                if (opcion == listaDirectorios.length) {
                    listarPeticion(file);
                } else {
                    listarPeticion(listaDirectorios[opcion]);
                }
            }
        }
    }
}
