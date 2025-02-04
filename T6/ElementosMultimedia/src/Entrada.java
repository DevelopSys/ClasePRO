import controller.Coleccion;
import model.Audio;
import model.Persona;
import model.Video;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        //Persona persona = new Persona("Borja","123123A");
        Persona persona  = new Persona();
        System.out.println(persona.getNombre());
        ArrayList<Persona> actores = new ArrayList<>();
        actores.add(new Persona("Actor1","1234"));
        actores.add(new Persona("Actor2","123"));
        Video video = new Video("123","Titulo",100,"mp3",
                new Persona("Autor","123"),new Persona("Director","1234A"),actores);
        video.mostrarDatos();
        Coleccion coleccion = new Coleccion();
        coleccion.
    }
}
