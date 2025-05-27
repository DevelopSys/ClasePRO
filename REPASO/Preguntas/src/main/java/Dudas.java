import model.Coche;

import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dudas {

    public void duda1() {
        // File -> FileInputStream -> ObjectInputStream
        File f = new File("src/main/java/resources/coches.obj");
        ArrayList<Coche> listaCoches = new ArrayList<Coche>();
        ObjectInputStream objectInputStream = null;

        if (f.exists()) {
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(f));
                listaCoches = (ArrayList<Coche>) objectInputStream.readObject();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void duda2(String nombre, int precio) {
        // acciones
        System.out.println(nombre);
        System.out.println(precio);
    }

    public void duda3(Coche coche) throws SQLException {
        PreparedStatement ps = null;
        ps.setString(1, coche.getMatricula());
        ps.setString(2, coche.getMatricula());
        ps.setString(3, coche.getMatricula());
        ps.executeUpdate(); // int borrado actualizacion
        ps.execute(); // boolean insercion
        ps.executeQuery(); // resultset SELECT!!!!!!
    }

    public void duda4() throws SQLException {
        // resultset -> SELECT * FROM %s WHERE %s=%s
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String marca = resultSet.getString("marca");
            String modelo = resultSet.getString("modelo");
            String matricula = resultSet.getString("matricula");
        }

    }

    public void duda5() throws IOException {
        // File -> FileReader (caracter a caracter) -> BufferedReader (linea a linea)
        File file = new File("ruta");
        FileReader fileReader = null;
        BufferedReader reader = null;
        fileReader = new FileReader(file);
        reader = new BufferedReader(fileReader);
        if (file.exists()) {

            String linea = null;
            while ((linea= reader.readLine())!=null){
                System.out.println(linea);
            }

            /*int codigo = -1;
            while ((codigo = fileReader.read()) != -1) {
                System.out.println((char) codigo);
            }*/


        }
    }

    public void duda6() throws IOException {
        // File -> FileWriter (caracter a caracter) -> BufferedWriter o PrintWriter (linea a linea)
        // csv -> cabecera1,cabecera2,cabecera3
        //        v1,v2,v3
        //        v1,v2,v3
        //        v1,v2,v3
        //        v1,v2,v3
        //        v1,v2,v3
        //        v1,v2,v3
        //        v1,v2,v3
        //        v1,v2,v3
        //        v1,v2,v3

        File file = new File("");
        PrintWriter printWriter = null;

        printWriter = new PrintWriter(new FileWriter(file,true));
        ArrayList<Coche> listado = new ArrayList<>(); // retorno de un metodo de DTO
        for (Coche coche: listado) {
            printWriter.println(coche.exportacionDatos());
        }


        printWriter.close();
    }
}
