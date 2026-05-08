package controller;

import com.google.gson.Gson;
import dao.ProductDAO;
import dao.UserDAO;
import model.ProductResponse;
import model.User;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class TiendaController {

    private UserDAO userDAO;
    private ProductDAO productDAO;

    public TiendaController() {
        userDAO = new UserDAO();
        productDAO = new ProductDAO();
    }

    public void signInUser(User user) {
        // logica de negocio
        // dar de alta un usuario
        userDAO.insertUser(user);
        // mandarle un correo de bienvenida
        // activarle una caracteristica de 1ª compra
    }

    public void loginUser(int id) {
        User user = userDAO.getUserById(id);
        if (user != null) {
            user.showData();
        } else {
            System.out.println("No existe este usuario");
        }
    }

    public void findUsers(String name) {
        List<User> lista = userDAO.getUserByName(name);
        if (!lista.isEmpty()) {
            lista.forEach(User::showData);
        } else {
            System.out.println("No hay usuarios con la condicioon de busqueda");
        }
    }

    public void updateUser(String name, String lastName, String newMail) {
        User user = userDAO.updateUserByLastNameAndName(name, lastName, newMail);
        if (user != null) {
            System.out.println("Actualizados los datos del usuarios: ");
            user.showData();
        } else {
            System.out.println("No se han encontrado usuarios con los criterios");
        }
    }

    public void importProducts() {
        HttpClient client = null;
        Gson gson = new Gson();
        try {
            client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .GET()
                    .uri(URI.create("https://dummyjson.com/products"))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ProductResponse productResponse = gson.fromJson(response.body(), ProductResponse.class);
            productDAO.insertProducts(productResponse.getProducts());
        } catch (Exception e) {
            System.out.println("Fallo en la conexion");
        } finally {
            client.close();
        }
    }

    public void getProfileUser(int id){
        User user = userDAO.getUserById(id);
        if(user != null){
            System.out.println("El perfil del usuario es ");
            System.out.println(user.getProfile().getName());
        }

    }

    public void getUsersProfile(int id){
        List<User> users = userDAO.getUsersByProfile(id);
        if (users != null){
            users.forEach(User::showData);
        }
    }
}
