package clases.ficheros;

import javax.annotation.processing.Filer;
import java.io.*;

public class TrabajoFicheros {

    public void evaluarFichero(File f) {

        String rutaCompleta = f.getAbsolutePath();
        File fileCompleto = f.getAbsoluteFile();
        String rutaContenedor = f.getParent();
        System.out.println(rutaCompleta);
        System.out.println(fileCompleto);
        System.out.println(rutaContenedor);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("el fichero ya existe");
        }


    }

    public void listarFichero(File f) {
        File file = new File("src/clases/ficheros/documentos/carpeta/secundaria");
        file.mkdirs();
        if (f.isDirectory()) {
            System.out.println("Es un directorio");
            String[] listaFicheros = f.list();
            /*for (String file : listaFicheros) {
                File fNuevo = new File(file);
            }*/
        }
    }

    public void leerFicheroReader(File f) {

        // File --> Reader --> Buffer --> cierro flujo datos

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(f);
            int codigo = 0;
            while ((codigo = fileReader.read()) > 0) {
                System.out.print(Character.toChars(codigo));
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("lectura no posible");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("error en el cerrado");

            }
        }

    }

    public void leerFicheroBuffer(File f) {
        // File --> Reader --> Buffer --> cierro flujo datos
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(f);
            bufferedReader = new BufferedReader(fileReader);
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerASCII(File f){

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(f);
            int codigo = fileReader.read();
            System.out.println(String.valueOf(codigo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirFichero(File f){


        // B,5
        // B,4
        // B,6
        // P,3
        // P,6
        // P,7
        // P,1

        String contenido = "B,5";
        String[] concursante = contenido.split(",");

        //contenido.split(".").length;

        // File --> Writer --> Buffer --> cierro flujo datos
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(f);
            fileWriter.write("adasd");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void escribirBuffer(File f){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(f,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ejemplo de escritura de fichero");
            bufferedWriter.newLine();
            bufferedWriter.write("ejemplo de escritura de fichero nueva linea");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void escribirObjeto(File file) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            ObjectOutputStream obj  = new ObjectOutputStream(fileOutputStream);
            obj.writeObject(new Almacen());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

