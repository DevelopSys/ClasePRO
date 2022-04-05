package controller;

import java.io.File;
import java.util.Scanner;

public class EjericicioController {

    Scanner scanner = new Scanner(System.in);

    public void listParentDirectory(){
        File file = new File("/Users/borjam/");
        /*
        0- Fichero1
        1- Fichero2
        2- Fichero.txt
         */
        File[] ficherosParent = file.listFiles();
        // fichero1(0) .DS(1) fichero.txt(2) fichero2(3) ficheroNuevo.txt(4)
        System.out.println("Imprimiendo "+file.getName());
        int contador=0;
        int opcion=0;
        for ( File item: ficherosParent ) {
            //if (!item.isHidden()){
                System.out.println(contador + " - "+item.getName());
                contador++;
            //}
        }
        System.out.println("Que directorio quieres listar");
        opcion = scanner.nextInt();
        if (opcion>=0 && opcion<ficherosParent.length){
            if (ficherosParent[opcion].isDirectory()){
                listarChild(ficherosParent[opcion]);
            } else {
                System.out.println("Error. es un fichero");
            }
        } else {
            System.out.println("Opción incorrecta");
        }
    }

    public void listarChild(File child){
        int contador=0;
        int opcion=0;
        File[] ficherosChild = child.listFiles();
        for ( File childItem : ficherosChild ) {
            System.out.println(contador +" - " + childItem.getName());
            contador++;
        }
        System.out.println("Que opcion quieres");
        opcion = scanner.nextInt();
        if (opcion>=0 && opcion<ficherosChild.length){
            if (ficherosChild[opcion].isDirectory()){
                listarChild(ficherosChild[opcion]);
            } else {
                System.out.println("Error. es un fichero");
            }
        } else {
            System.out.println("Opción incorrecta");
        }
    }

}
