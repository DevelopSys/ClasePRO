import java.util.ArrayList;

public class DataSet {

    public static DataSet newInstance() {
        // desde el newIntance quiero que retorneis diectamente un conjunto de equipos
        // pedidos
        DataSet dataSet = new DataSet();
        return dataSet;
    }

    public static ArrayList newInstanceEquipos() {
        // desde el newIntance quiero que retorneis diectamente un conjunto de equipos
        // pedidos
        ArrayList<Equipo> equipos = new DataSet().getEquiposEspania();
        return equipos;
    }

    public ArrayList<Equipo> getEquiposEspania(){

        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(new Equipo("At. Madrid",1));
        equipos.add(new Equipo("Fc. Barcelona",2));
        equipos.add(new Equipo("Real Madrid",3));

        return equipos;
    }

    public ArrayList<Equipo> getEquiposInglaterra(){

        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(new Equipo("Manchester",1));
        equipos.add(new Equipo("City",2));
        equipos.add(new Equipo("Arsenal",3));

        return equipos;
    }

    public ArrayList<Equipo> getEquiposItalia(){

        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(new Equipo("Milan",1));
        equipos.add(new Equipo("Juventus",2));
        equipos.add(new Equipo("Inter",3));

        return equipos;
    }
}
