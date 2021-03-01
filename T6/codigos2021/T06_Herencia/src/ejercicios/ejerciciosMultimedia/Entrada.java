package ejercicios.ejerciciosMultimedia;

public class Entrada {

    public static void main(String[] args) {
        //Multimedia multimedia = new Multimedia();
        Coleccion coleccion = new Coleccion();
        Libro libro = new Libro(1, "Libro", "AutorL", "epub", 123, "asd", 123);
        Imagen imagen = new Imagen(2, "Imagen", "AutorI", "jpg", 123);
        //Video video = new Video(3,"Video","AutorV","mkv",123,"Director");
        //video.addActor(new Actor("Borja","Martin",4));
        //video.addActor(new Actor("WEQ","QWEQwe",1));
        //video.mostrarDatos();

        coleccion.addElemento(new Video(3, "Video", "AutorV", "mkv", 123, "Director"));
        coleccion.addElemento(imagen);
        coleccion.addElemento(libro);


        coleccion.agregarActorVideo(3, new Actor("Borja", "aasdad", 2));
        coleccion.agregarActorVideo(3, new Actor("sfdg", "34", 2));
        coleccion.agregarActorVideo(3, new Actor("jtyu", "tur", 2));

        //coleccion.listarElementos();
        //coleccion.listarElementos();
        coleccion.listarElementos("Video");
        //coleccion.listarElementos(Video.class);


    }


}
