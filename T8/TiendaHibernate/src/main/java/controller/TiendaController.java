package controller;

import dao.UserDAO;
import model.User;

import java.util.List;

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

    public void findUsers(String name) {
        List<User> lista = userDAO.getUserByName(name);
        if (!lista.isEmpty()) {
            lista.forEach(User::showData);
        } else {
            System.out.println("No hay usuarios con la condicioon de busqueda");
        }
    }

    public void updateUser(String name, String lastName, String newMail){
        User user = userDAO.updateUserByLastNameAndName(name,lastName,newMail);
        if(user!=null){
            System.out.println("Actualizados los datos del usuarios: ");
            user.showData();
        } else {
            System.out.println("No se han encontrado usuarios con los criterios");
        }
    }
}
