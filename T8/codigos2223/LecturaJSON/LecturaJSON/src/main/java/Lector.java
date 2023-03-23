import model.Producto;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
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
        File file = new File("src/main/java/ficheros/productos.txt");
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            reader = new FileReader(file);
            bufferedReader = new BufferedReader(reader);
            String linea = null;
            StringBuilder lecturaCompleta = new StringBuilder();

            while ( (linea = bufferedReader.readLine())!=null ){
                lecturaCompleta.append(linea);
            }

            ArrayList<Producto> productosFiltrados = new ArrayList<>();
            JSONObject objetoGeneral = new JSONObject(lecturaCompleta.toString());
            JSONArray arrayObjetos = objetoGeneral.getJSONArray("products");
            for (int i = 0; i < arrayObjetos.length() ; i++) {
                JSONObject producto = arrayObjetos.getJSONObject(i);
                // nombre, descripcion y precio
                String nombre = producto.getString("title");
                String descripcion = producto.getString("description");
                String categoriaProducto = producto.getString("category");
                int precio = producto.getInt("price");
                Producto producto1 = new Producto(nombre,precio,descripcion);

                if (categoriaProducto.equalsIgnoreCase(categoria)){
                    // meterlo en el array
                    productosFiltrados.add(producto1);
                }
            }
            mostrarDatos(productosFiltrados);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private void mostrarDatos(ArrayList<Producto> productos){
        for ( Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void lecturaURL(){
        String urlString = "https://dummyjson.com/users";
        try {
            // Creo un objeto tipo URL
            URL url = new URL(urlString);
            // Leerlo abrir, una conexion
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // interpretar la respuesta
            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println(bufferedReader.readLine());
            // sacar nombre, apellido correo y genero de todos los usuarios del JSON
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
