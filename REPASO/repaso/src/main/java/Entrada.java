import model.Alumno;

import java.io.*;

public class Entrada {

    public static void main(String[] args) {
        // escritura
        File ficheroAlumnos = new File("src/main/java/resources/alumno.obj");

        /*
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            //fileWriter = new FileWriter(ficheroAlumnos);
            printWriter = new PrintWriter(new FileWriter(ficheroAlumnos));
            printWriter.println("Este es el primer alumno");
            printWriter.println("Este es el segundo alumno");
        } catch (IOException e) {
            System.out.println("Error el encontrar el fichero");
        } finally {

                printWriter.close();
                // fileWriter.close();
        }*/
        /*
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // fileReader = new FileReader(ficheroAlumnos);
            bufferedReader = new BufferedReader(new FileReader(ficheroAlumnos));
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/
        /*
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(ficheroAlumnos));
            objectOutputStream.writeObject(new Alumno("Borja", "MArtin","bmartin@gmail"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/

        ObjectInputStream objectInputStream = null;
        try {
             objectInputStream = new ObjectInputStream(new FileInputStream(ficheroAlumnos));
             Alumno alumno = (Alumno) objectInputStream.readObject();
            System.out.println(alumno.getNombre());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassCastException e){
            System.out.println("Error de igualdad");
        }

        finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
