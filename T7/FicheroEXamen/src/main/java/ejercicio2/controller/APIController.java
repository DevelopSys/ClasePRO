package ejercicio2.controller;

import com.google.gson.Gson;
import ejercicio2.model.Book;
import ejercicio2.model.Villain;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Optional;

public class APIController {
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;
    private Gson gson;
    private Book maxPage;
    private long maxPageInt  = -1;
    private ArrayList<Book> favs;

    public APIController(){
        favs = new ArrayList<>();
    }

    public void getAllLibros() {
        try {
            gson = new Gson();
            client = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://stephen-king-api.onrender.com/api/books"))
                    .build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject dataJSON = new JSONObject(body);
            JSONArray dataArray = dataJSON.getJSONArray("data");
            for (int i = 0; i < dataArray.length(); i++) {
                JSONObject dataBookJSON = dataArray.getJSONObject(i);
                Book book = gson.fromJson(dataBookJSON.toString(), Book.class);
                System.out.println(book.getId()+" "+book.getTitle());
                if (book.getPages()>maxPageInt){
                    maxPage = book;
                    maxPageInt = maxPage.getPages();
                }
            }
            System.out.println(body);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void getLibroById(int id) {
        try {
            gson = new Gson();
            client = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://stephen-king-api.onrender.com/api/book/"+id))
                    .build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject dataJSON = new JSONObject(body);
            JSONObject dataBookJSON = dataJSON.getJSONObject("data");
            Book book = gson.fromJson(dataBookJSON.toString(), Book.class);
            System.out.println(book.getId() +" "+book.getTitle());
            System.out.println("Su lista de villanos es: ");
            for (Villain item: book.getVillains()) {
                System.out.println(item.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void getLibroByIdFav(int id) {
        try {
            gson = new Gson();
            client = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://stephen-king-api.onrender.com/api/book/"+id))
                    .build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject dataJSON = new JSONObject(body);
            JSONObject dataBookJSON = dataJSON.getJSONObject("data");
            Book book = gson.fromJson(dataBookJSON.toString(), Book.class);
            favs.add(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void exportarFavs(){
        File file = new File("src/main/java/ficheros/favs.obj");
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(favs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void importarFavs(){
        File file = new File("src/main/java/ficheros/favs.obj");
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            favs = (ArrayList<Book>) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void getMaxPage(){
        if(maxPage != null){
            System.out.println(maxPage.getId() +" "+maxPage.getTitle()+" "+maxPage.getPages());
        } else {
            System.out.println("No se han encontrado libros");
        }
    }
}

