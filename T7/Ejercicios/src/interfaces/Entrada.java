package interfaces;

import interfaces.model.*;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        ArrayList<ClaseC> lista = new ArrayList();
        ArrayList<ClaseE> listaDespedir = new ArrayList<>();
        ClaseB claseB = new ClaseB("claseb");
        listaDespedir.add(new ClaseB("asdads"));
        listaDespedir.add(new ClaseD("asdads"));

        lista.add(new ClaseA("EjemploA"));
        lista.add(claseB);
        lista.add(new ClaseD("EjemploD"));

        /*for (ClaseE item: listaDespedir) {
            ((ClaseC)item).saludar("asdasd");
            item.despedir();
        }

        lista.add(new ClaseA("EjemploA"));
        lista.add(claseB);
        lista.add(new ClaseD("EjemploD"));*/

        for ( ClaseC item : lista ) {
            item.saludar("Saludo personalizado");
            ((ClaseE) item).despedir();
            if (item instanceof ClaseE){
            }

        }
    }
}
