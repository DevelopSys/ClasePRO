import model.Pais;
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

public class Ejercicio2 {

    public static void main(String[] args) {
        // url
        // httpconnection
        // buffereader
        // JSON
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce un nombre");
        String nombre = scanner.nextLine();
        ArrayList<Pais> listaPaises = new ArrayList<>();
        try {
            String urlTemplate = "https://api.nationalize.io/?name=%s";
            URL url = new URL(String.format(urlTemplate,nombre));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String lectura = null;

            while ((lectura = bufferedReader.readLine())!=null){
                builder.append(lectura);
            }


            JSONObject respuesta = new JSONObject(builder.toString());
            JSONArray paises = respuesta.getJSONArray("country");
            for (int i = 0; i < paises.length(); i++) {
                JSONObject probabilidadPais = paises.getJSONObject(i);
                double probabilidad =  probabilidadPais.getDouble("probability");
                String paisID = probabilidadPais.getString("country_id");
                listaPaises.add(new Pais(probabilidad,paisID));
            }

            System.out.printf("Mayor: Pais %s Probabilida %.2f%n",listaPaises.get(0).getId(),listaPaises.get(0).getProbabilidad());
            for (Pais pais: listaPaises) {
                System.out.printf("Pais %s Probabilida %.2f%n",pais.getId(),pais.getProbabilidad());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
