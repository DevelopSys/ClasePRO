package anonimas;

import java.util.ArrayList;

public class Garaje {

    private ArrayList<Coche> listaCoches;
    private ArrayList<CocheNormal> listaCocheNormal;


    public Garaje() {
        listaCoches = new ArrayList<>();
    }

    public void agregarCoche(Coche coche){
        listaCoches.add(coche);

    }

    public void agregarCocheNormal(CocheNormal coche){
        listaCocheNormal.add(coche);
    }

    public ArrayList<Coche> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(ArrayList<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }

    
}
