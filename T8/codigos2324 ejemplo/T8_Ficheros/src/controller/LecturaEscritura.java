package controller;

import java.io.*;


public class LecturaEscritura {


    public void lecturaFichero(String path){
        File file = new File(path);
        FileReader fileReader = null;


        try {
            fileReader = new FileReader(file);
           /*int lectura = fileReader.read();
           System.out.println(lectura);
           lectura = fileReader.read();
           System.out.println(lectura);*/
            int lectura = 0;


            String lecturaComun = "";
            while ( (lectura = fileReader.read())  != -1){
                //System.out.print((char) lectura);
                lecturaComun += (char) lectura;


            }
            System.out.println(lecturaComun);
            //System.out.println(lecturaComun.split("\\.")[0]);
            int numeroOraciones = lecturaComun.split("\\.").length;
            int numeroPalabras = lecturaComun.split(" ").length;
            int numeroLetras=lecturaComun.replaceAll("\\.","")
                    .replaceAll(",","").replaceAll(" ","").length();
            System.out.println("el numero de oraciones es: "+numeroOraciones);
            System.out.println("el numero de palabras es: "+numeroPalabras);
            System.out.println("el numero de letras es: "+numeroLetras);


        } catch (FileNotFoundException e) {
            System.out.println("El fichero que intentas leer no existe");
        } catch (IOException e){
            System.out.println("No hay persmisos de lectura");
        }
        finally {
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }
    }


    public void lecturaCodigo(String path){
        File file = new File(path);
        FileReader fileReader = null;


        try {
            fileReader = new FileReader(file);


            int lectura = 0;
            String lecturaCompleta = "";
            while ( (lectura = fileReader.read())  != -1){
                lecturaCompleta += (char)lectura;
            }
            for ( String palabra : lecturaCompleta.split(" ") ) {
                int codigo = Integer.parseInt(palabra);
                System.out.print((char) codigo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero que intentas leer no existe");
        } catch (IOException e){
            System.out.println("No hay persmisos de lectura");
        }
        finally {
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }
    }


    public void lecturaBuffer(String path){


        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;


        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);


            String linea = null;
            while ( (linea = bufferedReader.readLine()) !=null ) {
                System.out.println(linea);
            }


        } catch (FileNotFoundException e) {
            System.out.println("El fichero que intentas leer no existe");
        } catch (IOException e) {
            System.out.println("El fichero no tiene permisos de lectura");
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error en el proceso de cerrado");
            }
        }




    }


    public void escribirFichero(String path){
        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("No tienes permisos de escritura");
            }
        }
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            //fileWriter.write("Esto es un ejemplo \n");
            printWriter.println(123);
            fileWriter.write(115);
            fileWriter.write(32);
            fileWriter.write(116);
            fileWriter.write(13);
            fileWriter.write(69);
            fileWriter.write(765);
        } catch (IOException e) {
            System.out.println("Error en el proceso de creacion");
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }


    }
}

