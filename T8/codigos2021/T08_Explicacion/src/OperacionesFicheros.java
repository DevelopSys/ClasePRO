import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperacionesFicheros {


    public void iniciarFicheros(){
        //String os = System.getProperties().getProperty("os.name");
        //System.out.println(os);
        File fichero = new File("/Users/borjam/Desktop/nuevo.txt");
        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void leerDirectorio(){
        File escritorio = new File("/Users/borjam");
        if(escritorio.isDirectory()){
            System.out.println("Listando directorio");
            /*File[] listaFicheros = escritorio.listFiles();
            for (File itemFile :listaFicheros) {
                System.out.println(itemFile.getName());
            }*/
            String[] nombres = escritorio.list();
            for (String itemNombre:nombres) {
                System.out.println(itemNombre);
            }

        } else {
            System.out.println("No es un directorio");
        }
    }
    public void crearCarpeta() throws IOException {
        System.out.println("Introduce el nombre de la carpeta a crear");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        String nombre = lectura.readLine();
        File file = new File("/Users/borjam/Desktop/"+nombre+".txt");
        file.mkdir();
    };

}
