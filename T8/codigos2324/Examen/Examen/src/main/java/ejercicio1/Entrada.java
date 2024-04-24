package ejercicio1;

import java.io.*;

public class Entrada {

    // FILE -> FILEREADER -> BUFFEREDREADER

    public static void main(String[] args) {
        File file = new File("src/main/java/ejercicio1/resources/ejercicio1.txt");

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String linea = bufferedReader.readLine();
            System.out.println(linea);
            for (String caracter: linea.split("")) {
                char letra = (char) (caracter.charAt(0) /2);
                System.out.print(letra);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Error de lectura en fichero");
        } catch (IOException e) {
            System.out.println("Error de permisos");
        } finally {
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
