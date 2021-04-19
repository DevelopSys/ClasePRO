package genericos;

import java.util.ArrayList;

public class ClaseNumeros<T extends Number> extends ClaseElemento {

    private ArrayList<T> listaNumeros;

    public void mostrarNumeros(){
        System.out.printf("Método llamado desde la clase números");
    }

    public ArrayList<T> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<T> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    /*
    * public void mostrarNumeros(){
        System.out.printf("El número de elementos es "+listaDatos.size());
    }

    public void metodoGenerico(String elemento){

    }
    * */
}

