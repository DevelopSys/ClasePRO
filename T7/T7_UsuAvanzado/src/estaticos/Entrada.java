package estaticos;

import estaticos.data.DataSet;
import estaticos.model.Equipo;

public class Entrada {

    public static void main(String[] args) {

        DataSet.newInstance().getAllEquipos("Española"); // objeto creado
        DataSet.newInstance().getAllEquipos("Inglesa"); // objeto accedido
        DataSet.newInstance().getAllEquipos("Italiana"); // objeto accedido
        DataSet.newInstance(); // objeto accedido
        DataSet.newInstance(); // objeto accedido
        DataSet.newInstance(); // objeto accedido


        /*for (  Equipo equipo: DataSet.newInstance().getAllEquipos("Italiana")){
            System.out.println(equipo.getNombre());
        }*/
    }
}
