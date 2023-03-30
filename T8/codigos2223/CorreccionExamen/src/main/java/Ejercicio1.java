import java.io.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        File file = new File("src/main/java/fichero/ejercicio1.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String lectura= bufferedReader.readLine();
            String[] numeros = lectura.split(" ");
            for (String item: numeros) {
                int numeroConv = Integer.valueOf(item);
                System.out.print((char) numeroConv);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
