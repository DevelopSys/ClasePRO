package videos.almacenamiento;

import java.io.File;
import java.io.IOException;

public class OperacionesFile {

    public void operacionesGenerales(){
        File f = new File("src/videos/almacenamiento/documentos/");
        /*System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.canRead());
        System.out.println(f.getParent());*/
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] listaDocumentos = f.list();
        for (String doc : listaDocumentos){
            System.out.println(doc);
        }

        File[] listaFicheros = f.listFiles();
        for (File file : listaFicheros){
            System.out.println(file.getAbsolutePath());
        }

        File directorio = new File("src/videos/almacenamiento/documentos/consola");
        directorio.mkdir();

    }
}
