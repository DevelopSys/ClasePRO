import model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> agenda = new ArrayList<>();
        String opcionContinuar = null;
        String nombre, correo;
        int telefono;

        do {
            System.out.println("Introduce nombre");
            nombre = scanner.next();
            System.out.println("Introduce telefono");
            telefono = scanner.nextInt();
            System.out.println("Introduce correo");
            correo = scanner.next();
            agenda.add(new Usuario(nombre,telefono,correo));
            System.out.println("Quieres continuar introduciendo datos");
            opcionContinuar = scanner.next();

        } while (opcionContinuar.equalsIgnoreCase("Y"));

        File file = new File("src/main/java/fichero/ejercicio3.txt");
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file,true);
            printWriter = new PrintWriter(fileWriter);

            for (Usuario usuario: agenda) {
                printWriter.print(String.format("%s, %d, %s%n",usuario.getNombre(),usuario.getTelefono(),usuario.getCorreo()));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            printWriter.close();
        }

    }
}
