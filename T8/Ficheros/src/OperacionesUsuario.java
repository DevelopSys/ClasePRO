import model.Usuario;

import java.io.*;

public class OperacionesUsuario {

    public void escribirUsuario(String path, Usuario usuario) {
        File file = new File(path);
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println(usuario.toString());
            // escribe nombre,
        } catch (IOException e) {
            System.out.println("error i/o");
        } finally {
            try {
                printWriter.close();
            } catch (Exception e) {
                System.out.println("error en el cerrado");
            }
        }

    }
    public void lecturaUsuarios(String path){
        File file = new File(path);
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = bufferedReader.readLine())!=null){
                // Borja,Martin,borja@gmail.com,1234
                String[] datos = linea.split(",");
                Usuario usuario = new Usuario(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]));
                usuario.mostradDatos();

            }

        } catch (FileNotFoundException e) {
            System.out.println("Ficheo no encontrado");
        } catch (IOException e) {
            System.out.println("Fallo de I/O");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Fallo en el cierre");
            }
        }
    }

}
