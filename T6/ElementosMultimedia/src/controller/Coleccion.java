package controller;

import model.Audio;
import model.Elemento;
import model.Libre;
import model.Video;

import java.util.ArrayList;
import java.util.Collections;

public class Coleccion {
    private ArrayList<Elemento> listaElementos;

    public Coleccion(){
        listaElementos = new ArrayList<>();
    }

    public void anadirElemento(Elemento item){
        listaElementos.add(item);
    }

    public void eliminarElemento(String id){
        for (Elemento elemento: listaElementos) {
            if (elemento.getId().equalsIgnoreCase(id)){
                listaElementos.remove(elemento);
            }
        }
    }

    // 0 libros
    // 1 audios
    // 2 videos
    public void listarElementos(int tipo){
        for (Elemento item: listaElementos) {
            switch (tipo){
                case 0:
                    if (item instanceof Libre){
                        item.mostrarDatos();
                    }
                    break;
                case 1:
                    if (item instanceof Audio){
                        item.mostrarDatos();
                    }
                    break;
                case 2:
                    if (item instanceof Video){
                        item.mostrarDatos();
                    }
                    break;
                case 3:
                    item.mostrarDatos();
            }
            /*if (item instanceof Libre)
                item.mostrarDatos();
            else if (item instanceof clase) {
                item.mostrarDatos();
            } else if (item instanceof Audio) {
                item.mostrarDatos();
            }*/
        }
    }

}
