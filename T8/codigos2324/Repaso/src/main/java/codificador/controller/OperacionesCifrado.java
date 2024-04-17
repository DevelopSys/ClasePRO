package codificador.controller;

import java.io.*;

public class OperacionesCifrado {

    public void cifrarMensaje(String mensaje) {

        // Ejemplo de codificacion
        File file = new File("src/main/java/codificador/resources/mensaje_codificado.txt");

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                int codigoCifrado = ((int)letra)*2;
                fileWriter.write(codigoCifrado);
                //System.out.println(letra);
                //System.out.println();
            }

        } catch (IOException e) {
            System.out.println("error en el proceso");
        } finally {
            try {

                fileWriter.close();

            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }


    }
    public void descifrarMensaje(){
        File file = new File("src/main/java/codificador/resources/mensaje_codificado.txt");

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int codigo = -1;
            while ( (codigo = fileReader.read()) != -1){
                int codigoDescifrado = codigo/2;
                System.out.print((char) codigoDescifrado);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error en la apertura");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("error en el cerrado");
                }
            }
        }


    }

}
