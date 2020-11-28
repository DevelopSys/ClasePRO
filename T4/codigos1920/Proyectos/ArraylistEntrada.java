package inicio;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEntrada {

    static ArrayList<String> listaPalabras;

    public static void main(String[] args) {
        int tamanio;
        boolean completado;
        listaPalabras = new ArrayList();
        agregarElemento("palabra uno");
        agregarElemento("palabra dos");
        agregarElemento("palabra tres");
        agregarElemento("palabra cuatro");
        agregarElemento("palabra cinco");
        //agregarElemento("palabra uno");
        //borrarElemento("palabra diez");
        //recorrerArray();
        //System.out.println(listaPalabras.size());
        //listaPalabras = new ArrayList();
        //listaPalabras.clear();
        //System.out.println(listaPalabras.size());
        //listaPalabras.set(0,"nueva palabra");
        //System.out.println(listaPalabras.indexOf("palabra dos"));
        //listaPalabras.clone();
        //System.out.println(listaPalabras.isEmpty());
        //listaPalabras.lastIndexOf("palabra uno");

        //Collections.sort(listaPalabras);
        Collections.shuffle(listaPalabras);
        recorrerArray();


    }

    public static void borrarElemento(String elemento) {

        if (listaPalabras.contains(elemento)) {
            for (int i = 0; i < listaPalabras.size(); i++) {
                if (elemento.equals(listaPalabras.get(i))) {
                    listaPalabras.remove(i);
                    break;
                }
            }
        } else {
            System.out.println("El elemento no está en la lista");
        }
    }

    public static void agregarElemento(String palabra) {
        if (listaPalabras.contains(palabra)) {
            System.out.println("palabra ya existente, " +
                    "no se agregará");
        } else {
            listaPalabras.add(palabra);
        }
    }

    public static void recorrerArray() {
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }
    }

    public static void recorrerCualquierArray(ArrayList lista) {
        for (Object dato : lista) {
            System.out.println(dato);
        }

    }

}
