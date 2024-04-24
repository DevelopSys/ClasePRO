package ejercicio2;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Entada {

    public static void main(String[] args) {
        // URL -> HTTPConnection -> BufferedReader - JSON
        File file = new File("src/main/java/ejercicio2/resources/lanzamientos.txt");
        FileWriter fileWriter = null;
        BufferedReader reader = null;

        try {

            URL url = new URL("https://api.spacexdata.com/v3/launches");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String linea = null;
            while ((linea = reader.readLine())!=null){
                builder.append(linea);
            }

            JSONArray lanzamientos = new JSONArray(builder.toString());
            fileWriter = new FileWriter(file);

            for (int i = 0; i < lanzamientos.length(); i++) {
                JSONObject lanzamiento = lanzamientos.getJSONObject(i);
                String nombre = lanzamiento.getJSONObject("rocket").getString("rocket_name");
                int anio = lanzamiento.getInt("launch_year");
                String exito = lanzamiento.get("launch_success").toString();

                if (anio>=2010 && exito.equals("false")){
                    fileWriter.write(nombre+"\n");
                    /*System.out.println(nombre);
                    System.out.println(anio);
                    System.out.println(exito);*/
                }
            }


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileWriter!=null){

                try {
                    fileWriter.close();
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
