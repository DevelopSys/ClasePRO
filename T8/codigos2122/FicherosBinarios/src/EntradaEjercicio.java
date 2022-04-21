import controller.EjercicioController;
import model.Usuario;

import java.util.Scanner;

public class EntradaEjercicio {

    public static void main(String[] args) {

        EjercicioController ejercicioController = new EjercicioController();
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido, pass;
        int opcionUsuarios = 0, opcionLectura = 0;

        do {
            System.out.println("Intro nombre");
            nombre = scanner.next();
            System.out.println("Intro apellido");
            apellido = scanner.next();
            System.out.println("Intro pass");
            pass = scanner.next();
            Usuario usuario = new Usuario(nombre,apellido,pass);
            ejercicioController.addUsuario(nombre, apellido, pass);
            System.out.println("Quiere meter mas usuarios");
            opcionUsuarios = scanner.nextInt();
        } while (opcionUsuarios != 0);

        // NO QUIERO MAS, PASO A FICHERO
        ejercicioController.escrituraUsuarios();

        System.out.println("Quieres leer el fichero");
        opcionLectura = scanner.nextInt();
        if (opcionLectura==1){
           ejercicioController.lecturaFichero();
        }
        System.out.println("Terminado el ejercicio");


    }
}
