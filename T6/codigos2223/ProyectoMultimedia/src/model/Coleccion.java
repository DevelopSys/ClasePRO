package model;

import java.util.ArrayList;

public class Coleccion {

    private ArrayList<Elemento> listaElementos;
    public Coleccion() {
        listaElementos = new ArrayList<>();
    }
    public void agregarElemento(Elemento elemento){

        // cuadno el id no esté en la lista
        if (estaElemento(elemento.getId()) == null){
            listaElementos.add(elemento);
        } else {
            System.out.println("El elemento está en la colección, fallo al agregar");
        }
    }
    public void buscarElemento(int id){
        Elemento elemento = estaElemento(id);
        if (elemento !=null){
            elemento.mostrarDatos();
        } else {
            System.out.println("El elemento no se encuentra en la coleccion");
        }
    }
    public void listarElementos(){
        for (Elemento item: listaElementos ) {
            item.mostrarDatos();
        }
    }
    public void eliminarElemento(int id){
        // 1. Recorrer
        // 2. comparar id
        // 3. si coincide borro
        Elemento elemento = estaElemento(id);
        if (elemento!=null){
            listaElementos.remove(elemento);
        } else {
            System.out.println("no se ha encontrado el elemento, fallo al borrar");
        }

    }

    private Elemento estaElemento(int id){
        // algoritmo de comprobacion
        // 1. Recorrer la lista
        // 2. Comprobar si el id del elemento (lo necesito)
        // que quiero añadir es igual al que esto iterando (voy a iterar todos)
        // 3. Retornar el resultado --> boolean (T/F) o el objeto

        for ( Elemento item: listaElementos) {
            if (item.getId() == id){
                return item;
            }
        }

        return null;
    }
}
