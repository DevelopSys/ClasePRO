import model.Coche;
import model.Deportivo;
import model.Suv;
import model.Utilitario;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        //Coche coche = new Coche("a","a",123,123,0);

        Deportivo deportivo = new Deportivo("a", "b", 123, 123, 0, 200);
        Coche depotivo1 = new Deportivo("b","b",123,123,0,100);


        Utilitario utilitario = new Utilitario("a", "b", 123, 123, 0, 7);
        Suv suv = new Suv("a", "b", 123, 123, 0, 4);

        ArrayList<Coche> coches = new ArrayList();
        coches.add(deportivo);
        coches.add(utilitario);
        coches.add(suv);

        coches.get(0).acelerar(100);
        coches.get(1).acelerar(100);
        coches.get(2).acelerar(100);

        coches.get(0).decelerar(50);
        coches.get(1).decelerar(50);
        coches.get(2).decelerar(50);

        for (Coche item : coches) {
            item.mostrarDatos();
            // quiero llamarlo
            // item sea deportivo
            // System.out.println(((Deportivo)item).getPar());
            if (item instanceof Deportivo) {
                System.out.println(((Deportivo) item).getPar());
            }
        }

    }
}
