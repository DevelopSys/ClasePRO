package videos.genericos;

import java.util.ArrayList;
import java.util.Hashtable;

public class Entrada {

    public static void main(String[] args) {

        ClaseLista claseLista = new ClaseLista();
        claseLista.agragarElemento("asd");
        claseLista.agragarElemento(1);
        claseLista.agragarElemento(false);

        ClaseLista<String> clasePalabras = new ClaseLista<>();
        clasePalabras.agragarElemento("sasd");

        ClaseLista<Integer> claseNumeros = new ClaseLista<>();
        claseNumeros.agragarElemento(1);

        ArrayList<ClaseLista> listaElementos = new ArrayList<>();
        listaElementos.add(claseNumeros);
        listaElementos.add(clasePalabras);
        listaElementos.add(claseLista);



    }
}
