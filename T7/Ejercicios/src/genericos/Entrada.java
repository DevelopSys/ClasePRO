package genericos;

import genericos.model.Dato;
import genericos.model.MiLista;
import genericos.model.Usuario;

import java.lang.reflect.Array;
import java.util.*;

public class Entrada {

    public static void main(String[] args) {

        /*Dato<Integer, Boolean, List<Integer>> dato = new Dato(12, 100);
        Dato<Double, Character, ArrayList<String>> dato1 = new Dato(12.0, 100);
        Dato<Float, Object, Array> dato2 = new Dato(12.0f, 100);

        dato.mostrarDatos();
        dato1.mostrarDatos();
        dato2.mostrarDatos();*/

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        Collections.sort(listaUsuarios);


        MiLista<Integer> listaNumeros = new MiLista<>();
        listaNumeros.addElemento(3);
        listaNumeros.addElemento(5);
        listaNumeros.addElemento(8);
        listaNumeros.addElemento(-10);
        MiLista<String> listaPalabras = new MiLista<>();
        listaPalabras.addElemento("uno");
        listaPalabras.addElemento("dos");
        listaPalabras.addElemento("tres");
        listaPalabras.addElemento("cuatro");

        //listaPalabras.imprimirElementos();
        listaNumeros.imprimirElementos();

    }
}
