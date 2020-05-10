package github.ejercicios;

import java.io.*;

public class LecturaFichero {

    public void leerFichero(File f) {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(f);
            bufferedReader = new BufferedReader(fileReader);
            String palabra;
            while((palabra = bufferedReader.readLine())!=null){

                String[] letras = palabra.split(" ");
                for (String letra: letras) {
                    System.out.print(Character.toChars(Integer.valueOf(letra)));
                }

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

    public void leerFicheroLetras(File f) {
        FileReader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(f);
            br = new BufferedReader(reader);

            int linea;

            while ((linea = br.read()) > 0) {
                System.out.println(linea);
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void leerFicheroInverso(File f) {
        FileReader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(f);
            br = new BufferedReader(reader);

            int linea;

            while ((linea = br.read())>0){
                Character letra = (char)linea;
                System.out.println(letra);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
