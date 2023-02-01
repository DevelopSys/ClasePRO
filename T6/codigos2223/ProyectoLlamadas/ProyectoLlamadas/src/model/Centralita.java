package model;

import java.util.ArrayList;

public class Centralita {

    private ArrayList<Llamada> listaLlamadas;

    public Centralita(){
        listaLlamadas = new ArrayList<>();
    }

    public void agregarLlamada(Llamada llamada){
        this.listaLlamadas.add(llamada);
    }

    public void listarLlamadas(){
        for ( Llamada llamada : listaLlamadas ) {
            llamada.mostrarDatos();

        }

    }

    // este método se capaz de admitir un parametro que indique que tipo
    // de llamada quiero listar: nacional, local, todas
    // (llamada instanceof LlamadaLocal)


    // mostrar costes, muestra por consola el coste acumulado de la centralita
    // es el sumatorio de todos los costes de las llamadas
}
