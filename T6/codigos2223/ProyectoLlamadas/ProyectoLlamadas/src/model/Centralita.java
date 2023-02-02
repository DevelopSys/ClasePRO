package model;

import java.util.ArrayList;

public class Centralita {

    private ArrayList<Llamada> listaLlamadas;
    private double costeAcumulado;

    public Centralita(){
        listaLlamadas = new ArrayList<>();
    }

    public void agregarLlamada(Llamada llamada){
        this.listaLlamadas.add(llamada);
        costeAcumulado += llamada.getCoste();
    }

    public void listarLlamadas(){
        for ( Llamada llamada : listaLlamadas ) {
            llamada.mostrarDatos();
        }
    }

    // este método se capaz de admitir un parametro que indique que tipo
    // de llamada quiero listar: nacional, local, todas
    // (llamada instanceof LlamadaLocal)


    public void listarDetalleClase(Class<LlamadaLocal> clase){
        for (Llamada item :listaLlamadas ) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(clase.getSimpleName()) ){
                item.mostrarDatos();
            }
        }
    }


    public void listarDetalle(String tipo){
        switch (tipo){
            case "Local":
                listar("local");
                break;
            case "Nacional":
                listar("nacional");
                break;
        }
    }

    private void listar(String tipo){
        for ( Llamada item: listaLlamadas ) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(tipo)){
                item.mostrarDatos();
            }
        }
    }


    // mostrar costes, muestra por consola el coste acumulado de la centralita
    // es el sumatorio de todos los costes de las llamadas

    public void mostrarCosteAcumulado(){
        System.out.println("El coste acumulado es: "+costeAcumulado);
    }
}
