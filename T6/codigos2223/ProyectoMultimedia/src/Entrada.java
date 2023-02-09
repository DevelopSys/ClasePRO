import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {


        Coleccion coleccion = new Coleccion();
        // arraylist

        // pelicula

        // nt id, String titulo, int tamanio, String formato, String autor, String director, ArrayList<Actor> actores

        Video video = null;
        System.out.println("Dime el id del video");
        int id = new Scanner(System.in).nextInt();
        System.out.println("Dime el titulo del video");
        String titulo = new Scanner(System.in).next();
        System.out.println("Dime el tamanio del video");
        int tamanio = new Scanner(System.in).nextInt();
        System.out.println("Dime el formato del video");
        String formato = new Scanner(System.in).next();
        System.out.println("Dime el Director del video");
        String director = new Scanner(System.in).next();
        System.out.println("Dime el autor del video");
        String autor = new Scanner(System.in).next();
        ArrayList<Actor> reparto = new ArrayList<>();
        System.out.println("Dime los actores del video");
        String hayMas = "";
        do {

            System.out.println("Introduce nombre");
            String actor = new Scanner(System.in).next();
            System.out.println("Introduce apellido");
            String apellido = new Scanner(System.in).next();
            System.out.println("Introduce numero oscar");
            int numeroOscar = new Scanner(System.in).nextInt();
            reparto.add(new Actor(actor,apellido,numeroOscar));
            System.out.println("Quieres agregar más actores (s/n)");
            hayMas = new Scanner(System.in).next();
        }while (hayMas.equalsIgnoreCase("s"));

        video = new Video(id,titulo,tamanio,formato,autor,director,reparto);
        Libro libro1= new Libro(id,titulo,tamanio,formato,autor,director,123);
        Audio  audio1= new Audio(id,titulo,tamanio,formato,autor,123,"mp3");
        coleccion.agregarElemento(video);
        coleccion.agregarElemento(libro1);
        coleccion.agregarElemento(audio1);

        coleccion.listarElementos();

    }
}
