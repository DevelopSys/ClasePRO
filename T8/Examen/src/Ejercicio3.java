import model.Usuario;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {
        File file = new File("src/recursos/ejercicio3.obj");

        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            ArrayList<Usuario> lista = (ArrayList<Usuario>) objectInputStream.readObject();
            for (Usuario usuario: lista) {
                System.out.println(usuario.getNombre() + " "+usuario.getEdad());
            }
        } catch (IOException e) {
            System.out.println("Error I/O");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
