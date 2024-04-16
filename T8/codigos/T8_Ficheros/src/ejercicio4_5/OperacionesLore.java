package ejercicio4_5;

import java.io.*;

public class OperacionesLore {

    public void leerFichero(){
        File file = new File("src/resources/lore.txt");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int lectura = -1;
            while ((lectura = fileReader.read())!=-1){
                System.out.println(String.valueOf(lectura));
                escibirCaracter(String.valueOf(lectura));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe fichero");
        } catch (IOException e) {
            System.out.println("Error de permisos");
        } finally {
            try {

                assert fileReader != null;
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            }
        }



        // BufferedReader bufferedReader = null;

    }

    public void escibirCaracter(String s){
        File file = new File("src/resources/loreASCII.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            fileWriter.write(s);
            fileWriter.write(" ");
        } catch (IOException e) {
            System.out.println("Error de permisos");
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
