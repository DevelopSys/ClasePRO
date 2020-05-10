package github.flujodatos;

import java.io.*;

public class TrabajoFicheros {

    public void lecturaFichero(File file){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lecturaFicheroSimple(File file){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int linea;
            while ((linea = bufferedReader.read())>-1){
                System.out.println(linea);
                Character c = 'a';
                System.out.println(Character.toChars(linea));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerFicheroSeccionado(File file){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
            Character c = ',';
            while ((linea = bufferedReader.readLine())!=null){
                linea.split(",");
                linea.indexOf("a");
                linea.charAt(0);
                linea.lastIndexOf('a');
                linea.substring(0,4);
                linea.trim();

                int ultima = linea.length();
                int npalabras=0;
                String[] oraciones = linea.split(",");
                for (String oracion:oraciones) {
                    String[] palabras = oracion.split(" ");
                    npalabras += palabras.length;
                }
                System.out.println("el número de oraciones es: "+oraciones.length);
                System.out.println("el número de palaras es: "+npalabras);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lecturaFicherosascii(File file) throws IOException {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuilder frase = new StringBuilder();
            String linea;
            while ((linea = bufferedReader.readLine())!=null){
                //System.out.println(Character.toChars(linea.toString()));
                int codigo = Integer.valueOf(linea);
                String letra = String.valueOf((char)codigo);
                System.out.println(letra);
                frase.append(letra);
            }

            System.out.println(frase);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void escribirFichero(File file){
        String frase = "Esto es un ejemplo de escritura de fichero mediante códigos ascii. \n" +
                "Para poder recuperar el contenido del fichero simplemente hay que leer el código y traducirlo a su caracter asociado. \n" +
                "Hay que no todos los carácteres de este fichero son números";
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(int i=0;i<frase.length();i++){
                char character = frase.charAt(i);
                int numeroASCII = (int)character;
                //System.out.println(numeroASCII);
                bufferedWriter.write(" "+numeroASCII);
            }
            bufferedWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
