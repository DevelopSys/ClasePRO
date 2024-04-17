package agenda.controller;

import agenda.model.Usuario;
import agenda.model.UsuarioTexto;

import java.io.*;
import java.util.ArrayList;

public class GestorAgendaTexto {

    public void escribirUsuarios(UsuarioTexto usuario) {
        // FILE -> FILEWRITER -> PRINTWRITER

        File file = new File("src/main/java/agenda/resources/agendatexto.txt");

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file, true);
            printWriter = new PrintWriter(fileWriter);
            //UsuarioTexto u = new UsuarioTexto("Borja",4,5,3,23);
            // sacando por consola o escribiendo en un flujo texto plano -> toString
            // Borja,4,5,6,23
            printWriter.println(usuario);

        } catch (IOException e) {
            System.out.println("Fallo IO");
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }

    }


    public void leerUsuarios() {

        // FILE - FILEREAD -> BUFFEREDREADER
        File file = new File("src/main/java/agenda/resources/agendatexto.txt");

        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<UsuarioTexto> listado = new ArrayList<>();

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String linea = null; // Borja,3,5,8,23 -> new Usuarios(  )
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                UsuarioTexto usuario = new UsuarioTexto(datos[0], Integer.valueOf(datos[1]), Integer.valueOf(datos[2]),
                        Integer.valueOf(datos[3]), Integer.valueOf(datos[4]));
                listado.add(usuario);
                //System.out.println("El usuario leido y pasadao a objeto es: "+usuario.getNombre());
            }

            System.out.println("El numero de usuarios es "+listado.size());
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error de IO");
        }

    }
}
