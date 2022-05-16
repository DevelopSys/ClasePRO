package controller;

import java.io.*;

public class ControllerEj1 {

    public void lecturaFichero(){

        File file = new File("src/main/resources/fichero_cifrado.txt");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            // lectura caracter a caracter
            int caracter = -1;
            while ((caracter = fileReader.read())!=-1){
                System.out.print((char) (caracter/2));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //BufferedReader;

    }


}
