import org.json.*;
import java.io.*;

public class OperacionesFicheros {


    public void iniciarFicheros() {
        //String os = System.getProperties().getProperty("os.name");
        //System.out.println(os);
        File fichero = new File("/Users/borjam/Desktop/nuevo.txt");
        if (!fichero.exists()) {
            try {
                fichero.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerDirectorio() {
        File escritorio = new File("/Users/borjam");
        if (escritorio.isDirectory()) {
            System.out.println("Listando directorio");
            /*File[] listaFicheros = escritorio.listFiles();
            for (File itemFile :listaFicheros) {
                System.out.println(itemFile.getName());
            }*/
            String[] nombres = escritorio.list();
            for (String itemNombre : nombres) {
                System.out.println(itemNombre);
            }

        } else {
            System.out.println("No es un directorio");
        }
    }
    public void listarDirectorio(File file, int tabulaciones) {

        int contador = tabulaciones;
        //System.out.println("\t"+file.getName());
        for (int i = 0; i < contador; i++) {
            System.out.print("\t");
        }
        System.out.println(file.getName());


        if (file.isDirectory()) {
            System.out.println("Listando directorio");
            contador++;
            for (File fileItem : file.listFiles()) {
                // TODO lo mismo pero con una ruta inicial diferente
                listarDirectorio(fileItem, contador);
                //System.out.println(fileItem.getName());
            }
        }
    }
    public void crearCarpeta() throws IOException {
        System.out.println("Introduce el nombre de la carpeta a crear");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        String nombre = lectura.readLine();
        File file = new File("/Users/borjam/Desktop/" + nombre + ".txt");
        file.mkdir();
    }
    public void getPArentFile() {
        File file = new File("/Users/borjam/Desktop");
        file.getParentFile().listFiles();
    }
    public void leerFichero() throws IOException {
        File file = new File("src/resources/lectura.txt");
        //System.out.println(file.isFile());
        if (file.exists() && file.canRead()) {
            // FileReader
            FileReader lectorFichero = new FileReader(file);
            //int numeroChar = lectorFichero.read();
            //System.out.println(numeroChar);
            int numeroChar;
            /*do{
                numeroChar = lectorFichero.read();
                System.out.println(numeroChar);
                System.out.println((char) numeroChar);

            }while (numeroChar!=-1);*/

            numeroChar =0;
            String palabraCompleta = "";
            while ((numeroChar = lectorFichero.read())!=-1){
                //numeroChar = lectorFichero.read();
                System.out.println(numeroChar);
                //System.out.println((char) numeroChar);
                palabraCompleta += (char)numeroChar;
            }
            System.out.println(palabraCompleta);


        } else {
            System.out.println("Fichero no encontrado o sin permisos");
        }

    }
    public void lecturaRepaso(){
        File file = new File("src/resources/lectura.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            // int ASCII
            int asciCode=0;
            String lectura="";
            // asigna al asciCode del cabezal y lo compara con -1
            // asciCode != -1
            while ((asciCode = fileReader.read())!=-1){

                System.out.print((char) asciCode);
                lectura+=(char)asciCode;
            }
            // quiero el contenido entero de la lectura
            System.out.println();
            System.out.println("Impresion entera");
            System.out.println(lectura);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void lecturaJSON(){
        File file = new File("src/resources/lecturaJSON.txt");
        String lecturaJSON="";
        int numeroLectura=0;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            while ((numeroLectura = fileReader.read())!=-1){
                lecturaJSON += (char)numeroLectura;
            }
            JSONObject jsonObject = new JSONObject(lecturaJSON);
            String nombre = jsonObject.getString("nombre");
            int edad = jsonObject.getInt("edad");
            JSONArray aficiones = jsonObject.getJSONArray("aficiones");
            System.out.println(nombre);
            System.out.println(edad);
            for (int i = 0; i < aficiones.length(); i++) {
                // ves capturando cada una de las posiciones
                String aficionItem = aficiones.getString(i);
                System.out.println(aficionItem);
            }
            JSONArray hijos = jsonObject.getJSONArray("hijos");
            


            //System.out.println(lecturaJSON);
            /*String nombre = jsonObject.getString("nombre");
            int edad = jsonObject.getInt("edad");
            JSONArray aficiones = jsonObject.getJSONArray("aficiones");
            System.out.println(nombre);
            System.out.println(edad);
            //System.out.println(aficiones);
            for (int i = 0; i < aficiones.length(); i++) {
                System.out.println(aficiones.get(i));
            }*/


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            //System.out.println("Error en la creacion del JSON");
            e.printStackTrace();
        }
    }

}
