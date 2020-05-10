package ejercicios;

import java.io.*;

public class TextoASCII {

    public void traducirTextoASCII(){
        File f = new File("src/ejercicios/documentos/ej2.txt");
        File f2 = new File("src/ejercicios/documentos/ej2_2.txt");
        FileReader fr = null;
        BufferedReader br = null;

        FileWriter fw =null;
        BufferedWriter bw = null;

        int numeroOraciones = 0;
        int numeroPalabras = 0;
        int numeroLetras = 0;
        String[] oraciones = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            fw = new FileWriter(f2);
            bw = new BufferedWriter(fw);

            int codigo=0;
            while ((codigo = fr.read())>-1){
                System.out.print(codigo);
                bw.write(codigo);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                bw.close();
                fw.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
