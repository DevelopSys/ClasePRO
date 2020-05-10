package github.flujodatos.documentos;

import java.io.*;

public class TrabajoFicheroDatos {

    public void escribirDatos(File file){
        FileOutputStream fileOutputStream= null;
        DataOutputStream dataOutputStream= null;
        try {
            fileOutputStream = new FileOutputStream(file);
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeInt(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
             try {
                 dataOutputStream.close();
                 fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerDatos(File file){
        FileInputStream fileOutputStream= null;
        DataInputStream dataOutputStream= null;
        try {
            fileOutputStream = new FileInputStream(file);
            dataOutputStream = new DataInputStream(fileOutputStream);
            int i = dataOutputStream.readInt();
            System.out.println(i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
