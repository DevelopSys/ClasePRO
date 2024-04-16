package lecturaJSON.controller;
import com.google.gson.Gson;
import lecturaJSON.model.Asignatura;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;

public class Operaciones {

    public void lecturaJSONLocal() {
        File file = new File("src/resources/asignaturas.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder lectura = new StringBuilder();
            String linea = null;
            while ((linea = bufferedReader.readLine()) != null) {
                lectura.append(linea);
            }
            //System.out.println(lectura.toString());
            ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
            JSONArray arrayAsignaturas = new JSONArray(lectura.toString());
            for (int i = 0; i < arrayAsignaturas.length(); i++) {
                JSONObject asignaturaJSON = arrayAsignaturas.getJSONObject(i);
                Asignatura asignatura = new Gson().fromJson(asignaturaJSON.toString(),Asignatura.class);
                listaAsignaturas.add(asignatura);
                //System.out.println(asignatura.toString());
                /*String nombre = asignatura.getString("nombre");
                String profesor = asignatura.getString("profesor");
                int horas = asignatura.getInt("horas");
                JSONArray conocimientos = asignatura.getJSONArray("conocimientos");
                Asignatura a = new Asignatura(nombre, profesor, horas, conocimientos)
                System.out.println("nombre = " + nombre);
                System.out.println("profesor = " + profesor);
                System.out.println("horas = " + horas);
                for (int j = 0; j < conocimientos.length(); j++) {
                    System.out.println(conocimientos.getString(j));
                }*/
            }


            //System.out.println(arrayAsignaturas);

        } catch (FileNotFoundException e) {
            System.out.println("Fallo en el fichero");
        } catch (IOException e) {
            System.out.println("Fallo en la lectura");
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Fallo en el cerrado del fichero");
            }
        }

    }
}
