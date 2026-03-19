package ejercicio3;

import ejercicio3.model.Alumno;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // File file = new File("src/main/java/ficheros/ejercicio3.txt");
        BufferedReader bufferedReader = null;
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("src/main/java/ficheros/ejercicio3.txt"));
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                // Carlos,Perez,22597055V,9
                String[] datos = linea.split(",");
                Alumno alumno = new Alumno(datos[0],datos[1],datos[2],Integer.parseInt(datos[3]));
                alumnos.add(alumno);
            }

            alumnos.sort(Comparator.comparingInt(Alumno::getNota));
            alumnos.forEach(Alumno::mostrarDatos);
            // double media =
            // alumnos.stream().mapToDouble(Alumno::getNota).average().getAsDouble();
            // alumnos.forEach(item -> item.getNota());
            int sumatorio =0;
            for (Alumno item: alumnos) {
                sumatorio+=item.getNota();
            }
            System.out.println(sumatorio/alumnos.size());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
