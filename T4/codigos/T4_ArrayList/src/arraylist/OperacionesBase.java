package arraylist;


import java.util.ArrayList;

public class OperacionesBase {

    private ArrayList<String> lista = null;

    public void crearListaPalabras(){
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

    public int obtenerTamanioLista(){
        // realiza acciones
        return lista.size();
    }


}
