package github.ejercicios;

import java.io.File;

public class Entrada {

    public static void main(String[] args) {
        //UsuariosPedidos usuariosPedidos = new UsuariosPedidos();
        //usuariosPedidos.pedirUsuarios(new File("src/github/ejercicios/documentos/usuarios.txt"));
        LecturaFichero lecturaFichero = new LecturaFichero();
        //lecturaFichero.leerFichero(new File("src/github/ejercicios/documentos/inverso.txt"));
        Listar listar = new Listar();
        listar.listarRecursivo(new File("src"));

    }
}
