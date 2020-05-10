package clases.ficheros.objetos;

import java.io.*;

public class TrabajoObjetos {

    public void repaso(){
        File f = new File("ruta");
        FileReader fr = null;
        BufferedReader br = null;

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {



            bw.write("asdasdasdasdasdasd");
            bw.newLine();


            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String linea;

            while ((linea= br.readLine()) != null){
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();

                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirDatos(File file){

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write((byte)2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void leerDatos(File file){
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
            System.out.println(fis.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void escribirDatoFinal(File file){

        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream(file);
            dos = new DataOutputStream(fos);
            dos.writeInt(8);
            dos.writeUTF("hola");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void leerDatoFinal(File file){
        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(file);
            dis = new DataInputStream(fis);
            int lectura1 = dis.readInt();
            String lectura2 = dis.readUTF();

            System.out.println(lectura1);
            System.out.println(lectura2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                dis.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


}
