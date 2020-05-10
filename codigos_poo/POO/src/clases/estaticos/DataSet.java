package clases.estaticos;

import java.util.ArrayList;

public class DataSet {

    private static ArrayList<Equipo> listaEquipos;

    public static DataSet newInstance(){
        DataSet objeto = new DataSet();
        return objeto;
    }

    public static DataSet newInstance(int opcion){
        DataSet objeto = new DataSet();
        switch (opcion){

        }
        return objeto;
    }

    public static ArrayList getEquiposLaLiga(){

        listaEquipos = new ArrayList();
        listaEquipos.add(new Equipo("Barcelona",1));
        listaEquipos.add(new Equipo("Atletico",2));
        listaEquipos.add(new Equipo("Madrid",3));
        listaEquipos.add(new Equipo("Getafe",4));
        return listaEquipos;
    }

    public ArrayList getEquiposItalia(){

        listaEquipos = new ArrayList();
        listaEquipos.add(new Equipo("Juve",1));
        listaEquipos.add(new Equipo("Inter",2));
        listaEquipos.add(new Equipo("Roma",3));
        listaEquipos.add(new Equipo("Atalanta",4));
        return listaEquipos;
    }
}
