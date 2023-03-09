import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class OperacionesFicheros {

    public void metodoRecursivo(){
        System.out.println("Ejecicion de un metodo recursivo");
        metodoRecursivo();
    }

    public void creacionFichero(){
        File file = new File("/Users/borjam/Desktop/ficheros");
        File fileFinal = new File("/Users/borjam/Desktop/ficheros/fichero2.txt");
        File fileCarpeta = new File("/Users/borjam/Desktop/ficheros/subcarpeta");
        File ficheroProyecto = new File("src/ficheros/ejemploLocal.txt");
        boolean esFichero = fileFinal.isFile();
        boolean esCarpeta = fileFinal.isDirectory();
        String rutaFichero = fileFinal.getAbsolutePath();
        String nombreFichero = fileFinal.getName();
        // Pedir por consola un fichero (ruta completa)
        // y sacar informacion sobre dicho fichero
        try {
            ficheroProyecto.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println(rutaFichero);
        System.out.println(nombreFichero);
        System.out.println(esFichero);
        System.out.println(esCarpeta);

    }
    public void informacionFichero(){
        Scanner scanner = new Scanner(System.in);
        String rutaEntrada = scanner.next();
        System.out.println("src/ficheros/"+rutaEntrada);
        Path path = Paths.get(rutaEntrada);
        /*File file = new File(String.valueOf(path));
        System.out.println(file.getName());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());*/
    }
    public void lecturaRuta(){
        File file = new File("src/ficheros");
        System.out.println(file.getName());
        File[] listaNombres = file.listFiles();
        for (File fichero : listaNombres) {
            System.out.println(fichero.getName());
            if (fichero.isDirectory()){
                for (File fichero1 : fichero.listFiles()) {
                    System.out.println("\t"+fichero1.getName());
                }
            }
        }
    }

}
