package lecturaJSON.controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class Operaciones {

    public void lecturaJSONLocal(){
        File file = new File("src/resources/asignaturas.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder lectura = new StringBuilder();
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                lectura.append(linea);
            }
            //System.out.println(lectura.toString());
            JSONArray arrayAsignaturas = new JSONArray(lectura.toString());
            JSONObject asignatura = arrayAsignaturas.getJSONObject(0);
            String nombre = asignatura.getString("nombre");
            String profesor = asignatura.getString("profesor");
            int horas = asignatura.getInt("horas");
            System.out.println("nombre = " + nombre);
            System.out.println("profesor = " + profesor);
            System.out.println("horas = " + horas);
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
