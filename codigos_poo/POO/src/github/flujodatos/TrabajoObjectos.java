package github.flujodatos;

import java.io.*;

public class TrabajoObjectos {

    public void escribirObjeto(File file){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leer(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    }
}
