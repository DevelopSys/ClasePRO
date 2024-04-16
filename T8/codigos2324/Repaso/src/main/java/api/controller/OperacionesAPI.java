package api.controller;

import api.model.Producto;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class OperacionesAPI {

    public void lecturaAPI(){
        try {
            URL url = new URL("https://dummyjson.com/products");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            // while() -> lecturas recurrentes
            StringBuilder builder = new StringBuilder();
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                builder.append(linea);
            }

            //bufferedReader.readLine();
            JSONObject respuesta = new JSONObject(builder.toString());
            JSONArray productos = respuesta.getJSONArray("products");
            for (int i = 0; i < productos.length(); i++) {
                JSONObject producto = productos.getJSONObject(i);
                Producto productoJAVA = new Gson().fromJson(producto.toString(), Producto.class);
                System.out.println(productoJAVA.getTitle());
            }


        } catch (MalformedURLException e) {
            System.out.println("Error en la construccion de la URL");
        } catch (IOException e) {
            System.out.println("Error en la conexion con el API");
        }
    }
}
