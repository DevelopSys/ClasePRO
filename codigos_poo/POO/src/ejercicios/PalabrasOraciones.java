package ejercicios;

import java.io.*;

public class PalabrasOraciones {

    public void leerContenido(){
        File f = new File("src/ejercicios/documentos/ej2.txt");
        FileReader fr = null;
        BufferedReader br = null;
        int numeroOraciones = 0;
        int numeroPalabras = 0;
        int numeroLetras = 0;
        String[] oraciones = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String linea = null;

            while((linea = br.readLine())!=null){
                //System.out.println(linea);
                oraciones = linea.split("\\.");
                numeroOraciones += oraciones.length;
            }
            System.out.println(oraciones);
            for (String oracion:oraciones) {
                //System.out.println("oracion: " +oracion);
                String[] palabras = oracion.split(" ");
                char[] letras = oracion.trim().toCharArray();
                numeroLetras += letras.length;
                numeroPalabras += palabras.length;
            }
            System.out.println("El número de oraciones es: " +numeroOraciones);
            System.out.println("El número de letras es: " +numeroLetras);
            System.out.println("El número de palabras es: " +numeroPalabras);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
