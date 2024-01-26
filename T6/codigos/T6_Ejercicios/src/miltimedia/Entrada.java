package miltimedia;

import miltimedia.constantes.Constantes;
import miltimedia.controlador.Coleccion;
import miltimedia.model.*;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();

        Libro elemento1 = new Libro("Libro", new Persona("Nombre", "123A"),
                Constantes.SOPORTE_DIGITAL, 123, "123A", 123);
        ArrayList<Persona> actores = new ArrayList<>();
        actores.add(new Persona("asdasd", "asdasd"));
        actores.add(new Persona("asdasd", "asdasd"));
        Video elemento2 = new Video("Video", new Persona("Nombre", "123A"),
                Constantes.SOPORTE_PAPEL, 123, new Persona("asdad", "asdasd"),
                actores);
        Audio elemento3 = new Audio("Audio", new Persona("Nombre", "123A"),
                Constantes.SOPORTE_PAPEL, 123, 100, "mp3");


        coleccion.anadirElementos(elemento1);
        coleccion.anadirElementos(elemento2);
        coleccion.anadirElementos(elemento3);

        //coleccion.borrarElemento(2);
        //coleccion.listarElementos();
        coleccion.listarDetalle(3);

    }


}
