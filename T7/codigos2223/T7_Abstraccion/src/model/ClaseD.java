package model;

import java.util.ArrayList;

public class ClaseD {

    private ArrayList<ClaseA> clases;

    public ClaseD() {

        clases = new ArrayList<>();
    }

    public void agregarClase(ClaseA claseA){
        this.clases.add(claseA);
    }

    public void ejecutarMetodoInterfaz(EjemploInterfaz ejemploInterfaz){
        ejemploInterfaz.onElementoInterfaz();
    }
}
