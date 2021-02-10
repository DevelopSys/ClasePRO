package ejercicios.ejercicioCentralita;

import java.util.ArrayList;

public class Centralita {

    private ArrayList<LlamadaNacional> listaLlamadasNacional;
    private ArrayList<LlamadaLocal> listaLlamadasLocal;
    private int costeAcumulado;

    // constructores

    public Centralita(){
        //this.costeAcumulado = 0;
        listaLlamadasLocal = new ArrayList();
        listaLlamadasNacional = new ArrayList();
    }

    public void agregarLlamadaNacional(LlamadaNacional llamadaNacional){
        listaLlamadasNacional.add(llamadaNacional);
        this.costeAcumulado += llamadaNacional.getCoste();
    }

    public void agregarLlamadaLocal(LlamadaLocal llamadaLocal){
        listaLlamadasLocal.add(llamadaLocal);
        this.costeAcumulado += llamadaLocal.getCoste();
    }

    public void listarLlamadasLocal(){
        if(listaLlamadasLocal.size() == 0){
            System.out.println("No hay llamadas a listar");
        } else {
            for ( LlamadaLocal llamada : listaLlamadasLocal ) {
                llamada.mostrarDatos();
            }
        }
    }

    public void listarLlamadasNacional(){
        if(listaLlamadasNacional.size() == 0){
            System.out.println("No hay llamadas a listar");
        } else {
            for ( LlamadaNacional llamada : listaLlamadasNacional ) {
                llamada.mostrarDatos();
            }
        }
    }


    // getters y setters

    public int getCosteAcumulado(){
        return costeAcumulado;
    }

    public ArrayList<LlamadaNacional> getListaLlamadasNacional() {
        return listaLlamadasNacional;
    }

    public void setListaLlamadasNacional(ArrayList<LlamadaNacional> listaLlamadasNacional) {
        this.listaLlamadasNacional = listaLlamadasNacional;
    }

    public ArrayList<LlamadaLocal> getListaLlamadasLocal() {
        return listaLlamadasLocal;
    }

    public void setListaLlamadasLocal(ArrayList<LlamadaLocal> listaLlamadasLocal) {
        this.listaLlamadasLocal = listaLlamadasLocal;
    }

    public void setCosteAcumulado(int costeAcumulado) {
        this.costeAcumulado = costeAcumulado;
    }
}
