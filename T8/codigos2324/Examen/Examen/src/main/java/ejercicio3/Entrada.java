package ejercicio3;

import ejercicio3.model.Usuario;

import java.io.*;

public class Entrada {

    public static void main(String[] args) {
        // FILE -> FILEREAD -BUFFEREDREADER
        File fileUsuarios = new File("src/main/java/ejercicio3/resources/ejercicio3.txt");
        File fileUsuariosObjecto = new File("src/main/java/ejercicio3/resources/premio.obj");


        Usuario usuarioMax = new Usuario();
        usuarioMax.setMedia(0);
        BufferedReader reader = null;
        ObjectOutputStream oos = null;

        try {
            reader = new BufferedReader(new FileReader(fileUsuarios));
            String linea = null;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (usuarioMax.getMedia()<Integer.valueOf(datos[3].replaceAll(" ", ""))){
                Usuario usuario = new Usuario(datos[0], datos[1]
                        , datos[2], Integer.valueOf(datos[3].replaceAll(" ", "")));
                //System.out.println(usuario.getMedia());
                    usuarioMax = usuario;
                }
            }

            oos = new ObjectOutputStream(new FileOutputStream(fileUsuariosObjecto));
            oos.writeObject(usuarioMax);

            //System.out.println(usuarioMax.getNombre());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        // FILE -> FILEOUTPUTSTREAM -> OBJECTOUTPUTSTREAM
    }
}
