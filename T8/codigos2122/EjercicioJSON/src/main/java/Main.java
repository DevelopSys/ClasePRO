import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String genero;
        int numeroUsuarios;
        System.out.println("Cuantos usuarios");
        numeroUsuarios = scanner.nextInt();
        System.out.println("Que genero (male/female/ambos");
        genero = scanner.next();
        JSONController controller = new JSONController();
        controller.leerFichero();
        controller.leerUsuarios(numeroUsuarios,genero);
        controller.escribirUsuarios();
    }
}
