package controller;

import com.google.gson.Gson;
import model.Product;
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
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private String url = "https://dummyjson.com/products";
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;

    public void getAll() {

        Gson gson = new Gson();
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

            for (int i = 0; i < productsArray.length(); i++) {
                JSONObject productJSON = productsArray.getJSONObject(i);

                Product product = gson.fromJson(productJSON.toString(), Product.class);
                System.out.println(product.getId() + " " + product.getTitle() + " " + product.getPrice());
            }

            // nombre y precio de todos los productos

        } catch (Exception e) {
            System.out.println("Error en la peticion HTTP");
        }

    }
    public Product getById(int id) {
        Gson gson = new Gson();
        Product product = null;
        try {
            String urlProducto = url +"/" + id;
            client = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder().GET().uri(URI.create(urlProducto)).build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String productSTR = response.body();
            System.out.println(productSTR);
            JSONObject object = new JSONObject(productSTR);
            product = gson.fromJson(object.toString(), Product.class);

        } catch (Exception e) {
            System.out.println("Error en el proceso de la peticion");
            System.out.println(e.getMessage());
        }

        return product;
    }

    public void closeClient(){
        client.close();
    }

    public void getAPI() {
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
