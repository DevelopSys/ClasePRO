import javax.xml.crypto.Data;
import java.util.ArrayList;

public class DataSet {

    // base datos local (Read)

    private ArrayList<Equipo> listadoEquipos;


    public DataSet(){
        rellenarEquipos();
    }
    public static DataSet newInstance(){
        DataSet dataSet = new DataSet();
        return dataSet;
    }

    private void rellenarEquipos(){
        listadoEquipos = new ArrayList<>();
        listadoEquipos.add(new Equipo("Manchester","Inglesa",3));
        listadoEquipos.add(new Equipo("Arsenal","Inglesa",2));
        listadoEquipos.add(new Equipo("Monaco","Francesa",3));
        listadoEquipos.add(new Equipo("R. Sociedad","Española",3));
        listadoEquipos.add(new Equipo("Inter","Italiana",4));
        listadoEquipos.add(new Equipo("Madrid","Española",2));
        listadoEquipos.add(new Equipo("Atletico","Española",4));
        listadoEquipos.add(new Equipo("City","Inglesa",1));
        listadoEquipos.add(new Equipo("Lille","Fracesa",4));
        listadoEquipos.add(new Equipo("Juventus","Italiana",2));
        listadoEquipos.add(new Equipo("PSG","Francesa",1));
        listadoEquipos.add(new Equipo("Barcelona","Española",1));
        listadoEquipos.add(new Equipo("Napoles","Italiana",1));
        listadoEquipos.add(new Equipo("Liverpool","Ingles",4));
        listadoEquipos.add(new Equipo("Olimpique","Francesa",2));
        listadoEquipos.add(new Equipo("Milan","Italiana",3));
    }

    public ArrayList<Equipo> getAllEquipos(){
        return listadoEquipos;
    }

    public ArrayList<Equipo> getEquiposLiga(String liga){

        ArrayList<Equipo> equiposFiltrados = new ArrayList<>();
        for ( Equipo equipo : listadoEquipos) {
            if (equipo.getLiga().equalsIgnoreCase(liga)){
                equiposFiltrados.add(equipo);
            }
        }
        return equiposFiltrados;

    }
}
