import java.io.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        File file = new File("src/recursos/ejercicio1.txt");

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                String[] palabras = linea.split(" ");
                for (String palabra: palabras) {
                    System.out.print((char)Integer.parseInt(palabra));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) {
            System.out.println("No hay permisos");
        }

    }
}
