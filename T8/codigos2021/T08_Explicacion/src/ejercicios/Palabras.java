package ejercicios;

import java.io.*;

public class Palabras {

    public void contarPalabras() {
        File file = new File("src/resources/lore.txt");
        FileReader lector = null;
        BufferedReader bufferedReader = null;
        String lecturaCompleta = "";
        String linea;

        try {
            lector = new FileReader(file);
            bufferedReader = new BufferedReader(lector);

            while ((linea = bufferedReader.readLine()) != null) {
                lecturaCompleta += linea;
            }

            //System.out.println(lecturaCompleta);
            // frases
            String[] frases = lecturaCompleta.split("\\.");
            System.out.println("El número de frases es: " + frases.length);
            // palabras
            String[] palabras = lecturaCompleta.replace(",", "").replace(".", "").split(" ");
            for (String itemPalabra : palabras) {
                System.out.println(itemPalabra);
            }
            System.out.println("El número de palabras es " + palabras.length);
            // letras
            String[] letras = lecturaCompleta.replace(" ", "").split("");
            System.out.println("El número de letras es " + letras.length);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirASCII() {
        File fileEscritor = new File("src/resources/codigosASCII.txt");
        File fileLector = new File("src/resources/lore.txt");
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        int lecturaCode = 0;
        try {
            fileWriter = new FileWriter(fileEscritor);
            fileReader = new FileReader(fileLector);

            while ((lecturaCode = fileReader.read()) != -1) {
                System.out.println(lecturaCode);
                fileWriter.write(lecturaCode);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
