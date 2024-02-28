package estaticos.data;

import estaticos.model.Equipo;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class DataSet {


    /*
    * de inicio, a la instancia se le indica una liga
    * y la instancia retorna solo los equipos de la liga indicada
    * */

    public static DataSet instancia;

    private DataSet(){
        System.out.println("Objeto creado de primeras");
    }

    public static DataSet newInstance(){

        if (instancia == null){
            instancia = new DataSet();
        }
        return instancia;
    }

    public ArrayList<Equipo> getAllEquipos(String liga){

        ArrayList<Equipo> lista = new ArrayList<>();
        lista.add(new Equipo("Madrid","Española",1900));
        lista.add(new Equipo("Barcelona","Española",1900));
        lista.add(new Equipo("Inter","Italiana",1900));
        lista.add(new Equipo("Juventus","Italiana",1900));
        lista.add(new Equipo("City","Inglesa",1900));
        lista.add(new Equipo("Liverpool","Inglesa",1900));
        lista.add(new Equipo("Benfica","Portugal",1900));
        lista.add(new Equipo("Port","Portugal",1900));

        ArrayList<Equipo> listaFiltrada = new ArrayList<>();
        for (Equipo item:  lista ){
            if (item.getLiga().equals(liga)){
                listaFiltrada.add(item);
            }
        }


        return listaFiltrada;
    }

}
