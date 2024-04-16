package ejercicio1;

import ejercicio1.controller.OperacionesUsuario;
import ejercicio1.model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        OperacionesUsuario operacionesUsuario = new OperacionesUsuario();
        Scanner scanner = new Scanner(System.in);
        String continuar = "";

        do {
            System.out.println("Introduce todos los datos");
            String nombre = scanner.next();
            String apellido = scanner.next();
            String dni = scanner.next();
            int edad = scanner.nextInt();
            int telefono = scanner.nextInt();
            operacionesUsuario.agregarUsuario(new Usuario(nombre, apellido,
                    dni, edad, telefono));
            System.out.println("Quieres continuar (si/no)");
            continuar = scanner.next();


        } while (continuar.equalsIgnoreCase("si"));

        operacionesUsuario.exportarDatos();

    }
}
