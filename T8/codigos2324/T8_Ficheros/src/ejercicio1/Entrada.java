package ejercicio1;

import ejercicio1.model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continuar = "";
        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        do {
            System.out.println("Introduce todos los datos");
            String nombre = scanner.next();
            String apellido = scanner.next();
            String dni = scanner.next();
            int edad = scanner.nextInt();
            int telefono = scanner.nextInt();
            listaUsuario.add(new Usuario(nombre, apellido, dni, edad, telefono));
            System.out.println("Quieres continuar (si/no)");
            continuar = scanner.next();


        } while (continuar.equalsIgnoreCase("si"));


        File file = new File("src/resources/usuarios.txt");
        FileWriter fileWriter = null;

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error en permisos");
            }
        }

        try {
            fileWriter = new FileWriter(file,true);
            for (Usuario usuario :  listaUsuario ){
                fileWriter.write(usuario.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
