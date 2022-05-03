package controller;

import com.google.gson.Gson;
import model.Name;
import model.Usuario;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class JSONController {

    private ArrayList<Usuario> lista;

    public void leerUsuarios(int numero, String genero){
        if(lista==null){
            lista = new ArrayList<>();
        }
        String urlString = "https://randomuser.me/api/?results="+numero+"&gender="+genero;
        String urlFormat = String.format("https://randomuser.me/api/?results=%d&gender=%s",numero,genero);
        //System.out.println(urlFormat);

        BufferedReader reader =null;
        try {
            URL url = new URL(urlFormat);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuffer = new StringBuilder();
            String linea = null;

            while ((linea=reader.readLine())!=null){
                stringBuffer.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuffer.toString());
            JSONArray arreyResultados = jsonObject.getJSONArray("results");
            for (int i = 0; i < arreyResultados.length(); i++) {
                JSONObject objetoResultado = arreyResultados.getJSONObject(i);
                String mail = objetoResultado.getString("email");
                JSONObject name = objetoResultado.getJSONObject("name");
                String imagen = objetoResultado.getJSONObject("picture").getString("large");
                /*String title = name.getString("title");
                String first = name.getString("first");
                String last = name.getString("last");
                System.out.println(title);
                System.out.println(first);
                System.out.println(last);*/
                Gson gson = new Gson();
                Name nameJAVA = gson.fromJson(name.toString(),Name.class);
                lista.add(new Usuario(imagen,mail,nameJAVA));
                /*System.out.println(nameJAVA.getTitle());
                System.out.println(nameJAVA.getFirst());
                System.out.println(nameJAVA.getLast());
                System.out.println(mail);
                System.out.println(imagen);*/
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public void escribirUsuarios(){
        File file = new File("src/main/resources/usuarios.bin");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public void leerFichero(){
        File file = new File("src/main/resources/usuarios.bin");
        ObjectInputStream objectInputStream =null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            lista = (ArrayList<Usuario>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
