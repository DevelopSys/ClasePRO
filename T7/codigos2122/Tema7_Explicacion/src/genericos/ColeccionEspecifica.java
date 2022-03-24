package genericos;

import java.util.ArrayList;

public class ColeccionEspecifica<T extends Coleccionable> {

    private ArrayList<T> listaCosas;

    public ColeccionEspecifica(){
        listaCosas = new ArrayList<>();
    }

    public void agregarCosas(T cosa){
        listaCosas.add(cosa);
    }
}
