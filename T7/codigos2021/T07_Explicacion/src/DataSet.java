import javax.xml.crypto.Data;
import java.util.ArrayList;

public class DataSet {

    ArrayList<Equipo> listaTotalEquipos;

    public static DataSet newInstance() {
        // desde el newIntance quiero que retorneis diectamente un conjunto de equipos
        // pedidos
        DataSet dataSet = new DataSet();
        return dataSet;
    }

    public DataSet(Equipo equipo){
        listaTotalEquipos = new ArrayList<>();
        listaTotalEquipos.add(equipo);
    }

    public DataSet(){
        listaTotalEquipos = new ArrayList<>();
        listaTotalEquipos.add(new Equipo("At. Madrid","españa", 1));
        listaTotalEquipos.add(new Equipo("Fc. Barcelona","españa", 2));
        listaTotalEquipos.add(new Equipo("Real Madrid","españa", 3));
        listaTotalEquipos.add(new Equipo("Manchester","inglaterra", 1));
        listaTotalEquipos.add(new Equipo("City","inglaterra", 2));
        listaTotalEquipos.add(new Equipo("Arsenal", "inglaterra",3));
        listaTotalEquipos.add(new Equipo("Milan","italia", 1));
        listaTotalEquipos.add(new Equipo("Juventus","italia", 2));
        listaTotalEquipos.add(new Equipo("Inter","italia", 3));
    }


    public void addEquipo(Equipo equipo){
        listaTotalEquipos.add(equipo);
    }

    public static ArrayList<Equipo> newInstanceEquipos(String liga) {
        // desde el newIntance quiero que retorneis diectamente un conjunto de equipos
        // pedidos

        ArrayList<Equipo> equipos = null;

        /*switch (liga) {
            case "españa":
                equipos = new DataSet().getEquiposEspania();
                break;
            case "italia":
                equipos = new DataSet().getEquiposItalia();
                break;
            case "inglaterra":
                equipos = new DataSet().getEquiposInglaterra();
                break;
            default:
                System.out.println("Liga no reconocida");
                equipos = new ArrayList<>();
        }*/



        return equipos;
    }

    public ArrayList<Equipo> getEquiposFiltrados(String ligaFiltrar){

        ArrayList<Equipo> equiposFiltrados = new ArrayList<>();

        for (Equipo itemEquipo:listaTotalEquipos ) {
            if (itemEquipo.getLiga().equals(ligaFiltrar)){
                //System.out.println(itemEquipo.getNombre());
                equiposFiltrados.add(itemEquipo);
            }
        }

        return equiposFiltrados;
    }


}
