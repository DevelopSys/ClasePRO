package enumerados;

import enumerados.model.Estaciones;
import enumerados.model.Registro;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Registro> listaRegistro = new ArrayList<>();
        listaRegistro.add(new Registro(9,1,6,4,5,2023,Estaciones.otonio));
        // cuando un registro se produce, salte un mensaje si:
            // la temperatura es más alta que la temperatura media de la estacion en la que se produce

        //Estaciones verano = Estaciones.verano;
        //System.out.println(verano.getTemperaturaMedia());
    }
}
