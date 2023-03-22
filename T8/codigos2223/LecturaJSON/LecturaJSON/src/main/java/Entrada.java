import model.Producto;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        File file = new File("src/main/java/ficheros/productos.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        ArrayList<Producto> listaProductos = new ArrayList<>();
        int precioCaro=0, precioBarato=0;
        String nombreCaro, nombreBarato;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String lineaLeida = null;
            StringBuilder lecturaCompleta = new StringBuilder();

            while ((lineaLeida = bufferedReader.readLine())!=null){
                lecturaCompleta.append(lineaLeida);
            }

            JSONObject objetoGeneral = new JSONObject(lecturaCompleta.toString());
            JSONArray arrayProductos = objetoGeneral.getJSONArray("products");

            // obtengo todos los productos
            for (int i = 0; i <arrayProductos.length() ; i++) {
                JSONObject productoIphone = arrayProductos.getJSONObject(i);
                String titulo = productoIphone.getString("title");
                int  precio = productoIphone.getInt("price");
                listaProductos.add(new Producto(titulo,precio));
            }

            Producto productoCaro = listaProductos.get(0);
            Producto productoBarato =  listaProductos.get(0);;

            for (Producto item: listaProductos) {
                System.out.println(item.getNombre() + " " +item.getPrecio());
                if (productoCaro.getPrecio()<item.getPrecio()){
                    productoCaro = item;
                }
                if (productoBarato.getPrecio()>item.getPrecio()){
                    productoBarato = item;
                }
            }




            //int limit = (int)objetoGeneral.getInt("limit");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
