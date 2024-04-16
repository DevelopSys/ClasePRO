package controller;

import com.google.gson.Gson;
import model.Equipo;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class OperacionesJSON {


    public void lecturaAPI() {

        String urlString = "https://www.thesportsdb.com/api/v1/json/3/all_leagues.php";
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linea = "";
            StringBuilder lecturaTotal = new StringBuilder();

            while ((linea = bufferedReader.readLine()) != null) {
                lecturaTotal.append(linea);
            }

            JSONObject respuesta = new JSONObject(lecturaTotal.toString());
            JSONArray ligas = respuesta.getJSONArray("leagues");
            for (int i = 0; i < ligas.length(); i++) {
                JSONObject liga = ligas.getJSONObject(i);
                if (liga.getString("strSport").equals("Soccer")) {
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

    public void lecturaAPIEquipos(String liga) {

        String urlString = "https://www.thesportsdb.com/api/v1/json/3/search_all_teams.php?l=" + liga;
        System.out.println(urlString);
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linea = "";
            StringBuilder lecturaTotal = new StringBuilder();

            while ((linea = bufferedReader.readLine()) != null) {
                lecturaTotal.append(linea);
            }

            JSONObject respuesta = new JSONObject(lecturaTotal.toString());
            JSONArray equipos = respuesta.getJSONArray("teams");
            for (int i = 0; i < equipos.length(); i++) {
                JSONObject equipo = equipos.getJSONObject(i);
                Equipo equipoJAVA = new Gson().fromJson(equipo.toString(), Equipo.class);
                System.out.println(equipoJAVA.getStrTeam());
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void consultaTabla(int liga, String temporada) {
        String urlString =
                String.format("https://www.thesportsdb.com/api/v1/json/3/lookuptable.php?l=%d&s=%s", liga, temporada);
        try {
            // creo la url con el http que quiero consultar
            URL url = new URL(urlString);
            // abro la conexion sobre la url que he creado -> abrir el navegador
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // lee la respuesta de la conexion
            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // lee el string de la respuesta
            StringBuilder builder = new StringBuilder();
            String linea = null;

            while ((linea = bufferedReader.readLine()) != null) {
                builder.append(linea);
            }

            // pasa la respuesta leida a JSON
            JSONObject respuesta = new JSONObject(builder.toString());
            // capturo cada uno de los datos del JSON sacando por clave - valor
            JSONArray tabla = respuesta.getJSONArray("table");
            for (int i = 0; i < tabla.length(); i++) {
                // paso un objeto de tipo JSON en una posicion concreta a objeto de tipo JAVA
                Equipo equipo = new Gson().fromJson(tabla.getJSONObject(i).toString(), Equipo.class);
                System.out.printf("%s %s %s %s %s%n", equipo.getIntRank(),
                        equipo.getStrTeam(), equipo.getIntPoints(),
                        equipo.getIntGoalsFor(), equipo.getIntGoalsAgainst());
            }


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
