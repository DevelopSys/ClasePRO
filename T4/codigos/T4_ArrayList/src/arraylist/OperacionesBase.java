package arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OperacionesBase {

    private ArrayList<String> lista = null;

    public void crearListaPalabras(){



        Collections.sort(lista);
        System.out.println("Procedemos a crear una lista de palabras");
        lista = new ArrayList<>();
    }

    /*public void crearListaPalabras() {
        System.out.println("Procedemos a crear una lista de palabras");
        System.out.println("El tamaño de la lista es " + lista.size());
    }*/

    public void agregarElemento(String palabra) {
        // NO LA PIDO EN EL METODO
        System.out.println("Procedemos a agregar elemento a la lista de palabras");
        // se añada una palabra cualquiera a la lista
        lista.add(palabra);
        System.out.println("El tamaño de la lista es " + lista.size());
    }

    public void obtenerElemento(int posicion){
        if (!lista.isEmpty()){
            System.out.println("Procedemos a obtener elemento a la lista de palabras");
            String elemento = lista.get(posicion);
            System.out.println("El elemento de la posicion "+posicion +" es: "+elemento);
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    // sacar por consola todos los elementos de la lista

    public void listarElementos(){
        for ( String item : lista ) {
            System.out.println("Elemento: "+item);
        }
    }

    public void eliminarElemento(String elemento){
        if (lista.remove(elemento)){
            System.out.println("Elemento borrado");
            System.out.println("El tamaño de la lista es "+lista.size());
        }else {
            System.out.println("El elemento no esta en la lista");
        }

    }

    public void vaciarLista(){
        lista.clear();
    }

    public void modificarElemento(){
        // modificar el elemento que esta en la segunda posicion
        lista.set(2,"cambio");
        System.out.println(lista.get(2));
    }
    public int buscarElemento(String elemento){

        for (int i = 0; i < lista.size(); i++) {
            if (elemento.equalsIgnoreCase(lista.get(i))){
                return i;
            }
        }
        return -1;
    }

    public int obtenerTamanioLista(){
        // realiza acciones
        return lista.size();
    }


}
