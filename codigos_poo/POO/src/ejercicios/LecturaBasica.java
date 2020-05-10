package ejercicios;

import java.io.*;

public class LecturaBasica {

    public void leerContenido(){
        File f = new File("src/ejercicios/documentos/ej2.txt");
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String linea = null;

            while((linea = br.readLine())!=null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
