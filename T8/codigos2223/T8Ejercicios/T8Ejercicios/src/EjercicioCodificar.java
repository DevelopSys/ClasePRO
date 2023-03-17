import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjercicioCodificar {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce mensaje a codificar");
        String mensaje = null;
        int clave =0;
        try {
            mensaje = bufferedReader.readLine();
            System.out.println("Introduce la clave a codificar");
            clave = Integer.parseInt(bufferedReader.readLine());
            mensaje.toCharArray()


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
