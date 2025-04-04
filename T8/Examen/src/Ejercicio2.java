import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) {
        File file = new File("src/recursos/ejercicio2.txt");

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int codigo = -1;

            while ((codigo = fileReader.read())!=-1){
                System.out.print((char) (codigo/4));
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("No hay permisos de lectura");
        }
    }
}
