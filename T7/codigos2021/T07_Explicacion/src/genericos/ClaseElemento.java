package genericos;

import java.util.ArrayList;

public abstract class ClaseElemento {

    protected ArrayList<String> listaDatos;

    public ClaseElemento() {
    }

    public void mostrarNumeros(){
        System.out.printf("El número de elementos es "+listaDatos.size());
    }

    public void metodoGenerico(String elemento){

    }
}
