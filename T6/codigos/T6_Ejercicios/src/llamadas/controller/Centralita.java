package llamadas.controller;

import llamadas.model.Llamada;

import java.util.ArrayList;

public class Centralita {

    private ArrayList<Llamada> listaLlamadas;
    private double costeTotal;

    public Centralita() {
        listaLlamadas = new ArrayList<>();
        // costeTotal =0
    }

    public void registrarLlamada(Llamada llamada){
        listaLlamadas.add(llamada);
        costeTotal += llamada.getCoste();
    }

    public void buscarLlamadas(int numero){

        boolean existe = false;
        for (Llamada item : listaLlamadas ) {
            if (item.getnOrigen() == numero){
                item.mostrarDatos();
                existe = true;
            }
        }

        if(!existe){
            System.out.println("El numero no ha sido registrado nunca");
        }
    }

    public void listarLlamadas(){
        for ( Llamada item: listaLlamadas ) {
            item.mostrarDatos();
        }
    }

    public ArrayList<Llamada> getListaLlamadas() {
        return listaLlamadas;
    }

    public void setListaLlamadas(ArrayList<Llamada> listaLlamadas) {
        this.listaLlamadas = listaLlamadas;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }
}
