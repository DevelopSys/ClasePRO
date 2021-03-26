import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class EntradaEstaticos {

    public static void main(String[] args) {
        //ClaseNormal claseNormal = new ClaseNormal();
        //claseNormal.metodoNormal();
        //ClaseNormal.metodoEstatico();

        //DataSet dataSet = DataSet.newInstance();
        //dataSet.getEquiposEspania();
        //DataSet.newInstance().getEquiposEspania();

        // tenga el arraylist de equipos

        /*DataSet dataSet = new DataSet();
        ArrayList listaEquiposSecundaria = dataSet.getEquiposItalia();


        // 1 - España
        // 2 - Italia
        // 3 - Inglaterra
        // 4 - Todos

        /*ArrayList dataSet1 = DataSet.newInstance().getEquiposEspania();
        ArrayList dataSet2 = DataSet.newInstance().getEquiposItalia();
        ArrayList dataSet3 = DataSet.newInstance().getEquiposInglaterra();

        ArrayList<Equipo> listaFiltrada = DataSet.newInstanceEquipos(1);*/
        /*for (Equipo itemEquipo :listaEquipos) {
            System.out.println(itemEquipo.getNombre());
        }*/

        //DataSet dataSet = new DataSet();
        //dataSet.getEquiposEspania();
        //ArrayList<Equipo> listaEspania = DataSet.newInstance().getEquiposEspania();
        /*for ( Equipo itemEquipo: DataSet.newInstance().getEquiposEspania() ) {
            System.out.println(itemEquipo.getNombre());
        }*/

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Que equipos quieres ver");
        String liga = teclado.next();

        for ( Equipo itemEquipo: DataSet.newInstanceEquipos(liga) ) {
            System.out.println(itemEquipo.getNombre());
        }*/

        DataSet dataSet =  DataSet.newInstance();

        for (Equipo itemEquipo: dataSet.getEquiposFiltrados("italia") ) {
            System.out.println(itemEquipo.getNombre());
        }

        System.out.println("Añado un equipo");

        dataSet.addEquipo(new Equipo("Napoles","italia",6));
        for (Equipo itemEquipo: dataSet.getEquiposFiltrados("italia") ) {
            System.out.println(itemEquipo.getNombre());
        }



    }
}
