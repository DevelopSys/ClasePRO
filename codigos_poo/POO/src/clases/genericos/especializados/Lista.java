package clases.genericos.especializados;

import java.util.ArrayList;

public class Lista<T extends Number> {

    ArrayList<T> listaNumeros;

    public Lista() {
        this.listaNumeros = new ArrayList<>();
    }

    public void addNumero(T numero){
        listaNumeros.add(numero);
    }

    public void mostrarNumeros(){
        for (T numero: listaNumeros) {
            System.out.println(numero);
        }
    }
}
