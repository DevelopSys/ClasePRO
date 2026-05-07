package controller;

import dao.UserDAO;
import model.User;

public class TiendaController {

    private UserDAO userDAO;

    public TiendaController() {
        userDAO = new UserDAO();
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
}
