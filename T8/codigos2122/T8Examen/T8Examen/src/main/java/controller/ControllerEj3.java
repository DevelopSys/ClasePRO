package controller;

import com.google.gson.Gson;
import model.Pelicula;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ControllerEj3 {

    String urlEstrenos = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";
    String urlProximos = "https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";

    public void leerJSON(int tipo){
        String url = null;
        BufferedReader bufferedReader = null;
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        ObjectOutputStream objectOutputStream = null;
        if (tipo ==1){
            url = urlEstrenos;
        } else {
            url = urlProximos;
        }
        try {
            URL urlHTTP = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlHTTP.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                stringBuffer.append(linea);
            }

            JSONObject jsonPeliculas = new JSONObject(stringBuffer.toString());
            JSONArray jsonArrayPeliculas = jsonPeliculas.getJSONArray("results");

            for (int i = 0; i < jsonArrayPeliculas.length(); i++) {
                JSONObject pelicula = jsonArrayPeliculas.getJSONObject(i);
                Gson gson = new Gson();
                Pelicula peliculaItem = gson.fromJson(pelicula.toString(),Pelicula.class);
                listaPeliculas.add(peliculaItem);
                System.out.println(peliculaItem.getOriginal_title());
                System.out.println(peliculaItem.getRelease_date());
                System.out.println(peliculaItem.getOverview());
            }

            for (int i = 0; i < jsonArrayPeliculas.length(); i++) {
                JSONObject pelicula = jsonArrayPeliculas.getJSONObject(i);
                Gson gson = new Gson();
                Pelicula peliculaItem = gson.fromJson(pelicula.toString(),Pelicula.class);
                System.out.println("https://image.tmdb.org/t/p/w500"+peliculaItem.getPoster_path());
            }

            File file;
            if (tipo==1){
                file = new File("src/main/resources/cartalera.bin");
            } else {
                file = new File("src/main/resources/estrenos.bin");
            }

            //FileOutputStream;

            /*File
              FileWriter
              PrintWriter

              File
              FileOutput
              ObjetOutput
             */



            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(listaPeliculas);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {

                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }

                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }



}
