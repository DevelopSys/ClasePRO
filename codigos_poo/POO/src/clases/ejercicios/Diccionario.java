package clases.ejercicios;

import java.util.ArrayList;

public class Diccionario {

    ArrayList<Idioma> listaIdiomas;

    public Diccionario() {
        listaIdiomas = new ArrayList<>();
    }

    public void agregarIdioma(Idioma idioma){
        listaIdiomas.add(idioma);
    }
}
