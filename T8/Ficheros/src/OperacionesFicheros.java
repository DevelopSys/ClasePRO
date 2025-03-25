import java.io.*;

public class OperacionesFicheros {

    private int contadorNivel = 0;


    public void leerInformacion() {
        File file = new File("/Users/borja/Documents/GitHub/ClasePRO");
        System.out.println(file.isDirectory());
        System.out.println(file.exists());

        // file.list(); // nombre de los ficheros que estan dentro
        // file.listFiles(); // los ficheros que estan dentro
        for (File fichero : file.listFiles()) {
            recorrerDirectorio(fichero);
        }
    }

    public void crearDirectorio(String path) {
        // src/recursos/lectura
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public void crearFichero(String path) {
        // src/recursos/lectura
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo en la escritura del fichero");
            }
        }
    }

    // crear un metodo que me pida por consola mis datos personales,
    // ademas de un mensaje

    // todos los datos y el mensaje deberán guardarse
    // en el fichero datos.txt

    public void escribirFichero(String path){
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(105);
        } catch (IOException e) {
            System.out.println("Error en escritura");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }


    }

    public void recorrerDirectorio(File fichero) {
        for (int i = 0; i < contadorNivel; i++) {
            System.out.print("\t");
        }
        System.out.println(fichero.getName());
        if (fichero.isDirectory()) {
            contadorNivel++;
            for (File f : fichero.listFiles()) {
                recorrerDirectorio(f);
            }
        }
    }

    public void lecturaUnitaria(String path) {
        File file = new File(path);
        // hago lectura
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int lectura = -1;
            while ( (lectura = fileReader.read())!=-1 ){
                System.out.println("lectura = " + lectura+" asociado a la letra: "+(char)lectura);
                // System.out.print((char)lectura);
            }
            /*int lectura = fileReader.read();
            System.out.println("lectura = " + lectura+" asociado a la letra: "+(char)lectura);
            lectura = fileReader.read();
            System.out.println("lectura = " + lectura+" asociado a la letra: "+(char)lectura);*/
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            System.out.println("Terminando lectura");
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cierre del fichero");
            }
        }


    }

    public void lecturaCodigoCompleta(String path) {
        File file = new File(path);
        // hago lectura
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            /*String linea = bufferedReader.readLine();
            System.out.println("La linea leida es: "+linea);
            linea = bufferedReader.readLine();
            System.out.println("La linea leida es: "+linea);*/

            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                stringBuffer.append(linea);
                // lecturaCompleta += linea;
                // System.out.println(linea);
                /*String[] letras = linea.split(" ");
                for ( String letra : letras) {
                    //System.out.println(letra);
                    int letraNumero = Integer.parseInt(letra);
                    System.out.print((char) (letraNumero/2));
                }
                System.out.println();*/
            }
            System.out.println(stringBuffer.toString());
            // el string con todas las lineas del fichero


        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            System.out.println("Terminando lectura");
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cierre del fichero");
            }
        }


    }

}
