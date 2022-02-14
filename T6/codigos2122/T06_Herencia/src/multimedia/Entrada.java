package multimedia;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        //Elemento elemento = new Elemento("1","as","asd","asd","asd");
        //Libro libro = new Libro();

        ArrayList<Elemento> listaElementos = new ArrayList<>();
        // acceso a cualquier cosa
        Libro libro = new Libro("1","Libro titulo","Autor libro","100",
                "digital",123,100);

        Video video = new Video("1","Libro titulo","Autor libro","100",
                "digital","123","100");

        Audio audio = new Audio("1","Libro titulo","Autor libro","100",
                "digital",123,"100");

        Elemento libroElemento = new Libro ("1","Libro titulo","Autor libro","100",
                "digital",123,100);

        //libroElemento.mostrarDatos();

        // clase a la que pertenece Libro.class
        System.out.println(libro.getClass());
        System.out.println(libro.getClass().getName());
        System.out.println(libro.getClass().getCanonicalName());

        //System.out.println(libro instanceof Elemento);
        System.out.println(libroElemento instanceof Libro);


        listaElementos.add(libro);
        listaElementos.add(audio);
        listaElementos.add(video);
        listaElementos.add(libroElemento);

        // LIBRO --> metodoLibro
        // AUDIO --> metodoAudio
        // VIDEO --> metodoVideo
        // dependiendo del objeto que sea quiero ejecutar su método especifico
        for ( Elemento elemento : listaElementos ) {

            ((Libro)elemento).metodoLibro();

            if (elemento instanceof Libro){
                //elemento.mostrarDatos();
                ((Libro) elemento).metodoLibro();
            }else if (elemento instanceof Audio){
                //elemento.mostrarDatos();
                ((Audio)elemento).metodoAudio();
            }else if (elemento instanceof Video){
                //elemento.mostrarDatos();
                ((Video)elemento).metodoVideo();
            }*/

        }

    }
}
