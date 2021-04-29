import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        /*System.out.println("Lectura por scanner");
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.next();*/
        System.out.println("Lectura por bufferReader");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //String lectura = bufferedReader.readLine();
            //System.out.println(lectura);
            int lecturaInt = bufferedReader.read();
            System.out.println((char) lecturaInt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
