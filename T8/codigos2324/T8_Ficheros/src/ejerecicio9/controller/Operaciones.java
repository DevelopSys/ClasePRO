package ejerecicio9.controller;

import java.io.*;

public class Operaciones {

    public void cifrar(String mensaje, int clave){

        File file = new File("src/resources/cifrado.txt");
        FileWriter fileWriter = null;
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo en el proceso de creacion");
            }
        }

        try {

            fileWriter = new FileWriter(file,true);
            String[] letras = mensaje.split("");
            // Escribir
            for ( String letra :  letras ){
                char letraChar= letra.charAt(0);
                //System.out.println( ((int)letraChar * clave) ); // 'h' -> 104
                fileWriter.write(letraChar*clave);
            }
        } catch (IOException e) {
            System.out.println("Error de IO Excepcion, fallo en el proceso");
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Fallo en el cerrado");
            }
        }


        // Hola esto es un ejemplo
        // [] h,o,l,a, ,e,s,t,o


    }
    public void descifrar(String ruta, int clave){
        File file = new File(ruta);
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int codigo = -1;
            while ((codigo = fileReader.read()) != -1){
                char letra = (char) (codigo/clave);
                System.out.println(letra);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert fileReader != null;
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Fallo en el cerrado");
            }
        }

    }
}
