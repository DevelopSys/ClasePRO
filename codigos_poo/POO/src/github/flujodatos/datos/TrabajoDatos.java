package github.flujodatos.datos;
import java.io.*;

public class TrabajoDatos {

    public void antiguos(File f){
        try {
            FileReader reader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(reader);
            int numero  = Integer.parseInt(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter(f);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(123);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
