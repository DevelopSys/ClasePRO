package org.example;


import org.example.controller.UsuariosController;
import org.example.database.DatabaseUtil;
import org.example.model.Usuario;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        UsuariosController usuariosController = new UsuariosController();
        //usuariosController.insertarUsario(new Usuario("Juan","correo@juan.com","23456QWE"));
        //usuariosController.insertarUsuarioPS(new Usuario("Luis","correo@luis.com","23456QWE"));
        usuariosController.seleccionUsuarios("Luis","23456QWE");
        //usuariosController.seleccionUsuariosInt("Borja","12345A");

    }
}