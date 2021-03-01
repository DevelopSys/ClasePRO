package ejercicios.ejerciciosMultimedia;

import java.util.ArrayList;

public final class Coleccion{

    // getName() --> ejercicios.ejerciciosMultimedia.Coleccion;
    // getSimpleName() --> Coleccion;

    private int id;
    private ArrayList<Multimedia> listaElementos;

    public Coleccion(){
        listaElementos = new ArrayList<>();
        id = 1;
    }

    public void addElemento(Multimedia elemento){
        this.listaElementos.add(elemento);
    }

    public void modificarOscars(String nombreActor, String apellidoActor,int numeroOscar){
        for ( Multimedia itemMultimedia : listaElementos ) {
            if (itemMultimedia.getClass().getSimpleName().equals("Video")){

                ArrayList<Actor> listActores = ((Video)itemMultimedia).getActores();
                for ( Actor itemActor : listActores) {
                    if (itemActor.getNombre().equals(nombreActor) && itemActor.getApellido().equals(apellidoActor)){
                        itemActor.setNumeroOscars(numeroOscar);
                    }
                }

            }
        }
    }

    public void agregarActorVideo(int id,Actor actor ){

        for ( Multimedia multimedia :listaElementos) {
            if (multimedia.getId() == id && multimedia.getClass().getSimpleName().equals("Video")){
                //
                ((Video)multimedia).addActor(actor);
            }
        }

    }

    public void listarElementos(){
        for (Multimedia itemMultimedia : listaElementos) {
            System.out.println("\t ***Imprimiendo siguiente***");
            itemMultimedia.mostrarDatos();
        }
    }
    public void listarElementos(String nombreClase){
        for (Multimedia itemMultimedia : listaElementos) {

            //System.out.println(itemMultimedia.getClass().getSimpleName());
            if (itemMultimedia.getClass().getSimpleName().equals(nombreClase)){
                System.out.println("\t ***Imprimiendo siguiente***");
                itemMultimedia.mostrarDatos();
            }

        }
    }
    public void listarElementos(Class nombreClase){
        for (Multimedia itemMultimedia : listaElementos) {

            //System.out.println(itemMultimedia.getClass().getSimpleName());
            if (itemMultimedia.getClass() == nombreClase){
                System.out.println("\t ***Imprimiendo siguiente***");
                itemMultimedia.mostrarDatos();
            }

        }
    }

}
