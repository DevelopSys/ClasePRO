package controller;

import javax.swing.*;
import java.io.*;

public class FicherosController {

    public void getFileInfo(File file){
        System.out.println("Informacion de fichero");
        System.out.println("Es directorio? "+file.isDirectory());
        System.out.println("Es fichero? "+file.isFile());
        System.out.println("Existe? "+file.exists());
        System.out.println("Padre "+file.getParent());
        System.out.println("Nombre "+file.getName());
        System.out.println("Ruta Absoluta "+file.getAbsolutePath());
        System.out.println("Ruta Relativa "+file.getPath());
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void getDirectoryInfo(File file){
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.isDirectory()){
            String[] nombreFicheros = file.list();
            File[] ficheros = file.listFiles();
            for ( File fichero :ficheros) {
                System.out.println(fichero.getName());
            }
            //System.out.println(ficheros);
            //System.out.println(nombreFicheros);
            /*for ( String nombre : nombreFicheros ) {
                System.out.println(nombre);
            }*/
        }
    }
    public void lecturaFichero(File file) {

        FileReader fileReader =null;

        try {
            fileReader = new FileReader(file);
            /*int lectura = fileReader.read();
            System.out.println(lectura);
            int lectura2 = fileReader.read();
            System.out.println(lectura2);*/
            int lectura=0;
            /*do{
                lectura = fileReader.read();
                if (lectura>-1) {
                    System.out.println(lectura);
                }
            } while (lectura!=-1);*/
            /*while (lectura!=-1){
                lectura = fileReader.read();
                System.out.println(lectura);
            }*/
            while ((lectura=fileReader.read())!=-1){
                System.out.println((char) lectura);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public void lecturaBuffer(File file){


        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            //String linea = bufferedReader.readLine();
            //System.out.println(linea);
            String lectura = null;
            String lecturaCompleta = "";
            while ((lectura = bufferedReader.readLine())!=null){
                //lectura = bufferedReader.readLine();
                System.out.println(lectura);
                lecturaCompleta+=lectura;
                lecturaCompleta+="\n";
            }
            System.out.println("La lectura completa es: ");
            System.out.println(lecturaCompleta);



            // imprimir toda la lectura completa
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void escrituraFichero(File file){

        FileWriter fileWriter = null;
        String lineaEscribir = "Esto es un ejemplo de una linea a escribir dento del fichero";


        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(101);

        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
