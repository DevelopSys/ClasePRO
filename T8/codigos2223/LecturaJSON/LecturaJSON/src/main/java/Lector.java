import org.json.JSONArray;

import java.io.*;
import java.util.ArrayList;

public class Lector {

    public ArrayList<String> lecturaCategorias() {
        ArrayList<String> categorias = new ArrayList<>();

        File file = new File("src/main/java/ficheros/categorias.txt");
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(file);
            bufferedReader = new BufferedReader(reader);
            String lecturaCompleta = bufferedReader.readLine();
            JSONArray arrayCategorias = new JSONArray(lecturaCompleta);
            for (int i = 0; i < arrayCategorias.length(); i++) {
                //System.out.println(arrayCategorias.getString(i));
                categorias.add(arrayCategorias.getString(i));
            }

            return categorias;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void lecturaProductos(String categoria){
        // sacar los productos del JSON y ver si
        // la categoria es igual
        // pasarselos al MAIN
    }
}
