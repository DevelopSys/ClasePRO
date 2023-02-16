import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        listadoEquipos.add(new Equipo("Manchester","Inglesa",3,46));
        listadoEquipos.add(new Equipo("Arsenal","Inglesa",2,65));
        listadoEquipos.add(new Equipo("Monaco","Francesa",3,64));
        listadoEquipos.add(new Equipo("Inter","Italiana",4,34));
        listadoEquipos.add(new Equipo("Madrid","Española",2,54));
        listadoEquipos.add(new Equipo("R. Sociedad","Española",2,59));
        listadoEquipos.add(new Equipo("Atletico","Española",4,34));
        listadoEquipos.add(new Equipo("City","Inglesa",1,23));
        listadoEquipos.add(new Equipo("Lille","Fracesa",4,43));
        listadoEquipos.add(new Equipo("Juventus","Italiana",2,54));
        listadoEquipos.add(new Equipo("PSG","Francesa",1,67));
        listadoEquipos.add(new Equipo("Barcelona","Española",1,67));
        listadoEquipos.add(new Equipo("Napoles","Italiana",1,68));
        listadoEquipos.add(new Equipo("Liverpool","Ingles",4,92));
        listadoEquipos.add(new Equipo("Olimpique","Francesa",2,78));
        listadoEquipos.add(new Equipo("Milan","Italiana",3,65));
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

        // ordeno --> burbuja --> sort [1,2,3,4,5,6,7,8,9] ["hola","otra","palabra"]

        Collections.sort(equiposFiltrados, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                if (o1.getPosicion()>o2.getPosicion()){
                    return 0;
                } else {
                    return -1;
                }

            }
        });

        return equiposFiltrados;

    }

    // obtener el equipo que más goles tiene a favor
    // obttener el equipo que tiene más goles de cada liga (4)
}
