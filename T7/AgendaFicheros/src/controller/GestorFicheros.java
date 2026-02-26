package controller;

import model.Contacto;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorFicheros {
    private File file;
    private BufferedReader reader;
    private FileWriter writer;
    private PrintWriter printWriter;

    public void escribirContacto(Contacto contacto) {
        file = new File("src/resources/usuarios.txt");

        try {
            printWriter = new PrintWriter(new FileWriter(file, true));
            // nombre,apellido,dni
            printWriter.println(contacto);
            // falla
        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero");
        } finally {
            try {
                printWriter.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }

        /*try {
            writer = new FileWriter(file);
            writer.write("23");
        } catch (IOException e) {
            System.out.println("Error en la creacion del fichero");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("Error en la IO del fichero");
            }
        }*/

    }

    public List<Contacto> importarContactos(){

        List<Contacto> lista = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(new File("src/resources/usuarios.txt")));
            String linea;
            while ((linea= reader.readLine())!=null){
                // qwe,qwe,qwe
                String[] datos = linea.split(",");
                Contacto contacto = new Contacto(datos[0],datos[0],datos[2]);
                lista.add(contacto);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no está disponible para leer");
        } catch (IOException e) {
            System.out.println("No tienes permiso de lectura");
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }

        return lista;
    }

    public HashMap<String,Contacto> importarContactosHM(){

        HashMap<String,Contacto> lista = new HashMap<>();

        try {
            reader = new BufferedReader(new FileReader(new File("src/resources/usuarios.txt")));
            String linea;
            while ((linea= reader.readLine())!=null){
                // qwe,qwe,qwe
                String[] datos = linea.split(",");
                Contacto contacto = new Contacto(datos[0],datos[1],datos[2]);
                lista.put(contacto.getDni(),contacto);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no está disponible para leer");
        } catch (IOException e) {
            System.out.println("No tienes permiso de lectura");
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }

        return lista;
    }


}
