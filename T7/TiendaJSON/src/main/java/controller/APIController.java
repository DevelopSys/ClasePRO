package controller;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private String url = "https://dummyjson.com/products";
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;

    public void getAll() {

        // cerrarlo
        try {
            client = HttpClient.newHttpClient();
            request = HttpRequest
                    .newBuilder()
                    .GET()
                    .uri(URI.create(url))
                    .build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String productsStr = response.body();
            JSONObject productsJSON = new JSONObject(productsStr);
            JSONArray productsArray = productsJSON.getJSONArray("products");
            JSONObject product = productsArray.getJSONObject(29);
            double price = product.getDouble("price");
            System.out.println(price);

        } catch (Exception e) {
            System.out.println("Error en la peticion HTTP");
        } finally {
            try {
                client.close();
            } catch (NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void getAPI(){
        try {
            URL url = new URL(this.url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String productsStr = reader.readLine();
            System.out.println(productsStr);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
