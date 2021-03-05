package ejercicios.ejercicioLlamadas;

import ejercicios.ejercicioLlamadas.Llamada;

import java.util.ArrayList;

public final class Centralita {

    private ArrayList<Llamada> listaLLamadas;

    public Centralita() {
        this.listaLLamadas = new ArrayList<>();
    }

    public void agregarLlamada(Llamada llamada){
        listaLLamadas.add(llamada);
    }

    public void mostrarLlamadas(){
        for ( Llamada itemLlamada : listaLLamadas) {
            itemLlamada.mostrarDatos();
        }
    }

    public void mostrarLlamadas(String nombreClase){
        for (Llamada itemLlamada: listaLLamadas) {
            if (itemLlamada.getClass().getSimpleName().toLowerCase().equals(nombreClase.toLowerCase())){
                itemLlamada.mostrarDatos();
            }
        }
    }

    public void mostrarLlamadas(Class<Llamada> clase){
        for (Llamada itemLlamada: listaLLamadas) {
            if (itemLlamada.getClass() == clase){
                itemLlamada.mostrarDatos();
            }

            /*if (itemLlamada instanceof LlamadaLocal){

            }*/
        }
    }

    public void calcularCostes(){

        double costeTotal =0;

        for ( Llamada item: listaLLamadas ) {
            costeTotal += item.getCoste();
        }

        System.out.println("El coste total es: "+costeTotal);
    }
    public void calcularCostes(String nombreClase){

        double costeTotal = 0;
        for (Llamada itemLlamada: listaLLamadas) {
            if (itemLlamada.getClass().getSimpleName().toLowerCase().equals( nombreClase.toLowerCase())){
                costeTotal +=itemLlamada.getCoste();
            }
        }

        System.out.printf("El coste total de las llamadas %s es de %.2f%n", nombreClase,costeTotal);
    }

    public void buscarLlamada(int nOrigen){

        boolean existe = false;

        for ( Llamada itemLlamada : listaLLamadas ) {
            if (itemLlamada.getnOrigen() == nOrigen){
                itemLlamada.mostrarDatos();
                existe = true;
                break;
            }
        }

        if (!existe){
            System.out.println("El numero no ha sido encontrado");
        }

    }

    public ArrayList<Llamada> getListaLLamadas() {
        return listaLLamadas;
    }

    public void setListaLLamadas(ArrayList<Llamada> listaLLamadas) {
        this.listaLLamadas = listaLLamadas;
    }
}
