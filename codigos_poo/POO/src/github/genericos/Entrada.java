package github.genericos;

import java.util.ArrayList;
import java.util.Hashtable;

public class Entrada {

    public static void main(String[] args) {
        ArrayList listaElementosTotales = new ArrayList();
        ArrayList<String> listaElementosString = new ArrayList();

        Hashtable tablaElementosTotales = new Hashtable();
        Hashtable<String, Object> tablaElementosString = new Hashtable();

        ClaseElementos<Integer> claseNumeros = new ClaseElementos();
        // Error
        // claseNumeros.agregarElemento("asd");
        claseNumeros.agregarElemento(1);
        claseNumeros.agregarElemento(2);
        claseNumeros.agregarElemento(3);
        claseNumeros.agregarElemento(4);

        claseNumeros.mostrarDatos();

        ClaseElementos<String> clasePalabras = new ClaseElementos();
        // Error
        // clasePalabras.agregarElemento(1);
        clasePalabras.agregarElemento("Uno");
        clasePalabras.agregarElemento("Dos");
        clasePalabras.agregarElemento("Tres");
        clasePalabras.agregarElemento("Cuatro");

        clasePalabras.mostrarDatos();

    }
}
