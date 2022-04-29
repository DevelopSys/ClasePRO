package controller;

import com.google.gson.Gson;
import model.Asignatura;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONController {

    String jsonString = "{\n" +
            "  \"nombre\": \"Borja\",\n" +
            "  \"apellidos\": \"Martin Herrera\",\n" +
            "  \"edad\": 38,\n" +
            "  \"hobbies\": [\n" +
            "    \"musica\",\n" +
            "    \"deporte\",\n" +
            "    \"cine\",\n" +
            "    \"informática\"\n" +
            "  ]}";

    public void pasarStringJSON() {
        // STRING --> JSON (org.json)
        JSONObject jsonObject = new JSONObject(jsonString);
        String nombre = jsonObject.getString("nombre");
        int edad = jsonObject.getInt("edad");
        JSONArray hobbies = jsonObject.getJSONArray("hobbies");
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println("Tus hobbies son:");
        for (int i = 0; i < hobbies.length(); i++) {
            System.out.println(hobbies.getString(i));
        }

    }

    public void leerFicheroJSON() {
        File file = new File("src/main/resources/persona.json");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            // br.readLine() --> linea completa
            String linea = null;
            StringBuffer lecturaCompleta = new StringBuffer();
            while ((linea = br.readLine())!= null){
                lecturaCompleta.append(linea);
            }

            // PASAR UN STRING A JSON

            JSONObject jsonObject = new JSONObject(lecturaCompleta.toString());
            JSONArray arrayConocimientos = jsonObject.getJSONArray("conocimientos");
            for (int i = 0; i < arrayConocimientos.length(); i++) {
                JSONObject conocimiento = arrayConocimientos.getJSONObject(i);
                Gson gson = new Gson();

                Conocimiento conocimientoJava = gson.fromJson(conocimiento.toString(),Conocimiento.class);
                System.out.println(conocimientoJava.getConcepto());
                System.out.println(conocimientoJava.getExperiencia());


                /*String concepto = conocimiento.getString("concepto");
                int experiencia = conocimiento.getInt("experiencia");
                System.out.println(concepto);
                System.out.println(experiencia);
                System.out.println("Los detalles del conocimiento "+concepto+" son:");
                JSONArray detalles = conocimiento.getJSONArray("detalle");
                for (int j = 0 ; j < detalles.length() ; j++) {
                    String detalle = detalles.getString(j);
                    System.out.println(detalle);
                }*/
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerJSONAsignturas(){

        File file = new File("src/main/resources/asignaturas.json");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer buffer = new StringBuffer();
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                buffer.append(linea);
            }

            JSONObject jsonAsignaturas = new JSONObject(buffer.toString());
            JSONArray asignaturas = jsonAsignaturas.getJSONArray("asignaturas");
            for (int i = 0; i < asignaturas.length(); i++) {
                JSONObject asignaturaJSON = asignaturas.getJSONObject(i);
                Gson gson = new Gson();
                Asignatura asignatura = gson.fromJson(asignaturaJSON.toString(),Asignatura.class);
                caracteristicasAsignatura(asignatura);

            }

            // Captura todas las asignaturas individuales y tener la posibilidad de
            // tratarlas como objetos JAVA
            // y ver su curso y su ciclo
            // Pedir al usuario un curso y un ciclo del que quiere ver las asignturas
                // dam
                // 1
            // si se introduce un curso que no esta en el JSON, el sistema indica CURSO NO ENCONTRADO
            // el sistema deber mostrar las asignaturas del ciclo y curso pedido con el siguiente formato
            // Nombre: XX
            // Profesor: NOM AP
            // Sigras: XX
            // Duracion: XX
            // Conocimientos: XX,XX,XX

            System.out.println(asignaturas);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void caracteristicasAsignatura(Asignatura asignatura){
        System.out.println(asignatura.getCiclo());
        System.out.println(asignatura.getCurso());
    }


}
