package ejercicios;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Jornadas {

    FileReader lector = null;

    public void leerJornadas() {

        File file = new File("src/resources/partidos.txt");
        String partidosTemporada = "";
        int lecturaByte=0;

        try {
            lector = new FileReader(file);
            while( ( lecturaByte = lector.read()) != -1 ){
                partidosTemporada+=(char)lecturaByte;
            }
            //System.out.println(partidosTemporada);
            JSONObject objectoJornadas = new JSONObject(partidosTemporada);
            JSONArray itemJornadas = objectoJornadas.getJSONArray("events");
            for (int i = 0; i < itemJornadas.length(); i++) {
                JSONObject partido = itemJornadas.getJSONObject(i);
                String local = partido.getString("strHomeTeam");
                int golesLocal = Integer.valueOf(partido.getString("intHomeScore"));
                String visitante = partido.getString("strAwayTeam");
                int golesVisitantes = Integer.valueOf(partido.getString("intAwayScore"));

                System.out.printf("%s %d vs %s %d%n",local,golesLocal,visitante,golesVisitantes);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public void leerJornadas(String equipo) {

        File file = new File("src/resources/partidos.txt");
        String partidosTemporada = "";
        int lecturaByte=0;
        int contador=0;

        try {
            lector = new FileReader(file);
            while( ( lecturaByte = lector.read()) != -1 ){
                partidosTemporada+=(char)lecturaByte;
            }
            //System.out.println(partidosTemporada);
            JSONObject objectoJornadas = new JSONObject(partidosTemporada);
            JSONArray itemJornadas = objectoJornadas.getJSONArray("events");
            for (int i = 0; i < itemJornadas.length(); i++) {
                JSONObject partido = itemJornadas.getJSONObject(i);
                String local = partido.getString("strHomeTeam");
                int golesLocal = Integer.valueOf(partido.getString("intHomeScore"));
                String visitante = partido.getString("strAwayTeam");
                String porteroLocal = partido.getString("strHomeLineupGoalkeeper");
                String defensasLocal = partido.getString("strHomeLineupDefense");
                String mediosLocal = partido.getString("strHomeLineupMidfield");
                String delanterosLocal = partido.getString("strHomeLineupForward");
                String banquilloLocal = partido.getString("strHomeLineupSubstitutes");
                int golesVisitantes = Integer.valueOf(partido.getString("intAwayScore"));
                String porteroVisitante = partido.getString("strAwayLineupGoalkeeper");
                String defensasVisitante= partido.getString("strAwayLineupDefense");
                String mediosVisitante = partido.getString("strAwayLineupMidfield");
                String delanterosVisitante = partido.getString("strAwayLineupForward");
                String banquilloVisitante = partido.getString("strAwayLineupSubstitutes");

                if (local.toLowerCase().equals(equipo.toLowerCase()) || visitante.toLowerCase().equals(equipo.toLowerCase())) {
                    System.out.println("Partido "+ contador);
                    System.out.printf("%s %d vs %s %d%n", local, golesLocal, visitante, golesVisitantes);
                    System.out.println("Alineación Local");
                    System.out.println("\t "+porteroLocal);
                    System.out.println("\t "+defensasLocal);
                    System.out.println("\t "+mediosLocal);
                    System.out.println("\t "+delanterosLocal);
                    System.out.println("Banquillo");
                    System.out.println("\t "+banquilloLocal);
                    System.out.println("Alineación Visitante");

                    System.out.println("\t "+porteroVisitante);
                    System.out.println("\t "+defensasVisitante);
                    System.out.println("\t "+mediosVisitante);
                    System.out.println("\t "+defensasVisitante);
                    System.out.println("Banquillo");
                    System.out.println("\t "+banquilloVisitante);
                    System.out.println("");
                    contador++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
