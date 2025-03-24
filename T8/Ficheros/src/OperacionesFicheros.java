import java.io.File;

public class OperacionesFicheros {


    public void leerInformacion() {
        File file = new File("/Users/borja/Documents/GitHub/ClasePRO");
        System.out.println(file.isDirectory());
        System.out.println(file.exists());

        file.list(); // nombre de los ficheros que estan dentro
        file.listFiles(); // los ficheros que estan dentro
        for (File fichero : file.listFiles()) {
            System.out.println(fichero.getAbsolutePath());
        }

    }

}
