import model.Equipo;
import model.Liga;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Lector {

    private ArrayList<Liga> listaLigas;
    private ArrayList<Equipo> listaEquipos;

    public Lector(){
        this.listaLigas = new ArrayList<>();
        this.listaEquipos = new ArrayList<>();
    }

    public void obtenerLigas(){
        String urlLigas = "https://www.thesportsdb.com/api/v1/json/3/all_leagues.php";
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(urlLigas);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lectura = bufferedReader.readLine();
            JSONObject objeto = new JSONObject(lectura);
            JSONArray arrayLigas = objeto.getJSONArray("leagues");
            for (int i = 0; i <arrayLigas.length(); i++) {
                JSONObject liga = arrayLigas.getJSONObject(i);
                String nombreLiga = liga.getString("strLeague");
                String deporte = liga.getString("strSport");
                String idLiga =  liga.getString("idLeague");
                if (deporte.equalsIgnoreCase("soccer")){
                    listaLigas.add(new Liga(nombreLiga,idLiga));
                }
            }
        } catch (MalformedURLException e) {
            //throw new RuntimeException(e);
        } catch (IOException e) {
            //throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void listarLigas(){
        for (int i = 0; i < listaLigas.size(); i++) {
            System.out.printf("%s - %s%n",listaLigas.get(i).getId(),listaLigas.get(i).getNombre());
        }
    }

    public void obtenerClasificacion(){

        // id año
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el id de la liga de la cual quieres sacar la clasificacion");
        String id = scanner.nextLine();
        System.out.println("Indica la temporada");
        String temporada = scanner.nextLine();
        //String clasificacionURL = "https://www.thesportsdb.com/api/v1/json/3/lookuptable.php?l="+id+"&s="+temporada;
        String clasificacionURL = String.format("https://www.thesportsdb.com/api/v1/json/3/lookuptable.php?l=%s&s=%s"
                ,id,temporada);
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(clasificacionURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lectura = bufferedReader.readLine();
            JSONObject objeto = new JSONObject(lectura);
            JSONArray arrayTabla = objeto.getJSONArray("table");
            for (int i = 0; i <arrayTabla.length(); i++) {
                JSONObject equipo = arrayTabla.getJSONObject(i);
                String nombre = equipo.getString("strTeam");
                String posicion =  equipo.getString("intRank");
                String idEquipo =  equipo.getString("idTeam");
                listaEquipos.add(new Equipo(nombre,posicion,idEquipo));
            }
        } catch (MalformedURLException e) {
            //throw new RuntimeException(e);
        } catch (IOException e) {
            //throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void mostrarEquipos(){
        for ( Equipo item: listaEquipos ) {
            System.out.printf("%s %s%n",item.getPosicion(), item.getNombre());
        }
    }


}
