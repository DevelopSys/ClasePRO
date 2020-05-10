package videos.almacenamiento;

import java.io.*;

public class OperacionesCaracteres {

    public void leerFichero(File f){
        // File --> Flujo --> Buffer -----> close
        FileReader fileReader =null;
        BufferedReader bufferedReader= null;
        try {
            fileReader = new FileReader(f);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            /*while ((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }*/
            int caracter;

            while ((caracter = bufferedReader.read())>-1){
                System.out.println(caracter);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }

    }

    public void leerFicheroASCII (File file){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String palabra;
            while((palabra = bufferedReader.readLine())!=null){
                int codigoLeido = Integer.valueOf(palabra);
                System.out.println((char)codigoLeido);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerPalabras (File file){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String palabra = bufferedReader.readLine();
            String[] letras = palabra.split(" ");
            for (String letra: letras) {
                int coldigoLeido = Integer.valueOf(letra);
                System.out.println((char)coldigoLeido);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
