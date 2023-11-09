package arraylistbase;

import java.util.ArrayList;

public class Ejercicio1 {

    private ArrayList<String> listaPalabras;

    public void iniciarEjercicio(){
        iniciarLista();
        agregarPalabras();
        listarPalabras();
    }
    private void iniciarLista(){
        listaPalabras = new ArrayList<>();
    }
    private void agregarPalabras(){
        listaPalabras.add("Palabra1");
        listaPalabras.add("Palabra2");
        listaPalabras.add("Palabra3");
        listaPalabras.add("Palabra4");
        listaPalabras.add("Palabra5");
        listaPalabras.add("Palabra6");
        listaPalabras.add("Palabra7");
        listaPalabras.add("Palabra8");
        listaPalabras.add("Palabra9");
        listaPalabras.add("Palabra10");
    }
    private void listarPalabras(){
        for ( String item: listaPalabras ) {
            System.out.println(item);
        }
    }

}
