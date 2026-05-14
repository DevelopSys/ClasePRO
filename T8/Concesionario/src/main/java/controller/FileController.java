package controller;

import dao.MarcaDAO;
import model.Coche;
import model.Marca;

import java.io.*;
import java.util.ArrayList;

public class FileController {

    private MarcaDAO marcaDAO;

    public FileController(){
        marcaDAO = new MarcaDAO();
    }

    public ArrayList<Coche> importarCoches() {
        // File -> FileReader -> BufferedReader
        ArrayList<Coche> coches = new ArrayList<>();
        // File file = new File("src/main/java/coches.csv");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("src/main/java/coches.csv"));
            String linea = null;

            while ((linea = br.readLine()) != null) {
                // 1234ABC,1,Ibiza,Rojo,1,2020,45000,12500,1
                String[] datos = linea.split(",");
                int idMarca = Integer.parseInt(datos[1]);
                Marca marca = marcaDAO.getMarcaById(idMarca);
                // ves a dao y busca la marca con id X datos[1] -> Marca
                Coche coche = new Coche(datos[0], marca, datos[2], datos[3],
                        datos[4], datos[5], datos[6], datos[7], Integer.parseInt(datos[8]));
                // coches.add(coche);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Fallo en permisos de lectura");
        } finally {
            try {
                br.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado del flujo");
            }
        }


        return coches;
    }

}
