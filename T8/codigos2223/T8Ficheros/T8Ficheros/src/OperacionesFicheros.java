import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class OperacionesFicheros {

    public void metodoRecursivo() {
        System.out.println("Ejecicion de un metodo recursivo");
        metodoRecursivo();
    }

    public void creacionFichero() {
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

    public void informacionFichero() {
        Scanner scanner = new Scanner(System.in);
        String rutaEntrada = scanner.next();
        System.out.println("src/ficheros/" + rutaEntrada);
        Path path = Paths.get(rutaEntrada);
        /*File file = new File(String.valueOf(path));
        System.out.println(file.getName());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());*/
    }

    public void lecturaRuta() {
        File file = new File("src/ficheros");
        System.out.println(file.getName());
        File[] listaNombres = file.listFiles();
        for (File fichero : listaNombres) {
            System.out.println(fichero.getName());
            if (fichero.isDirectory()) {
                for (File fichero1 : fichero.listFiles()) {
                    System.out.println("\t" + fichero1.getName());
                }
            }
        }
    }

    public void leerDirectorio(File file) {

        File[] ficheros = file.listFiles();
        for (File i : ficheros) {
            System.out.println(i.getName());
            if (i.isDirectory()) {
                System.out.print("\t");
                leerDirectorio(i);
            }
        }

    }

    public void leerFicheros() {
        File fichero = new File("src/ficheros/lectura.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(fichero);
            int codigo = -1;
            while ((codigo = reader.read()) != -1) {
                System.out.print((char) codigo);
            }
        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
        } finally {
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void leerBufferFicheros() {
        File file = new File("src/ficheros/lectura.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String linea = null;
            StringBuilder contenido = new StringBuilder();
            while ((linea = bufferedReader.readLine()) != null) {
                contenido.append(linea + "\n");
            }

            System.out.println("CONTENIDO ES: ");
            System.out.println(contenido);

            // Cuantas lineas tiene un fichero
            // Cuantas palabras tiene cada linea
            // Cuantas letras tiene cada linea
            // Cuantas palabras hay en total
            // Cuantas letras hay en total


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void ejercicioConteo() {
        // cuantas palabras
        // cuantas letras
        // cuantas lineas

        int numeroLineas = 0;
        int numeroPalabras = 0;
        int numeroLetras = 0;

        File file = new File("src/ficheros/lectura.txt");
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            reader = new FileReader(file);
            bufferedReader = new BufferedReader(reader);
            String linea = null; // desde 0 lineas a m linea

            // si hay linea
            while ((linea = bufferedReader.readLine()) != null){
                //System.out.println(linea);
                numeroLineas++;
            }

            System.out.println("El numero de lineas es: "+numeroPalabras);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
