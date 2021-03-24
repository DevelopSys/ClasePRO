import javax.xml.crypto.Data;
import java.util.ArrayList;

public class EntradaEstaticos {

    public static void main(String[] args) {
        //ClaseNormal claseNormal = new ClaseNormal();
        //claseNormal.metodoNormal();
        //ClaseNormal.metodoEstatico();

        //DataSet dataSet = DataSet.newInstance();
        //dataSet.getEquiposEspania();
        //DataSet.newInstance().getEquiposEspania();

        // tenga el arraylist de equipos

        DataSet dataSet = new DataSet();
        ArrayList listaEquiposSecundaria = dataSet.getEquiposItalia();


        // 1 - España
        // 2 - Italia
        // 3 - Inglaterra
        // 4 - Todos

        /*ArrayList dataSet1 = DataSet.newInstance().getEquiposEspania();
        ArrayList dataSet2 = DataSet.newInstance().getEquiposItalia();
        ArrayList dataSet3 = DataSet.newInstance().getEquiposInglaterra();*/

        ArrayList<Equipo> listaFiltrada = DataSet.newInstanceEquipos(1);




        /*for (Equipo itemEquipo :listaEquipos) {
            System.out.println(itemEquipo.getNombre());
        }*/
    }
}
