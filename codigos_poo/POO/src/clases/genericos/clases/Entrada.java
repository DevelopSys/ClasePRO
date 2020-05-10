package clases.genericos.clases;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        ClaseListaPalabras listaPalabras= new ClaseListaPalabras();
        listaPalabras.agregarElemento("asdas");
        listaPalabras.eliminar("asdas");

        ClaseListaInteger listaNumeros = new ClaseListaInteger();
        listaNumeros.agregarElemento(1);
        listaNumeros.agregarElemento(1);


        ClaseLista<String,Float> claseLista = new ClaseLista();
        claseLista.agregarElemento("asdasd");

        ClaseLista<Integer, Boolean> claseLista1 = new ClaseLista();
        claseLista1.agregarElemento(1);

    }
}
