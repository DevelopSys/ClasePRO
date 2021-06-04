package codigosFicheros;
import org.json.*;
import java.io.*;


public class TrabajoFicheros {

    public void existeFichero(File file) {
        //System.out.println(file.exists());
        if (file.exists() && file.isFile() && file.canRead()) {
            System.out.println("El fichero está disponible");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerFichero(File file) {
        FileReader fileReader;
        String lectura = "";

        try {
            fileReader = new FileReader(file);
            int codigo = 0;
            while ((codigo = fileReader.read()) != -1) {
                //System.out.print((char)codigo);
                char letra = (char) codigo;
                lectura += letra;

            }
            System.out.println("Fin de la lectura");
            //System.out.println("El resultado es "+ lectura);
            if (lectura.contains("Pepe")) {
                System.out.println("esta borja");
            }
            ;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerFicheroBuffer(File file) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String lectura = "";

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String totalContenido = "";
            String linea = "";
            while ((linea = bufferedReader.readLine()) != null) {
                //System.out.println(linea);
                totalContenido += linea;
                totalContenido += "\n";

            }

            System.out.println("Fin de la lectura");
            System.out.println("La lectura es: " + totalContenido);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirFichero(File file) {

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write("otra linea\n");
            fileWriter.write("otra linea más");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void escribirFicheroBuffer(File file) {

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Una linea escrita de forma conjunta");
            bufferedWriter.newLine();
            bufferedWriter.write("otra linea escrita de forma conjunta");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void lecturaJSON(File file){

        FileReader fileReader = null;
        String lecturaCompleta="";

        try {
            int codigo = 0;
            fileReader = new FileReader(file);
            while ((codigo = fileReader.read())!=-1){
                lecturaCompleta += (char)codigo;
            }

            JSONArray arrayPersonas = new JSONArray(lecturaCompleta);
            for (int i = 0; i < arrayPersonas.length(); i++) {
                JSONObject objetoItem = arrayPersonas.getJSONObject(i);
                String nombrePersona = objetoItem.getString("nombre");
                JSONArray arrayHijos = objetoItem.getJSONArray("hijos");

                System.out.println(nombrePersona);
                if (arrayHijos.length()>0){
                    System.out.println("Tiene "+ arrayHijos.length()+"hijos");
                } else {
                    System.out.println("no tiene hijos");
                }
            }

            //System.out.println(lecturaCompleta);
            //JSONObject object = new JSONObject(lecturaCompleta);
            //double altura = object.getDouble("altura");
            //System.out.println(altura);
            /*JSONArray arrayHobbies = object.getJSONArray("hobbies");
            for (int i = 0; i < arrayHobbies.length(); i++) {
                String hobbieItem = arrayHobbies.getString(i);
                System.out.println(hobbieItem);
            }*/


            /*JSONArray arrayHijos = object.getJSONArray("hijos");
            for (int i = 0; i < arrayHijos.length(); i++) {
                JSONObject hijoItem = arrayHijos.getJSONObject(i);
                System.out.println(hijoItem.getString("nombre"));
            }*/



        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }


    }

}
