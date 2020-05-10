package clases.ejercicios;

import java.util.ArrayList;

public abstract class Idioma {

    private String nombre;
    private int numHablantes;
    private ArrayList<String> palabras;

    public Idioma(String nombre, int numHablantes) {
        this.nombre = nombre;
        this.numHablantes = numHablantes;
        palabras = new ArrayList();
    }

    public abstract void saludar();
    public abstract void despedir();

    public void agregarPalabra(String palabra){
        palabras.add(palabra);
    }

    public void listarPalabras(){

        for (String palabra:palabras) {
            System.out.println(palabra);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHablantes() {
        return numHablantes;
    }

    public void setNumHablantes(int numHablantes) {
        this.numHablantes = numHablantes;
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }
}
