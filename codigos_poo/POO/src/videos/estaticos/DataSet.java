package videos.estaticos;

import java.util.ArrayList;

public class DataSet {

    private ArrayList<Equipo> listaEquipos;

    public static DataSet newInstance(){
        DataSet dataSet = new DataSet();
        return dataSet;
    }

    public ArrayList<Equipo> getEquiposLaLiga(){
        listaEquipos = new ArrayList();
        listaEquipos.add(new Equipo("Barcelona",1));
        listaEquipos.add(new Equipo("R. Madrid",2));
        listaEquipos.add(new Equipo("Atl. Madrid",3));
        return listaEquipos;
    }

    public ArrayList<Equipo> getEquiposPremiere(){
        listaEquipos = new ArrayList();
        listaEquipos.add(new Equipo("Liverpool",1));
        listaEquipos.add(new Equipo("City",2));
        listaEquipos.add(new Equipo("Manchester",3));
        return listaEquipos;
    }

    public ArrayList<Equipo> getEquiposCalcio(){
        listaEquipos = new ArrayList();
        listaEquipos.add(new Equipo("Inter",1));
        listaEquipos.add(new Equipo("Juventus",2));
        listaEquipos.add(new Equipo("Roma",3));
        return listaEquipos;
    }



}
