package controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class OperacionesJSON {


    public void lecturaAPI(){

        String urlString = "https://www.thesportsdb.com/api/v1/json/3/all_leagues.php";
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linea = "";
            StringBuilder lecturaTotal = new StringBuilder();

            while ((linea = bufferedReader.readLine()) != null ){
                lecturaTotal.append(linea);
            }

            JSONObject respuesta = new JSONObject(lecturaTotal.toString());
            JSONArray ligas = respuesta.getJSONArray("leagues");
            for (int i = 0; i < ligas.length(); i++) {
                JSONObject liga = ligas.getJSONObject(i);
                if (liga.getString("strSport").equals("Soccer")){
                    String nombre = liga.getString("strLeague");
                    System.out.println(nombre);
                }
            }




        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
