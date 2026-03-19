package ejercicio1;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/main/java/ficheros/ejercicio1.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                String[] codigos = linea.split(" ");
                for (String item: codigos) {
                    char letra = (char) Integer.parseInt(item);
                    System.out.print(letra);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error en la ruta de lectura");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
