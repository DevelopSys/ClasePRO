package controller;

import java.io.*;

public class Gestor {

    File file;
    FileReader reader;
    BufferedReader bufferedReader;
    FileWriter fileWriter;
    PrintWriter printWriter;

    public void codificar(String mensaje, int fase) {

        try {
            fileWriter = new FileWriter("src/main/java/ficheros/mensaje.txt", true);
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                int codigo = letra;
                fileWriter.write(codigo * fase);
            }
        } catch (IOException e) {
            System.out.println("La ruta de escritura no es correcta");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado del flujo");
            }
        }

    }

    public void decodificar(int fase) {

        try {
            reader = new FileReader("src/main/java/ficheros/mensaje.txt");
            int codigo;
            while ((codigo = reader.read()) != -1) {
                char letra = (char) (codigo / fase);
                System.out.print(letra);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no se encuentra");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        }

    }

    public void desencritpar() {

        try {
            bufferedReader =
                    new BufferedReader(new FileReader("src/main/java/ficheros/codigos.txt"));
            // si hay mas lineas con while para lecturas recurrentes
            String linea = bufferedReader.readLine();
            String[] codigosStr = linea.split(" ");
            for (String item : codigosStr) {
                int codigo = Integer.parseInt(item);
                char letra = (char) codigo;
                System.out.print(letra);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        }

    }
}
