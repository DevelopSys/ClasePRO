import java.io.*;
import java.util.Scanner;

public class EjercicioCodificar {

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce mensaje a codificar");
        String mensaje = null;
        int clave =0;
        File file = new File("src/ficheros/codificacion.txt");

        // codificacion
        try {
            mensaje = bufferedReader.readLine();
            System.out.println("Introduce la clave a codificar");
            clave = Integer.parseInt(bufferedReader.readLine());
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);

            for ( char item: mensaje.toCharArray() ) {
                int codigo = (byte)item * clave;
                printWriter.println(codigo);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                printWriter.close();
                bufferedReader.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // decodificar
        FileReader reader = null;
        BufferedReader bufferedReader1 = null;
        try {
            reader = new FileReader(file);
            bufferedReader1 = new BufferedReader(reader);
            System.out.println("Introduce la clave a decodificar");
            clave = Integer.parseInt(bufferedReader1.readLine());


            String lectura = null;
            String builder = "";
            StringBuilder builder1 = new StringBuilder();

            while ((lectura = bufferedReader1.readLine())!=null){
                builder += lectura;
                //builder1.append(lectura);
            }

            for ( String item : builder.toString().split(" ")) {
                 int codigoResultado = Integer.parseInt(item)/clave;
                System.out.println((char) codigoResultado);
            }


        } catch (Exception e) {
            System.out.println("Fallo detectado");
            System.out.println(e.getMessage());
        }

    }
}
