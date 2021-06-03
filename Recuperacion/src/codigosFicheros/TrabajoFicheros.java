package codigosFicheros;

import java.io.*;

public class TrabajoFicheros {

    public void existeFichero(File file){
        //System.out.println(file.exists());
        if (file.exists() && file.isFile() && file.canRead()){
            System.out.println("El fichero está disponible");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void leerFichero(File file){
        FileReader fileReader;
        String lectura="";

        try {
            fileReader = new FileReader(file);
            int codigo = 0;
            while ((codigo=fileReader.read())!=-1){
                //System.out.print((char)codigo);
                char letra= (char)codigo;
                lectura += letra;

            }
            System.out.println("Fin de la lectura");
            //System.out.println("El resultado es "+ lectura);
            if (lectura.contains("Pepe")){
                System.out.println("esta borja");
            };

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerFicheroBuffer(File file){
        FileReader fileReader;
        BufferedReader bufferedReader;
        String lectura="";

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String totalContenido = "";
            String linea = "";
            while ((linea=bufferedReader.readLine())!= null){
                //System.out.println(linea);
                totalContenido += linea;
                totalContenido += "\n";

            }

            System.out.println("Fin de la lectura");
            System.out.println("La lectura es: "+totalContenido);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
