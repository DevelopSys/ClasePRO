package org.example;

import org.example.controller.UsuarioController;
import org.example.model.Usuario;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UsuarioController usuarioController = new UsuarioController();
        //usuarioController.insertarUsuario(new Usuario("Borja","correo@hibernate.com","123ASD"));
        //usuarioController.obtenerDatos(1);
        usuarioController.obtenerLogin("Borja","12345A");
    }
}
