
import model.*;


import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        // ejecutar
        //Coche coche = new Coche("Marca1","Modelo1");
        //coche.encender();
        //coche.encender();
        //Coche coche1 = new Coche("Marca2","Modelo2");
        //System.out.println(coche1);

        Todoterreno todoterreno = new Todoterreno("T1","MT1", "4x4");
        Deportivo deportivo = new Deportivo("D1","MD1",400,500);

        ArrayList<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(deportivo);
        listaCoches.add(todoterreno);

        for (Coche item: listaCoches) {
            //((Deportivo)item).acelerar();
            item.mostrarDatos();
            if (item instanceof  Deportivo){
                ((Deportivo) item).acelerar();
            } else if (item instanceof Todoterreno){
                ((Todoterreno) item).subirSuspension();
            }
        }

    }
}
